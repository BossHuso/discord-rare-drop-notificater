package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Skotizo implements BaseNPC {
    public List<ItemData> drops;

    public Skotizo() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25778, 1f, "1", false));
        drops.add(new ItemData(1127, 0.07f, "3", false));
        drops.add(new ItemData(1079, 0.07f, "3", false));
        drops.add(new ItemData(1093, 0.07f, "3", false));
        drops.add(new ItemData(560, 0.07f, "500", false));
        drops.add(new ItemData(566, 0.07f, "450", false));
        drops.add(new ItemData(565, 0.07f, "450", false));
        drops.add(new ItemData(449, 0.07f, "75", false));
        drops.add(new ItemData(3051, 0.07f, "20", false));
        drops.add(new ItemData(219, 0.07f, "20", false));
        drops.add(new ItemData(13439, 0.07f, "60", false));
        drops.add(new ItemData(2722, 1f, "1", false));
        drops.add(new ItemData(2363, 0.07f, "20", false));
        drops.add(new ItemData(8782, 0.07f, "150", false));
        drops.add(new ItemData(1391, 0.07f, "25", false));
        drops.add(new ItemData(9194, 0.07f, "40", false));
        drops.add(new ItemData(2366, 0.01f, "1", false));
        drops.add(new ItemData(12073, 0.2f, "1", false));
        drops.add(new ItemData(21275, 0.04f, "1", false));
        drops.add(new ItemData(23083, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(21273, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(19679, 0.0234375f, "1", false));
        drops.add(new ItemData(19677, 0.75f, "1", false));
        drops.add(new ItemData(19681, 0.0234375f, "1", false));
        drops.add(new ItemData(19683, 0.0234375f, "1", false));
        drops.add(new ItemData(19685, 0.0078125f, "1", false));
        drops.add(new ItemData(19701, 0.0004f, "1", false));
        drops.add(new ItemData(19677, 0.15f, "2", false));
        drops.add(new ItemData(19677, 0.05f, "3", false));
        drops.add(new ItemData(19677, 0.04f, "4", false));
        drops.add(new ItemData(19677, 0.01f, "5", false));
        drops.add(new ItemData(1631, 0.009f, "10", false));
        drops.add(new ItemData(6571, 0.001f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
