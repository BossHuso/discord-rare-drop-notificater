package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dwarf implements BaseNPC {
    public List<ItemData> drops;

    public Dwarf() {
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
        drops.add(new ItemData(995, 0.1171875f, "10", false));
        drops.add(new ItemData(995, 0.015625f, "30", false));
        drops.add(new ItemData(2347, 0.078125f, "1", false));
        drops.add(new ItemData(2349, 0.0546875f, "1", false));
        drops.add(new ItemData(440, 0.03125f, "1", false));
        drops.add(new ItemData(438, 0.0234375f, "1", false));
        drops.add(new ItemData(436, 0.0234375f, "1", false));
        drops.add(new ItemData(2351, 0.0234375f, "1", false));
        drops.add(new ItemData(453, 0.015625f, "1", false));
        drops.add(new ItemData(1265, 0.1015625f, "1", false));
        drops.add(new ItemData(1139, 0.03125f, "1", false));
        drops.add(new ItemData(23182, 0.01f, "1", false));
        drops.add(new ItemData(1375, 0.015625f, "1", false));
        drops.add(new ItemData(1363, 0.0078125f, "1", false));
        drops.add(new ItemData(877, 0.0546875f, "2-12", false));
        drops.add(new ItemData(562, 0.03125f, "2", false));
        drops.add(new ItemData(561, 0.03125f, "2", false));
        drops.add(new ItemData(995, 0.1796875f, "4", false));
        drops.add(new ItemData(995, 0.09375f, "10", false));
        drops.add(new ItemData(995, 0.15625f, "4", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
