package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Kraken implements BaseNPC {
    public List<ItemData> drops;

    public Kraken() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(1403, 0.0234375f, "1", false));
        drops.add(new ItemData(560, 0.078125f, "150", false));
        drops.add(new ItemData(565, 0.078125f, "60", false));
        drops.add(new ItemData(566, 0.0546875f, "50", false));
        drops.add(new ItemData(5321, 0.0234375f, "24", false));
        drops.add(new ItemData(5304, 0.0078125f, "2", false));
        drops.add(new ItemData(5316, 0.0078125f, "1", false));
        drops.add(new ItemData(401, 0.0234375f, "125", false));
        drops.add(new ItemData(1391, 0.03125f, "10", false));
        drops.add(new ItemData(567, 0.015625f, "50", false));
        drops.add(new ItemData(1601, 0.0078125f, "8", false));
        drops.add(new ItemData(1347, 0.015625f, "1", false));
        drops.add(new ItemData(8778, 0.0234375f, "60", false));
        drops.add(new ItemData(2363, 0.0078125f, "2", false));
        drops.add(new ItemData(383, 0.015625f, "50", false));
        drops.add(new ItemData(7944, 0.015625f, "100", false));
        drops.add(new ItemData(3051, 0.015625f, "6", false));
        drops.add(new ItemData(995, 0.1171875f, "10000-19999", false));
        drops.add(new ItemData(385, 0.0546875f, "5", false));
        drops.add(new ItemData(7114, 0.03125f, "1", false));
        drops.add(new ItemData(10925, 0.03125f, "2", false));
        drops.add(new ItemData(403, 0.0234375f, "5", false));
        drops.add(new ItemData(1303, 0.015625f, "1", false));
        drops.add(new ItemData(311, 0.0078125f, "1", false));
        drops.add(new ItemData(1925, 0.0078125f, "1", false));
        drops.add(new ItemData(989, 0.0078125f, "1", false));
        drops.add(new ItemData(686, 0.013671875f, "1", false));
        drops.add(new ItemData(5952, 0.015625f, "2", false));
        drops.add(new ItemData(1645, 0.0078125f, "1", false));
        drops.add(new ItemData(12004, 0.0025f, "1", false));
        drops.add(new ItemData(4091, 0.0078125f, "1", false));
        drops.add(new ItemData(23083, 0.020833333333333332f, "1", false));
        drops.add(new ItemData(4093, 0.0078125f, "1", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(12007, 0.001f, "1", false));
        drops.add(new ItemData(12655, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(11907, 0.001953125f, "1", false));
        drops.add(new ItemData(555, 0.078125f, "400", false));
        drops.add(new ItemData(4695, 0.03125f, "100", false));
        drops.add(new ItemData(562, 0.078125f, "250", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
