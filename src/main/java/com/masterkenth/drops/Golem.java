package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Golem implements BaseNPC {
    public List<ItemData> drops;

    public Golem() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23907, 1f, "16-24", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
