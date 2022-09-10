package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Irina implements BaseNPC {
    public List<ItemData> drops;

    public Irina() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00048828125f, "1", false));
        drops.add(new ItemData(1621, 0.000244140625f, "1", false));
        drops.add(new ItemData(1619, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1452, 0.00004577279118818842f, "1", false));
        drops.add(new ItemData(1462, 0.00004577279118818842f, "1", false));
        drops.add(new ItemData(1617, 0.000030517578125f, "1", false));
        drops.add(new ItemData(830, 0.0000152587890625f, "5", false));
        drops.add(new ItemData(987, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(985, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(1247, 0.00000095367431640625f, "1", false));
        drops.add(new ItemData(2366, 0.000000476837158203125f, "1", false));
        drops.add(new ItemData(1249, 0.000000357599931157722f, "1", false));
        drops.add(new ItemData(2859, 1f, "1", false));
        drops.add(new ItemData(209, 0.000244140625f, "1", false));
        drops.add(new ItemData(211, 0.00018310658634391078f, "1", false));
        drops.add(new ItemData(213, 0.000152587890625f, "1", false));
        drops.add(new ItemData(215, 0.0001220703125f, "1", false));
        drops.add(new ItemData(2485, 0.00009155245497908027f, "1", false));
        drops.add(new ItemData(217, 0.00009155245497908027f, "1", false));
        drops.add(new ItemData(221, 0.00390625f, "1", false));
        drops.add(new ItemData(231, 0.00390625f, "1", false));
        drops.add(new ItemData(247, 0.00390625f, "1", false));
        drops.add(new ItemData(239, 0.00390625f, "1", false));
        drops.add(new ItemData(1353, 0.01953125f, "1", false));
        drops.add(new ItemData(225, 0.00390625f, "1", false));
        drops.add(new ItemData(245, 0.00390625f, "1", false));
        drops.add(new ItemData(440, 0.01953125f, "5", false));
        drops.add(new ItemData(453, 0.01953125f, "2", false));
        drops.add(new ItemData(2353, 0.01953125f, "2", false));
        drops.add(new ItemData(2138, 0.01953125f, "2", false));
        drops.add(new ItemData(2132, 0.01953125f, "2", false));
        drops.add(new ItemData(2136, 0.01953125f, "2", false));
        drops.add(new ItemData(227, 0.09765625f, "2", false));
        drops.add(new ItemData(995, 0.0390625f, "6", false));
        drops.add(new ItemData(886, 0.01953125f, "50", false));
        drops.add(new ItemData(995, 0.009765625f, "15", false));
        drops.add(new ItemData(995, 0.009765625f, "16", false));
        drops.add(new ItemData(995, 0.01953125f, "20", false));
        drops.add(new ItemData(995, 0.009765625f, "38", false));
        drops.add(new ItemData(995, 0.009765625f, "50", false));
        drops.add(new ItemData(995, 0.009765625f, "96", false));
        drops.add(new ItemData(995, 0.009765625f, "120", false));
        drops.add(new ItemData(1925, 0.048828125f, "2", false));
        drops.add(new ItemData(590, 0.0390625f, "2", false));
        drops.add(new ItemData(229, 0.09765625f, "2", false));
        drops.add(new ItemData(887, 0.01953125f, "5", false));
        drops.add(new ItemData(6814, 0.1953125f, "1", false));
        drops.add(new ItemData(958, 0.1953125f, "1", false));
        drops.add(new ItemData(1582, 0.001953125f, "1", false));
        drops.add(new ItemData(199, 0.0009765625f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(201, 0.0007324397568300008f, "1", false));
        drops.add(new ItemData(203, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(205, 0.000427240878407246f, "1", false));
        drops.add(new ItemData(207, 0.00033569438383295846f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
