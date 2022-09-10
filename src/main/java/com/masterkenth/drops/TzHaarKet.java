package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TzHaarKet implements BaseNPC {
    public List<ItemData> drops;

    public TzHaarKet() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6528, 0.001953125f, "1", false));
        drops.add(new ItemData(13498, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(6524, 0.001953125f, "1", false));
        drops.add(new ItemData(6568, 0.001953125f, "1", false));
        drops.add(new ItemData(1623, 0.03125f, "1", false));
        drops.add(new ItemData(1621, 0.03125f, "1", false));
        drops.add(new ItemData(1619, 0.03125f, "1", false));
        drops.add(new ItemData(1617, 0.0078125f, "1", false));
        drops.add(new ItemData(9194, 0.0078125f, "1-4,20", false));
        drops.add(new ItemData(6529, 0.125f, "1-103", false));
        drops.add(new ItemData(21298, 0.0005f, "1", false));
        drops.add(new ItemData(21301, 0.0005f, "1", false));
        drops.add(new ItemData(21304, 0.0005f, "1", false));
        drops.add(new ItemData(13498, 0.04f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
