package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Blackbear implements BaseNPC {
    public List<ItemData> drops;

    public Blackbear() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(948, 1f, "1", false));
        drops.add(new ItemData(2136, 1f, "1", false));
        drops.add(new ItemData(7815, 1f, "1", false));
        drops.add(new ItemData(11941, 0.14285714285714285f, "1", false));
        drops.add(new ItemData(13462, 0.04f, "1", false));
        drops.add(new ItemData(23182, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(23490, 0.0008223684210526315f, "1", false));
        drops.add(new ItemData(21257, 0.0033333333333333335f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
