package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Unicow implements BaseNPC {
    public List<ItemData> drops;

    public Unicow() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(237, 1f, "2-4", false));
        drops.add(new ItemData(10878, 0.15f, "1", false));
        drops.add(new ItemData(10859, 0.1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
