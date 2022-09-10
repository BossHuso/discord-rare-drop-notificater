package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class HoopSnake implements BaseNPC {
    public List<ItemData> drops;

    public HoopSnake() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(6287, 0.3f, "1", false));
        drops.add(new ItemData(21555, 0.15428571428571428f, "1-14", false));
        drops.add(new ItemData(21562, 0.008571428571428572f, "1", false));
        drops.add(new ItemData(21564, 0.004285714285714286f, "1", false));
        drops.add(new ItemData(21566, 0.0034285714285714284f, "1", false));
        drops.add(new ItemData(21568, 0.0008571428571428571f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
