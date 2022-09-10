package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class MonkofZamorak implements BaseNPC {
    public List<ItemData> drops;

    public MonkofZamorak() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1033, 0.05f, "1", false));
        drops.add(new ItemData(1035, 0.05f, "1", false));
        drops.add(new ItemData(2944, 1f, "1", false));
        drops.add(new ItemData(11941, 0.16666666666666666f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
