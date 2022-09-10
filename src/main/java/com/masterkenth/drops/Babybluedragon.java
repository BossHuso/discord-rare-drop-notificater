package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Babybluedragon implements BaseNPC {
    public List<ItemData> drops;

    public Babybluedragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(534, 1f, "1", false));
        drops.add(new ItemData(7839, 0.25f, "1", false));
        drops.add(new ItemData(23083, 0.0015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
