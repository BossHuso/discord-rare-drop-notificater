package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Skogre implements BaseNPC {
    public List<ItemData> drops;

    public Skogre() {
        drops = new ArrayList<>();
        drops.add(new ItemData(4812, 1f, "1", false));
        drops.add(new ItemData(4850, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
