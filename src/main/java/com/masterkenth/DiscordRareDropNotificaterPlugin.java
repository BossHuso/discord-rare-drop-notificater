package com.masterkenth;

import com.google.inject.Provides;
import com.masterkenth.discord.Embed;
import com.masterkenth.discord.Author;
import com.masterkenth.discord.Field;
import com.masterkenth.discord.Image;
import com.masterkenth.discord.Webhook;

import org.json.JSONObject;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

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

	@Override
	protected void startUp() throws Exception {
		log.info("Started");

		ProcessLootDrop();
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("Stopped");
	}

	@Provides
	DiscordRareDropNotificaterConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(DiscordRareDropNotificaterConfig.class);
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
