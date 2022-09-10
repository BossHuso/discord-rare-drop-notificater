package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Chronozonhard implements BaseNPC {
    public List<ItemData> drops;

    public Chronozonhard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25769, 1f, "1", false));
        drops.add(new ItemData(779, 1f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
