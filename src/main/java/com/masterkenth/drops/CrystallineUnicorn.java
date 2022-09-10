package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CrystallineUnicorn implements BaseNPC {
    public List<ItemData> drops;

    public CrystallineUnicorn() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23866, 1f, "50-105", false));
        drops.add(new ItemData(23872, 0.125f, "4", false));
        drops.add(new ItemData(23834, 0.125f, "1", false));
        drops.add(new ItemData(23904, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
