package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Wallasalki implements BaseNPC {
    public List<ItemData> drops;

    public Wallasalki() {
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
        drops.add(new ItemData(565, 0.078125f, "1-5", false));
        drops.add(new ItemData(886, 0.078125f, "1-10", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(6153, 0.015625f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(5296, 0.0015559358954411078f, "1", false));
        drops.add(new ItemData(5297, 0.001059322033898305f, "1", false));
        drops.add(new ItemData(5281, 0.001026167265264238f, "1", false));
        drops.add(new ItemData(5106, 0.0007282790765421309f, "1", false));
        drops.add(new ItemData(5298, 0.0007282790765421309f, "1", false));
        drops.add(new ItemData(5280, 0.0006951685783802572f, "1", false));
        drops.add(new ItemData(22873, 0.0004965489845573266f, "1", false));
        drops.add(new ItemData(6147, 0.015625f, "1", false));
        drops.add(new ItemData(5299, 0.0004965489845573266f, "1", false));
        drops.add(new ItemData(5300, 0.0003310381355932203f, "1", false));
        drops.add(new ItemData(5301, 0.00023172822913287297f, "1", false));
        drops.add(new ItemData(5302, 0.00016551906779661016f, "1", false));
        drops.add(new ItemData(22879, 0.00013241525423728814f, "3", false));
        drops.add(new ItemData(5303, 0.00009931176943779607f, "1", false));
        drops.add(new ItemData(5304, 0.00006620762711864407f, "1", false));
        drops.add(new ItemData(1438, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(1446, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(1440, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(556, 0.078125f, "1-10", false));
        drops.add(new ItemData(1442, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(1448, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(1444, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(1454, 0.0035714285714285713f, "1", false));
        drops.add(new ItemData(1452, 0.002678810608090008f, "1", false));
        drops.add(new ItemData(1462, 0.002678810608090008f, "1", false));
        drops.add(new ItemData(7936, 0.078125f, "9", false));
        drops.add(new ItemData(6167, 0.015625f, "1", false));
        drops.add(new ItemData(6165, 0.015625f, "1", false));
        drops.add(new ItemData(6163, 0.015625f, "1", false));
        drops.add(new ItemData(558, 0.078125f, "1-10", false));
        drops.add(new ItemData(345, 0.015625f, "1-2", false));
        drops.add(new ItemData(353, 0.0234375f, "1-2", false));
        drops.add(new ItemData(359, 0.015625f, "1-2", false));
        drops.add(new ItemData(555, 0.078125f, "1-10", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(557, 0.078125f, "1-10", false));
        drops.add(new ItemData(562, 0.078125f, "1-10", false));
        drops.add(new ItemData(560, 0.078125f, "1-10", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
