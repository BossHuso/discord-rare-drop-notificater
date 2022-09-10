package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AmmoniteCrab implements BaseNPC {
    public List<ItemData> drops;

    public AmmoniteCrab() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.001953125f, "1", false));
        drops.add(new ItemData(1621, 0.0009765625f, "1", false));
        drops.add(new ItemData(1619, 0.00048828125f, "1", false));
        drops.add(new ItemData(1452, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(1462, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(1617, 0.0001220703125f, "1", false));
        drops.add(new ItemData(830, 0.00006103515625f, "5", false));
        drops.add(new ItemData(987, 0.00006103515625f, "1", false));
        drops.add(new ItemData(985, 0.00006103515625f, "1", false));
        drops.add(new ItemData(1247, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(2366, 0.0000019073486328125f, "1", false));
        drops.add(new ItemData(1249, 0.000001430399724630888f, "1", false));
        drops.add(new ItemData(1267, 0.0390625f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "3", false));
        drops.add(new ItemData(407, 0.09375f, "2", false));
        drops.add(new ItemData(407, 0.0703125f, "1", false));
        drops.add(new ItemData(401, 0.0625f, "1-2", false));
        drops.add(new ItemData(409, 0.0234375f, "1", false));
        drops.add(new ItemData(401, 0.015625f, "5", false));
        drops.add(new ItemData(403, 0.015625f, "2", false));
        drops.add(new ItemData(411, 0.0078125f, "1", false));
        drops.add(new ItemData(409, 0.0078125f, "3", false));
        drops.add(new ItemData(313, 0.015625f, "10", false));
        drops.add(new ItemData(21555, 0.2265625f, "4", false));
        drops.add(new ItemData(21543, 0.0078125f, "1", false));
        drops.add(new ItemData(21545, 0.0078125f, "1", false));
        drops.add(new ItemData(21490, 0.0078125f, "2", false));
        drops.add(new ItemData(405, 0.0078125f, "1", false));
        drops.add(new ItemData(21555, 0.0625f, "2", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(21555, 0.15428571428571428f, "5-14", false));
        drops.add(new ItemData(21562, 0.008571428571428572f, "1", false));
        drops.add(new ItemData(21564, 0.004285714285714286f, "1", false));
        drops.add(new ItemData(21555, 0.046875f, "8", false));
        drops.add(new ItemData(21566, 0.0034285714285714284f, "1", false));
        drops.add(new ItemData(21568, 0.0008571428571428571f, "1", false));
        drops.add(new ItemData(21622, 0.046875f, "1", false));
        drops.add(new ItemData(440, 0.03125f, "1", false));
        drops.add(new ItemData(438, 0.03125f, "3", false));
        drops.add(new ItemData(45, 0.015625f, "5", false));
        drops.add(new ItemData(453, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
