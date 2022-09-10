package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Sorebones implements BaseNPC {
    public List<ItemData> drops;

    public Sorebones() {
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
        drops.add(new ItemData(562, 0.0078125f, "7", false));
        drops.add(new ItemData(564, 0.0234375f, "5", false));
        drops.add(new ItemData(563, 0.0234375f, "2", false));
        drops.add(new ItemData(199, 0.05847953216374269f, "1", false));
        drops.add(new ItemData(201, 0.043859649122807015f, "1", false));
        drops.add(new ItemData(203, 0.033003300330033f, "1", false));
        drops.add(new ItemData(205, 0.02564102564102564f, "1", false));
        drops.add(new ItemData(207, 0.020161290322580645f, "1", false));
        drops.add(new ItemData(209, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(211, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(9141, 0.0234375f, "2-12", false));
        drops.add(new ItemData(213, 0.009157509157509158f, "1", false));
        drops.add(new ItemData(215, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(2485, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(217, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "30", false));
        drops.add(new ItemData(995, 0.1640625f, "38", false));
        drops.add(new ItemData(995, 0.0625f, "46", false));
        drops.add(new ItemData(995, 0.046875f, "55", false));
        drops.add(new ItemData(995, 0.015625f, "60", false));
        drops.add(new ItemData(313, 0.171875f, "10", false));
        drops.add(new ItemData(1209, 0.015625f, "1", false));
        drops.add(new ItemData(6721, 0.0078125f, "1", false));
        drops.add(new ItemData(7157, 0.0078125f, "1", false));
        drops.add(new ItemData(8926, 0.0234375f, "1", false));
        drops.add(new ItemData(10894, 1f, "1", false));
        drops.add(new ItemData(10893, 1f, "1", false));
        drops.add(new ItemData(10895, 1f, "3", false));
        drops.add(new ItemData(10904, 1f, "30", false));
        drops.add(new ItemData(7863, 0.25f, "1", false));
        drops.add(new ItemData(6807, 0.0002f, "1", false));
        drops.add(new ItemData(8925, 0.0390625f, "1", false));
        drops.add(new ItemData(1025, 0.0078125f, "1", false));
        drops.add(new ItemData(1329, 0.0234375f, "1", false));
        drops.add(new ItemData(555, 0.0078125f, "23", false));
        drops.add(new ItemData(559, 0.015625f, "6", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
