package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Babyblackdragon implements BaseNPC {
    public List<ItemData> drops;

    public Babyblackdragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(534, 1f, "1", false));
        drops.add(new ItemData(23083, 0.006369426751592357f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
