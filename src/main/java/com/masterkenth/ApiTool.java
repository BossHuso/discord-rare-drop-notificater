package com.masterkenth;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Future;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.RequestBody;
import okhttp3.MediaType;

public class ApiTool {
  private static final String API_ROOT = "api.osrsbox.com";
  private static final String API_PATH_NPCS = "monsters";
  private static final String API_PATH_ITEMS = "items";
  private static ApiTool _instance;
  
  private OkHttpClient httpClient = new OkHttpClient();

  public static ApiTool getInstance() {
    if(_instance == null) {
      _instance = new ApiTool();
    }
    return _instance;
  }

  public CompletableFuture<Void> postRaw(String url, String data, String type) {
    CompletableFuture<Void> f = new CompletableFuture<>();

    Request request = new Request.Builder()
      .url(url)
      .post(RequestBody.create(data, MediaType.parse(type)))
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
            f.complete(null);
          }
        }
      }
    });

    return f;
  }

  public CompletableFuture<JSONObject> getNPC(int npcId) {
    CompletableFuture<JSONObject> f = new CompletableFuture<>();

    HttpUrl url = new HttpUrl.Builder()
      .scheme("https")
      .host(API_ROOT)
      .addPathSegment(API_PATH_NPCS)
      .addPathSegment("" + npcId)
      .build();

    Request request = new Request.Builder()
      .url(url)
      .build();

      CallRequestJson(request, f);

    return f;
  }

  public CompletableFuture<JSONObject> getItem(int itemId) {
    CompletableFuture<JSONObject> f = new CompletableFuture<>();

    HttpUrl url = new HttpUrl.Builder()
      .scheme("https")
      .host(API_ROOT)
      .addPathSegment(API_PATH_ITEMS)
      .addPathSegment("" + itemId)
      .build();

    Request request = new Request.Builder()
      .url(url)
      .build();

      CallRequestJson(request, f);

    return f;
  }

  private void CallRequestJson(Request request, CompletableFuture<JSONObject> future) {
    httpClient.newCall(request).enqueue(new Callback() {
      @Override public void onFailure(Call call, IOException e) {
        future.completeExceptionally(e);
      }

      @Override public void onResponse(Call call, Response response) throws IOException {
        try (ResponseBody responseBody = response.body()) {
          if (!response.isSuccessful()) {
            future.completeExceptionally(new IOException("Unexpected code " + response));
          } else {
            String jsonBody = responseBody.string();
            future.complete(new JSONObject(jsonBody));
          }
        }
      }
    });
  }
}
