package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Hero implements BaseNPC {
    public List<ItemData> drops;

    public Hero() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.8203125f, "200-300", false));
        drops.add(new ItemData(560, 0.0625f, "2", false));
        drops.add(new ItemData(1993, 0.046875f, "1", false));
        drops.add(new ItemData(565, 0.0390625f, "1", false));
        drops.add(new ItemData(1601, 0.0078125f, "1", false));
        drops.add(new ItemData(569, 0.015625f, "1", false));
        drops.add(new ItemData(444, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
