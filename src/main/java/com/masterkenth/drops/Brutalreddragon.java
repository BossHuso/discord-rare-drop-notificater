package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Brutalreddragon implements BaseNPC {
    public List<ItemData> drops;

    public Brutalreddragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(2489, 0.0078125f, "1", false));
        drops.add(new ItemData(1215, 0.0078125f, "1", false));
        drops.add(new ItemData(1305, 0.0078125f, "1", false));
        drops.add(new ItemData(1149, 0.0078125f, "1", false));
        drops.add(new ItemData(1127, 0.0078125f, "1", false));
        drops.add(new ItemData(560, 0.0625f, "25", false));
        drops.add(new ItemData(830, 0.0625f, "30", false));
        drops.add(new ItemData(556, 0.0546875f, "105", false));
        drops.add(new ItemData(565, 0.0546875f, "12", false));
        drops.add(new ItemData(563, 0.0546875f, "25", false));
        drops.add(new ItemData(1749, 1f, "2", false));
        drops.add(new ItemData(892, 0.0546875f, "25", false));
        drops.add(new ItemData(810, 0.0390625f, "20", false));
        drops.add(new ItemData(868, 0.015625f, "10", false));
        drops.add(new ItemData(805, 0.015625f, "15", false));
        drops.add(new ItemData(239, 0.03125f, "5", false));
        drops.add(new ItemData(11232, 0.0234375f, "8", false));
        drops.add(new ItemData(11237, 0.015625f, "8", false));
        drops.add(new ItemData(451, 0.015625f, "2", false));
        drops.add(new ItemData(19582, 0.015625f, "25", false));
        drops.add(new ItemData(995, 0.09375f, "670", false));
        drops.add(new ItemData(11377, 0.078125f, "1", false));
        drops.add(new ItemData(995, 0.015625f, "621", false));
        drops.add(new ItemData(2011, 0.0625f, "3", false));
        drops.add(new ItemData(1247, 0.078125f, "1", false));
        drops.add(new ItemData(1073, 0.0546875f, "1", false));
        drops.add(new ItemData(13510, 0.05f, "1", false));
        drops.add(new ItemData(23083, 0.016129032258064516f, "1", false));
        drops.add(new ItemData(1161, 0.0390625f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(19677, 0.006993006993006993f, "1", false));
        drops.add(new ItemData(19679, 0.004651162790697674f, "1", false));
        drops.add(new ItemData(19681, 0.004651162790697674f, "1", false));
        drops.add(new ItemData(19683, 0.004651162790697674f, "1", false));
        drops.add(new ItemData(1303, 0.0390625f, "1", false));
        drops.add(new ItemData(2501, 0.015625f, "1", false));
        drops.add(new ItemData(1163, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
