package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cockatrice implements BaseNPC {
    public List<ItemData> drops;

    public Cockatrice() {
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
        drops.add(new ItemData(561, 0.015625f, "6", false));
        drops.add(new ItemData(563, 0.0234375f, "2", false));
        drops.add(new ItemData(555, 0.015625f, "2", false));
        drops.add(new ItemData(554, 0.015625f, "7", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(1279, 0.0234375f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(5318, 0.05263157894736842f, "4", false));
        drops.add(new ItemData(5319, 0.04f, "4", false));
        drops.add(new ItemData(5324, 0.02631578947368421f, "4", false));
        drops.add(new ItemData(5322, 0.012987012987012988f, "3", false));
        drops.add(new ItemData(5320, 0.0064516129032258064f, "3", false));
        drops.add(new ItemData(1207, 0.0234375f, "1", false));
        drops.add(new ItemData(5323, 0.003215434083601286f, "2", false));
        drops.add(new ItemData(5321, 0.0015360983102918587f, "2", false));
        drops.add(new ItemData(22879, 0.0011160714285714285f, "2", false));
        drops.add(new ItemData(995, 0.125f, "15", false));
        drops.add(new ItemData(995, 0.09375f, "5", false));
        drops.add(new ItemData(995, 0.09375f, "28", false));
        drops.add(new ItemData(995, 0.03125f, "62", false));
        drops.add(new ItemData(995, 0.0234375f, "42", false));
        drops.add(new ItemData(995, 0.0078125f, "1", false));
        drops.add(new ItemData(225, 0.1640625f, "1", false));
        drops.add(new ItemData(4121, 0.0078125f, "1", false));
        drops.add(new ItemData(826, 0.0078125f, "5", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(7976, 0.001f, "1", false));
        drops.add(new ItemData(1295, 0.0078125f, "1", false));
        drops.add(new ItemData(4117, 0.001953125f, "1", false));
        drops.add(new ItemData(561, 0.046875f, "2", false));
        drops.add(new ItemData(561, 0.03125f, "4", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
