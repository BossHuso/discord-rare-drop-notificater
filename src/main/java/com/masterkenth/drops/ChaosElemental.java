package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ChaosElemental implements BaseNPC {
    public List<ItemData> drops;

    public ChaosElemental() {
        drops = new ArrayList<>();
        drops.add(new ItemData(2297, 0.1f, "3", false));
        drops.add(new ItemData(361, 0.1f, "5", false));
        drops.add(new ItemData(11920, 0.00390625f, "1", false));
        drops.add(new ItemData(1215, 0.0859375f, "1", false));
        drops.add(new ItemData(7158, 0.0078125f, "1", false));
        drops.add(new ItemData(556, 0.078125f, "500", false));
        drops.add(new ItemData(565, 0.078125f, "75", false));
        drops.add(new ItemData(562, 0.078125f, "250", false));
        drops.add(new ItemData(560, 0.078125f, "125", false));
        drops.add(new ItemData(809, 0.078125f, "300", false));
        drops.add(new ItemData(892, 0.078125f, "150", false));
        drops.add(new ItemData(534, 0.1f, "2", false));
        drops.add(new ItemData(199, 0.0078125f, "1-4", false));
        drops.add(new ItemData(201, 0.005858230814294083f, "1-4", false));
        drops.add(new ItemData(203, 0.004393673110720563f, "1-4", false));
        drops.add(new ItemData(205, 0.003417634996582365f, "1-4", false));
        drops.add(new ItemData(207, 0.0026852846401718583f, "1-4", false));
        drops.add(new ItemData(209, 0.001953125f, "1-4", false));
        drops.add(new ItemData(211, 0.0014647722279185586f, "1-4", false));
        drops.add(new ItemData(213, 0.001220703125f, "1-4", false));
        drops.add(new ItemData(215, 0.0009765625f, "1-4", false));
        drops.add(new ItemData(2485, 0.0007324397568300008f, "1-4", false));
        drops.add(new ItemData(530, 0.1f, "5", false));
        drops.add(new ItemData(217, 0.0007324397568300008f, "1-4", false));
        drops.add(new ItemData(464, 0.1015625f, "10", false));
        drops.add(new ItemData(5952, 0.078125f, "1", false));
        drops.add(new ItemData(5940, 0.078125f, "1", false));
        drops.add(new ItemData(995, 0.0625f, "7500", false));
        drops.add(new ItemData(532, 0.1f, "3", false));
        drops.add(new ItemData(526, 0.1f, "4", false));
        drops.add(new ItemData(536, 0.1f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23083, 0.01694915254237288f, "1", false));
        drops.add(new ItemData(12073, 0.005f, "1", false));
        drops.add(new ItemData(11995, 0.0033333333333333335f, "1", false));
        drops.add(new ItemData(23490, 0.017241379310344827f, "1", false));
        drops.add(new ItemData(21257, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(2436, 0.1f, "1", false));
        drops.add(new ItemData(2442, 0.1f, "1", false));
        drops.add(new ItemData(2440, 0.1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
