package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CorruptedUnicorn implements BaseNPC {
    public List<ItemData> drops;

    public CorruptedUnicorn() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23824, 1f, "50-105", false));
        drops.add(new ItemData(23872, 0.125f, "4", false));
        drops.add(new ItemData(23871, 0.125f, "1", false));
        drops.add(new ItemData(23858, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
