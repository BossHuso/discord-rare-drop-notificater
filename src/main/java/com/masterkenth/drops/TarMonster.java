package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TarMonster implements BaseNPC {
    public List<ItemData> drops;

    public TarMonster() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1939, 0.3333333333333333f, "10", false));
        drops.add(new ItemData(21555, 0.2571428571428571f, "5-14", false));
        drops.add(new ItemData(21562, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(21564, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(21566, 0.005714285714285714f, "1", false));
        drops.add(new ItemData(21568, 0.0014285714285714286f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
