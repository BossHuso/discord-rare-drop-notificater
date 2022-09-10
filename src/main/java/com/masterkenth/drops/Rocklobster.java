package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Rocklobster implements BaseNPC {
    public List<ItemData> drops;

    public Rocklobster() {
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
        drops.add(new ItemData(377, 1f, "1", false));
        drops.add(new ItemData(203, 0.0032959789057350032f, "1", false));
        drops.add(new ItemData(205, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(207, 0.002014098690835851f, "1", false));
        drops.add(new ItemData(209, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(211, 0.001098659635245001f, "1", false));
        drops.add(new ItemData(213, 0.0009154994049253868f, "1", false));
        drops.add(new ItemData(215, 0.0007324397568300008f, "1", false));
        drops.add(new ItemData(2485, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(217, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(5318, 0.00390625f, "1-4", false));
        drops.add(new ItemData(3767, 0.0078125f, "1", false));
        drops.add(new ItemData(5319, 0.001953125f, "1-3", false));
        drops.add(new ItemData(5324, 0.0009765625f, "1-3", false));
        drops.add(new ItemData(5322, 0.00048828125f, "1-2", false));
        drops.add(new ItemData(5320, 0.000244140625f, "1-2", false));
        drops.add(new ItemData(5323, 0.0001220703125f, "1", false));
        drops.add(new ItemData(5321, 0.00006103515625f, "1", false));
        drops.add(new ItemData(22879, 0.00006103515625f, "1", false));
        drops.add(new ItemData(1438, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(1446, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(1440, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(3757, 0.0078125f, "1", false));
        drops.add(new ItemData(1442, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(1448, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(1444, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(1454, 0.0017857142857142857f, "1", false));
        drops.add(new ItemData(1452, 0.0013392259274139548f, "1", false));
        drops.add(new ItemData(1462, 0.0013392259274139548f, "1", false));
        drops.add(new ItemData(7936, 0.078125f, "4", false));
        drops.add(new ItemData(401, 0.078125f, "1-3", false));
        drops.add(new ItemData(1781, 0.078125f, "1", false));
        drops.add(new ItemData(231, 0.078125f, "1", false));
        drops.add(new ItemData(557, 0.078125f, "1-20", false));
        drops.add(new ItemData(403, 0.078125f, "1-3", false));
        drops.add(new ItemData(301, 0.078125f, "1", false));
        drops.add(new ItemData(590, 0.078125f, "1", false));
        drops.add(new ItemData(555, 0.078125f, "1-20", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(886, 0.078125f, "1-10", false));
        drops.add(new ItemData(884, 0.078125f, "1-20", false));
        drops.add(new ItemData(199, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(201, 0.004393673110720563f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
