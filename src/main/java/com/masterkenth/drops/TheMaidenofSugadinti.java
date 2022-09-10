package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TheMaidenofSugadinti implements BaseNPC {
    public List<ItemData> drops;

    public TheMaidenofSugadinti() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22504, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
