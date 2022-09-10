package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Vespula implements BaseNPC {
    public List<ItemData> drops;

    public Vespula() {
        drops = new ArrayList<>();
        drops.add(new ItemData(20893, 1f, "1", false));
        drops.add(new ItemData(20984, 1f, "2", false));
        drops.add(new ItemData(20960, 1f, "1", false));
        drops.add(new ItemData(20972, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
