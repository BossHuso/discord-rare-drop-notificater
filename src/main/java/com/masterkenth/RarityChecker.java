package com.masterkenth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Future;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.entry;    

import org.json.JSONArray;
import org.json.JSONObject;

import lombok.extern.slf4j.Slf4j;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Call;
import okhttp3.Callback;

import net.runelite.api.ItemID;
import net.runelite.api.ItemComposition;
import net.runelite.client.game.ItemManager;

@Slf4j
public class RarityChecker {
  public float CheckRarityEvent(String eventName, int itemId) {
    String lowerName = eventName.toLowerCase();
    Map<Integer, Float> table = RarityTables.EVENT_TABLE_MAPPING.getOrDefault(lowerName, null);
    if (table != null) {
      if(table.containsKey(itemId)) {
        return table.get(itemId);
      } else {
        return -1f;
      }
    } else {
      log.warn("No event table for '" + eventName + "'");
    }

    return -1f;
  }

  public CompletableFuture<Float> CheckRarityNPC(int npcId, int itemId) {
    CompletableFuture<Float> f = new CompletableFuture<>();

    ApiTool.getInstance().getNPC(npcId)
    .thenAccept(npcJson -> {
      try {
        JSONArray drops = npcJson.getJSONArray("drops");
  
        for(int i = 0; i < drops.length(); i++) {
          JSONObject drop = drops.getJSONObject(i);
          int dropId = drop.getInt("id");
          if(dropId == itemId) {
            float rarity = drop.getFloat("rarity");
            f.complete(rarity);
          }
        }
      } catch (Exception e) {
        f.completeExceptionally(e);
      }
    });

    return f;
  }
}
