package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Possessedpickaxe implements BaseNPC {
    public List<ItemData> drops;

    public Possessedpickaxe() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1267, 1f, "1", false));
        drops.add(new ItemData(1267, 0.95f, "1", false));
        drops.add(new ItemData(1269, 0.02f, "1", false));
        drops.add(new ItemData(1273, 0.02f, "1", false));
        drops.add(new ItemData(1271, 0.008f, "1", false));
        drops.add(new ItemData(1275, 0.002f, "1", false));
        drops.add(new ItemData(2801, 0.00390625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
