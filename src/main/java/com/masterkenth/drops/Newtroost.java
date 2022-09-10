package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Newtroost implements BaseNPC {
    public List<ItemData> drops;

    public Newtroost() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(221, 1f, "4-10", false));
        drops.add(new ItemData(10859, 0.1f, "1", false));
        drops.add(new ItemData(10882, 0.15f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
