package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class UndeadLumberjack implements BaseNPC {
    public List<ItemData> drops;

    public UndeadLumberjack() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(960, 1f, "1", false));
        drops.add(new ItemData(10939, 0.25f, "1", false));
        drops.add(new ItemData(10940, 0.25f, "1", false));
        drops.add(new ItemData(10941, 0.25f, "1", false));
        drops.add(new ItemData(10933, 0.25f, "1", false));
        drops.add(new ItemData(6807, 0.0002f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
