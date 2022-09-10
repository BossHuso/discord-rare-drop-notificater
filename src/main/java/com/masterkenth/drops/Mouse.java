package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mouse implements BaseNPC {
    public List<ItemData> drops;

    public Mouse() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1985, 0.125f, "1", false));
        drops.add(new ItemData(995, 0.125f, "3-237", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
