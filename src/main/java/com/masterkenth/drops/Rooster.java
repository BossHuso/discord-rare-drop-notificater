package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Rooster implements BaseNPC {
    public List<ItemData> drops;

    public Rooster() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(2138, 1f, "1", false));
        drops.add(new ItemData(314, 0.5f, "5", false));
        drops.add(new ItemData(314, 0.25f, "15", false));
        drops.add(new ItemData(23182, 0.0033333333333333335f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
