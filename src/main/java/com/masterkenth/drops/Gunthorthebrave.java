package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Gunthorthebrave implements BaseNPC {
    public List<ItemData> drops;

    public Gunthorthebrave() {
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
        drops.add(new ItemData(554, 0.015625f, "8", false));
        drops.add(new ItemData(563, 0.0078125f, "2", false));
        drops.add(new ItemData(995, 0.328125f, "8", false));
        drops.add(new ItemData(995, 0.0703125f, "12", false));
        drops.add(new ItemData(995, 0.0390625f, "25", false));
        drops.add(new ItemData(995, 0.0234375f, "32", false));
        drops.add(new ItemData(2142, 0.0078125f, "1", false));
        drops.add(new ItemData(1595, 0.0078125f, "1", false));
        drops.add(new ItemData(1917, 0.0078125f, "1", false));
        drops.add(new ItemData(948, 0.0078125f, "1", false));
        drops.add(new ItemData(1349, 0.046875f, "1", false));
        drops.add(new ItemData(956, 0.0078125f, "1", false));
        drops.add(new ItemData(1375, 0.03125f, "1", false));
        drops.add(new ItemData(23182, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(1420, 0.0078125f, "1", false));
        drops.add(new ItemData(882, 0.03125f, "10", false));
        drops.add(new ItemData(562, 0.03125f, "3", false));
        drops.add(new ItemData(884, 0.0234375f, "8", false));
        drops.add(new ItemData(557, 0.0234375f, "5", false));
        drops.add(new ItemData(558, 0.015625f, "10", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
