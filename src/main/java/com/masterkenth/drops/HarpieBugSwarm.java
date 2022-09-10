package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class HarpieBugSwarm implements BaseNPC {
    public List<ItemData> drops;

    public HarpieBugSwarm() {
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
        drops.add(new ItemData(1353, 0.03125f, "1", false));
        drops.add(new ItemData(560, 0.0234375f, "3", false));
        drops.add(new ItemData(995, 0.1953125f, "40", false));
        drops.add(new ItemData(995, 0.15625f, "160", false));
        drops.add(new ItemData(995, 0.078125f, "230", false));
        drops.add(new ItemData(995, 0.0546875f, "30", false));
        drops.add(new ItemData(995, 0.015625f, "490", false));
        drops.add(new ItemData(444, 0.0625f, "1", false));
        drops.add(new ItemData(1993, 0.015625f, "1", false));
        drops.add(new ItemData(1157, 0.03125f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(1387, 0.0234375f, "1", false));
        drops.add(new ItemData(1109, 0.015625f, "1", false));
        drops.add(new ItemData(1145, 0.0078125f, "1", false));
        drops.add(new ItemData(4123, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.15625f, "30", false));
        drops.add(new ItemData(554, 0.0625f, "60", false));
        drops.add(new ItemData(562, 0.0390625f, "15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
