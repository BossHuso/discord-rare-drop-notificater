package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedMithrilArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedMithrilArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "25", false));
        drops.add(new ItemData(1159, 1f, "1", false));
        drops.add(new ItemData(1121, 1f, "1", false));
        drops.add(new ItemData(1071, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
