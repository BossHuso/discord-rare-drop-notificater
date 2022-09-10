package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Reddragon implements BaseNPC {
    public List<ItemData> drops;

    public Reddragon() {
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
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1303, 0.0078125f, "1", false));
        drops.add(new ItemData(892, 0.0625f, "4", false));
        drops.add(new ItemData(563, 0.0390625f, "4", false));
        drops.add(new ItemData(565, 0.03125f, "2", false));
        drops.add(new ItemData(560, 0.0234375f, "5", false));
        drops.add(new ItemData(199, 0.00390625f, "1", false));
        drops.add(new ItemData(201, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(203, 0.002197319270490002f, "1", false));
        drops.add(new ItemData(205, 0.0017091095539224065f, "1", false));
        drops.add(new ItemData(207, 0.0013428226131328052f, "1", false));
        drops.add(new ItemData(1749, 1f, "1", false));
        drops.add(new ItemData(209, 0.0009765625f, "1", false));
        drops.add(new ItemData(211, 0.0007324397568300008f, "1", false));
        drops.add(new ItemData(213, 0.0006103515625f, "1", false));
        drops.add(new ItemData(215, 0.00048828125f, "1", false));
        drops.add(new ItemData(2485, 0.00036620646720621084f, "1", false));
        drops.add(new ItemData(217, 0.00036620646720621084f, "1", false));
        drops.add(new ItemData(995, 0.3125f, "196", false));
        drops.add(new ItemData(995, 0.2265625f, "66", false));
        drops.add(new ItemData(995, 0.078125f, "330", false));
        drops.add(new ItemData(995, 0.0078125f, "690", false));
        drops.add(new ItemData(1315, 0.03125f, "1", false));
        drops.add(new ItemData(19582, 0.078125f, "10", false));
        drops.add(new ItemData(1897, 0.0234375f, "3", false));
        drops.add(new ItemData(2361, 0.0078125f, "1", false));
        drops.add(new ItemData(1355, 0.0234375f, "1", false));
        drops.add(new ItemData(23510, 0.1f, "1", false));
        drops.add(new ItemData(23512, 0.1f, "1", false));
        drops.add(new ItemData(23514, 0.1f, "1", false));
        drops.add(new ItemData(13510, 0.025f, "1", false));
        drops.add(new ItemData(23499, 0.02f, "1", false));
        drops.add(new ItemData(23083, 0.011235955056179775f, "1", false));
        drops.add(new ItemData(1369, 0.0234375f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(811, 0.0234375f, "8", false));
        drops.add(new ItemData(828, 0.0078125f, "20", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1123, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
