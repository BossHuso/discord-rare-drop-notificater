package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mudskipper implements BaseNPC {
    public List<ItemData> drops;

    public Mudskipper() {
        drops = new ArrayList<>();
        drops.add(new ItemData(7532, 1f, "1", false));
        drops.add(new ItemData(407, 0.171875f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
