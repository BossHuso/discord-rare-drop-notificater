package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cavegoblinminer implements BaseNPC {
    public List<ItemData> drops;

    public Cavegoblinminer() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(5013, 0.15625f, "1", false));
        drops.add(new ItemData(995, 0.15625f, "6", false));
        drops.add(new ItemData(440, 0.15625f, "7", false));
        drops.add(new ItemData(590, 0.15625f, "1", false));
        drops.add(new ItemData(440, 0.1171875f, "2", false));
        drops.add(new ItemData(442, 0.0390625f, "1", false));
        drops.add(new ItemData(7905, 0.25f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
