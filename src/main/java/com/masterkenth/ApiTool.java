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

import org.json.JSONObject;

import net.runelite.client.RuneLite;

import java.io.IOException;
import java.io.File;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.IncorrectnessListener;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.SilentJavaScriptErrorListener;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.RequestBody;
import okhttp3.MediaType;
import okhttp3.MultipartBody;

public class ApiTool
{
  private static final String API_ROOT = "api.osrsbox.com";
  private static final String API_PATH_NPCS = "monsters";
  private static final String API_PATH_ITEMS = "items";
  private static final String WIKI_ROOT = "oldschool.runescape.wiki";
  private static ApiTool _instance;

  private OkHttpClient httpClient = null;

  public static ApiTool getInstance()
  {
    if (_instance == null)
    {
      _instance = new ApiTool();
      _instance.httpClient = new OkHttpClient.Builder()
          .cache(new Cache(new File(RuneLite.CACHE_DIR, "okhttp_drdn"), 20 * 1024 * 1024)) // 20mb cache
          .build();
    }
    return _instance;
  }

  public WebClient getWebClient()
  {
    WebClient htmlClient = new WebClient(BrowserVersion.CHROME);
    htmlClient.setCssErrorHandler(new SilentCssErrorHandler());
    htmlClient.setJavaScriptErrorListener(new SilentJavaScriptErrorListener());
    htmlClient.setIncorrectnessListener(new IncorrectnessListener()
    {
      @Override
      public void notify(String message, Object origin)
      {
      }
    });
    return htmlClient;
  }

  public CompletableFuture<JSONObject> getNPC(int npcId)
  {
    HttpUrl url = new HttpUrl.Builder().scheme("https").host(API_ROOT).addPathSegment(API_PATH_NPCS)
        .addPathSegment("" + npcId).build();

    Request request = new Request.Builder().url(url).build();

    return CallRequestJson(request);
  }

  public CompletableFuture<JSONObject> getItem(int itemId)
  {
    HttpUrl url = new HttpUrl.Builder().scheme("https").host(API_ROOT).addPathSegment(API_PATH_ITEMS)
        .addPathSegment("" + itemId).build();

    Request request = new Request.Builder().url(url).build();

    return CallRequestJson(request);
  }

  public CompletableFuture<String> getIconUrl(String searchType, int searchId, String searchName)
  {
    return CompletableFuture.supplyAsync(new Supplier<String>()
    {
      @Override
      public String get()
      {
        HttpUrl baseUrl = new HttpUrl.Builder().host(WIKI_ROOT).scheme("https").build();

        HttpUrl url = new HttpUrl.Builder().host(WIKI_ROOT).scheme("https").addPathSegments("w/Special:Lookup")
            .addQueryParameter("type", searchType).addQueryParameter("id", "" + searchId)
            .addQueryParameter("name", searchName).build();

        try
        {
          HtmlPage page = getWebClient().getPage(url.toString());
          DomNode imgNode = page.querySelector("td.inventory-image a.image img");
          String localIconPath = imgNode.getAttributes().getNamedItem("src").getNodeValue().substring(1);
          String absoluteIconPath = baseUrl.toString() + localIconPath;
          return absoluteIconPath;
        }
        catch (Exception e)
        {
          System.err.println("Unable to get icon url for " + searchId + " " + searchName + ": " + e.getMessage() + "("
              + url.toString() + ")");
          return null;
        }
      }
    });
  }

  public CompletableFuture<ResponseBody> postRaw(String url, String data, String type)
  {
    Request request = new Request.Builder().url(url).post(RequestBody.create(data, MediaType.parse(type))).build();

    return callRequest(request);
  }

  public CompletableFuture<Void> postFormImage(String url, byte[] imageBytes, String type)
  {
    MultipartBody.Builder requestBuilder = new MultipartBody.Builder().setType(MultipartBody.FORM)
        .addFormDataPart("file", "image.png", RequestBody.create(imageBytes, MediaType.parse(type)));

    Request request = new Request.Builder().url(url).post(requestBuilder.build()).build();

    return callRequest(request).thenAccept(rb ->
    {
    });
  }

  private CompletableFuture<ResponseBody> callRequest(Request request)
  {
    CompletableFuture<ResponseBody> future = new CompletableFuture<>();

    httpClient.newCall(request).enqueue(new Callback()
    {
      @Override
      public void onFailure(Call call, IOException e)
      {
        future.completeExceptionally(e);
      }

      @Override
      public void onResponse(Call call, Response response) throws IOException
      {
        System.out.println(String.format("ApiTool %s (%d)", request.url().toString(), response.code()));
        try (ResponseBody responseBody = response.body())
        {
          if (!response.isSuccessful())
          {
            future.completeExceptionally(new IOException("Unexpected code " + response));
          }
          else
          {
            future.complete(responseBody);
          }
        }
        response.close();
      }
    });

    return future;
  }

  private CompletableFuture<JSONObject> CallRequestJson(Request request)
  {
    System.out.println("ApiTool " + request.url().toString());
    return callRequest(request).thenCompose(responseBody ->
    {
      CompletableFuture<JSONObject> f = new CompletableFuture<>();
      try
      {
        f.complete(new JSONObject(responseBody.string()));
      }
      catch (Exception e)
      {
        f.completeExceptionally(e);
      }
      return f;
    });
  }
}
