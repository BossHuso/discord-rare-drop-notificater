package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BlackGuardBerserker implements BaseNPC {
    public List<ItemData> drops;

    public BlackGuardBerserker() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.001953125f, "1", false));
        drops.add(new ItemData(1621, 0.0009765625f, "1", false));
        drops.add(new ItemData(1619, 0.00048828125f, "1", false));
        drops.add(new ItemData(1452, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(1462, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(1617, 0.0001220703125f, "1", false));
        drops.add(new ItemData(830, 0.00006103515625f, "5", false));
        drops.add(new ItemData(987, 0.00006103515625f, "1", false));
        drops.add(new ItemData(985, 0.00006103515625f, "1", false));
        drops.add(new ItemData(1247, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(2366, 0.0000019073486328125f, "1", false));
        drops.add(new ItemData(1249, 0.000001430399724630888f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(207, 0.0013428226131328052f, "1", false));
        drops.add(new ItemData(209, 0.0009765625f, "1", false));
        drops.add(new ItemData(211, 0.0007324397568300008f, "1", false));
        drops.add(new ItemData(213, 0.0006103515625f, "1", false));
        drops.add(new ItemData(215, 0.00048828125f, "1", false));
        drops.add(new ItemData(2485, 0.00036620646720621084f, "1", false));
        drops.add(new ItemData(217, 0.00036620646720621084f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "5", false));
        drops.add(new ItemData(438, 0.0078125f, "1", false));
        drops.add(new ItemData(440, 0.0234375f, "2", false));
        drops.add(new ItemData(1337, 0.0234375f, "1", false));
        drops.add(new ItemData(995, 0.3515625f, "35", false));
        drops.add(new ItemData(995, 0.0390625f, "42", false));
        drops.add(new ItemData(995, 0.0703125f, "46", false));
        drops.add(new ItemData(995, 0.0234375f, "57", false));
        drops.add(new ItemData(1917, 0.0078125f, "1", false));
        drops.add(new ItemData(3801, 0.03125f, "1", false));
        drops.add(new ItemData(1891, 0.03125f, "1", false));
        drops.add(new ItemData(1929, 0.0078125f, "1", false));
        drops.add(new ItemData(1592, 0.0078125f, "1", false));
        drops.add(new ItemData(1335, 0.046875f, "1", false));
        drops.add(new ItemData(1339, 0.0078125f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(1341, 0.015625f, "1", false));
        drops.add(new ItemData(199, 0.00390625f, "1", false));
        drops.add(new ItemData(201, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(203, 0.002197319270490002f, "1", false));
        drops.add(new ItemData(205, 0.0017091095539224065f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
