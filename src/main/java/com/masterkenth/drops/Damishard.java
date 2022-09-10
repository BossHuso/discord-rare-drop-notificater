package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Damishard implements BaseNPC {
    public List<ItemData> drops;

    public Damishard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(4673, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
