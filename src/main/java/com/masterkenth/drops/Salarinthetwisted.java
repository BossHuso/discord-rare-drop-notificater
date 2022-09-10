package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Salarinthetwisted implements BaseNPC {
    public List<ItemData> drops;

    public Salarinthetwisted() {
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
        drops.add(new ItemData(205, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(207, 0.02617801047120419f, "1", false));
        drops.add(new ItemData(209, 0.01904761904761905f, "1", false));
        drops.add(new ItemData(211, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(213, 0.011904761904761904f, "1", false));
        drops.add(new ItemData(215, 0.009523809523809525f, "1", false));
        drops.add(new ItemData(2485, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(217, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(239, 0.0390625f, "1", false));
        drops.add(new ItemData(231, 0.0078125f, "1", false));
        drops.add(new ItemData(1217, 0.0078125f, "1", false));
        drops.add(new ItemData(227, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.0390625f, "3", false));
        drops.add(new ItemData(995, 0.0234375f, "24", false));
        drops.add(new ItemData(995, 0.0234375f, "10", false));
        drops.add(new ItemData(167, 0.0859375f, "1", false));
        drops.add(new ItemData(993, 0.078125f, "1", false));
        drops.add(new ItemData(555, 0.0390625f, "12", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(563, 0.03125f, "2", false));
        drops.add(new ItemData(561, 0.0078125f, "3", false));
        drops.add(new ItemData(554, 0.0078125f, "36", false));
        drops.add(new ItemData(199, 0.07633587786259542f, "1", false));
        drops.add(new ItemData(201, 0.05714285714285714f, "1", false));
        drops.add(new ItemData(203, 0.04291845493562232f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
