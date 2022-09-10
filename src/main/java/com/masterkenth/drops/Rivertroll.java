package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Rivertroll implements BaseNPC {
    public List<ItemData> drops;

    public Rivertroll() {
        drops = new ArrayList<>();
        drops.add(new ItemData(359, 0.0078125f, "1", false));
        drops.add(new ItemData(313, 0.1015625f, "30", false));
        drops.add(new ItemData(313, 0.015625f, "50", false));
        drops.add(new ItemData(314, 0.03125f, "20", false));
        drops.add(new ItemData(314, 0.03125f, "40", false));
        drops.add(new ItemData(407, 0.09375f, "1", false));
        drops.add(new ItemData(151, 0.0234375f, "1", false));
        drops.add(new ItemData(405, 0.0390625f, "1", false));
        drops.add(new ItemData(331, 0.03125f, "1", false));
        drops.add(new ItemData(345, 0.0234375f, "1", false));
        drops.add(new ItemData(349, 0.046875f, "1", false));
        drops.add(new ItemData(327, 0.03125f, "1", false));
        drops.add(new ItemData(371, 0.1484375f, "1", false));
        drops.add(new ItemData(383, 0.09375f, "1", false));
        drops.add(new ItemData(313, 0.2109375f, "5", false));
        drops.add(new ItemData(313, 0.0703125f, "15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
