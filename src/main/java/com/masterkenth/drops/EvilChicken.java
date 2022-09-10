package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class EvilChicken implements BaseNPC {
    public List<ItemData> drops;

    public EvilChicken() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(2138, 1f, "1", false));
        drops.add(new ItemData(314, 1f, "50-250", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
