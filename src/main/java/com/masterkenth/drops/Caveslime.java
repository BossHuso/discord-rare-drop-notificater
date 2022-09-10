package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Caveslime implements BaseNPC {
    public List<ItemData> drops;

    public Caveslime() {
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
        drops.add(new ItemData(1939, 1f, "1-6", false));
        drops.add(new ItemData(995, 0.234375f, "4", false));
        drops.add(new ItemData(995, 0.3046875f, "10", false));
        drops.add(new ItemData(995, 0.078125f, "22", false));
        drops.add(new ItemData(995, 0.015625f, "46", false));
        drops.add(new ItemData(595, 0.0859375f, "1", false));
        drops.add(new ItemData(4540, 0.0078125f, "1", false));
        drops.add(new ItemData(2357, 0.015625f, "1", false));
        drops.add(new ItemData(1351, 0.0234375f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(1279, 0.0546875f, "1", false));
        drops.add(new ItemData(1155, 0.0078125f, "1", false));
        drops.add(new ItemData(1191, 0.015625f, "1", false));
        drops.add(new ItemData(4121, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.0390625f, "15", false));
        drops.add(new ItemData(557, 0.0234375f, "5", false));
        drops.add(new ItemData(995, 0.0546875f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
