package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Nuclearsmokedevil implements BaseNPC {
    public List<ItemData> drops;

    public Nuclearsmokedevil() {
        drops = new ArrayList<>();
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(2501, 0.0078125f, "1", false));
        drops.add(new ItemData(12002, 0.001953125f, "1", false));
        drops.add(new ItemData(3140, 0.000030517578125f, "1", false));
        drops.add(new ItemData(4697, 0.0859375f, "15", false));
        drops.add(new ItemData(4697, 0.0390625f, "40", false));
        drops.add(new ItemData(9144, 0.0390625f, "15", false));
        drops.add(new ItemData(554, 0.03125f, "37", false));
        drops.add(new ItemData(556, 0.03125f, "37", false));
        drops.add(new ItemData(566, 0.03125f, "10", false));
        drops.add(new ItemData(554, 0.015625f, "150", false));
        drops.add(new ItemData(1371, 0.0234375f, "1", false));
        drops.add(new ItemData(892, 0.015625f, "24", false));
        drops.add(new ItemData(199, 0.035211267605633804f, "1-2", false));
        drops.add(new ItemData(201, 0.026385224274406333f, "1-2", false));
        drops.add(new ItemData(203, 0.019762845849802372f, "1-2", false));
        drops.add(new ItemData(205, 0.015384615384615385f, "1-2", false));
        drops.add(new ItemData(207, 0.012091898428053204f, "1-2", false));
        drops.add(new ItemData(209, 0.008787346221441126f, "1-2", false));
        drops.add(new ItemData(211, 0.0065919578114700065f, "1-2", false));
        drops.add(new ItemData(213, 0.005494505494505495f, "1-2", false));
        drops.add(new ItemData(215, 0.004393673110720563f, "1-2", false));
        drops.add(new ItemData(1213, 0.0234375f, "1", false));
        drops.add(new ItemData(2485, 0.0032959789057350032f, "1-2", false));
        drops.add(new ItemData(217, 0.0032959789057350032f, "1-2", false));
        drops.add(new ItemData(995, 0.09375f, "750", false));
        drops.add(new ItemData(995, 0.0546875f, "80", false));
        drops.add(new ItemData(995, 0.0234375f, "300", false));
        drops.add(new ItemData(385, 0.046875f, "1", false));
        drops.add(new ItemData(2353, 0.0234375f, "2", false));
        drops.add(new ItemData(1513, 0.0234375f, "5", false));
        drops.add(new ItemData(453, 0.0234375f, "15", false));
        drops.add(new ItemData(2361, 0.015625f, "1", false));
        drops.add(new ItemData(1397, 0.0234375f, "1", false));
        drops.add(new ItemData(9438, 0.015625f, "1", false));
        drops.add(new ItemData(1885, 0.015625f, "3", false));
        drops.add(new ItemData(2491, 0.0234375f, "1", false));
        drops.add(new ItemData(1393, 0.0234375f, "1", false));
        drops.add(new ItemData(2722, 0.078125f, "1", false));
        drops.add(new ItemData(23083, 0.0196078431372549f, "1", false));
        drops.add(new ItemData(1085, 0.015625f, "1", false));
        drops.add(new ItemData(12073, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(20730, 0.017543859649122806f, "1", false));
        drops.add(new ItemData(20736, 0.017543859649122806f, "1", false));
        drops.add(new ItemData(21270, 0.005f, "1", false));
        drops.add(new ItemData(20724, 0.005f, "1", false));
        drops.add(new ItemData(1163, 0.015625f, "1", false));
        drops.add(new ItemData(1113, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
