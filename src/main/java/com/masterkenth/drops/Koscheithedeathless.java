package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Koscheithedeathless implements BaseNPC {
    public List<ItemData> drops;

    public Koscheithedeathless() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3757, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
