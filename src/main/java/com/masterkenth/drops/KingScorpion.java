package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class KingScorpion implements BaseNPC {
    public List<ItemData> drops;

    public KingScorpion() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11941, 0.25f, "1", false));
        drops.add(new ItemData(13459, 0.04f, "1", false));
        drops.add(new ItemData(23182, 0.01f, "1", false));
        drops.add(new ItemData(23490, 0.0012642225031605564f, "1", false));
        drops.add(new ItemData(21257, 0.0033783783783783786f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
