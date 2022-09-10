package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Gorak implements BaseNPC {
    public List<ItemData> drops;

    public Gorak() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(1623, 0.25f, "1", false));
        drops.add(new ItemData(1621, 0.125f, "1", false));
        drops.add(new ItemData(1619, 0.0625f, "1", false));
        drops.add(new ItemData(1452, 0.02343566908835247f, "1", false));
        drops.add(new ItemData(1462, 0.02343566908835247f, "1", false));
        drops.add(new ItemData(1617, 0.015625f, "1", false));
        drops.add(new ItemData(830, 0.0078125f, "5", false));
        drops.add(new ItemData(987, 0.0078125f, "1", false));
        drops.add(new ItemData(985, 0.0078125f, "1", false));
        drops.add(new ItemData(1247, 0.00048828125f, "1", false));
        drops.add(new ItemData(2366, 0.000244140625f, "1", false));
        drops.add(new ItemData(1249, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(9016, 0.3333333333333333f, "1", false));
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
        drops.add(new ItemData(3192, 0.0234375f, "1", false));
        drops.add(new ItemData(5670, 0.015625f, "1", false));
        drops.add(new ItemData(1309, 0.0234375f, "1", false));
        drops.add(new ItemData(802, 0.0234375f, "1", false));
        drops.add(new ItemData(1365, 0.0078125f, "1", false));
        drops.add(new ItemData(803, 0.0234375f, "1", false));
        drops.add(new ItemData(1199, 0.0078125f, "1", false));
        drops.add(new ItemData(1083, 0.0078125f, "1", false));
        drops.add(new ItemData(1069, 0.03125f, "1", false));
        drops.add(new ItemData(1113, 0.0078125f, "1", false));
        drops.add(new ItemData(199, 0.03125f, "1", false));
        drops.add(new ItemData(201, 0.0234192037470726f, "1", false));
        drops.add(new ItemData(203, 0.01757469244288225f, "1", false));
        drops.add(new ItemData(205, 0.013679890560875513f, "1", false));
        drops.add(new ItemData(207, 0.010741138560687433f, "1", false));
        drops.add(new ItemData(209, 0.0078125f, "1", false));
        drops.add(new ItemData(211, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(213, 0.0048828125f, "1", false));
        drops.add(new ItemData(215, 0.00390625f, "1", false));
        drops.add(new ItemData(2485, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(217, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(995, 0.0390625f, "27", false));
        drops.add(new ItemData(995, 0.0390625f, "97", false));
        drops.add(new ItemData(995, 0.2265625f, "104", false));
        drops.add(new ItemData(995, 0.1953125f, "132", false));
        drops.add(new ItemData(995, 0.078125f, "286", false));
        drops.add(new ItemData(995, 0.0625f, "475", false));
        drops.add(new ItemData(5625, 0.015625f, "4", false));
        drops.add(new ItemData(2570, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
