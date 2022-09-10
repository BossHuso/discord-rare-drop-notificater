package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cowhard implements BaseNPC {
    public List<ItemData> drops;

    public Cowhard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1739, 1f, "1", false));
        drops.add(new ItemData(2132, 1f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
