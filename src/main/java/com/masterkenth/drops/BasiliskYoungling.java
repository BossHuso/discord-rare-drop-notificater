package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BasiliskYoungling implements BaseNPC {
    public List<ItemData> drops;

    public BasiliskYoungling() {
        drops = new ArrayList<>();
        drops.add(new ItemData(24256, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
