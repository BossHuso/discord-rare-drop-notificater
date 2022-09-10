package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ShaededBeast implements BaseNPC {
    public List<ItemData> drops;

    public ShaededBeast() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23497, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
