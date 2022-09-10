package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ghoul implements BaseNPC {
    public List<ItemData> drops;

    public Ghoul() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(7881, 0.25f, "1", false));
        drops.add(new ItemData(6799, 0.0002f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
