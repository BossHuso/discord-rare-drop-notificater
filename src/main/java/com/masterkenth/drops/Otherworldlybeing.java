package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Otherworldlybeing implements BaseNPC {
    public List<ItemData> drops;

    public Otherworldlybeing() {
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
        drops.add(new ItemData(561, 0.0703125f, "5", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(995, 0.4609375f, "15", false));
        drops.add(new ItemData(1641, 0.015625f, "1", false));
        drops.add(new ItemData(562, 0.0625f, "4", false));
        drops.add(new ItemData(1428, 0.0078125f, "1", false));
        drops.add(new ItemData(355, 0.0078125f, "1", false));
        drops.add(new ItemData(563, 0.0546875f, "2", false));
        drops.add(new ItemData(564, 0.0390625f, "2", false));
        drops.add(new ItemData(560, 0.03125f, "2", false));
        drops.add(new ItemData(565, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
