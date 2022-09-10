package com.masterkenth;

public class ItemData
{
	public Integer ItemId;
	public Integer GePrice;
	public int HaPrice;

	public String Quantity = "";
	public float Rarity = 1f;
	public boolean Unique = false;

	public ItemData() {
	}

	public ItemData(Integer iItemId, float fRarity, String sQuantity, boolean bUnique) {
		ItemId = iItemId;
		Rarity = fRarity;
		Quantity = sQuantity;
		Unique = bUnique;
	}
}
