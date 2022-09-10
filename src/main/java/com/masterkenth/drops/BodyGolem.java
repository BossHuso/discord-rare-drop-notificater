package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BodyGolem implements BaseNPC {
    public List<ItemData> drops;

    public BodyGolem() {
        drops = new ArrayList<>();
        drops.add(new ItemData(434, 0.11538461538461539f, "3-4", false));
        drops.add(new ItemData(1621, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(1619, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(25676, 0.2f, "10-20", false));
        drops.add(new ItemData(25698, 0.13333333333333333f, "1", false));
        drops.add(new ItemData(25639, 0.004f, "1", false));
        drops.add(new ItemData(23182, 0.01f, "1", false));
        drops.add(new ItemData(436, 0.11538461538461539f, "3-4", false));
        drops.add(new ItemData(438, 0.11538461538461539f, "3-4", false));
        drops.add(new ItemData(440, 0.11538461538461539f, "2-3", false));
        drops.add(new ItemData(1436, 0.11538461538461539f, "4-6", false));
        drops.add(new ItemData(1436, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(559, 0.15384615384615385f, "5-10", false));
        drops.add(new ItemData(559, 0.11538461538461539f, "1", false));
        drops.add(new ItemData(1623, 0.07692307692307693f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
