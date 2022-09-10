package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BlackKnight implements BaseNPC {
    public List<ItemData> drops;

    public BlackKnight() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.005859375f, "1", false));
        drops.add(new ItemData(1621, 0.0029296875f, "1", false));
        drops.add(new ItemData(1619, 0.00146484375f, "1", false));
        drops.add(new ItemData(1452, 0.000549273494258261f, "1", false));
        drops.add(new ItemData(1462, 0.000549273494258261f, "1", false));
        drops.add(new ItemData(1617, 0.0003662109375f, "1", false));
        drops.add(new ItemData(830, 0.00018310546875f, "5", false));
        drops.add(new ItemData(987, 0.00018310546875f, "1", false));
        drops.add(new ItemData(985, 0.00018310546875f, "1", false));
        drops.add(new ItemData(1247, 0.000011444091796875f, "1", false));
        drops.add(new ItemData(2366, 0.0000057220458984375f, "1", false));
        drops.add(new ItemData(1249, 0.000004291199173892664f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(563, 0.015625f, "3", false));
        drops.add(new ItemData(564, 0.0078125f, "7", false));
        drops.add(new ItemData(558, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(201, 0.004393673110720563f, "1", false));
        drops.add(new ItemData(203, 0.0032959789057350032f, "1", false));
        drops.add(new ItemData(205, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(207, 0.002014098690835851f, "1", false));
        drops.add(new ItemData(209, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(211, 0.001098659635245001f, "1", false));
        drops.add(new ItemData(1279, 0.03125f, "1", false));
        drops.add(new ItemData(213, 0.0009154994049253868f, "1", false));
        drops.add(new ItemData(215, 0.0007324397568300008f, "1", false));
        drops.add(new ItemData(2485, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(217, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(5318, 0.05263157894736842f, "4", false));
        drops.add(new ItemData(5319, 0.04f, "4", false));
        drops.add(new ItemData(5324, 0.02631578947368421f, "4", false));
        drops.add(new ItemData(5322, 0.012987012987012988f, "3", false));
        drops.add(new ItemData(5320, 0.0064516129032258064f, "3", false));
        drops.add(new ItemData(5323, 0.003215434083601286f, "2", false));
        drops.add(new ItemData(1153, 0.015625f, "1", false));
        drops.add(new ItemData(5321, 0.0015360983102918587f, "2", false));
        drops.add(new ItemData(22879, 0.0011160714285714285f, "2", false));
        drops.add(new ItemData(2353, 0.046875f, "1", false));
        drops.add(new ItemData(438, 0.0078125f, "1", false));
        drops.add(new ItemData(1933, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.1640625f, "35", false));
        drops.add(new ItemData(995, 0.140625f, "5", false));
        drops.add(new ItemData(995, 0.0859375f, "6", false));
        drops.add(new ItemData(995, 0.078125f, "58", false));
        drops.add(new ItemData(995, 0.0703125f, "12", false));
        drops.add(new ItemData(1424, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.0234375f, "10", false));
        drops.add(new ItemData(995, 0.015625f, "80", false));
        drops.add(new ItemData(995, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.0078125f, "13", false));
        drops.add(new ItemData(2309, 0.0078125f, "1", false));
        drops.add(new ItemData(888, 0.03125f, "3", false));
        drops.add(new ItemData(11941, 0.1111111111111111f, "1", false));
        drops.add(new ItemData(559, 0.0234375f, "9", false));
        drops.add(new ItemData(562, 0.0234375f, "6", false));
        drops.add(new ItemData(557, 0.0234375f, "10", false));
        drops.add(new ItemData(560, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
