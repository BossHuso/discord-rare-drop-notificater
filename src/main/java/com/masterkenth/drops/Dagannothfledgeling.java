package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dagannothfledgeling implements BaseNPC {
    public List<ItemData> drops;

    public Dagannothfledgeling() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(23083, 0.0035714285714285713f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
