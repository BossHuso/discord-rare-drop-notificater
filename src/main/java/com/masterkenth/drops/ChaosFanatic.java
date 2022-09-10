package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ChaosFanatic implements BaseNPC {
    public List<ItemData> drops;

    public ChaosFanatic() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(554, 0.03125f, "250", false));
        drops.add(new ItemData(4697, 0.03125f, "30", false));
        drops.add(new ItemData(562, 0.03125f, "175", false));
        drops.add(new ItemData(565, 0.03125f, "50", false));
        drops.add(new ItemData(7946, 0.0625f, "3", false));
        drops.add(new ItemData(385, 0.0625f, "1", false));
        drops.add(new ItemData(2434, 0.0625f, "1", false));
        drops.add(new ItemData(2297, 0.03125f, "8", false));
        drops.add(new ItemData(995, 0.140625f, "499-3998", false));
        drops.add(new ItemData(2485, 0.0625f, "4", false));
        drops.add(new ItemData(11928, 0.00390625f, "1", false));
        drops.add(new ItemData(2570, 0.0546875f, "1", false));
        drops.add(new ItemData(1452, 0.046875f, "1", false));
        drops.add(new ItemData(245, 0.046875f, "10", false));
        drops.add(new ItemData(1621, 0.0390625f, "6", false));
        drops.add(new ItemData(1623, 0.0390625f, "4", false));
        drops.add(new ItemData(993, 0.03125f, "1", false));
        drops.add(new ItemData(7936, 0.015625f, "250", false));
        drops.add(new ItemData(11931, 0.00390625f, "1", false));
        drops.add(new ItemData(1391, 0.0390625f, "5", false));
        drops.add(new ItemData(3387, 0.0390625f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23083, 0.012658227848101266f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(11995, 0.001f, "1", false));
        drops.add(new ItemData(23490, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(21257, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(3389, 0.0390625f, "1", false));
        drops.add(new ItemData(1035, 0.03125f, "1", false));
        drops.add(new ItemData(1033, 0.03125f, "1", false));
        drops.add(new ItemData(4675, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
