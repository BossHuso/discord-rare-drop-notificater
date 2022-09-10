package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Slagilith implements BaseNPC {
    public List<ItemData> drops;

    public Slagilith() {
        drops = new ArrayList<>();
        drops.add(new ItemData(449, 1f, "1", false));
        drops.add(new ItemData(1617, 1f, "1", false));
        drops.add(new ItemData(1619, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
