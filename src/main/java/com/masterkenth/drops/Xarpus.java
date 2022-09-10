package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Xarpus implements BaseNPC {
    public List<ItemData> drops;

    public Xarpus() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22512, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
