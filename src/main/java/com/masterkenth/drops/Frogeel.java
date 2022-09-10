package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Frogeel implements BaseNPC {
    public List<ItemData> drops;

    public Frogeel() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(5001, 1f, "5-10", false));
        drops.add(new ItemData(10877, 0.15f, "1", false));
        drops.add(new ItemData(10859, 0.1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
