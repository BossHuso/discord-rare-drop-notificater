package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Elvarg implements BaseNPC {
    public List<ItemData> drops;

    public Elvarg() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
