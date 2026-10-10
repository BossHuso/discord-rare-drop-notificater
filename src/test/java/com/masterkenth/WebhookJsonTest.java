package com.masterkenth;

import com.google.gson.Gson;
import com.masterkenth.discord.Author;
import com.masterkenth.discord.Embed;
import com.masterkenth.discord.Field;
import com.masterkenth.discord.Image;
import com.masterkenth.discord.Webhook;
import com.masterkenth.models.Npc;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class WebhookJsonTest
{
	private final Gson gson = new Gson();

	@Test
	public void embedUsesDiscordKeysAndOmitsNulls()
	{
		Author author = new Author();
		author.setName("Player");
		author.setIcon_url("https://example.com/icon.png");

		Field field = new Field();
		field.setName("Rarity");
		field.setValue("1/128");
		field.setInline(true);

		Image thumbnail = new Image();
		thumbnail.setUrl("https://example.com/item.png");

		Embed embed = new Embed();
		embed.setAuthor(author);
		embed.setDescription("Just got an item");
		embed.setThumbnail(thumbnail);
		embed.setFields(new Field[]{field});

		Webhook webhook = new Webhook();
		webhook.setEmbeds(new Embed[]{embed});

		// Same shape org.json produced from the getters: icon_url and inline keys, null image and content left out
		assertEquals("{\"embeds\":[{\"author\":{\"name\":\"Player\",\"icon_url\":\"https://example.com/icon.png\"},"
				+ "\"description\":\"Just got an item\",\"thumbnail\":{\"url\":\"https://example.com/item.png\"},"
				+ "\"fields\":[{\"name\":\"Rarity\",\"value\":\"1/128\",\"inline\":true}]}]}",
			gson.toJson(webhook));
	}

	@Test
	public void plainTextMessageHasContentOnly()
	{
		Webhook webhook = new Webhook();
		webhook.setContent("**Player** - Just got **Item**");

		assertEquals("{\"content\":\"**Player** - Just got **Item**\"}", gson.toJson(webhook));
	}

	@Test
	public void dropTableLoadsWithoutTypeToken()
	{
		JsonUtils jsonUtils = new JsonUtils(gson);

		Npc npc = jsonUtils.getNpc("Aberrant spectre");
		assertNotNull(npc);
		assertTrue(npc.getItems().size() > 0);
		assertEquals(Integer.valueOf(1623), npc.getItems().get(0).getItemID());
	}
}
