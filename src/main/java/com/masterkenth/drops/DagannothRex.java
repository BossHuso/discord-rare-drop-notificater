package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class DagannothRex implements BaseNPC {
    public List<ItemData> drops;

    public DagannothRex() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6729, 1f, "1", false));
        drops.add(new ItemData(1359, 0.0078125f, "1", false));
        drops.add(new ItemData(3758, 0.0078125f, "1", false));
        drops.add(new ItemData(3748, 0.0078125f, "1", false));
        drops.add(new ItemData(1315, 0.0078125f, "1", false));
        drops.add(new ItemData(6739, 0.0078125f, "1", false));
        drops.add(new ItemData(2570, 0.0078125f, "1", false));
        drops.add(new ItemData(6129, 0.0078125f, "1", false));
        drops.add(new ItemData(6130, 0.0078125f, "1", false));
        drops.add(new ItemData(6737, 0.0078125f, "1", false));
        drops.add(new ItemData(6735, 0.0078125f, "1", false));
        drops.add(new ItemData(6155, 1f, "1", false));
        drops.add(new ItemData(2456, 0.0078125f, "1", false));
        drops.add(new ItemData(141, 0.0078125f, "1", false));
        drops.add(new ItemData(129, 0.0078125f, "1", false));
        drops.add(new ItemData(147, 0.0078125f, "1", false));
        drops.add(new ItemData(159, 0.0078125f, "1", false));
        drops.add(new ItemData(165, 0.0078125f, "1", false));
        drops.add(new ItemData(191, 0.0078125f, "1", false));
        drops.add(new ItemData(447, 0.078125f, "25", false));
        drops.add(new ItemData(2361, 0.0234375f, "1", false));
        drops.add(new ItemData(453, 0.015625f, "100", false));
        drops.add(new ItemData(1193, 0.1328125f, "1", false));
        drops.add(new ItemData(440, 0.0078125f, "150", false));
        drops.add(new ItemData(2353, 0.0078125f, "15-30", false));
        drops.add(new ItemData(1438, 0.0011160714285714285f, "1", false));
        drops.add(new ItemData(1446, 0.0011160714285714285f, "1", false));
        drops.add(new ItemData(1440, 0.0011160714285714285f, "1", false));
        drops.add(new ItemData(1442, 0.0011160714285714285f, "1", false));
        drops.add(new ItemData(1448, 0.0011160714285714285f, "1", false));
        drops.add(new ItemData(1444, 0.0011160714285714285f, "1", false));
        drops.add(new ItemData(1454, 0.0004464285714285714f, "1", false));
        drops.add(new ItemData(1452, 0.00033481769176683295f, "1", false));
        drops.add(new ItemData(1343, 0.0859375f, "1", false));
        drops.add(new ItemData(1462, 0.00033481769176683295f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "100-1209", false));
        drops.add(new ItemData(207, 0.0546875f, "1", false));
        drops.add(new ItemData(365, 0.0546875f, "5", false));
        drops.add(new ItemData(373, 0.03125f, "5", false));
        drops.add(new ItemData(385, 0.0078125f, "5", false));
        drops.add(new ItemData(1357, 0.0546875f, "1", false));
        drops.add(new ItemData(1119, 0.03125f, "1", false));
        drops.add(new ItemData(1273, 0.0234375f, "1", false));
        drops.add(new ItemData(13492, 0.05f, "1", false));
        drops.add(new ItemData(2722, 0.023809523809523808f, "1", false));
        drops.add(new ItemData(23083, 0.01694915254237288f, "1", false));
        drops.add(new ItemData(12073, 0.0013333333333333333f, "1", false));
        drops.add(new ItemData(12645, 0.0002f, "1", false));
        drops.add(new ItemData(1123, 0.015625f, "1", false));
        drops.add(new ItemData(3757, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
