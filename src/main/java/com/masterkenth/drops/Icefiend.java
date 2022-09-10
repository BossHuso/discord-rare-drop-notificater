package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Icefiend implements BaseNPC {
    public List<ItemData> drops;

    public Icefiend() {
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
        drops.add(new ItemData(556, 0.0078125f, "1-5", false));
        drops.add(new ItemData(11941, 0.125f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.03125f, "1-5", false));
        drops.add(new ItemData(995, 0.03125f, "1-30", false));
        drops.add(new ItemData(995, 0.03125f, "1-20", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
