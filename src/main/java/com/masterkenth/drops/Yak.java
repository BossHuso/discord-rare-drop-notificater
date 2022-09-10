package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Yak implements BaseNPC {
    public List<ItemData> drops;

    public Yak() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(10818, 1f, "1", false));
        drops.add(new ItemData(10814, 1f, "1", false));
        drops.add(new ItemData(10816, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
