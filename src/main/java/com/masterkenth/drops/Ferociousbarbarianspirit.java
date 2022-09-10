package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ferociousbarbarianspirit implements BaseNPC {
    public List<ItemData> drops;

    public Ferociousbarbarianspirit() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.015625f, "1", false));
        drops.add(new ItemData(1621, 0.0078125f, "1", false));
        drops.add(new ItemData(1619, 0.00390625f, "1", false));
        drops.add(new ItemData(1452, 0.0014647293180220294f, "1", false));
        drops.add(new ItemData(1462, 0.0014647293180220294f, "1", false));
        drops.add(new ItemData(1617, 0.0009765625f, "1", false));
        drops.add(new ItemData(830, 0.00048828125f, "5", false));
        drops.add(new ItemData(987, 0.00048828125f, "1", false));
        drops.add(new ItemData(985, 0.00048828125f, "1", false));
        drops.add(new ItemData(1247, 0.000030517578125f, "1", false));
        drops.add(new ItemData(2366, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(1249, 0.000011443197797047105f, "1", false));
        drops.add(new ItemData(1428, 0.0390625f, "1", false));
        drops.add(new ItemData(199, 0.01953125f, "1-2", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1-2", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1-2", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1-2", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1-2", false));
        drops.add(new ItemData(209, 0.0048828125f, "1-2", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1-2", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1-2", false));
        drops.add(new ItemData(215, 0.00244140625f, "1-2", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1-2", false));
        drops.add(new ItemData(1430, 0.03125f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1-2", false));
        drops.add(new ItemData(5295, 0.0390625f, "1", false));
        drops.add(new ItemData(11467, 0.125f, "1", false));
        drops.add(new ItemData(11465, 0.0625f, "1", false));
        drops.add(new ItemData(11487, 0.015625f, "1", false));
        drops.add(new ItemData(11485, 0.015625f, "1", false));
        drops.add(new ItemData(11471, 0.015625f, "1", false));
        drops.add(new ItemData(11469, 0.0234375f, "1", false));
        drops.add(new ItemData(11499, 0.015625f, "1", false));
        drops.add(new ItemData(11497, 0.0234375f, "1", false));
        drops.add(new ItemData(1432, 0.0078125f, "1", false));
        drops.add(new ItemData(11507, 0.03125f, "1", false));
        drops.add(new ItemData(11505, 0.03125f, "1", false));
        drops.add(new ItemData(11473, 0.0078125f, "1", false));
        drops.add(new ItemData(11477, 0.0078125f, "1", false));
        drops.add(new ItemData(1515, 0.015625f, "3", false));
        drops.add(new ItemData(2353, 0.015625f, "2", false));
        drops.add(new ItemData(2359, 0.015625f, "2", false));
        drops.add(new ItemData(2361, 0.0078125f, "1", false));
        drops.add(new ItemData(2363, 0.0078125f, "1", false));
        drops.add(new ItemData(532, 0.0546875f, "10", false));
        drops.add(new ItemData(11373, 0.015625f, "1", false));
        drops.add(new ItemData(11341, 0.0390625f, "1", false));
        drops.add(new ItemData(385, 0.046875f, "3", false));
        drops.add(new ItemData(867, 0.03125f, "20", false));
        drops.add(new ItemData(20543, 1f, "1", false));
        drops.add(new ItemData(816, 0.03125f, "20", false));
        drops.add(new ItemData(892, 0.03125f, "10", false));
        drops.add(new ItemData(9144, 0.03125f, "10", false));
        drops.add(new ItemData(560, 0.0625f, "5-9", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
