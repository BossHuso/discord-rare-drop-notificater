package com.masterkenth;

import com.google.inject.Provides;
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
	}

	@Override
	protected void shutDown() throws Exception {
		log.info("Stopped");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged) {
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN) {
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "My wazzap plugin says " + config.greeting(), null);
		}
	}

	@Provides
	DiscordRareDropNotificaterConfig provideConfig(ConfigManager configManager) {
		return configManager.getConfig(DiscordRareDropNotificaterConfig.class);
	}
}
