package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SummonedZombie implements BaseNPC {
    public List<ItemData> drops;

    public SummonedZombie() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(6807, 0.0002f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
