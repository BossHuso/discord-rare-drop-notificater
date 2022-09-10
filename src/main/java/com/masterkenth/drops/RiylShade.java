package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class RiylShade implements BaseNPC {
    public List<ItemData> drops;

    public RiylShade() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3400, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
