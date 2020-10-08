package com.masterkenth;

import com.google.inject.Provides;
import com.masterkenth.discord.Embed;
import com.masterkenth.discord.Author;
import com.masterkenth.discord.Field;
import com.masterkenth.discord.Image;
import com.masterkenth.discord.Webhook;

import org.json.JSONObject;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.ItemComposition;
import net.runelite.api.NPC;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.DrawManager;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemStack;
import net.runelite.http.api.loottracker.LootRecordType;
import okhttp3.HttpUrl;

@Slf4j
@PluginDescriptor(
	name = "Discord Rare Drop Notificater", 
	description = "Sends a detailed notification via Discord webhooks whenever you get a rare/unique drop.",
	tags = { "discord", "loot", "unique", "boss", "notification" }
)
public class DiscordRareDropNotificaterPlugin extends Plugin {
	@Inject
	private Client client;

	@Inject
	private DiscordRareDropNotificaterConfig config;
	
	@Inject
	private ItemManager itemManager;

	@Inject
	private DrawManager drawManager;

	private final RarityChecker rarityChecker = new RarityChecker();

	@Override
	protected void startUp() throws Exception {
		log.info("Started");
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("Stopped");
	}

	private CompletableFuture<java.awt.Image> queuedScreenshot = null;

	@Provides
	DiscordRareDropNotificaterConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(DiscordRareDropNotificaterConfig.class);
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
/* 		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			Collection<ItemStack> items = new java.util.ArrayList<ItemStack>();
			items.add(new ItemStack(4720, 1, new LocalPoint(0, 0)));
			items.add(new ItemStack(4740, 100, new LocalPoint(0, 0)));
			items.add(new ItemStack(4712, 1, new LocalPoint(0, 0)));
			LootReceived lr = new LootReceived("Barrows", -1, LootRecordType.EVENT, items);
			onLootReceived(lr);
		} */
	}

	@Subscribe
	public void onNpcLootReceived(NpcLootReceived npcLootReceived)
	{
		NPC npc = npcLootReceived.getNpc();
		Collection<ItemStack> items = npcLootReceived.getItems();

		List<CompletableFuture<Boolean>> futures = new ArrayList<CompletableFuture<Boolean>>();
		for(ItemStack item : items) {
			futures.add(processItemRarityNPC(npc, item.getId(), item.getQuantity()));
		}

		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
		.thenAccept(_v -> sendScreenshotIfSupposedTo());
	}

	@Subscribe
	public void onLootReceived(LootReceived lootReceived)
	{
		// Only process EVENTS such as Barrows, CoX etc.
		// For NPCs onNpcLootReceived receives more information and is used instead.
		if(lootReceived.getType() != LootRecordType.EVENT) {
			return;
		}

		Collection<ItemStack> items = lootReceived.getItems();
		List<CompletableFuture<Boolean>> futures = new ArrayList<CompletableFuture<Boolean>>();
		for(ItemStack item : items) {
			futures.add(processItemRarityEvent(lootReceived.getName(), item.getId(), item.getQuantity()));
		}

		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
		.thenAccept(_v -> sendScreenshotIfSupposedTo());
	}

	private CompletableFuture<Boolean> processItemRarityEvent(String eventName, int itemId, int quantity) {
		log.info("ProcessItemRarityEvent " + eventName + " " + itemId + " (" + itemManager.getItemComposition(itemId).getName() + ")");
		float rarity = rarityChecker.CheckRarityEvent(eventName, itemId);
		if(rarity >= 0) {
			log.info("ProcessItemRarityEvent " + eventName + " " + itemId + " (" + itemManager.getItemComposition(itemId).getName() + ") 1/" + (1f/rarity));
			queueScreenshot();
			return QueueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, -1, -1, null, eventName, config.webhookUrl())
			.thenApply(_v -> true);
		}
		return CompletableFuture.completedFuture(false);
	}

	private CompletableFuture<Boolean> processItemRarityNPC(NPC npc, int itemId, int quantity) {
		int npcId = npc.getId();
		int npcCombatLevel = npc.getCombatLevel();
		String npcName = npc.getName();
		log.info("ProcessItemRarityNPC " + npcName + " " + itemId + " (" + itemManager.getItemComposition(itemId).getName() + ")");
		return rarityChecker.CheckRarityNPC(npcId, itemId)
		.thenCompose(rarity -> {
			if(rarity >= 0) {
				CompletableFuture<Boolean> f = new CompletableFuture<>();
				log.info("ProcessItemRarityNPC " + npcName + " " + itemId + " (" + itemManager.getItemComposition(itemId).getName() + ") 1/" + (1f/rarity));
				queueScreenshot();
				QueueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, npcId, npcCombatLevel, npcName, null, config.webhookUrl())
				.handle((_v, e) -> {
					if(e != null) {
						f.completeExceptionally(e);
					} else {
						f.complete(true);
					}
					return null;
				});
				return f;
			} else {
				return CompletableFuture.completedFuture(false);
			}
		});
	}

	private void queueScreenshot() {
		if(queuedScreenshot == null) {
			queuedScreenshot = getScreenshot();
		}
	}

	private void sendScreenshotIfSupposedTo() {
		if(queuedScreenshot != null) {
			queuedScreenshot.thenAccept(screenshot -> {
				sendScreenshot(config.webhookUrl(), screenshot);
				queuedScreenshot = null;
			});
		}
	}

	private CompletableFuture<Void> QueueLootNotification(
		String playerName, 
		String playerIconUrl,
		int itemId, 
		int quantity, 
		float rarity, 
		int npcId, 
		int npcCombatLevel, 
		String npcName,
		String eventName,
		String webhookUrl)
	{
		log.info("QueueLootNotification");

		Author author = new Author();
		author.setName(playerName);

		if(playerIconUrl != null) {
			author.setIcon_url(playerIconUrl);
		}

		Field rarityField = new Field();
		rarityField.setName("Rarity");
		rarityField.setValue(getItemRarityString(rarity));
		rarityField.setInline(true);

		Field valueField = new Field();
		valueField.setName("Value");
		valueField.setValue(getItemValueString(itemId));
		valueField.setInline(true);

		Embed embed = new Embed();
		embed.setAuthor(author);
		embed.setFields(new Field[]{ rarityField, valueField });

		Image thumbnail = new Image();
		CompletableFuture<Void> iconFuture = getItemIconUrl(itemId)
		.thenAccept(iconUrl -> {
			thumbnail.setUrl(iconUrl);
			embed.setThumbnail(thumbnail);
		});
		
		CompletableFuture<Void> descFuture = getNotificationDescription(itemId, npcId, npcCombatLevel, npcName, eventName)
		.handle((notifDesc, e) -> {
			if(e != null) {
				log.error("unable to get item desc for " + itemId + " (" + e.getMessage() + ")");
			}
			embed.setDescription(notifDesc);
			return null;
		});
	
		return CompletableFuture.allOf(descFuture, iconFuture)
		.thenCompose(_v -> {
			Webhook webhookData = new Webhook();
			webhookData.setEmbeds(new Embed[]{ embed });
			log.info("QueueLootNotification sending");
			return sendWebhookData(config.webhookUrl(), webhookData);
		});
	}

	private CompletableFuture<java.awt.Image> getScreenshot() {
		CompletableFuture<java.awt.Image> f = new CompletableFuture<>();
		drawManager.requestNextFrameListener(screenshotImage -> {
			f.complete(screenshotImage);
		});
		return f;
	}

	private CompletableFuture<Void> sendWebhookData(String webhookUrl, Webhook webhookData) {
		JSONObject json = new JSONObject(webhookData);
		String jsonStr = json.toString();
		log.info("sendWebhookData");
		return ApiTool.getInstance().postRaw(webhookUrl, jsonStr, "application/json")
		.thenAccept(res -> { log.info("sendWebhookData sent"); });
	}

	private CompletableFuture<Void> sendScreenshot(String webhookUrl, java.awt.Image screenshot) {
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write((BufferedImage)screenshot, "png", baos);
			byte[] imageBytes = baos.toByteArray();
			return ApiTool.getInstance().postFormImage(webhookUrl, imageBytes, "image/png");			
		} catch (Exception e) {
			return CompletableFuture.failedFuture(e);
		}
	}

	// TODO: Add Pet notification

	private CompletableFuture<String> getNotificationDescription(int itemId, int npcId, int npcCombatLevel, String npcName, String eventName) {
		ItemComposition itemComp = itemManager.getItemComposition(itemId);		

		return ApiTool.getInstance().getItem(itemId)
		.thenCompose(itemJson -> {
			String itemUrl = itemJson.getString("wiki_url");
			String baseMsg = "Just got [" + itemComp.getName() + "](" + itemUrl + ")";

			if(npcId >= 0) {
				return ApiTool.getInstance().getNPC(npcId)
				.thenApply(npcJson -> {
					String npcUrl = npcJson.getString("wiki_url");
					String fullMsg = baseMsg + " from lvl " + npcCombatLevel + " [" + npcName + "](" + npcUrl +")";
					return fullMsg;
				})
				.exceptionally(e -> {
					log.error("!= NPC info for " + npcId + " (" + e.getMessage() + ")");
					return baseMsg + " from lvl " + npcCombatLevel + " " + npcName;
				});
			} else if(eventName != null) {
				String eventUrl = HttpUrl.parse("https://oldschool.runescape.wiki/")
				.newBuilder()
				.addPathSegments("w/Special:Search")
				.addQueryParameter("search", eventName)
				.build()
				.toString();
				String fullMsg = baseMsg + " from [" + eventName + "](" + eventUrl + ")";
				return CompletableFuture.completedFuture(fullMsg);
			} else {
				return CompletableFuture.completedFuture(baseMsg + " from something");
			}
		});
	}

	private String getItemValueString(int itemId) {
		ItemComposition itemComp = itemManager.getItemComposition(itemId);
		return "```fix\n" + NumberFormat.getNumberInstance(Locale.US).format(itemComp.getPrice()) + " GP\n```";
	}

	private String getItemRarityString(float rarity) {
		return "```glsl\n# 1/" + (1/rarity) + " (" + (rarity*100f) + "%)\n```";
	}

	private CompletableFuture<String> getItemIconUrl(int itemId) {
		ItemComposition itemComp = itemManager.getItemComposition(itemId);
		return ApiTool.getInstance().getIconUrl(itemId, itemComp.getName());
	}

	private String getPlayerIconUrl() {
		switch(client.getAccountType()) {
			case IRONMAN: return "https://oldschool.runescape.wiki/images/0/09/Ironman_chat_badge.png";
			case HARDCORE_IRONMAN: return "https://oldschool.runescape.wiki/images/b/b8/Hardcore_ironman_chat_badge.png";
			case ULTIMATE_IRONMAN: return "https://oldschool.runescape.wiki/images/0/02/Ultimate_ironman_chat_badge.png";
			default: return null;
		}
	}

	private String getPlayerName() {
		return client.getLocalPlayer().getName();
	}
}
