package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class VitreousJelly implements BaseNPC {
    public List<ItemData> drops;

    public VitreousJelly() {
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
        drops.add(new ItemData(1365, 0.0859375f, "1", false));
        drops.add(new ItemData(995, 0.0546875f, "11", false));
        drops.add(new ItemData(995, 0.015625f, "460", false));
        drops.add(new ItemData(562, 0.0390625f, "15", false));
        drops.add(new ItemData(560, 0.0234375f, "5", false));
        drops.add(new ItemData(2357, 0.015625f, "1", false));
        drops.add(new ItemData(1734, 0.0078125f, "10", false));
        drops.add(new ItemData(1311, 0.0546875f, "1", false));
        drops.add(new ItemData(2722, 0.078125f, "1", false));
        drops.add(new ItemData(23083, 0.016129032258064516f, "1", false));
        drops.add(new ItemData(20730, 0.004016064257028112f, "1", false));
        drops.add(new ItemData(1353, 0.0234375f, "1", false));
        drops.add(new ItemData(20736, 0.004016064257028112f, "1", false));
        drops.add(new ItemData(21270, 0.0011467889908256881f, "1", false));
        drops.add(new ItemData(20724, 0.0011467889908256881f, "1", false));
        drops.add(new ItemData(1197, 0.015625f, "1", false));
        drops.add(new ItemData(4127, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.3046875f, "102", false));
        drops.add(new ItemData(995, 0.234375f, "44", false));
        drops.add(new ItemData(995, 0.078125f, "220", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
