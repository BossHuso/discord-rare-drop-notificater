package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CrystallineSpider implements BaseNPC {
    public List<ItemData> drops;

    public CrystallineSpider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23866, 1f, "10-30", false));
        drops.add(new ItemData(23872, 0.125f, "1,3", false));
        drops.add(new ItemData(23875, 0.125f, "1", false));
        drops.add(new ItemData(23834, 0.125f, "1", false));
        drops.add(new ItemData(23904, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
