package com.masterkenth;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Future;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Call;
import okhttp3.Callback;

public class RarityChecker {
  private static final String API_ROOT = "api.osrsbox.com";
  private static final String API_PATH_NPCS = "monsters";
  private static final String API_PATH_ITEMS = "items";

  private final OkHttpClient httpClient = new OkHttpClient();

  public CompletableFuture<Float> CheckRarity(int npcId, int itemId) {
    // TODO: Give actual rarity
    CompletableFuture<Float> f = new CompletableFuture<>();
    
    HttpUrl url = new HttpUrl.Builder()
      .scheme("https")
      .host(API_ROOT)
      .addPathSegment(API_PATH_NPCS)
      .addPathSegment("" + npcId)
      .build();

    Request request = new Request.Builder()
      .url(url)
      .build();

    httpClient.newCall(request).enqueue(new Callback() {
      @Override public void onFailure(Call call, IOException e) {
        f.completeExceptionally(e);
      }

      @Override public void onResponse(Call call, Response response) throws IOException {
        try (ResponseBody responseBody = response.body()) {
          if (!response.isSuccessful()) {
            f.completeExceptionally(new IOException("Unexpected code " + response));
          } else {
            String jsonBody = responseBody.string();
            f.complete(ParseNPCItemRarity(jsonBody, itemId));
          }
        }
      }
    });

    return f;
  }

  private float ParseNPCItemRarity(String jsonBody, int itemId) {
    try {
      JSONObject jsonObject = new JSONObject(jsonBody);
      JSONArray drops = jsonObject.getJSONArray("drops");
  
      for(int i = 0; i < drops.length(); i++) {
        JSONObject drop = drops.getJSONObject(i);
        int dropId = drop.getInt("id");
        if(dropId == itemId) {
          float rarity = drop.getFloat("rarity");
          return rarity;
        }
      }
    } catch (Exception e) {
      //TODO: handle exception
    }
    
    return -1;
  }
}
