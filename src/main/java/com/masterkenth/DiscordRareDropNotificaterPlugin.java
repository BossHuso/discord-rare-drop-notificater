package com.masterkenth;

import com.google.common.collect.ImmutableList;
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
import net.runelite.api.ItemComposition;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
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
public class DiscordRareDropNotificaterPlugin extends Plugin
{
	private static final String PET_MESSAGE_DUPLICATE = "You have a funny feeling like you would have been followed";
	private static final ImmutableList<String> PET_MESSAGES = ImmutableList.of(
			"You have a funny feeling like you're being followed", "You feel something weird sneaking into your backpack",
			"You have a funny feeling like you would have been followed", PET_MESSAGE_DUPLICATE);

	@Inject
	private Client client;

	@Inject
	private DiscordRareDropNotificaterConfig config;

	@Inject
	private ItemManager itemManager;

	@Inject
	private DrawManager drawManager;

	private final RarityChecker rarityChecker = new RarityChecker();

	private CompletableFuture<java.awt.Image> queuedScreenshot = null;

	@Provides
	DiscordRareDropNotificaterConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(DiscordRareDropNotificaterConfig.class);
	}

	@Subscribe
	public void onNpcLootReceived(NpcLootReceived npcLootReceived)
	{
		NPC npc = npcLootReceived.getNpc();
		Collection<ItemStack> items = npcLootReceived.getItems();

		List<CompletableFuture<Boolean>> futures = new ArrayList<CompletableFuture<Boolean>>();
		for (ItemStack item : items)
		{
			futures.add(processItemRarityNPC(npc, item.getId(), item.getQuantity()));
		}

		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
				.thenAccept(_v -> sendScreenshotIfSupposedTo());
	}

	@Subscribe
	public void onLootReceived(LootReceived lootReceived)
	{
		if (lootReceived.getType() != LootRecordType.EVENT)
		{
			// Only process EVENTS such as Barrows, CoX etc.
			// For NPCs onNpcLootReceived receives more information and is used instead.
			return;
		}

		Collection<ItemStack> items = lootReceived.getItems();
		List<CompletableFuture<Boolean>> futures = new ArrayList<CompletableFuture<Boolean>>();
		for (ItemStack item : items)
		{
			futures.add(processItemRarityEvent(lootReceived.getName(), item.getId(), item.getQuantity()));
		}

		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
				.thenAccept(_v -> sendScreenshotIfSupposedTo());
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		String chatMessage = event.getMessage();

		if (PET_MESSAGES.stream().anyMatch(chatMessage::contains))
		{
			boolean isDuplicate = chatMessage.contains(PET_MESSAGE_DUPLICATE);
			log.info(String.format("Possible pet: duplicate=%b (%s, %s) %s", isDuplicate, event.getSender(), event.getName(),
					event.getMessage()));
			getScreenshot().thenAccept(screenshot ->
			{
				// Waiting for screenshot before checking pet allows us to wait one frame, in
				// case pet data is not available yet

				// TODO: Figure out how to get pet info
				queuePetNotification(getPlayerName(), getPlayerIconUrl(), null, -1, isDuplicate)
						.thenCompose(_v -> sendScreenshot(config.webhookUrl(), screenshot));
			});
		}
	}

	private CompletableFuture<Boolean> processItemRarityEvent(String eventName, int itemId, int quantity)
	{
		float rarity = rarityChecker.CheckRarityEvent(eventName, itemId);

		if (rarity >= 0)
		{
			log.info("ProcessItemRarityEvent " + eventName + " " + itemId + " ("
					+ itemManager.getItemComposition(itemId).getName() + ") 1/" + (1f / rarity));
			queueScreenshot();
			return QueueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, -1, -1, null,
					eventName, config.webhookUrl()).thenApply(_v -> true);
		}
		return CompletableFuture.completedFuture(false);
	}

	private CompletableFuture<Boolean> processItemRarityNPC(NPC npc, int itemId, int quantity)
	{
		int npcId = npc.getId();
		int npcCombatLevel = npc.getCombatLevel();
		String npcName = npc.getName();

		return rarityChecker.CheckRarityNPC(npcId, itemId).thenCompose(rarity ->
		{
			int totalGeValue = itemManager.getItemPrice(itemId) * quantity;
			int totalHaValue = itemManager.getItemComposition(itemId).getHaPrice() * quantity;
			if (rarity <= (1f / config.minRarity()) || totalGeValue >= config.minValue() || totalHaValue >= config.minValue())
			{
				CompletableFuture<Boolean> f = new CompletableFuture<>();
				log.info(String.format("ProcessItemRarityNPC npc=(%d) %s lvl %d item=(%d) %s (%dx) rarity=1/%d GE=%d HA=%d",
						npcId, npcName, npcCombatLevel, itemId, itemManager.getItemComposition(itemId).getName(), quantity,
						(int) (1f / rarity), totalGeValue, totalHaValue));
				queueScreenshot();
				QueueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, npcId, npcCombatLevel,
						npcName, null, config.webhookUrl()).handle((_v, e) ->
						{
							if (e != null)
							{
								f.completeExceptionally(e);
							}
							else
							{
								f.complete(true);
							}
							return null;
						});
				return f;
			}
			else
			{
				return CompletableFuture.completedFuture(false);
			}
		});
	}

	private void queueScreenshot()
	{
		if (queuedScreenshot == null)
		{
			queuedScreenshot = getScreenshot();
		}
	}

	private void sendScreenshotIfSupposedTo()
	{
		if (queuedScreenshot != null)
		{
			queuedScreenshot.thenAccept(screenshot ->
			{
				sendScreenshot(config.webhookUrl(), screenshot);
				queuedScreenshot = null;
			});
		}
	}

	private CompletableFuture<Void> QueueLootNotification(String playerName, String playerIconUrl, int itemId,
			int quantity, float rarity, int npcId, int npcCombatLevel, String npcName, String eventName, String webhookUrl)
	{
		Author author = new Author();
		author.setName(playerName);

		if (playerIconUrl != null)
		{
			author.setIcon_url(playerIconUrl);
		}

		Field rarityField = new Field();
		rarityField.setName("Rarity");
		rarityField.setValue(getRarityString(rarity));
		rarityField.setInline(true);

		Field haValueField = new Field();
		haValueField.setName("HA Value");
		haValueField.setValue(getGPValueString(itemManager.getItemComposition(itemId).getHaPrice() * quantity));
		haValueField.setInline(true);

		Field geValueField = new Field();
		geValueField.setName("GE Value");
		geValueField.setValue(getGPValueString(itemManager.getItemPrice(itemId) * quantity));
		geValueField.setInline(true);

		Embed embed = new Embed();
		embed.setAuthor(author);
		embed.setFields(new Field[] { rarityField, haValueField, geValueField });

		Image thumbnail = new Image();
		CompletableFuture<Void> iconFuture = ApiTool.getInstance()
				.getIconUrl("item", itemId, itemManager.getItemComposition(itemId).getName()).thenAccept(iconUrl ->
				{
					thumbnail.setUrl(iconUrl);
					embed.setThumbnail(thumbnail);
				});

		CompletableFuture<Void> descFuture = getLootNotificationDescription(itemId, quantity, npcId, npcCombatLevel,
				npcName, eventName).handle((notifDesc, e) ->
				{
					if (e != null)
					{
						log.error("unable to get item desc for " + itemId + " (" + e.getMessage() + ")");
					}
					embed.setDescription(notifDesc);
					return null;
				});

		return CompletableFuture.allOf(descFuture, iconFuture).thenCompose(_v ->
		{
			Webhook webhookData = new Webhook();
			webhookData.setEmbeds(new Embed[] { embed });
			return sendWebhookData(config.webhookUrl(), webhookData);
		});
	}

	private CompletableFuture<Void> queuePetNotification(String playerName, String playerIconUrl, String petName,
			int rarity, boolean isDuplicate)
	{
		Author author = new Author();
		author.setName(playerName);

		if (playerIconUrl != null)
		{
			author.setIcon_url(playerIconUrl);
		}

		/*
		 * Field rarityField = new Field(); rarityField.setName("Rarity");
		 * rarityField.setValue(getRarityString(rarity)); rarityField.setInline(true);
		 */

		Embed embed = new Embed();
		embed.setAuthor(author);
		embed.setFields(new Field[] { /* rarityField */ });
		embed.setDescription(getPetNotificationDescription(isDuplicate));

		/*
		 * Image thumbnail = new Image(); CompletableFuture<Void> iconFuture =
		 * ApiTool.getInstance().getIconUrl("pet", -1, petName).thenAccept(iconUrl -> {
		 * thumbnail.setUrl(iconUrl); embed.setThumbnail(thumbnail); });
		 */

		return CompletableFuture.allOf().thenCompose(_v ->
		{
			Webhook webhookData = new Webhook();
			webhookData.setEmbeds(new Embed[] { embed });
			return sendWebhookData(config.webhookUrl(), webhookData);
		});
	}

	private CompletableFuture<java.awt.Image> getScreenshot()
	{
		CompletableFuture<java.awt.Image> f = new CompletableFuture<>();
		drawManager.requestNextFrameListener(screenshotImage ->
		{
			f.complete(screenshotImage);
		});
		return f;
	}

	private CompletableFuture<Void> sendWebhookData(String webhookUrl, Webhook webhookData)
	{
		JSONObject json = new JSONObject(webhookData);
		String jsonStr = json.toString();
		return ApiTool.getInstance().postRaw(webhookUrl, jsonStr, "application/json").thenAccept(res ->
		{
		});
	}

	private CompletableFuture<Void> sendScreenshot(String webhookUrl, java.awt.Image screenshot)
	{
		try
		{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write((BufferedImage) screenshot, "png", baos);
			byte[] imageBytes = baos.toByteArray();
			return ApiTool.getInstance().postFormImage(webhookUrl, imageBytes, "image/png");
		}
		catch (Exception e)
		{
			return CompletableFuture.failedFuture(e);
		}
	}

	// TODO: Add Pet notification

	private CompletableFuture<String> getLootNotificationDescription(int itemId, int quantity, int npcId,
			int npcCombatLevel, String npcName, String eventName)
	{
		ItemComposition itemComp = itemManager.getItemComposition(itemId);

		return ApiTool.getInstance().getItem(itemId).thenCompose(itemJson ->
		{
			String itemUrl = itemJson.getString("wiki_url");
			String baseMsg = "Just got " + (quantity > 1 ? quantity + "x " : "") + "[" + itemComp.getName() + "](" + itemUrl
					+ ")";

			if (npcId >= 0)
			{
				return ApiTool.getInstance().getNPC(npcId).thenApply(npcJson ->
				{
					String npcUrl = npcJson.getString("wiki_url");
					String fullMsg = baseMsg + " from lvl " + npcCombatLevel + " [" + npcName + "](" + npcUrl + ")";
					return fullMsg;
				}).exceptionally(e ->
				{
					log.error("!= NPC info for " + npcId + " (" + e.getMessage() + ")");
					return baseMsg + " from lvl " + npcCombatLevel + " " + npcName;
				});
			}
			else if (eventName != null)
			{
				String eventUrl = HttpUrl.parse("https://oldschool.runescape.wiki/").newBuilder()
						.addPathSegments("w/Special:Search").addQueryParameter("search", eventName).build().toString();
				String fullMsg = baseMsg + " from [" + eventName + "](" + eventUrl + ")";
				return CompletableFuture.completedFuture(fullMsg);
			}
			else
			{
				return CompletableFuture.completedFuture(baseMsg + " from something");
			}
		});
	}

	private String getPetNotificationDescription(boolean isDuplicate)
	{
		if (isDuplicate)
		{
			return "Would've gotten a pet, but already has it.";
		}
		else
		{
			return "Just got a pet, probably.";
		}
	}

	private String getGPValueString(int value)
	{
		return "```fix\n" + NumberFormat.getNumberInstance(Locale.US).format(value) + " GP\n```";
	}

	private String getRarityString(float rarity)
	{
		return "```glsl\n# 1/" + (1 / rarity) + " (" + (rarity * 100f) + "%)\n```";
	}

	private String getPlayerIconUrl()
	{
		switch (client.getAccountType())
		{
		case IRONMAN:
			return "https://oldschool.runescape.wiki/images/0/09/Ironman_chat_badge.png";
		case HARDCORE_IRONMAN:
			return "https://oldschool.runescape.wiki/images/b/b8/Hardcore_ironman_chat_badge.png";
		case ULTIMATE_IRONMAN:
			return "https://oldschool.runescape.wiki/images/0/02/Ultimate_ironman_chat_badge.png";
		default:
			return null;
		}
	}

	private String getPlayerName()
	{
		return client.getLocalPlayer().getName();
	}
}
