package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CorruptedBear implements BaseNPC {
    public List<ItemData> drops;

    public CorruptedBear() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23871, 1f, "1", false));
        drops.add(new ItemData(23872, 0.125f, "5", false));
        drops.add(new ItemData(23831, 0.001953125f, "1", false));
        drops.add(new ItemData(23858, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
