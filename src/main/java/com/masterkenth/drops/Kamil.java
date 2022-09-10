package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Kamil implements BaseNPC {
    public List<ItemData> drops;

    public Kamil() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1897, 1f, "1,2", false));
        drops.add(new ItemData(3024, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
