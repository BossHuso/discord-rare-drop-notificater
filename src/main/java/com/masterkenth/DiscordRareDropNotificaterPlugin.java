package com.masterkenth;

import com.google.inject.Provides;
import com.masterkenth.discord.Embed;
import com.masterkenth.discord.Author;
import com.masterkenth.discord.Field;
import com.masterkenth.discord.Image;
import com.masterkenth.discord.Webhook;

import org.json.JSONObject;

import java.util.Collection;

import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.api.ItemComposition;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.events.PlayerLootReceived;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.http.api.loottracker.LootRecordType;
import net.runelite.client.game.ItemManager;
import net.runelite.client.game.ItemStack;

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

	private final RarityChecker rarityChecker = new RarityChecker();

	@Override
	protected void startUp() throws Exception {
		log.info("Started");
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("Stopped");
	}

	@Provides
	DiscordRareDropNotificaterConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(DiscordRareDropNotificaterConfig.class);
	}

	@Subscribe
	public void onNpcLootReceived(NpcLootReceived npcLootReceived)
	{
		NPC npc = npcLootReceived.getNpc();
		Collection<ItemStack> items = npcLootReceived.getItems();

		/* log.info("onNpcLootReceived: " + npc.getCombatLevel() + " " + npc.getName() + " dropped:"); */

		for(ItemStack item : items) {
			int id = item.getId();
			ItemComposition itemComp = itemManager.getItemComposition(id);
			/* log.info(item.getQuantity() + " " + itemComp.getName() + " (" + itemManager.getItemPrice(id) + ")"); */

			log.info(npc.getName() + " (" + npc.getId() + ") dropped " + itemComp.getName() + " (" + item.getId() + ")");
			QueueRarityCheck(npc.getId(), item.getId());
		}
	}

	@Subscribe
	public void onLootReceived(LootReceived lootReceived)
	{
		if(lootReceived.getType() != LootRecordType.EVENT) {
			return;
		}

		// Only process EVENTS such as Barrows, CoX etc.
		// For NPCs onNpcLootReceived receives more information and is used instead.

		Collection<ItemStack> items = lootReceived.getItems();

		log.info("OnLootReceived: " + lootReceived.getName() + " received:");

		for(ItemStack item : items) {
			int id = item.getId();
			ItemComposition itemComp = itemManager.getItemComposition(id);
			log.info(item.getQuantity() + " " + itemComp.getName() + " (" + itemManager.getItemPrice(id) + ")");
		}
	}

	private void QueueRarityCheck(int npcId, int itemId) {
		rarityChecker.CheckRarity(npcId, itemId)
		.thenAccept(rarity -> {
			log.info("npc " + npcId + " item " + itemId + " has rarity " + rarity + "(1/" + (1/rarity) + ")");
		});
	}

	private void ProcessLootDrop() {
		Author author = new Author();
		author.setName("MK");
		author.setIcon_url(getPlayerIcon());

		Image thumbnail = new Image();
		thumbnail.setUrl(getItemIcon());

		Field rarityField = new Field();
		rarityField.setName("Rarity");
		rarityField.setValue(getItemRarityString());
		rarityField.setInline(true);

		Field valueField = new Field();
		valueField.setName("Value");
		valueField.setValue(getItemValueString());
		valueField.setInline(true);

		Embed embed = new Embed();
		embed.setAuthor(author);
		embed.setDescription(buildNotificationDescription());
		embed.setThumbnail(thumbnail);
		embed.setFields(new Field[]{ rarityField, valueField });
		
		Webhook webhookData = new Webhook();
		webhookData.setEmbeds(new Embed[]{ embed });

		ExecuteWebhook(webhookData);
	}

	private String buildNotificationDescription() {
		// TODO: Return correct string
		return "";
	}

	private String getItemValueString() {
		// TODO: Return correct value string
		return "";
	}

	private String getItemRarityString() {
		// TODO: Return correct rarity string
		return "";
	}

	private String getItemIcon() {
		// TODO: Return correct item icon
		return "";
	}

	private String getPlayerIcon() {
		// TODO: Return approperiate ironman badge
		return "";
	}

	private void ExecuteWebhook(Webhook webhook) {
		JSONObject json = new JSONObject(webhook);
		log.info("------ TEST JSON ------");
		log.info(json.toString());
	}
}
