package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Shade implements BaseNPC {
    public List<ItemData> drops;

    public Shade() {
        drops = new ArrayList<>();
        drops.add(new ItemData(546, 0.25f, "1", false));
        drops.add(new ItemData(548, 0.25f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
