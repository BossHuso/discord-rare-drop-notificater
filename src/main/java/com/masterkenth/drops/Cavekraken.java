package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cavekraken implements BaseNPC {
    public List<ItemData> drops;

    public Cavekraken() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0075f, "1", false));
        drops.add(new ItemData(1621, 0.00375f, "1", false));
        drops.add(new ItemData(1619, 0.001875f, "1", false));
        drops.add(new ItemData(1452, 0.0007030700726505741f, "1", false));
        drops.add(new ItemData(1462, 0.0007030700726505741f, "1", false));
        drops.add(new ItemData(1617, 0.00046875f, "1", false));
        drops.add(new ItemData(830, 0.000234375f, "5", false));
        drops.add(new ItemData(987, 0.000234375f, "1", false));
        drops.add(new ItemData(985, 0.000234375f, "1", false));
        drops.add(new ItemData(1247, 0.0000146484375f, "1", false));
        drops.add(new ItemData(2366, 0.00000732421875f, "1", false));
        drops.add(new ItemData(1249, 0.00000549273494258261f, "1", false));
        drops.add(new ItemData(1383, 0.02f, "1", false));
        drops.add(new ItemData(555, 0.05f, "15", false));
        drops.add(new ItemData(555, 0.05f, "30", false));
        drops.add(new ItemData(555, 0.05f, "75", false));
        drops.add(new ItemData(554, 0.05f, "30", false));
        drops.add(new ItemData(560, 0.08f, "30", false));
        drops.add(new ItemData(562, 0.08f, "50", false));
        drops.add(new ItemData(565, 0.04f, "5", false));
        drops.add(new ItemData(199, 0.007501875468867217f, "1", false));
        drops.add(new ItemData(201, 0.00562429696287964f, "1", false));
        drops.add(new ItemData(203, 0.004219409282700422f, "1", false));
        drops.add(new ItemData(1147, 0.0325f, "1", false));
        drops.add(new ItemData(205, 0.0032808398950131233f, "1", false));
        drops.add(new ItemData(207, 0.002577984016499098f, "1", false));
        drops.add(new ItemData(209, 0.0018751171948246765f, "1", false));
        drops.add(new ItemData(211, 0.0014062719729995782f, "1", false));
        drops.add(new ItemData(213, 0.0011719207781553968f, "1", false));
        drops.add(new ItemData(215, 0.0009374707040404988f, "1", false));
        drops.add(new ItemData(2485, 0.0007031359864997891f, "1", false));
        drops.add(new ItemData(217, 0.0007031359864997891f, "1", false));
        drops.add(new ItemData(5296, 0.005973715651135006f, "1", false));
        drops.add(new ItemData(5297, 0.0040683482506102524f, "1", false));
        drops.add(new ItemData(1245, 0.02f, "1", false));
        drops.add(new ItemData(5281, 0.003940110323089046f, "1", false));
        drops.add(new ItemData(5106, 0.002796420581655481f, "1", false));
        drops.add(new ItemData(5298, 0.002796420581655481f, "1", false));
        drops.add(new ItemData(5280, 0.0026695141484249867f, "1", false));
        drops.add(new ItemData(22873, 0.0019069412662090007f, "1", false));
        drops.add(new ItemData(5299, 0.0019069412662090007f, "1", false));
        drops.add(new ItemData(5300, 0.001271132579128003f, "1", false));
        drops.add(new ItemData(5301, 0.0008898380494749955f, "1", false));
        drops.add(new ItemData(5302, 0.0006356066865823429f, "1", false));
        drops.add(new ItemData(22879, 0.0005084659582040983f, "3", false));
        drops.add(new ItemData(1347, 0.02f, "1", false));
        drops.add(new ItemData(5303, 0.0003813591640607124f, "1", false));
        drops.add(new ItemData(5304, 0.0002542394427071416f, "1", false));
        drops.add(new ItemData(685, 0.02f, "1", false));
        drops.add(new ItemData(1939, 0.02f, "60", false));
        drops.add(new ItemData(401, 0.03f, "30", false));
        drops.add(new ItemData(995, 0.05f, "120-300", false));
        drops.add(new ItemData(1925, 0.004166666666666667f, "1", false));
        drops.add(new ItemData(377, 0.02f, "3", false));
        drops.add(new ItemData(571, 0.02f, "2", false));
        drops.add(new ItemData(407, 0.02f, "1", false));
        drops.add(new ItemData(1391, 0.02f, "1", false));
        drops.add(new ItemData(373, 0.03f, "2", false));
        drops.add(new ItemData(385, 0.03f, "1", false));
        drops.add(new ItemData(5952, 0.03f, "1", false));
        drops.add(new ItemData(227, 0.02f, "50", false));
        drops.add(new ItemData(1444, 0.02f, "1", false));
        drops.add(new ItemData(12004, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(1395, 0.02f, "1", false));
        drops.add(new ItemData(23083, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(2722, 0.01f, "1", false));
        drops.add(new ItemData(12073, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(1403, 0.01f, "1", false));
        drops.add(new ItemData(11907, 0.005f, "1", false));
        drops.add(new ItemData(4694, 0.03f, "7", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
