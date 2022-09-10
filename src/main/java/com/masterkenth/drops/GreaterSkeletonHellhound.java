package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GreaterSkeletonHellhound implements BaseNPC {
    public List<ItemData> drops;

    public GreaterSkeletonHellhound() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(6806, 0.0002f, "1", false));
        drops.add(new ItemData(23490, 0.016129032258064516f, "1", false));
        drops.add(new ItemData(21257, 0.005952380952380952f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
