package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zamorakranger implements BaseNPC {
    public List<ItemData> drops;

    public Zamorakranger() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(849, 0.04f, "1", false));
        drops.add(new ItemData(847, 0.02f, "1", false));
        drops.add(new ItemData(886, 0.04f, "10", false));
        drops.add(new ItemData(888, 0.04f, "10", false));
        drops.add(new ItemData(888, 0.02f, "20", false));
        drops.add(new ItemData(995, 0.8f, "100", false));
        drops.add(new ItemData(1777, 0.04f, "10", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
