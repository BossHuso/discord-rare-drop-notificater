package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Gangster implements BaseNPC {
    public List<ItemData> drops;

    public Gangster() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(213, 0.030517578125f, "1", false));
        drops.add(new ItemData(2485, 0.018310546875f, "1", false));
        drops.add(new ItemData(2357, 0.05859375f, "8-16", false));
        drops.add(new ItemData(8782, 0.078125f, "4-8", false));
        drops.add(new ItemData(8778, 0.15625f, "10-20", false));
        drops.add(new ItemData(8780, 0.1171875f, "5-10", false));
        drops.add(new ItemData(995, 0.1171875f, "600-800", false));
        drops.add(new ItemData(6032, 0.09765625f, "45-80", false));
        drops.add(new ItemData(1333, 0.0125f, "1", false));
        drops.add(new ItemData(13395, 0.2f, "1", false));
        drops.add(new ItemData(1107, 0.03125f, "1", false));
        drops.add(new ItemData(2722, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(1151, 0.03125f, "1", false));
        drops.add(new ItemData(1089, 0.03125f, "1", false));
        drops.add(new ItemData(1327, 0.04296875f, "1", false));
        drops.add(new ItemData(564, 0.078125f, "30-60", false));
        drops.add(new ItemData(215, 0.0244140625f, "1", false));
        drops.add(new ItemData(217, 0.0244140625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
