package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Chaosdruidwarrior implements BaseNPC {
    public List<ItemData> drops;

    public Chaosdruidwarrior() {
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
        drops.add(new ItemData(203, 0.04830917874396135f, "1-2", false));
        drops.add(new ItemData(205, 0.03759398496240601f, "1-2", false));
        drops.add(new ItemData(207, 0.029498525073746312f, "1-2", false));
        drops.add(new ItemData(209, 0.021505376344086023f, "1-2", false));
        drops.add(new ItemData(211, 0.01610305958132045f, "1-2", false));
        drops.add(new ItemData(213, 0.013422818791946308f, "1-2", false));
        drops.add(new ItemData(215, 0.010741138560687433f, "1-2", false));
        drops.add(new ItemData(2485, 0.008058017727639f, "1-2", false));
        drops.add(new ItemData(217, 0.008058017727639f, "1-2", false));
        drops.add(new ItemData(239, 0.0390625f, "1", false));
        drops.add(new ItemData(1217, 0.0078125f, "1", false));
        drops.add(new ItemData(235, 0.015625f, "1", false));
        drops.add(new ItemData(225, 0.0078125f, "1", false));
        drops.add(new ItemData(225, 0.0078125f, "2", false));
        drops.add(new ItemData(231, 0.0078125f, "1", false));
        drops.add(new ItemData(227, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.1171875f, "3", false));
        drops.add(new ItemData(995, 0.0234375f, "29", false));
        drops.add(new ItemData(995, 0.0078125f, "10", false));
        drops.add(new ItemData(5100, 0.0078125f, "1", false));
        drops.add(new ItemData(167, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.0390625f, "12", false));
        drops.add(new ItemData(563, 0.03125f, "2", false));
        drops.add(new ItemData(13471, 0.04f, "1", false));
        drops.add(new ItemData(557, 0.015625f, "9", false));
        drops.add(new ItemData(556, 0.0078125f, "36", false));
        drops.add(new ItemData(561, 0.0078125f, "3", false));
        drops.add(new ItemData(199, 0.08620689655172414f, "1-2", false));
        drops.add(new ItemData(201, 0.06451612903225806f, "1-2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
