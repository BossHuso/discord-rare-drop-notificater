package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GiantMole implements BaseNPC {
    public List<ItemData> drops;

    public GiantMole() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(556, 0.15625f, "105", false));
        drops.add(new ItemData(565, 0.1484375f, "15", false));
        drops.add(new ItemData(554, 0.0859375f, "105", false));
        drops.add(new ItemData(884, 0.078125f, "690", false));
        drops.add(new ItemData(563, 0.0390625f, "15", false));
        drops.add(new ItemData(560, 0.0234375f, "7", false));
        drops.add(new ItemData(1515, 0.078125f, "100", false));
        drops.add(new ItemData(385, 0.03125f, "4", false));
        drops.add(new ItemData(2359, 0.0234375f, "1", false));
        drops.add(new ItemData(440, 0.015625f, "100", false));
        drops.add(new ItemData(7416, 1f, "1", false));
        drops.add(new ItemData(413, 0.0078125f, "1", false));
        drops.add(new ItemData(7418, 1f, "1-3", false));
        drops.add(new ItemData(1301, 0.078125f, "1", false));
        drops.add(new ItemData(23083, 0.013513513513513514f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(1121, 0.0703125f, "1", false));
        drops.add(new ItemData(12646, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(1725, 0.0546875f, "1", false));
        drops.add(new ItemData(1355, 0.015625f, "1", false));
        drops.add(new ItemData(1369, 0.0078125f, "1", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
