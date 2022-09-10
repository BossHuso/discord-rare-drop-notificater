package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class FlawedGolem implements BaseNPC {
    public List<ItemData> drops;

    public FlawedGolem() {
        drops = new ArrayList<>();
        drops.add(new ItemData(434, 0.15384615384615385f, "1", false));
        drops.add(new ItemData(25676, 0.0625f, "6-12", false));
        drops.add(new ItemData(25639, 0.0013333333333333333f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
        drops.add(new ItemData(434, 0.09615384615384616f, "2", false));
        drops.add(new ItemData(434, 0.057692307692307696f, "3", false));
        drops.add(new ItemData(1436, 0.23076923076923078f, "1-3", false));
        drops.add(new ItemData(1436, 0.17307692307692307f, "2-4", false));
        drops.add(new ItemData(438, 0.11538461538461539f, "1-2", false));
        drops.add(new ItemData(436, 0.11538461538461539f, "1-2", false));
        drops.add(new ItemData(1623, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(1621, 0.019230769230769232f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
