package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class WarpedJelly implements BaseNPC {
    public List<ItemData> drops;

    public WarpedJelly() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0078125f, "1", false));
        drops.add(new ItemData(1621, 0.00390625f, "1", false));
        drops.add(new ItemData(1619, 0.001953125f, "1", false));
        drops.add(new ItemData(1452, 0.0007323646590110147f, "1", false));
        drops.add(new ItemData(1462, 0.0007323646590110147f, "1", false));
        drops.add(new ItemData(1617, 0.00048828125f, "1", false));
        drops.add(new ItemData(830, 0.000244140625f, "5", false));
        drops.add(new ItemData(987, 0.000244140625f, "1", false));
        drops.add(new ItemData(985, 0.000244140625f, "1", false));
        drops.add(new ItemData(1247, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(2366, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(1249, 0.000005721598898523552f, "1", false));
        drops.add(new ItemData(1371, 0.0859375f, "1", false));
        drops.add(new ItemData(995, 0.2109375f, "44", false));
        drops.add(new ItemData(995, 0.2109375f, "102", false));
        drops.add(new ItemData(995, 0.0703125f, "220", false));
        drops.add(new ItemData(995, 0.046875f, "11", false));
        drops.add(new ItemData(995, 0.015625f, "460", false));
        drops.add(new ItemData(379, 0.125f, "2", false));
        drops.add(new ItemData(2357, 0.015625f, "1", false));
        drops.add(new ItemData(1734, 0.0078125f, "10", false));
        drops.add(new ItemData(1313, 0.0390625f, "1", false));
        drops.add(new ItemData(2722, 0.015625f, "1", false));
        drops.add(new ItemData(1357, 0.0234375f, "1", false));
        drops.add(new ItemData(23083, 0.012987012987012988f, "1", false));
        drops.add(new ItemData(19677, 0.004166666666666667f, "1", false));
        drops.add(new ItemData(19679, 0.002777777777777778f, "1", false));
        drops.add(new ItemData(19681, 0.002777777777777778f, "1", false));
        drops.add(new ItemData(19683, 0.002777777777777778f, "1", false));
        drops.add(new ItemData(1317, 0.015625f, "1", false));
        drops.add(new ItemData(4127, 0.015625f, "1", false));
        drops.add(new ItemData(1201, 0.015625f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.0390625f, "45", false));
        drops.add(new ItemData(560, 0.0234375f, "15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
