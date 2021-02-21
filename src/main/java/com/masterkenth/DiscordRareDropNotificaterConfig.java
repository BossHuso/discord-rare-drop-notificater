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

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("discordraredropnotificater")
public interface DiscordRareDropNotificaterConfig extends Config
{
	@ConfigItem(
			keyName = "webhookurl",
			name = "Discord webhook URL(s)",
			description = "The Discord Webhook URL(s) to use, separated by newline"
	)
	default String webhookUrl()
	{
		return "";
	}

	@ConfigItem(
			keyName = "minrarity",
			name = "Min NPC Rarity (1/x)",
			description = "NPC drops more rare than this are posted to Discord"
	)
	default int minRarity()
	{
		return 64;
	}

	@ConfigItem(
			keyName = "minvalue",
			name = "Min NPC Value",
			description = "NPC drops more valuable (GE or HA) than this are posted to Discord"
	)
	default int minValue()
	{
		return 50000;
	}

	@ConfigItem(
			keyName = "andinsteadofor",
			name = "Require both rarity and value",
			description = "Whether drops should meet both rarity AND value requirements to get posted"
	)
	default boolean andInsteadOfOr()
	{
		return false;
	}

	@ConfigItem(keyName = "sendscreenshot", name = "Send Screenshot", description = "Whether to send a screenshot")
	default boolean sendScreenshot()
	{
		return true;
	}

	@ConfigItem(
			keyName = "ignoredkeywords",
			name = "Ignored Keywords",
			description = "(NPC drops only) comma-separated list of keywords in item name for items to ignore"
	)
	default String ignoredKeywords()
	{
		return "grimy,seed";
	}
}
