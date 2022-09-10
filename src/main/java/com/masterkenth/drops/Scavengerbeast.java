package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Scavengerbeast implements BaseNPC {
    public List<ItemData> drops;

    public Scavengerbeast() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(20911, 0.1111111111111111f, "6-16", false));
        drops.add(new ItemData(20910, 0.1111111111111111f, "6-16", false));
        drops.add(new ItemData(20912, 0.1111111111111111f, "6-16", false));
        drops.add(new ItemData(21036, 0.1111111111111111f, "2", false));
        drops.add(new ItemData(307, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(1267, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(1349, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(10010, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(2347, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(590, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(1523, 0.1111111111111111f, "1", false));
        drops.add(new ItemData(20853, 0.1111111111111111f, "30-50", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
