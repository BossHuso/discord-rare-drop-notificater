package com.masterkenth;

import java.util.concurrent.CompletableFuture;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import lombok.extern.slf4j.Slf4j;

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
