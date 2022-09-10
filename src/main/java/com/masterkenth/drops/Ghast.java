package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ghast implements BaseNPC {
    public List<ItemData> drops;

    public Ghast() {
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
        drops.add(new ItemData(199, 0.06451612903225806f, "1", false));
        drops.add(new ItemData(201, 0.04830917874396135f, "1", false));
        drops.add(new ItemData(203, 0.036231884057971016f, "1", false));
        drops.add(new ItemData(205, 0.028169014084507043f, "1", false));
        drops.add(new ItemData(207, 0.022172949002217297f, "1", false));
        drops.add(new ItemData(209, 0.01610305958132045f, "1", false));
        drops.add(new ItemData(211, 0.012091898428053204f, "1", false));
        drops.add(new ItemData(213, 0.010070493454179255f, "1", false));
        drops.add(new ItemData(215, 0.008058017727639f, "1", false));
        drops.add(new ItemData(2485, 0.006042296072507553f, "1", false));
        drops.add(new ItemData(1420, 0.0234375f, "1", false));
        drops.add(new ItemData(217, 0.006042296072507553f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "10", false));
        drops.add(new ItemData(995, 0.1640625f, "18", false));
        drops.add(new ItemData(995, 0.0625f, "26", false));
        drops.add(new ItemData(995, 0.046875f, "35", false));
        drops.add(new ItemData(995, 0.015625f, "1", false));
        drops.add(new ItemData(313, 0.203125f, "7", false));
        drops.add(new ItemData(590, 0.015625f, "1", false));
        drops.add(new ItemData(221, 0.0078125f, "1", false));
        drops.add(new ItemData(438, 0.0078125f, "1", false));
        drops.add(new ItemData(1203, 0.015625f, "1", false));
        drops.add(new ItemData(1189, 0.0078125f, "1", false));
        drops.add(new ItemData(559, 0.015625f, "3", false));
        drops.add(new ItemData(556, 0.0234375f, "4", false));
        drops.add(new ItemData(562, 0.0078125f, "4", false));
        drops.add(new ItemData(564, 0.0078125f, "2", false));
        drops.add(new ItemData(554, 0.0078125f, "7", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
