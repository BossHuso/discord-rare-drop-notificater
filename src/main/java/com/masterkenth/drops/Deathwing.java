package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Deathwing implements BaseNPC {
    public List<ItemData> drops;

    public Deathwing() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
