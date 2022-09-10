package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ghost implements BaseNPC {
    public List<ItemData> drops;

    public Ghost() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23182, 0.011111111111111112f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
