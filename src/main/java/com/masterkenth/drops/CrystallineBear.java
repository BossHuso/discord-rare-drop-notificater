package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CrystallineBear implements BaseNPC {
    public List<ItemData> drops;

    public CrystallineBear() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23834, 1f, "1", false));
        drops.add(new ItemData(23872, 0.125f, "5", false));
        drops.add(new ItemData(23868, 0.001953125f, "1", false));
        drops.add(new ItemData(23904, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
