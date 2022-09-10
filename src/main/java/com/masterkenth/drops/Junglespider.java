package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Junglespider implements BaseNPC {
    public List<ItemData> drops;

    public Junglespider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6291, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
