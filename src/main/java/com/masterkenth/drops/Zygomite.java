package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zygomite implements BaseNPC {
    public List<ItemData> drops;

    public Zygomite() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(1621, 0.0035714285714285713f, "1", false));
        drops.add(new ItemData(1619, 0.0017857142857142857f, "1", false));
        drops.add(new ItemData(1452, 0.0006695905453814991f, "1", false));
        drops.add(new ItemData(1462, 0.0006695905453814991f, "1", false));
        drops.add(new ItemData(1617, 0.0004464285714285714f, "1", false));
        drops.add(new ItemData(830, 0.0002232142857142857f, "5", false));
        drops.add(new ItemData(987, 0.0002232142857142857f, "1", false));
        drops.add(new ItemData(985, 0.0002232142857142857f, "1", false));
        drops.add(new ItemData(1247, 0.000013950892857142857f, "1", false));
        drops.add(new ItemData(2366, 0.000006975446428571428f, "1", false));
        drops.add(new ItemData(1249, 0.000005231176135792962f, "1", false));
        drops.add(new ItemData(1623, 0.009124087591240875f, "1", false));
        drops.add(new ItemData(1621, 0.004562043795620438f, "1", false));
        drops.add(new ItemData(1619, 0.002281021897810219f, "1", false));
        drops.add(new ItemData(1452, 0.0008553163900858565f, "1", false));
        drops.add(new ItemData(1462, 0.0008553163900858565f, "1", false));
        drops.add(new ItemData(1617, 0.0005702554744525547f, "1", false));
        drops.add(new ItemData(830, 0.00028512773722627735f, "5", false));
        drops.add(new ItemData(987, 0.00028512773722627735f, "1", false));
        drops.add(new ItemData(985, 0.00028512773722627735f, "1", false));
        drops.add(new ItemData(1247, 0.000017820483576642334f, "1", false));
        drops.add(new ItemData(2366, 0.000008910241788321167f, "1", false));
        drops.add(new ItemData(1249, 0.000006682159297545754f, "1", false));
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(5318, 0.0072992700729927005f, "4", false));
        drops.add(new ItemData(5282, 0.019464720194647202f, "1", false));
        drops.add(new ItemData(995, 0.021897810218978103f, "24", false));
        drops.add(new ItemData(995, 0.2846715328467153f, "64", false));
        drops.add(new ItemData(995, 0.072992700729927f, "120", false));
        drops.add(new ItemData(995, 0.014598540145985401f, "250", false));
        drops.add(new ItemData(6034, 0.043795620437956206f, "1", false));
        drops.add(new ItemData(2970, 0.019464720194647202f, "1", false));
        drops.add(new ItemData(434, 0.051094890510948905f, "1", false));
        drops.add(new ItemData(7432, 0.019464720194647202f, "1", false));
        drops.add(new ItemData(1353, 0.021897810218978103f, "1", false));
        drops.add(new ItemData(1311, 0.021897810218978103f, "1", false));
        drops.add(new ItemData(23083, 0.005319148936170213f, "1", false));
        drops.add(new ItemData(1353, 0.02142857142857143f, "1", false));
        drops.add(new ItemData(1311, 0.04285714285714286f, "1", false));
        drops.add(new ItemData(1163, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(561, 0.02142857142857143f, "2", false));
        drops.add(new ItemData(557, 0.03571428571428571f, "15", false));
        drops.add(new ItemData(203, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(205, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(1159, 0.0072992700729927005f, "1", false));
        drops.add(new ItemData(5323, 0.07857142857142857f, "4", false));
        drops.add(new ItemData(5318, 0.007142857142857143f, "4", false));
        drops.add(new ItemData(5282, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(995, 0.21428571428571427f, "44", false));
        drops.add(new ItemData(995, 0.2785714285714286f, "102", false));
        drops.add(new ItemData(995, 0.05f, "220", false));
        drops.add(new ItemData(995, 0.014285714285714285f, "460", false));
        drops.add(new ItemData(6034, 0.04285714285714286f, "1-3", false));
        drops.add(new ItemData(2970, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(434, 0.05f, "1", false));
        drops.add(new ItemData(561, 0.21897810218978103f, "2", false));
        drops.add(new ItemData(7432, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(557, 0.0364963503649635f, "15", false));
        drops.add(new ItemData(23083, 0.009009009009009009f, "1", false));
        drops.add(new ItemData(203, 0.014598540145985401f, "1", false));
        drops.add(new ItemData(205, 0.0072992700729927005f, "1", false));
        drops.add(new ItemData(5323, 0.08029197080291971f, "4", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
