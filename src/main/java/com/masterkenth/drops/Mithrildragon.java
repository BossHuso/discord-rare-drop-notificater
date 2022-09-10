package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mithrildragon implements BaseNPC {
    public List<ItemData> drops;

    public Mithrildragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(11335, 0.000030517578125f, "1", false));
        drops.add(new ItemData(565, 0.1484375f, "27", false));
        drops.add(new ItemData(830, 0.109375f, "8", false));
        drops.add(new ItemData(9144, 0.046875f, "10-21", false));
        drops.add(new ItemData(566, 0.0390625f, "10", false));
        drops.add(new ItemData(892, 0.0234375f, "8", false));
        drops.add(new ItemData(385, 0.046875f, "1", false));
        drops.add(new ItemData(385, 0.03125f, "1", false));
        drops.add(new ItemData(11465, 0.015625f, "1", false));
        drops.add(new ItemData(385, 0.015625f, "6", false));
        drops.add(new ItemData(2359, 1f, "3", false));
        drops.add(new ItemData(11469, 0.015625f, "1", false));
        drops.add(new ItemData(11497, 0.015625f, "1", false));
        drops.add(new ItemData(11485, 0.015625f, "1", false));
        drops.add(new ItemData(995, 0.1328125f, "600", false));
        drops.add(new ItemData(995, 0.0546875f, "876", false));
        drops.add(new ItemData(19582, 0.0546875f, "15", false));
        drops.add(new ItemData(11338, 0.0234375f, "1", false));
        drops.add(new ItemData(2363, 0.0234375f, "2", false));
        drops.add(new ItemData(11341, 0.015625f, "1", false));
        drops.add(new ItemData(1373, 0.0625f, "1", false));
        drops.add(new ItemData(817, 0.0546875f, "14", false));
        drops.add(new ItemData(1373, 0.03125f, "1", false));
        drops.add(new ItemData(23083, 0.01694915254237288f, "1", false));
        drops.add(new ItemData(12073, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(868, 0.0234375f, "8", false));
        drops.add(new ItemData(1432, 0.0234375f, "1", false));
        drops.add(new ItemData(1247, 0.015625f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
