package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SirHarry implements BaseNPC {
    public List<ItemData> drops;

    public SirHarry() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(2353, 0.0078125f, "1", false));
        drops.add(new ItemData(199, 0.015625f, "1", false));
        drops.add(new ItemData(201, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(203, 0.008787346221441126f, "1", false));
        drops.add(new ItemData(205, 0.00683526999316473f, "1", false));
        drops.add(new ItemData(207, 0.0053705692803437165f, "1", false));
        drops.add(new ItemData(209, 0.00390625f, "1", false));
        drops.add(new ItemData(211, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(213, 0.00244140625f, "1", false));
        drops.add(new ItemData(215, 0.001953125f, "1", false));
        drops.add(new ItemData(1490, 1f, "1", false));
        drops.add(new ItemData(2485, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(217, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(995, 0.3125f, "48", false));
        drops.add(new ItemData(995, 0.1484375f, "15", false));
        drops.add(new ItemData(995, 0.125f, "2", false));
        drops.add(new ItemData(995, 0.078125f, "8", false));
        drops.add(new ItemData(995, 0.015625f, "120", false));
        drops.add(new ItemData(1281, 0.015625f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(1295, 0.0078125f, "1", false));
        drops.add(new ItemData(1157, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.1015625f, "30", false));
        drops.add(new ItemData(565, 0.0078125f, "1", false));
        drops.add(new ItemData(2351, 0.0703125f, "1", false));
        drops.add(new ItemData(2359, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
