package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Karamelhard implements BaseNPC {
    public List<ItemData> drops;

    public Karamelhard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6794, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
