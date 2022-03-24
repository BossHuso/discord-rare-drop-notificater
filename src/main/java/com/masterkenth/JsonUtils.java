package com.masterkenth;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
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
		if (_instance == null){
			_instance = new JsonUtils();
		}

		return _instance;
	}

	private CompletableFuture<JSONObject> getMonsterDropJson(){
		return CompletableFuture.supplyAsync(() -> cachedMonsterDropList);
	}

	public JsonUtils(){
		cachedMonsterDropList = getJsonFromResource("monster-drops.json");
	}

	public CompletableFuture<JSONArray> getNpcDropList(int npcId){
		CompletableFuture<JSONArray> f = new CompletableFuture<>();
		getMonsterDropJson().thenAccept(json -> {
			f.complete(json.getJSONArray(String.valueOf(npcId)));
		});

		return f;
	}

	private JSONObject getJsonFromResource(String resource)
	{
		try (InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource))
		{
			assert in != null;
			try (BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8)))
			{
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();

				while (line != null)
				{
					sb.append(line);
					sb.append(System.lineSeparator());
					line = br.readLine();
				}

				return new JSONObject(sb.toString());
			}
			catch (Exception e)
			{
				log.error("Error getting json", e);
				throw new RuntimeException(e);
			}

		}
		catch (Exception e)
		{
			log.error("Error getting file", e);
			throw new RuntimeException(e);
		}
	}
}
