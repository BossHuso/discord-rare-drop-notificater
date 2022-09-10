package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Fox implements BaseNPC {
    public List<ItemData> drops;

    public Fox() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(21263, 0.125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
