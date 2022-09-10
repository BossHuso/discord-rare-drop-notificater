package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class KnightofArdougne implements BaseNPC {
    public List<ItemData> drops;

    public KnightofArdougne() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 1f, "50", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
