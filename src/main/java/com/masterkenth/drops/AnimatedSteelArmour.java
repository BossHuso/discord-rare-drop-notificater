package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedSteelArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedSteelArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "15", false));
        drops.add(new ItemData(1157, 0.9f, "1", false));
        drops.add(new ItemData(1119, 1f, "1", false));
        drops.add(new ItemData(1069, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
