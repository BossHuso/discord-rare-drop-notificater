package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class HillGiant implements BaseNPC {
    public List<ItemData> drops;

    public HillGiant() {
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
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(886, 0.015625f, "10", false));
        drops.add(new ItemData(558, 0.015625f, "3", false));
        drops.add(new ItemData(564, 0.015625f, "2", false));
        drops.add(new ItemData(561, 0.015625f, "6", false));
        drops.add(new ItemData(562, 0.0078125f, "2", false));
        drops.add(new ItemData(560, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.013679890560875513f, "1", false));
        drops.add(new ItemData(201, 0.010256410256410256f, "1", false));
        drops.add(new ItemData(203, 0.007692307692307693f, "1", false));
        drops.add(new ItemData(205, 0.005980861244019139f, "1", false));
        drops.add(new ItemData(1203, 0.03125f, "1", false));
        drops.add(new ItemData(207, 0.004699248120300752f, "1", false));
        drops.add(new ItemData(209, 0.003417634996582365f, "1", false));
        drops.add(new ItemData(211, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(213, 0.0021362956633198035f, "1", false));
        drops.add(new ItemData(215, 0.0017091095539224065f, "1", false));
        drops.add(new ItemData(2485, 0.001281722635221738f, "1", false));
        drops.add(new ItemData(217, 0.001281722635221738f, "1", false));
        drops.add(new ItemData(5318, 0.05263157894736842f, "4", false));
        drops.add(new ItemData(5319, 0.04f, "4", false));
        drops.add(new ItemData(5324, 0.02631578947368421f, "4", false));
        drops.add(new ItemData(1153, 0.0390625f, "1", false));
        drops.add(new ItemData(5322, 0.012987012987012988f, "3", false));
        drops.add(new ItemData(5320, 0.0064516129032258064f, "3", false));
        drops.add(new ItemData(5323, 0.003215434083601286f, "2", false));
        drops.add(new ItemData(5321, 0.0015360983102918587f, "2", false));
        drops.add(new ItemData(22879, 0.0011160714285714285f, "2", false));
        drops.add(new ItemData(995, 0.140625f, "5", false));
        drops.add(new ItemData(995, 0.109375f, "38", false));
        drops.add(new ItemData(995, 0.078125f, "52", false));
        drops.add(new ItemData(995, 0.0625f, "15", false));
        drops.add(new ItemData(995, 0.0546875f, "10", false));
        drops.add(new ItemData(1191, 0.0234375f, "1", false));
        drops.add(new ItemData(995, 0.046875f, "8", false));
        drops.add(new ItemData(995, 0.015625f, "88", false));
        drops.add(new ItemData(225, 0.0859375f, "1", false));
        drops.add(new ItemData(1917, 0.046875f, "1", false));
        drops.add(new ItemData(1446, 0.015625f, "1", false));
        drops.add(new ItemData(20754, 0.0078125f, "1", false));
        drops.add(new ItemData(1295, 0.015625f, "1", false));
        drops.add(new ItemData(11941, 0.2f, "1", false));
        drops.add(new ItemData(13474, 0.04f, "1", false));
        drops.add(new ItemData(884, 0.046875f, "3", false));
        drops.add(new ItemData(23182, 0.02f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(6800, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(554, 0.0234375f, "15", false));
        drops.add(new ItemData(555, 0.0234375f, "7", false));
        drops.add(new ItemData(563, 0.0234375f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
