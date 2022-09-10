package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Chaosdwarf implements BaseNPC {
    public List<ItemData> drops;

    public Chaosdwarf() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.009765625f, "1", false));
        drops.add(new ItemData(1621, 0.0048828125f, "1", false));
        drops.add(new ItemData(1619, 0.00244140625f, "1", false));
        drops.add(new ItemData(1452, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1462, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1617, 0.0006103515625f, "1", false));
        drops.add(new ItemData(830, 0.00030517578125f, "5", false));
        drops.add(new ItemData(987, 0.00030517578125f, "1", false));
        drops.add(new ItemData(985, 0.00030517578125f, "1", false));
        drops.add(new ItemData(1247, 0.000019073486328125f, "1", false));
        drops.add(new ItemData(2366, 0.0000095367431640625f, "1", false));
        drops.add(new ItemData(1249, 0.0000071519986231544404f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(564, 0.015625f, "3", false));
        drops.add(new ItemData(560, 0.0078125f, "3", false));
        drops.add(new ItemData(555, 0.0078125f, "10", false));
        drops.add(new ItemData(995, 0.3125f, "92", false));
        drops.add(new ItemData(995, 0.140625f, "47", false));
        drops.add(new ItemData(995, 0.0859375f, "25", false));
        drops.add(new ItemData(995, 0.078125f, "150", false));
        drops.add(new ItemData(995, 0.015625f, "350", false));
        drops.add(new ItemData(995, 0.015625f, "15", false));
        drops.add(new ItemData(453, 0.0078125f, "1", false));
        drops.add(new ItemData(1157, 0.015625f, "1", false));
        drops.add(new ItemData(991, 0.0546875f, "1", false));
        drops.add(new ItemData(1985, 0.0078125f, "1", false));
        drops.add(new ItemData(2359, 0.046875f, "1", false));
        drops.add(new ItemData(1982, 0.0078125f, "1", false));
        drops.add(new ItemData(1299, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(1181, 0.0078125f, "1", false));
        drops.add(new ItemData(563, 0.03125f, "3", false));
        drops.add(new ItemData(556, 0.0234375f, "24", false));
        drops.add(new ItemData(562, 0.0234375f, "10", false));
        drops.add(new ItemData(558, 0.0234375f, "37", false));
        drops.add(new ItemData(561, 0.0234375f, "9", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
