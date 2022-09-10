package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Skeletalminer implements BaseNPC {
    public List<ItemData> drops;

    public Skeletalminer() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(884, 0.015625f, "12", false));
        drops.add(new ItemData(564, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.0390625f, "1", false));
        drops.add(new ItemData(201, 0.02932551319648094f, "1", false));
        drops.add(new ItemData(203, 0.02197802197802198f, "1", false));
        drops.add(new ItemData(205, 0.017094017094017096f, "1", false));
        drops.add(new ItemData(207, 0.013422818791946308f, "1", false));
        drops.add(new ItemData(209, 0.009765625f, "1", false));
        drops.add(new ItemData(211, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(213, 0.006105006105006105f, "1", false));
        drops.add(new ItemData(1137, 0.046875f, "1", false));
        drops.add(new ItemData(215, 0.0048828125f, "1", false));
        drops.add(new ItemData(2485, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(217, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(995, 0.1953125f, "5", false));
        drops.add(new ItemData(995, 0.1875f, "10", false));
        drops.add(new ItemData(995, 0.0625f, "25", false));
        drops.add(new ItemData(995, 0.03125f, "45", false));
        drops.add(new ItemData(995, 0.0234375f, "65", false));
        drops.add(new ItemData(995, 0.015625f, "1", false));
        drops.add(new ItemData(2349, 0.0390625f, "1", false));
        drops.add(new ItemData(1279, 0.03125f, "1", false));
        drops.add(new ItemData(1349, 0.015625f, "1", false));
        drops.add(new ItemData(23182, 0.01f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(1323, 0.0078125f, "1", false));
        drops.add(new ItemData(556, 0.0234375f, "15", false));
        drops.add(new ItemData(555, 0.0234375f, "9", false));
        drops.add(new ItemData(562, 0.0234375f, "5", false));
        drops.add(new ItemData(563, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
