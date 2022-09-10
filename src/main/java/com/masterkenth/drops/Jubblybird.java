package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Jubblybird implements BaseNPC {
    public List<ItemData> drops;

    public Jubblybird() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(7566, 1f, "1", false));
        drops.add(new ItemData(314, 1f, "25-32", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
