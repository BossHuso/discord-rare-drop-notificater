package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SkeletalWyvern implements BaseNPC {
    public List<ItemData> drops;

    public SkeletalWyvern() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6812, 1f, "1", false));
        drops.add(new ItemData(1163, 0.015625f, "1", false));
        drops.add(new ItemData(1201, 0.015625f, "1", false));
        drops.add(new ItemData(556, 0.046875f, "225", false));
        drops.add(new ItemData(892, 0.0390625f, "36", false));
        drops.add(new ItemData(555, 0.03125f, "150", false));
        drops.add(new ItemData(562, 0.03125f, "80", false));
        drops.add(new ItemData(563, 0.03125f, "45", false));
        drops.add(new ItemData(560, 0.03125f, "40", false));
        drops.add(new ItemData(565, 0.03125f, "25", false));
        drops.add(new ItemData(9143, 0.0234375f, "75-99", false));
        drops.add(new ItemData(6809, 0.001953125f, "1", false));
        drops.add(new ItemData(9144, 0.0234375f, "35-44", false));
        drops.add(new ItemData(566, 0.0078125f, "20", false));
        drops.add(new ItemData(199, 0.013679890560875513f, "1-3", false));
        drops.add(new ItemData(201, 0.010256410256410256f, "1-3", false));
        drops.add(new ItemData(203, 0.007692307692307693f, "1-3", false));
        drops.add(new ItemData(205, 0.005980861244019139f, "1-3", false));
        drops.add(new ItemData(207, 0.004699248120300752f, "1-3", false));
        drops.add(new ItemData(209, 0.003417634996582365f, "1-3", false));
        drops.add(new ItemData(211, 0.002563445270443476f, "1-3", false));
        drops.add(new ItemData(213, 0.0021362956633198035f, "1-3", false));
        drops.add(new ItemData(4087, 0.001953125f, "1", false));
        drops.add(new ItemData(215, 0.0017091095539224065f, "1-3", false));
        drops.add(new ItemData(2485, 0.001281722635221738f, "1-3", false));
        drops.add(new ItemData(217, 0.001281722635221738f, "1-3", false));
        drops.add(new ItemData(7936, 0.0625f, "250", false));
        drops.add(new ItemData(1513, 0.046875f, "35", false));
        drops.add(new ItemData(2361, 0.046875f, "10", false));
        drops.add(new ItemData(440, 0.0234375f, "200", false));
        drops.add(new ItemData(1619, 0.015625f, "10", false));
        drops.add(new ItemData(1617, 0.015625f, "5", false));
        drops.add(new ItemData(995, 0.09375f, "300", false));
        drops.add(new ItemData(4585, 0.001953125f, "1", false));
        drops.add(new ItemData(379, 0.0625f, "6", false));
        drops.add(new ItemData(2434, 0.0546875f, "2", false));
        drops.add(new ItemData(567, 0.015625f, "75", false));
        drops.add(new ItemData(9465, 0.015625f, "1", false));
        drops.add(new ItemData(5295, 0.015625f, "3", false));
        drops.add(new ItemData(5300, 0.015625f, "1", false));
        drops.add(new ItemData(1399, 0.03125f, "1", false));
        drops.add(new ItemData(1391, 0.0234375f, "10", false));
        drops.add(new ItemData(1359, 0.0234375f, "1", false));
        drops.add(new ItemData(23083, 0.0136986301369863f, "1", false));
        drops.add(new ItemData(12073, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(1373, 0.015625f, "1", false));
        drops.add(new ItemData(1347, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
