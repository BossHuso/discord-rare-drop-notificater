package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Jubster implements BaseNPC {
    public List<ItemData> drops;

    public Jubster() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(7566, 1f, "3-7", false));
        drops.add(new ItemData(10881, 0.15f, "1", false));
        drops.add(new ItemData(10859, 0.1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
