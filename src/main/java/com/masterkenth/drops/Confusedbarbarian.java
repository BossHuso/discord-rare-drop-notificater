package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Confusedbarbarian implements BaseNPC {
    public List<ItemData> drops;

    public Confusedbarbarian() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11337, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
