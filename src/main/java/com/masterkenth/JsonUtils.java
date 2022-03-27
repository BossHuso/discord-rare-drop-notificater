package com.masterkenth;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

@Slf4j
public class JsonUtils
{
	private static JsonUtils _instance;
	private final JSONObject cachedMonsterDropList;

	public static JsonUtils getInstance()
	{
		if (_instance == null)
		{
			_instance = new JsonUtils();
		}

		return _instance;
	}

	private CompletableFuture<JSONObject> getMonsterDropJson()
	{
		return CompletableFuture.supplyAsync(() -> cachedMonsterDropList);
	}

	public JsonUtils()
	{
		cachedMonsterDropList = getJsonFromResource("/monster-drops.json");
	}

	public CompletableFuture<JSONArray> getNpcDropList(int npcId)
	{
		CompletableFuture<JSONArray> f = new CompletableFuture<>();
		getMonsterDropJson().thenAccept(json -> {
			f.complete(json.getJSONArray(String.valueOf(npcId)));
		});

		return f;
	}

	private JSONObject getJsonFromResource(String resource)
	{
		try (BufferedReader br = new BufferedReader(
			new InputStreamReader(
				Objects.requireNonNull(DiscordRareDropNotificaterPlugin.class.getResourceAsStream(resource)),
				StandardCharsets.UTF_8)))
		{
			String json = br.lines().collect(Collectors.joining("\n"));
			return new JSONObject(json);
		}
		catch (Exception e)
		{
			log.error("Error getting json", e);
			throw new RuntimeException(e);
		}
	}
}
