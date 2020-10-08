package com.masterkenth;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("discordraredropnotificater")
public interface DiscordRareDropNotificaterConfig extends Config {
	@ConfigItem(keyName = "webhookurl", name = "Discord webhook URL", description = "The Discord Webhook URL to use")
	default String webhookUrl() {
		return "";
	}
	@ConfigItem(keyName = "minrarity", name = "Min NPC Rarity (1/x)", description = "NPC drops more rare than this are posted to Discord")
	default int minRarity() {
		return 64;
	}
}
