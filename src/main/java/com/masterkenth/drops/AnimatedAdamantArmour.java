package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AnimatedAdamantArmour implements BaseNPC {
    public List<ItemData> drops;

    public AnimatedAdamantArmour() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8851, 1f, "30", false));
        drops.add(new ItemData(1161, 1f, "1", false));
        drops.add(new ItemData(1123, 1f, "1", false));
        drops.add(new ItemData(1073, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
