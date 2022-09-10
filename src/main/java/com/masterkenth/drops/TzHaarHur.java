package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TzHaarHur implements BaseNPC {
    public List<ItemData> drops;

    public TzHaarHur() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0078125f, "1", false));
        drops.add(new ItemData(1931, 0.03125f, "1", false));
        drops.add(new ItemData(6529, 0.9333333333333333f, "3-7", false));
        drops.add(new ItemData(1623, 0.02564102564102564f, "1", false));
        drops.add(new ItemData(1621, 0.020512820512820513f, "1", false));
        drops.add(new ItemData(1619, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(1617, 0.005128205128205128f, "1", false));
        drops.add(new ItemData(1621, 0.0078125f, "1", false));
        drops.add(new ItemData(1619, 0.0078125f, "1", false));
        drops.add(new ItemData(1617, 0.001953125f, "1", false));
        drops.add(new ItemData(6529, 0.125f, "1-16", false));
        drops.add(new ItemData(1755, 0.03125f, "1", false));
        drops.add(new ItemData(2347, 0.03125f, "1", false));
        drops.add(new ItemData(1935, 0.03125f, "1", false));
        drops.add(new ItemData(946, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
