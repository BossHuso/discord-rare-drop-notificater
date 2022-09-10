package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Frog implements BaseNPC {
    public List<ItemData> drops;

    public Frog() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
