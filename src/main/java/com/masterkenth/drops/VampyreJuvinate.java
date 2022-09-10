package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class VampyreJuvinate implements BaseNPC {
    public List<ItemData> drops;

    public VampyreJuvinate() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1367, 0.03125f, "1", false));
        drops.add(new ItemData(1315, 0.0078125f, "1", false));
        drops.add(new ItemData(1343, 0.0078125f, "1", false));
        drops.add(new ItemData(1287, 0.0078125f, "1", false));
        drops.add(new ItemData(1430, 0.0078125f, "1", false));
        drops.add(new ItemData(1331, 0.0078125f, "1", false));
        drops.add(new ItemData(1083, 0.125f, "1", false));
        drops.add(new ItemData(1119, 0.125f, "1", false));
        drops.add(new ItemData(1165, 0.03125f, "1", false));
        drops.add(new ItemData(1195, 0.03125f, "1", false));
        drops.add(new ItemData(1179, 0.03125f, "1", false));
        drops.add(new ItemData(1369, 0.03125f, "1", false));
        drops.add(new ItemData(1159, 0.03125f, "1", false));
        drops.add(new ItemData(1109, 0.03125f, "1", false));
        drops.add(new ItemData(1107, 0.0078125f, "1", false));
        drops.add(new ItemData(1077, 0.0078125f, "1", false));
        drops.add(new ItemData(1071, 0.0078125f, "1", false));
        drops.add(new ItemData(1181, 0.0078125f, "1", false));
        drops.add(new ItemData(1145, 0.0078125f, "1", false));
        drops.add(new ItemData(561, 0.0078125f, "10", false));
        drops.add(new ItemData(560, 0.0078125f, "10", false));
        drops.add(new ItemData(1519, 0.03125f, "5", false));
        drops.add(new ItemData(1329, 0.03125f, "1", false));
        drops.add(new ItemData(1515, 0.03125f, "5", false));
        drops.add(new ItemData(1641, 0.03125f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(1299, 0.03125f, "1", false));
        drops.add(new ItemData(1357, 0.03125f, "1", false));
        drops.add(new ItemData(1381, 0.0078125f, "1", false));
        drops.add(new ItemData(1387, 0.0078125f, "1", false));
        drops.add(new ItemData(4580, 0.0078125f, "1", false));
        drops.add(new ItemData(1313, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
