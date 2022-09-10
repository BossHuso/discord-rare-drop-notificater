package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Unicorn implements BaseNPC {
    public List<ItemData> drops;

    public Unicorn() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(237, 1f, "1", false));
        drops.add(new ItemData(7821, 1f, "1", false));
        drops.add(new ItemData(13465, 0.02857142857142857f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
