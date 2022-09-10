package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GiantScarabhard implements BaseNPC {
    public List<ItemData> drops;

    public GiantScarabhard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(10581, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
