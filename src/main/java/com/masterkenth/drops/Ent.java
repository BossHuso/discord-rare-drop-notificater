package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ent implements BaseNPC {
    public List<ItemData> drops;

    public Ent() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1511, 0.001953125f, "1", false));
        drops.add(new ItemData(1521, 0.001953125f, "2", false));
        drops.add(new ItemData(1519, 0.001953125f, "2", false));
        drops.add(new ItemData(1517, 0.001953125f, "2", false));
        drops.add(new ItemData(1515, 0.001953125f, "2", false));
        drops.add(new ItemData(1513, 0.001953125f, "2", false));
        drops.add(new ItemData(21257, 0.00423728813559322f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
