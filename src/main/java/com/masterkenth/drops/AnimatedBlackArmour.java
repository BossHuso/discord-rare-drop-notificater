package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedBlackArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedBlackArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "20", false));
        drops.add(new ItemData(1165, 1f, "1", false));
        drops.add(new ItemData(1125, 1f, "1", false));
        drops.add(new ItemData(1077, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
