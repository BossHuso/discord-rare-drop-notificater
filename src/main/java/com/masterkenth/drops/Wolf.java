package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Wolf implements BaseNPC {
    public List<ItemData> drops;

    public Wolf() {
        drops = new ArrayList<>();
        drops.add(new ItemData(2859, 1f, "1", false));
        drops.add(new ItemData(7830, 0.25f, "1", false));
        drops.add(new ItemData(11941, 0.16666666666666666f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
