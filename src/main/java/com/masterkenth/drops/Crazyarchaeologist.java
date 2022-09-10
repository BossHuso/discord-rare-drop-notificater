package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Crazyarchaeologist implements BaseNPC {
    public List<ItemData> drops;

    public Crazyarchaeologist() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(11212, 0.0078125f, "75", false));
        drops.add(new ItemData(385, 0.0625f, "1", false));
        drops.add(new ItemData(6705, 0.0625f, "3", false));
        drops.add(new ItemData(2434, 0.0625f, "1", false));
        drops.add(new ItemData(2297, 0.03125f, "8", false));
        drops.add(new ItemData(995, 0.140625f, "499-3998", false));
        drops.add(new ItemData(217, 0.0625f, "4", false));
        drops.add(new ItemData(239, 0.046875f, "10", false));
        drops.add(new ItemData(442, 0.046875f, "40", false));
        drops.add(new ItemData(1621, 0.0390625f, "6", false));
        drops.add(new ItemData(11929, 0.00390625f, "1", false));
        drops.add(new ItemData(1623, 0.0390625f, "4", false));
        drops.add(new ItemData(1749, 0.0390625f, "10", false));
        drops.add(new ItemData(686, 0.03125f, "1", false));
        drops.add(new ItemData(991, 0.03125f, "1", false));
        drops.add(new ItemData(9194, 0.03125f, "12", false));
        drops.add(new ItemData(10976, 0.015625f, "1", false));
        drops.add(new ItemData(11990, 0.0078125f, "1", false));
        drops.add(new ItemData(11932, 0.00390625f, "1", false));
        drops.add(new ItemData(1731, 0.0546875f, "1", false));
        drops.add(new ItemData(9185, 0.0390625f, "2", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23083, 0.012658227848101266f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(21257, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(2501, 0.03125f, "1", false));
        drops.add(new ItemData(868, 0.03125f, "10", false));
        drops.add(new ItemData(4698, 0.03125f, "30", false));
        drops.add(new ItemData(2, 0.03125f, "150", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
