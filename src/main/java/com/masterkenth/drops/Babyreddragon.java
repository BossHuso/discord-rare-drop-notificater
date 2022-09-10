package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Babyreddragon implements BaseNPC {
    public List<ItemData> drops;

    public Babyreddragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(534, 1f, "1", false));
        drops.add(new ItemData(23510, 0.04f, "1", false));
        drops.add(new ItemData(23512, 0.04f, "1", false));
        drops.add(new ItemData(23514, 0.04f, "1", false));
        drops.add(new ItemData(23499, 0.0125f, "1", false));
        drops.add(new ItemData(23083, 0.0015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
