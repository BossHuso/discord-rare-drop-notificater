package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Swordchick implements BaseNPC {
    public List<ItemData> drops;

    public Swordchick() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(314, 1f, "10-40", false));
        drops.add(new ItemData(10859, 0.1f, "1", false));
        drops.add(new ItemData(10880, 0.15f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
