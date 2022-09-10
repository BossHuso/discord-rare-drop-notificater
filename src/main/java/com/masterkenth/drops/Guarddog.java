package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Guarddog implements BaseNPC {
    public List<ItemData> drops;

    public Guarddog() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(13468, 0.04f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
