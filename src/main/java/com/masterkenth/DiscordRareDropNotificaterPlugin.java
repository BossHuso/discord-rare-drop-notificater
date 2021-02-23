/* 
 * BSD 2-Clause License
 * 
 * Copyright (c) 2020, MasterKenth
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */
package com.masterkenth;

import com.google.common.collect.ImmutableList;
import com.google.inject.Provides;
import com.masterkenth.discord.Embed;
import com.masterkenth.discord.Author;
import com.masterkenth.discord.Field;
import com.masterkenth.discord.Image;
import com.masterkenth.discord.Webhook;

import net.runelite.api.ChatMessageType;
import org.json.JSONObject;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
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
			ItemComposition comp = itemManager.getItemComposition(item.getId());
			if (!shouldBeIgnored(comp.getName()))
			{
				futures.add(processItemRarityNPC(npc, item.getId(), item.getQuantity()));
			}
		}

		if (futures.size() > 0)
		{
			CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
					.thenAccept(_v -> sendScreenshotIfSupposedTo());
		}

		CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
				.thenAccept(_v -> sendScreenshotIfSupposedTo()).exceptionally(e ->
				{
					log.error(String.format("onNpcLootReceived error: %s", e.getMessage()), e);
					log.error(String.format("npc %d items %s", npcLootReceived.getNpc().getId(),
							npcLootReceived.getItems().stream().map(i -> "" + i.getId()).reduce("", (p, c) -> p + ", " + c)));
					return null;
				});
	}

	@Subscribe
	public void onLootReceived(LootReceived lootReceived)
	{
		// Only process EVENTS such as Barrows, CoX etc. and PICKPOCKET
		// For NPCs onNpcLootReceived receives more information and is used instead.
		if (lootReceived.getType() == LootRecordType.NPC)
		{
			return;
		}

		Collection<ItemStack> items = lootReceived.getItems();
		List<CompletableFuture<Boolean>> futures = new ArrayList<>();

		if (lootReceived.getType() == LootRecordType.EVENT)
		{
			for (ItemStack item : items)
			{
				ItemComposition comp = itemManager.getItemComposition(item.getId());
				if (!shouldBeIgnored(comp.getName()))
				{
					futures.add(processItemRarityEvent(lootReceived.getName(), item.getId(), item.getQuantity()));
				}
			}

			CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
					.thenAccept(_v -> sendScreenshotIfSupposedTo()).exceptionally(e ->
			{
				log.error(String.format("onLootReceived error: %s", e.getMessage()), e);
				log.error(String.format("event %s items %s", lootReceived.getName(),
						lootReceived.getItems().stream().map(i -> "" + i.getId()).reduce("", (p, c) -> p + ", " + c)));
				return null;
			});
			if (futures.size() > 0)
			{
				CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
						.thenAccept(_v -> sendScreenshotIfSupposedTo());
			}
		}

		if (lootReceived.getType() == LootRecordType.PICKPOCKET)
		{
			for (ItemStack item : items)
			{
				ItemComposition comp = itemManager.getItemComposition(item.getId());
				if (!shouldBeIgnored(comp.getName()))
				{
					futures.add(processItemRarityPickpocket(lootReceived.getName(), item.getId(), item.getQuantity()));
				}
			}

			CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
					.thenAccept(_v -> sendScreenshotIfSupposedTo()).exceptionally(e ->
			{
				log.error(String.format("onLootReceived error: %s", e.getMessage()), e);
				log.error(String.format("pickpocket %s items %s", lootReceived.getName(),
						lootReceived.getItems().stream().map(i -> "" + i.getId()).reduce("", (p, c) -> p + ", " + c)));
				return null;
			});
			if (futures.size() > 0)
			{
				CompletableFuture.allOf(futures.toArray(new CompletableFuture[futures.size()]))
						.thenAccept(_v -> sendScreenshotIfSupposedTo());
			}
		}
	}

	@Subscribe
	public void onChatMessage(ChatMessage event)
	{
		String chatMessage = event.getMessage();

		if (event.getType() != ChatMessageType.GAMEMESSAGE
				&& event.getType() != ChatMessageType.SPAM
				&& event.getType() != ChatMessageType.TRADE
				&& event.getType() != ChatMessageType.FRIENDSCHATNOTIFICATION)
		{
			return;
		}

		if (PET_MESSAGES.stream().anyMatch(chatMessage::contains))
		{
			boolean isDuplicate = chatMessage.contains(PET_MESSAGE_DUPLICATE);
			log.info(String.format("Possible pet: duplicate=%b (%s, %s) %s", isDuplicate, event.getSender(), event.getName(),
					event.getMessage()));

			CompletableFuture<java.awt.Image> screenshotFuture = config.sendScreenshot() ? getScreenshot()
					: CompletableFuture.completedFuture(null);

			screenshotFuture
					// Waiting for screenshot before checking pet allows us to wait one frame, in
					// case pet data is not available yet
					// TODO: Figure out how to get pet info
					.thenApply(screenshot -> queuePetNotification(getPlayerName(), getPlayerIconUrl(), null, -1, isDuplicate)
							.thenCompose(_v -> screenshot != null ? sendScreenshot(getWebhookUrls(), screenshot)
									: CompletableFuture.completedFuture(null)))
					.exceptionally(e ->
					{
						log.error(String.format("onChatMessage (pet) error: %s", e.getMessage()), e);
						log.error(event.toString());
						return null;
					});
		}
	}

	private boolean shouldBeIgnored(String itemName)
	{
		String lowerName = itemName.toLowerCase();
		List<String> keywords = Arrays.asList(config.ignoredKeywords().split(","));
		return keywords.stream().anyMatch(key -> key.length() > 0 && lowerName.contains(key.toLowerCase()));
	}

	private CompletableFuture<Boolean> processItemRarityEvent(String eventName, int itemId, int quantity)
	{
		float rarity = rarityChecker.CheckRarityEvent(eventName, itemId, itemManager);

		if (rarity >= 0)
		{
			queueScreenshot();
			return queueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, -1, -1, null,
					eventName, config.webhookUrl()).thenApply(_v -> true);
		}
		return CompletableFuture.completedFuture(false);
	}

	private CompletableFuture<Boolean> processItemRarityPickpocket(String pickpocketName, int itemId, int quantity)
	{
		float rarity = rarityChecker.CheckRarityPickpocket(pickpocketName, itemId, itemManager);

		if (rarity >= 0)
		{
			queueScreenshot();
			return queueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, -1, -1, null,
					pickpocketName, config.webhookUrl()).thenApply(_v -> true);
		}
		return CompletableFuture.completedFuture(false);
	}

	private CompletableFuture<Boolean> processItemRarityNPC(NPC npc, int itemId, int quantity)
	{
		int npcId = npc.getId();
		int npcCombatLevel = npc.getCombatLevel();
		String npcName = npc.getName();

		return rarityChecker.CheckRarityNPC(npcId, itemId, itemManager).thenCompose(rarity ->
		{
			int totalGeValue = itemManager.getItemPrice(itemId) * quantity;
			int totalHaValue = itemManager.getItemComposition(itemId).getHaPrice() * quantity;

			boolean valueMet = totalGeValue >= config.minValue() || totalHaValue >= config.minValue();
			boolean rarityMet = rarity <= (1f / config.minRarity());

			if (config.andInsteadOfOr() ? (valueMet && rarityMet) : (valueMet || rarityMet))
			{
				CompletableFuture<Boolean> f = new CompletableFuture<>();
				queueScreenshot();
				queueLootNotification(getPlayerName(), getPlayerIconUrl(), itemId, quantity, rarity, npcId, npcCombatLevel,
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
		if (queuedScreenshot == null && config.sendScreenshot())
		{
			queuedScreenshot = getScreenshot();
		}
	}

	private void sendScreenshotIfSupposedTo()
	{
		if (queuedScreenshot != null && config.sendScreenshot())
		{
			CompletableFuture<java.awt.Image> copy = queuedScreenshot;
			queuedScreenshot = null;
			copy.thenAccept(screenshot -> sendScreenshot(getWebhookUrls(), screenshot)).handle((v, e) ->
			{
				if (e != null)
				{
					log.error(String.format("sendScreenshotIfSupposedTo error: %s", e.getMessage()), e);
				}
				queuedScreenshot = null;
				return null;
			});
		}
	}

	private CompletableFuture<Void> queueLootNotification(String playerName, String playerIconUrl, int itemId,
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
				.getIconUrl("item", itemId, itemManager.getItemComposition(itemId).getName()).handle((iconUrl, e) ->
				{
					if (e != null)
					{
						log.error(String.format("queueLootNotification (icon %d) error: %s", itemId, e.getMessage()), e);
					}
					thumbnail.setUrl(iconUrl);
					embed.setThumbnail(thumbnail);
					return null;
				});

		CompletableFuture<Void> descFuture = getLootNotificationDescription(itemId, quantity, npcId, npcCombatLevel,
				npcName, eventName).handle((notifDesc, e) ->
				{
					if (e != null)
					{
						log.error(String.format("queueLootNotification (desc %d) error: %s", itemId, e.getMessage()), e);
					}
					embed.setDescription(notifDesc);
					return null;
				});

		return CompletableFuture.allOf(descFuture, iconFuture).thenCompose(_v ->
		{
			Webhook webhookData = new Webhook();
			webhookData.setEmbeds(new Embed[] { embed });
			return sendWebhookData(getWebhookUrls(), webhookData);
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
			return sendWebhookData(getWebhookUrls(), webhookData);
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

	private CompletableFuture<Void> sendWebhookData(List<String> webhookUrls, Webhook webhookData)
	{
		JSONObject json = new JSONObject(webhookData);
		String jsonStr = json.toString();

		List<Throwable> exceptions = new ArrayList<>();
		List<CompletableFuture<Void>> sends = webhookUrls.stream()
				.map(url -> ApiTool.getInstance().postRaw(url, jsonStr, "application/json").handle((_v, e) ->
				{
					if (e != null)
					{
						exceptions.add(e);
					}
					return null;
				}).thenAccept(_v ->
				{
				})).collect(Collectors.toList());

		return CompletableFuture.allOf(sends.toArray(new CompletableFuture[sends.size()])).thenCompose(_v ->
		{
			if (exceptions.size() > 0)
			{
				log.error(String.format("sendWebhookData got %d error(s)", exceptions.size()));
				exceptions.forEach(t -> log.error(t.getMessage()));
				CompletableFuture<Void> f = new CompletableFuture<>();
				f.completeExceptionally(exceptions.get(0));
				return f;
			}
			return CompletableFuture.completedFuture(null);
		});
	}

	private CompletableFuture<Void> sendScreenshot(List<String> webhookUrls, java.awt.Image screenshot)
	{
		try
		{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ImageIO.write((BufferedImage) screenshot, "png", baos);
			byte[] imageBytes = baos.toByteArray();

			List<Throwable> exceptions = new ArrayList<>();
			List<CompletableFuture<Void>> sends = webhookUrls.stream()
					.map(url -> ApiTool.getInstance().postFormImage(url, imageBytes, "image/png").handle((_v, e) ->
					{
						if (e != null)
						{
							exceptions.add(e);
						}
						return null;
					}).thenAccept(_v ->
					{
					})).collect(Collectors.toList());

			return CompletableFuture.allOf(sends.toArray(new CompletableFuture[sends.size()])).thenCompose(_v ->
			{
				if (exceptions.size() > 0)
				{
					log.error(String.format("sendScreenshot got %d error(s)", exceptions.size()));
					exceptions.forEach(t -> log.error(t.getMessage()));
					CompletableFuture<Void> f = new CompletableFuture<>();
					f.completeExceptionally(exceptions.get(0));
					return f;
				}
				return CompletableFuture.completedFuture(null);
			});
		}
		catch (Exception e)
		{
			log.error("Unable to send screenshot", e);
			return CompletableFuture.completedFuture(null);
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
			return "Just got a pet.";
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

	private List<String> getWebhookUrls()
	{
		return Arrays.asList(config.webhookUrl().split("\n")).stream().filter(u -> u.length() > 0)
				.collect(Collectors.toList());
	}
}
