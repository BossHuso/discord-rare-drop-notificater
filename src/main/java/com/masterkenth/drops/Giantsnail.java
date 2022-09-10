package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Giantsnail implements BaseNPC {
    public List<ItemData> drops;

    public Giantsnail() {
        drops = new ArrayList<>();
        drops.add(new ItemData(7800, 1f, "1", false));
        drops.add(new ItemData(10996, 0.02f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
