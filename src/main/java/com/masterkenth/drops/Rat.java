package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Rat implements BaseNPC {
    public List<ItemData> drops;

    public Rat() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(300, 1f, "1", false));
        drops.add(new ItemData(7836, 0.25f, "1", false));
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
