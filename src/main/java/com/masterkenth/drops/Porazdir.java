package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Porazdir implements BaseNPC {
    public List<ItemData> drops;

    public Porazdir() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21799, 1f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(21257, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
