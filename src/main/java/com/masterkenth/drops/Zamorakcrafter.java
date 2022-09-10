package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zamorakcrafter implements BaseNPC {
    public List<ItemData> drops;

    public Zamorakcrafter() {
        drops = new ArrayList<>();
        drops.add(new ItemData(556, 0.14285714285714285f, "5", false));
        drops.add(new ItemData(563, 0.014285714285714285f, "3", false));
        drops.add(new ItemData(561, 0.02857142857142857f, "2", false));
        drops.add(new ItemData(7936, 0.07142857142857142f, "3", false));
        drops.add(new ItemData(7936, 0.014285714285714285f, "10", false));
        drops.add(new ItemData(995, 0.14285714285714285f, "50", false));
        drops.add(new ItemData(559, 0.07142857142857142f, "3", false));
        drops.add(new ItemData(565, 0.02857142857142857f, "4", false));
        drops.add(new ItemData(562, 0.07142857142857142f, "4", false));
        drops.add(new ItemData(560, 0.02857142857142857f, "3", false));
        drops.add(new ItemData(557, 0.07142857142857142f, "6", false));
        drops.add(new ItemData(555, 0.14285714285714285f, "5", false));
        drops.add(new ItemData(566, 0.02857142857142857f, "3", false));
        drops.add(new ItemData(554, 0.14285714285714285f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
