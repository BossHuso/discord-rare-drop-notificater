package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dagannothspawn implements BaseNPC {
    public List<ItemData> drops;

    public Dagannothspawn() {
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
        drops.add(new ItemData(313, 0.078125f, "3", false));
        drops.add(new ItemData(411, 0.03125f, "1", false));
        drops.add(new ItemData(1444, 0.078125f, "1", false));
        drops.add(new ItemData(555, 0.078125f, "3", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(23083, 0.0012953367875647669f, "1", false));
        drops.add(new ItemData(359, 0.078125f, "1", false));
        drops.add(new ItemData(345, 0.0390625f, "1", false));
        drops.add(new ItemData(327, 0.078125f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "16", false));
        drops.add(new ItemData(995, 0.078125f, "25", false));
        drops.add(new ItemData(401, 0.078125f, "1", false));
        drops.add(new ItemData(314, 0.296875f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
