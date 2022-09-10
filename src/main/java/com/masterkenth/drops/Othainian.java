package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Othainian implements BaseNPC {
    public List<ItemData> drops;

    public Othainian() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25769, 1f, "1", false));
        drops.add(new ItemData(1497, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
