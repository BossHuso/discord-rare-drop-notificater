package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Tektonenraged implements BaseNPC {
    public List<ItemData> drops;

    public Tektonenraged() {
        drops = new ArrayList<>();
        drops.add(new ItemData(20890, 1f, "1", false));
        drops.add(new ItemData(20910, 1f, "5", false));
        drops.add(new ItemData(20996, 1f, "2", false));
        drops.add(new ItemData(20972, 1f, "1", false));
        drops.add(new ItemData(20960, 1f, "1", false));
        drops.add(new ItemData(6573, 0.0022222222222222222f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
