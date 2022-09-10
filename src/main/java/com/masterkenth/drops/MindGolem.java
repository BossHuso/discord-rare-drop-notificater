package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class MindGolem implements BaseNPC {
    public List<ItemData> drops;

    public MindGolem() {
        drops = new ArrayList<>();
        drops.add(new ItemData(434, 0.11538461538461539f, "2-3", false));
        drops.add(new ItemData(1621, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(1619, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(25676, 0.13333333333333333f, "8-16", false));
        drops.add(new ItemData(25696, 0.13333333333333333f, "1", false));
        drops.add(new ItemData(25639, 0.002f, "1", false));
        drops.add(new ItemData(23182, 0.001953125f, "1", false));
        drops.add(new ItemData(436, 0.11538461538461539f, "2-3", false));
        drops.add(new ItemData(438, 0.11538461538461539f, "2-3", false));
        drops.add(new ItemData(440, 0.11538461538461539f, "1-2", false));
        drops.add(new ItemData(1436, 0.11538461538461539f, "3-5", false));
        drops.add(new ItemData(1436, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(558, 0.15384615384615385f, "5-10", false));
        drops.add(new ItemData(558, 0.11538461538461539f, "1", false));
        drops.add(new ItemData(1623, 0.07692307692307693f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
