package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Highwayman implements BaseNPC {
    public List<ItemData> drops;

    public Highwayman() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1019, 1f, "1", false));
        drops.add(new ItemData(9140, 0.05f, "2-12", false));
        drops.add(new ItemData(526, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
