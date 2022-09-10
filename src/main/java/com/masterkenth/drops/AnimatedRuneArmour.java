package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedRuneArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedRuneArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "40", false));
        drops.add(new ItemData(1163, 1f, "1", false));
        drops.add(new ItemData(1127, 1f, "1", false));
        drops.add(new ItemData(1079, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
