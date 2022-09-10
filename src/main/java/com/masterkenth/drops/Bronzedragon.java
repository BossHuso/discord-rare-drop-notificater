package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Bronzedragon implements BaseNPC {
    public List<ItemData> drops;

    public Bronzedragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1123, 0.0078125f, "1", false));
        drops.add(new ItemData(1303, 0.0078125f, "1", false));
        drops.add(new ItemData(829, 0.15625f, "30", false));
        drops.add(new ItemData(554, 0.0625f, "50", false));
        drops.add(new ItemData(9142, 0.046875f, "2-12", false));
        drops.add(new ItemData(563, 0.0390625f, "10", false));
        drops.add(new ItemData(565, 0.0234375f, "15", false));
        drops.add(new ItemData(560, 0.0078125f, "25", false));
        drops.add(new ItemData(995, 0.3125f, "196", false));
        drops.add(new ItemData(2349, 1f, "5", false));
        drops.add(new ItemData(995, 0.078125f, "330", false));
        drops.add(new ItemData(995, 0.0078125f, "690", false));
        drops.add(new ItemData(2361, 0.0234375f, "1", false));
        drops.add(new ItemData(373, 0.015625f, "2", false));
        drops.add(new ItemData(373, 0.0078125f, "1", false));
        drops.add(new ItemData(4585, 0.00048828125f, "1", false));
        drops.add(new ItemData(4087, 0.00048828125f, "1", false));
        drops.add(new ItemData(816, 0.0546875f, "16", false));
        drops.add(new ItemData(23083, 0.010752688172043012f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(1315, 0.03125f, "1", false));
        drops.add(new ItemData(1355, 0.0234375f, "1", false));
        drops.add(new ItemData(1369, 0.0234375f, "1", false));
        drops.add(new ItemData(868, 0.0234375f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
