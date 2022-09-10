package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BearCub implements BaseNPC {
    public List<ItemData> drops;

    public BearCub() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(948, 1f, "1", false));
        drops.add(new ItemData(2136, 1f, "1", false));
        drops.add(new ItemData(7815, 1f, "1", false));
        drops.add(new ItemData(13462, 0.04f, "1", false));
        drops.add(new ItemData(23182, 0.011111111111111112f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
