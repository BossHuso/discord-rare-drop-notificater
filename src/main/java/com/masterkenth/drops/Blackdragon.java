package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Blackdragon implements BaseNPC {
    public List<ItemData> drops;

    public Blackdragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1303, 0.0078125f, "1", false));
        drops.add(new ItemData(829, 0.15625f, "30", false));
        drops.add(new ItemData(816, 0.0546875f, "16", false));
        drops.add(new ItemData(554, 0.0625f, "50", false));
        drops.add(new ItemData(565, 0.0234375f, "15", false));
        drops.add(new ItemData(556, 0.0078125f, "75", false));
        drops.add(new ItemData(563, 0.0390625f, "10", false));
        drops.add(new ItemData(995, 0.3125f, "196", false));
        drops.add(new ItemData(995, 0.078125f, "330", false));
        drops.add(new ItemData(995, 0.0078125f, "690", false));
        drops.add(new ItemData(1747, 1f, "1", false));
        drops.add(new ItemData(19582, 0.046875f, "10", false));
        drops.add(new ItemData(2361, 0.0234375f, "1", false));
        drops.add(new ItemData(1897, 0.0234375f, "1", false));
        drops.add(new ItemData(7478, 1f, "1", false));
        drops.add(new ItemData(1315, 0.03125f, "1", false));
        drops.add(new ItemData(1355, 0.0234375f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(13510, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(23083, 0.013513513513513514f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(23490, 0.013888888888888888f, "1", false));
        drops.add(new ItemData(21257, 0.005952380952380952f, "1", false));
        drops.add(new ItemData(1369, 0.0234375f, "1", false));
        drops.add(new ItemData(868, 0.0234375f, "2", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1123, 0.0078125f, "1", false));
        drops.add(new ItemData(11286, 0.0002f, "1", false));
        drops.add(new ItemData(1123, 0.15625f, "1", false));
        drops.add(new ItemData(868, 0.0546875f, "15", false));
        drops.add(new ItemData(868, 0.046875f, "10", false));
        drops.add(new ItemData(1317, 0.03125f, "1", false));
        drops.add(new ItemData(1371, 0.0234375f, "1", false));
        drops.add(new ItemData(1359, 0.0234375f, "1", false));
        drops.add(new ItemData(868, 0.0234375f, "5", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(1201, 0.0078125f, "1", false));
        drops.add(new ItemData(560, 0.0625f, "10", false));
        drops.add(new ItemData(565, 0.0234375f, "10", false));
        drops.add(new ItemData(562, 0.0078125f, "25", false));
        drops.add(new ItemData(995, 0.3125f, "500-999", false));
        drops.add(new ItemData(995, 0.078125f, "1000-1999", false));
        drops.add(new ItemData(19582, 0.046875f, "25", false));
        drops.add(new ItemData(2361, 0.0234375f, "1", false));
        drops.add(new ItemData(7946, 0.0234375f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
