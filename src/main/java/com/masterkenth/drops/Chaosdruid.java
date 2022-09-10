package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Chaosdruid implements BaseNPC {
    public List<ItemData> drops;

    public Chaosdruid() {
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
        drops.add(new ItemData(201, 0.06756756756756757f, "1-2", false));
        drops.add(new ItemData(203, 0.050505050505050504f, "1-2", false));
        drops.add(new ItemData(205, 0.03937007874015748f, "1-2", false));
        drops.add(new ItemData(207, 0.030864197530864196f, "1-2", false));
        drops.add(new ItemData(209, 0.02247191011235955f, "1-2", false));
        drops.add(new ItemData(211, 0.016835016835016835f, "1-2", false));
        drops.add(new ItemData(213, 0.014044943820224719f, "1-2", false));
        drops.add(new ItemData(215, 0.011235955056179775f, "1-2", false));
        drops.add(new ItemData(2485, 0.008424599831508003f, "1-2", false));
        drops.add(new ItemData(217, 0.008424599831508003f, "1-2", false));
        drops.add(new ItemData(563, 0.0546875f, "2", false));
        drops.add(new ItemData(995, 0.0390625f, "3", false));
        drops.add(new ItemData(995, 0.0390625f, "8", false));
        drops.add(new ItemData(995, 0.0234375f, "29", false));
        drops.add(new ItemData(995, 0.0078125f, "35", false));
        drops.add(new ItemData(227, 0.078125f, "1", false));
        drops.add(new ItemData(1291, 0.0078125f, "1", false));
        drops.add(new ItemData(231, 0.0078125f, "1", false));
        drops.add(new ItemData(1594, 0.0078125f, "1", false));
        drops.add(new ItemData(9142, 0.03125f, "2-12", false));
        drops.add(new ItemData(556, 0.0234375f, "36", false));
        drops.add(new ItemData(11941, 0.09090909090909091f, "1", false));
        drops.add(new ItemData(13471, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(23490, 0.0006915629322268327f, "1", false));
        drops.add(new ItemData(21257, 0.003289473684210526f, "1", false));
        drops.add(new ItemData(559, 0.015625f, "9", false));
        drops.add(new ItemData(557, 0.015625f, "9", false));
        drops.add(new ItemData(558, 0.015625f, "12", false));
        drops.add(new ItemData(561, 0.0078125f, "3", false));
        drops.add(new ItemData(199, 0.09009009009009009f, "1-2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
