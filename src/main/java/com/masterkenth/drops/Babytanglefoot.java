package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Babytanglefoot implements BaseNPC {
    public List<ItemData> drops;

    public Babytanglefoot() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6020, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
