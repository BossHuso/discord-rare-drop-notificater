package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Kebbit implements BaseNPC {
    public List<ItemData> drops;

    public Kebbit() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(10176, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
