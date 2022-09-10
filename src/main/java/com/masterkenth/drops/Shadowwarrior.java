package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Shadowwarrior implements BaseNPC {
    public List<ItemData> drops;

    public Shadowwarrior() {
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
        drops.add(new ItemData(1245, 0.0078125f, "1", false));
        drops.add(new ItemData(199, 0.035211267605633804f, "1", false));
        drops.add(new ItemData(201, 0.026385224274406333f, "1", false));
        drops.add(new ItemData(203, 0.019762845849802372f, "1", false));
        drops.add(new ItemData(205, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(207, 0.012091898428053204f, "1", false));
        drops.add(new ItemData(209, 0.008787346221441126f, "1", false));
        drops.add(new ItemData(211, 0.0065919578114700065f, "1", false));
        drops.add(new ItemData(213, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(215, 0.004393673110720563f, "1", false));
        drops.add(new ItemData(2485, 0.0032959789057350032f, "1", false));
        drops.add(new ItemData(1233, 0.0078125f, "1", false));
        drops.add(new ItemData(217, 0.0032959789057350032f, "1", false));
        drops.add(new ItemData(995, 0.3671875f, "8", false));
        drops.add(new ItemData(2359, 0.03125f, "1", false));
        drops.add(new ItemData(187, 0.0078125f, "1", false));
        drops.add(new ItemData(869, 0.0078125f, "1", false));
        drops.add(new ItemData(1297, 0.0078125f, "1", false));
        drops.add(new ItemData(581, 0.0078125f, "1", false));
        drops.add(new ItemData(564, 0.0703125f, "3", false));
        drops.add(new ItemData(565, 0.046875f, "2", false));
        drops.add(new ItemData(556, 0.03125f, "45", false));
        drops.add(new ItemData(560, 0.03125f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
