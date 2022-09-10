package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedBronzeArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedBronzeArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "5", false));
        drops.add(new ItemData(1155, 0.9f, "1", false));
        drops.add(new ItemData(1117, 0.9f, "1", false));
        drops.add(new ItemData(1075, 0.9f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
