package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Vanguard implements BaseNPC {
    public List<ItemData> drops;

    public Vanguard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(20895, 1f, "1", false));
        drops.add(new ItemData(20924, 1f, "1", false));
        drops.add(new ItemData(20936, 1f, "1", false));
        drops.add(new ItemData(20948, 1f, "1", false));
        drops.add(new ItemData(20984, 1f, "1-2", false));
        drops.add(new ItemData(20960, 0.5f, "1", false));
        drops.add(new ItemData(20996, 0.3333333333333333f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
