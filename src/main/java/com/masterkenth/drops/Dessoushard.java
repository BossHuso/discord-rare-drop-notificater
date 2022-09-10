package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dessoushard implements BaseNPC {
    public List<ItemData> drops;

    public Dessoushard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3325, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
