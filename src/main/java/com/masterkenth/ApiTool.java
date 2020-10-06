package com.masterkenth;

import org.json.JSONObject;

import java.io.IOException;

import java.util.concurrent.CompletableFuture;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;

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

  public CompletableFuture<ResponseBody> postRaw(String url, String data, String type) {
    Request request = new Request.Builder()
      .url(url)
      .post(RequestBody.create(data, MediaType.parse(type)))
      .build();
    
    return callRequest(request);
  }

  public CompletableFuture<Void> postFormImage(String url, byte[] imageBytes, String type) {
    MultipartBody.Builder requestBuilder = new MultipartBody.Builder()
    .setType(MultipartBody.FORM)
    .addFormDataPart("file", "image.png", RequestBody.create(imageBytes, MediaType.parse(type)));

    Request request = new Request.Builder()
    .url(url)
    .post(requestBuilder.build())
    .build();

    return callRequest(request)
    .thenAccept(rb -> {});
  }

  public CompletableFuture<JSONObject> getNPC(int npcId) {
    HttpUrl url = new HttpUrl.Builder()
      .scheme("https")
      .host(API_ROOT)
      .addPathSegment(API_PATH_NPCS)
      .addPathSegment("" + npcId)
      .build();

    Request request = new Request.Builder()
      .url(url)
      .build();

    return CallRequestJson(request);
  }

  public CompletableFuture<JSONObject> getItem(int itemId) {
    HttpUrl url = new HttpUrl.Builder()
      .scheme("https")
      .host(API_ROOT)
      .addPathSegment(API_PATH_ITEMS)
      .addPathSegment("" + itemId)
      .build();

    Request request = new Request.Builder()
      .url(url)
      .build();

    return CallRequestJson(request);
  }

  private CompletableFuture<ResponseBody> callRequest(Request request) {
    CompletableFuture<ResponseBody> future = new CompletableFuture<>();

    httpClient.newCall(request).enqueue(new Callback() {
      @Override public void onFailure(Call call, IOException e) {
        future.completeExceptionally(e);
      }

      @Override public void onResponse(Call call, Response response) throws IOException {
        try (ResponseBody responseBody = response.body()) {
          if (!response.isSuccessful()) {
            future.completeExceptionally(new IOException("Unexpected code " + response));
          } else {
            future.complete(responseBody);
          }
        }
      }
    });

    return future;
  }

  private CompletableFuture<JSONObject> CallRequestJson(Request request) {
    return callRequest(request)
    .thenCompose(responseBody -> {
      CompletableFuture<JSONObject> f = new CompletableFuture<>();
      try {
        f.complete(new JSONObject(responseBody.string()));
      } catch (Exception e) {
        f.completeExceptionally(e);
      }
      return f;
    });
  }
}
