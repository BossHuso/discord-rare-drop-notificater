package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Pirate implements BaseNPC {
    public List<ItemData> drops;

    public Pirate() {
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
        drops.add(new ItemData(556, 0.015625f, "10", false));
        drops.add(new ItemData(557, 0.015625f, "9", false));
        drops.add(new ItemData(554, 0.015625f, "5", false));
        drops.add(new ItemData(563, 0.0078125f, "2", false));
        drops.add(new ItemData(995, 0.2265625f, "4", false));
        drops.add(new ItemData(995, 0.1015625f, "25", false));
        drops.add(new ItemData(995, 0.0625f, "7", false));
        drops.add(new ItemData(995, 0.046875f, "12", false));
        drops.add(new ItemData(995, 0.03125f, "35", false));
        drops.add(new ItemData(995, 0.0078125f, "55", false));
        drops.add(new ItemData(9140, 0.078125f, "2-12", false));
        drops.add(new ItemData(1025, 0.09375f, "1", false));
        drops.add(new ItemData(1949, 0.0078125f, "1", false));
        drops.add(new ItemData(2351, 0.0078125f, "1", false));
        drops.add(new ItemData(1203, 0.046875f, "1", false));
        drops.add(new ItemData(11941, 0.16666666666666666f, "1", false));
        drops.add(new ItemData(1321, 0.03125f, "1", false));
        drops.add(new ItemData(1115, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.046875f, "2", false));
        drops.add(new ItemData(561, 0.0390625f, "2", false));
        drops.add(new ItemData(882, 0.0234375f, "9", false));
        drops.add(new ItemData(882, 0.015625f, "12", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
