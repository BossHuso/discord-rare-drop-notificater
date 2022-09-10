package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Crab implements BaseNPC {
    public List<ItemData> drops;

    public Crab() {
        drops = new ArrayList<>();
        drops.add(new ItemData(7518, 1f, "1", false));
        drops.add(new ItemData(7536, 0.125f, "1", false));
        drops.add(new ItemData(7538, 0.125f, "1", false));
        drops.add(new ItemData(407, 0.1f, "2", false));
        drops.add(new ItemData(7536, 0.0625f, "1", false));
        drops.add(new ItemData(7538, 0.0625f, "1", false));
        drops.add(new ItemData(407, 0.1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
