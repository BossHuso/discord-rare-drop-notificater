package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Blackdemon implements BaseNPC {
    public List<ItemData> drops;

    public Blackdemon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25772, 1f, "1", false));
        drops.add(new ItemData(565, 0.03125f, "7", false));
        drops.add(new ItemData(554, 0.0078125f, "37", false));
        drops.add(new ItemData(563, 0.0078125f, "3", false));
        drops.add(new ItemData(199, 0.04484304932735426f, "1", false));
        drops.add(new ItemData(201, 0.03367003367003367f, "1", false));
        drops.add(new ItemData(203, 0.025252525252525252f, "1", false));
        drops.add(new ItemData(205, 0.019646365422396856f, "1", false));
        drops.add(new ItemData(207, 0.015432098765432098f, "1", false));
        drops.add(new ItemData(209, 0.011235955056179775f, "1", false));
        drops.add(new ItemData(211, 0.008424599831508003f, "1", false));
        drops.add(new ItemData(1283, 0.03125f, "1", false));
        drops.add(new ItemData(213, 0.007017543859649123f, "1", false));
        drops.add(new ItemData(215, 0.005614823133071308f, "1", false));
        drops.add(new ItemData(2485, 0.004212299915754001f, "1", false));
        drops.add(new ItemData(217, 0.004212299915754001f, "1", false));
        drops.add(new ItemData(995, 0.3125f, "132", false));
        drops.add(new ItemData(995, 0.0546875f, "30", false));
        drops.add(new ItemData(995, 0.046875f, "44", false));
        drops.add(new ItemData(995, 0.046875f, "220", false));
        drops.add(new ItemData(995, 0.0078125f, "460", false));
        drops.add(new ItemData(379, 0.0234375f, "1", false));
        drops.add(new ItemData(1365, 0.0234375f, "1", false));
        drops.add(new ItemData(2361, 0.015625f, "1", false));
        drops.add(new ItemData(133, 0.0078125f, "1", false));
        drops.add(new ItemData(1361, 0.015625f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(13501, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(23083, 0.011764705882352941f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(19677, 0.004424778761061947f, "1", false));
        drops.add(new ItemData(19679, 0.0029411764705882353f, "1", false));
        drops.add(new ItemData(19681, 0.0029411764705882353f, "1", false));
        drops.add(new ItemData(19683, 0.0029411764705882353f, "1", false));
        drops.add(new ItemData(23490, 0.012195121951219513f, "1", false));
        drops.add(new ItemData(21257, 0.005128205128205128f, "1", false));
        drops.add(new ItemData(1113, 0.0078125f, "1", false));
        drops.add(new ItemData(556, 0.0625f, "50", false));
        drops.add(new ItemData(562, 0.0546875f, "10", false));
        drops.add(new ItemData(385, 0.015625f, "1", false));
        drops.add(new ItemData(23490, 0.014705882352941176f, "1", false));
        drops.add(new ItemData(21257, 0.00625f, "1", false));
        drops.add(new ItemData(1289, 0.03125f, "1", false));
        drops.add(new ItemData(1211, 0.0234375f, "1", false));
        drops.add(new ItemData(1371, 0.015625f, "1", false));
        drops.add(new ItemData(1123, 0.0078125f, "1", false));
        drops.add(new ItemData(1213, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(560, 0.0625f, "5", false));
        drops.add(new ItemData(562, 0.0546875f, "25", false));
        drops.add(new ItemData(563, 0.0078125f, "15", false));
        drops.add(new ItemData(565, 0.0078125f, "5", false));
        drops.add(new ItemData(2361, 0.015625f, "2", false));
        drops.add(new ItemData(449, 0.0078125f, "2", false));
        drops.add(new ItemData(995, 0.3125f, "250-499", false));
        drops.add(new ItemData(995, 0.0546875f, "250", false));
        drops.add(new ItemData(995, 0.046875f, "500-749", false));
        drops.add(new ItemData(995, 0.046875f, "500-999", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
