package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CorporealBeast implements BaseNPC {
    public List<ItemData> drops;

    public CorporealBeast() {
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
        drops.add(new ItemData(12823, 0.0007326007326007326f, "1", false));
        drops.add(new ItemData(566, 0.0625f, "250", false));
        drops.add(new ItemData(9144, 0.046875f, "250", false));
        drops.add(new ItemData(560, 0.04296875f, "300", false));
        drops.add(new ItemData(9245, 0.0390625f, "175", false));
        drops.add(new ItemData(2, 0.033203125f, "2000", false));
        drops.add(new ItemData(890, 0.033203125f, "750", false));
        drops.add(new ItemData(563, 0.033203125f, "250", false));
        drops.add(new ItemData(564, 0.033203125f, "500", false));
        drops.add(new ItemData(383, 0.041015625f, "70", false));
        drops.add(new ItemData(7936, 0.041015625f, "2500", false));
        drops.add(new ItemData(12827, 0.0007326007326007326f, "1", false));
        drops.add(new ItemData(2361, 0.03515625f, "35", false));
        drops.add(new ItemData(1753, 0.03515625f, "100", false));
        drops.add(new ItemData(449, 0.033203125f, "125", false));
        drops.add(new ItemData(451, 0.0234375f, "20", false));
        drops.add(new ItemData(8780, 0.0234375f, "100", false));
        drops.add(new ItemData(6332, 0.0234375f, "150", false));
        drops.add(new ItemData(1513, 0.0234375f, "75", false));
        drops.add(new ItemData(7060, 0.0390625f, "30", false));
        drops.add(new ItemData(239, 0.033203125f, "120", false));
        drops.add(new ItemData(9735, 0.033203125f, "120", false));
        drops.add(new ItemData(12819, 0.0002442002442002442f, "1", false));
        drops.add(new ItemData(5321, 0.029296875f, "24", false));
        drops.add(new ItemData(995, 0.0234375f, "20000-50000", false));
        drops.add(new ItemData(5952, 0.01953125f, "40", false));
        drops.add(new ItemData(12829, 0.015625f, "1", false));
        drops.add(new ItemData(5295, 0.009765625f, "10", false));
        drops.add(new ItemData(12833, 0.005859375f, "1", false));
        drops.add(new ItemData(4091, 0.03515625f, "1", false));
        drops.add(new ItemData(12073, 0.005f, "1", false));
        drops.add(new ItemData(25521, 0.001f, "1", false));
        drops.add(new ItemData(12816, 0.0002f, "1", false));
        drops.add(new ItemData(4093, 0.03515625f, "1", false));
        drops.add(new ItemData(1405, 0.0234375f, "1", false));
        drops.add(new ItemData(1403, 0.0234375f, "1", false));
        drops.add(new ItemData(1407, 0.0234375f, "1", false));
        drops.add(new ItemData(1401, 0.0234375f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
