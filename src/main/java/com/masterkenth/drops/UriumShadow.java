package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class UriumShadow implements BaseNPC {
    public List<ItemData> drops;

    public UriumShadow() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25419, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
