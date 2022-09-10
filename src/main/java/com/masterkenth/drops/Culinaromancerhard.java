package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Culinaromancerhard implements BaseNPC {
    public List<ItemData> drops;

    public Culinaromancerhard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1891, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
