package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SeaSnakeHatchling implements BaseNPC {
    public List<ItemData> drops;

    public SeaSnakeHatchling() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(313, 0.03125f, "50", false));
        drops.add(new ItemData(46, 0.03125f, "3", false));
        drops.add(new ItemData(571, 0.0234375f, "1", false));
        drops.add(new ItemData(363, 0.03125f, "2", false));
        drops.add(new ItemData(377, 0.015625f, "1", false));
        drops.add(new ItemData(401, 0.015625f, "5", false));
        drops.add(new ItemData(403, 0.015625f, "5", false));
        drops.add(new ItemData(411, 0.0078125f, "2", false));
        drops.add(new ItemData(413, 0.0078125f, "1", false));
        drops.add(new ItemData(405, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.015625f, "15", false));
        drops.add(new ItemData(4695, 0.015625f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(4160, 0.015625f, "4", false));
        drops.add(new ItemData(995, 0.46875f, "44", false));
        drops.add(new ItemData(995, 0.0859375f, "32", false));
        drops.add(new ItemData(995, 0.0703125f, "24", false));
        drops.add(new ItemData(995, 0.0546875f, "23", false));
        drops.add(new ItemData(823, 0.078125f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
