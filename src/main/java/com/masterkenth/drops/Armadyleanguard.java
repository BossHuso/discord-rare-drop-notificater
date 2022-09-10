package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Armadyleanguard implements BaseNPC {
    public List<ItemData> drops;

    public Armadyleanguard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.017578125f, "1", false));
        drops.add(new ItemData(1621, 0.0087890625f, "1", false));
        drops.add(new ItemData(1619, 0.00439453125f, "1", false));
        drops.add(new ItemData(1452, 0.0016478204827747832f, "1", false));
        drops.add(new ItemData(1462, 0.0016478204827747832f, "1", false));
        drops.add(new ItemData(1617, 0.0010986328125f, "1", false));
        drops.add(new ItemData(830, 0.00054931640625f, "5", false));
        drops.add(new ItemData(987, 0.00054931640625f, "1", false));
        drops.add(new ItemData(985, 0.00054931640625f, "1", false));
        drops.add(new ItemData(1247, 0.000034332275390625f, "1", false));
        drops.add(new ItemData(2366, 0.0000171661376953125f, "1", false));
        drops.add(new ItemData(1249, 0.000012873597521677994f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(1247, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.2890625f, "35", false));
        drops.add(new ItemData(995, 0.09375f, "350", false));
        drops.add(new ItemData(2347, 0.0390625f, "1", false));
        drops.add(new ItemData(453, 0.0546875f, "1", false));
        drops.add(new ItemData(314, 0.0390625f, "30", false));
        drops.add(new ItemData(53, 0.078125f, "30", false));
        drops.add(new ItemData(2361, 0.0078125f, "5", false));
        drops.add(new ItemData(385, 0.0234375f, "1", false));
        drops.add(new ItemData(805, 0.0234375f, "6", false));
        drops.add(new ItemData(11826, 0.000001f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11836, 0.000001f, "1", false));
        drops.add(new ItemData(561, 0.0390625f, "20", false));
        drops.add(new ItemData(565, 0.0390625f, "20", false));
        drops.add(new ItemData(564, 0.0390625f, "20", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
