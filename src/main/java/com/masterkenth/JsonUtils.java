package com.masterkenth;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;
import com.masterkenth.models.Npc;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;

@Slf4j
@Singleton
public class JsonUtils
{
	private final List<Npc> npcList;

	@Inject
	public JsonUtils(Gson gson)
	{
		try(InputStreamReader reader = new InputStreamReader(
				Objects.requireNonNull(DiscordRareDropNotificaterPlugin.class.getResourceAsStream("/monster-drops.json")),
				StandardCharsets.UTF_8)) {
			npcList = Arrays.asList(gson.fromJson(reader, Npc[].class));
		}
		catch (Exception e)
		{
			log.error("Error getting json", e);
			throw new RuntimeException(e);
		}
	}

	public Npc getNpc(String npcName)
	{
		return npcList.stream().filter((i) -> npcName.equals(i.getNpcName())).findFirst().orElse(null);
	}
}
