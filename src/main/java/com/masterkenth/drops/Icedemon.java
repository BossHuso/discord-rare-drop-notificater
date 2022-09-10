package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Icedemon implements BaseNPC {
    public List<ItemData> drops;

    public Icedemon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25766, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
