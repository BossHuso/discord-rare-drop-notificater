package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mosquitoswarm implements BaseNPC {
    public List<ItemData> drops;

    public Mosquitoswarm() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6319, 1f, "3", false));
        drops.add(new ItemData(6319, 1f, "5", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
