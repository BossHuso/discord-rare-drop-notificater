package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Spidine implements BaseNPC {
    public List<ItemData> drops;

    public Spidine() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(223, 1f, "3-6", false));
        drops.add(new ItemData(10879, 0.15f, "1", false));
        drops.add(new ItemData(10859, 0.1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
