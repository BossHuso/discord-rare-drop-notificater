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
}
