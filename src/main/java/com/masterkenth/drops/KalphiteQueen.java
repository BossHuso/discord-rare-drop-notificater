package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class KalphiteQueen implements BaseNPC {
    public List<ItemData> drops;

    public KalphiteQueen() {
        drops = new ArrayList<>();
        drops.add(new ItemData(7946, 0.1111111111111111f, "3", false));
        drops.add(new ItemData(1391, 0.0390625f, "10", false));
        drops.add(new ItemData(1113, 0.03515625f, "1", false));
        drops.add(new ItemData(2501, 0.03125f, "1", false));
        drops.add(new ItemData(5667, 0.03125f, "25", false));
        drops.add(new ItemData(3053, 0.015625f, "1", false));
        drops.add(new ItemData(3140, 0.0078125f, "1", false));
        drops.add(new ItemData(7158, 0.00390625f, "1", false));
        drops.add(new ItemData(560, 0.046875f, "150", false));
        drops.add(new ItemData(565, 0.046875f, "100", false));
        drops.add(new ItemData(888, 0.0390625f, "500", false));
        drops.add(new ItemData(385, 0.1111111111111111f, "2", false));
        drops.add(new ItemData(892, 0.0234375f, "250", false));
        drops.add(new ItemData(3049, 0.015625f, "25", false));
        drops.add(new ItemData(207, 0.015625f, "25", false));
        drops.add(new ItemData(3051, 0.015625f, "25", false));
        drops.add(new ItemData(219, 0.015625f, "25", false));
        drops.add(new ItemData(5304, 0.03125f, "2", false));
        drops.add(new ItemData(5321, 0.0234375f, "25", false));
        drops.add(new ItemData(5288, 0.0234375f, "2", false));
        drops.add(new ItemData(5289, 0.0234375f, "2", false));
        drops.add(new ItemData(5316, 0.0234375f, "2", false));
        drops.add(new ItemData(11936, 0.1111111111111111f, "2", false));
        drops.add(new ItemData(2363, 0.0390625f, "3", false));
        drops.add(new ItemData(1783, 0.03125f, "100", false));
        drops.add(new ItemData(444, 0.03125f, "250", false));
        drops.add(new ItemData(1513, 0.03125f, "60", false));
        drops.add(new ItemData(1621, 0.0234375f, "25", false));
        drops.add(new ItemData(1619, 0.0234375f, "25", false));
        drops.add(new ItemData(1617, 0.0234375f, "25", false));
        drops.add(new ItemData(245, 0.078125f, "60", false));
        drops.add(new ItemData(3138, 0.0625f, "100", false));
        drops.add(new ItemData(995, 0.0390625f, "15000-20000", false));
        drops.add(new ItemData(6685, 0.1111111111111111f, "1", false));
        drops.add(new ItemData(1987, 0.0390625f, "100", false));
        drops.add(new ItemData(5940, 0.0390625f, "5", false));
        drops.add(new ItemData(6016, 0.0234375f, "10", false));
        drops.add(new ItemData(2434, 0.1111111111111111f, "2", false));
        drops.add(new ItemData(3024, 0.1111111111111111f, "1", false));
        drops.add(new ItemData(22671, 1f, "1", false));
        drops.add(new ItemData(12699, 0.1111111111111111f, "1", false));
        drops.add(new ItemData(13489, 0.05f, "1", false));
        drops.add(new ItemData(23083, 0.018867924528301886f, "1", false));
        drops.add(new ItemData(12073, 0.01f, "1", false));
        drops.add(new ItemData(7981, 0.0078125f, "1", false));
        drops.add(new ItemData(12885, 0.0005f, "1", false));
        drops.add(new ItemData(12647, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(169, 0.1111111111111111f, "1", false));
        drops.add(new ItemData(183, 0.1111111111111111f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
