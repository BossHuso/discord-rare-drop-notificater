package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Vetion implements BaseNPC {
    public List<ItemData> drops;

    public Vetion() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(565, 0.0546875f, "200", false));
        drops.add(new ItemData(2, 0.03125f, "250", false));
        drops.add(new ItemData(1619, 0.0546875f, "20", false));
        drops.add(new ItemData(1617, 0.0546875f, "10", false));
        drops.add(new ItemData(444, 0.046875f, "300", false));
        drops.add(new ItemData(225, 0.0390625f, "25", false));
        drops.add(new ItemData(1513, 0.0390625f, "100", false));
        drops.add(new ItemData(8778, 0.0390625f, "300", false));
        drops.add(new ItemData(536, 0.0234375f, "100", false));
        drops.add(new ItemData(1631, 0.015625f, "1", false));
        drops.add(new ItemData(12601, 0.001953125f, "1", false));
        drops.add(new ItemData(2970, 0.015625f, "200", false));
        drops.add(new ItemData(207, 0.0078125f, "100", false));
        drops.add(new ItemData(995, 0.1484375f, "15000-19999", false));
        drops.add(new ItemData(11936, 0.078125f, "8", false));
        drops.add(new ItemData(3024, 0.078125f, "3", false));
        drops.add(new ItemData(10925, 0.0390625f, "10", false));
        drops.add(new ItemData(4850, 0.0390625f, "10", false));
        drops.add(new ItemData(6034, 0.037109375f, "100", false));
        drops.add(new ItemData(11940, 0.0078125f, "375", false));
        drops.add(new ItemData(5289, 0.0078125f, "1", false));
        drops.add(new ItemData(1275, 0.09375f, "1", false));
        drops.add(new ItemData(5315, 0.0078125f, "1", false));
        drops.add(new ItemData(5316, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(12073, 0.01f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(13179, 0.0005f, "1", false));
        drops.add(new ItemData(6806, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(23490, 0.02f, "1", false));
        drops.add(new ItemData(1319, 0.0234375f, "1", false));
        drops.add(new ItemData(21257, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(4675, 0.0234375f, "1", false));
        drops.add(new ItemData(11920, 0.005859375f, "1", false));
        drops.add(new ItemData(7158, 0.00390625f, "1", false));
        drops.add(new ItemData(562, 0.0546875f, "400", false));
        drops.add(new ItemData(560, 0.0546875f, "300", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
