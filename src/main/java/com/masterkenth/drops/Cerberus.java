package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cerberus implements BaseNPC {
    public List<ItemData> drops;

    public Cerberus() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25778, 1f, "1", false));
        drops.add(new ItemData(1359, 0.0234375f, "1", false));
        drops.add(new ItemData(1275, 0.0234375f, "1", false));
        drops.add(new ItemData(1391, 0.0234375f, "6", false));
        drops.add(new ItemData(1163, 0.0234375f, "1", false));
        drops.add(new ItemData(3053, 0.015625f, "1", false));
        drops.add(new ItemData(3202, 0.015625f, "1", false));
        drops.add(new ItemData(554, 0.046875f, "300", false));
        drops.add(new ItemData(566, 0.046875f, "100", false));
        drops.add(new ItemData(7936, 0.0390625f, "300", false));
        drops.add(new ItemData(565, 0.03125f, "60", false));
        drops.add(new ItemData(13231, 0.001953125f, "1", false));
        drops.add(new ItemData(2, 0.03125f, "50", false));
        drops.add(new ItemData(9381, 0.03125f, "40", false));
        drops.add(new ItemData(560, 0.0234375f, "100", false));
        drops.add(new ItemData(453, 0.046875f, "120", false));
        drops.add(new ItemData(3024, 0.046875f, "2", false));
        drops.add(new ItemData(7218, 0.046875f, "3", false));
        drops.add(new ItemData(995, 0.0390625f, "10000-20000", false));
        drops.add(new ItemData(536, 0.0390625f, "20", false));
        drops.add(new ItemData(1724, 0.0390625f, "1", false));
        drops.add(new ItemData(245, 0.0390625f, "15", false));
        drops.add(new ItemData(13229, 0.001953125f, "1", false));
        drops.add(new ItemData(592, 0.03125f, "50", false));
        drops.add(new ItemData(569, 0.03125f, "20", false));
        drops.add(new ItemData(219, 0.03125f, "6", false));
        drops.add(new ItemData(451, 0.0234375f, "5", false));
        drops.add(new ItemData(1617, 0.0234375f, "5", false));
        drops.add(new ItemData(13249, 0.015625f, "3", false));
        drops.add(new ItemData(5304, 0.015625f, "3", false));
        drops.add(new ItemData(13227, 0.001953125f, "1", false));
        drops.add(new ItemData(13233, 0.001953125f, "1", false));
        drops.add(new ItemData(1127, 0.0390625f, "1", false));
        drops.add(new ItemData(23083, 0.017857142857142856f, "1", false));
        drops.add(new ItemData(12073, 0.01f, "1", false));
        drops.add(new ItemData(13245, 0.0005f, "1", false));
        drops.add(new ItemData(13247, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(1113, 0.03125f, "1", false));
        drops.add(new ItemData(1319, 0.03125f, "1", false));
        drops.add(new ItemData(2503, 0.0234375f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
