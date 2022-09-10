package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ManiacalMonkeyArcher implements BaseNPC {
    public List<ItemData> drops;

    public ManiacalMonkeyArcher() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3179, 1f, "1", false));
        drops.add(new ItemData(143, 0.1f, "1", false));
        drops.add(new ItemData(954, 0.05f, "1", false));
        drops.add(new ItemData(1325, 0.1f, "1", false));
        drops.add(new ItemData(853, 0.05f, "1", false));
        drops.add(new ItemData(8778, 0.15f, "1", false));
        drops.add(new ItemData(199, 0.1f, "1", false));
        drops.add(new ItemData(1963, 0.1f, "1", false));
        drops.add(new ItemData(5626, 0.05f, "5", false));
        drops.add(new ItemData(177, 0.1f, "1", false));
        drops.add(new ItemData(365, 0.2f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
