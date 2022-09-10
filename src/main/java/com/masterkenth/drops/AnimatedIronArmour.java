package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedIronArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedIronArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "10", false));
        drops.add(new ItemData(1153, 1f, "1", false));
        drops.add(new ItemData(1115, 1f, "1", false));
        drops.add(new ItemData(1067, 0.9f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
