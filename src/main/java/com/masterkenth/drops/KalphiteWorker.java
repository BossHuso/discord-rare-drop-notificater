package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class KalphiteWorker implements BaseNPC {
    public List<ItemData> drops;

    public KalphiteWorker() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(1279, 0.0234375f, "1", false));
        drops.add(new ItemData(555, 0.015625f, "2", false));
        drops.add(new ItemData(563, 0.0234375f, "2", false));
        drops.add(new ItemData(561, 0.015625f, "4", false));
        drops.add(new ItemData(199, 0.013679890560875513f, "1", false));
        drops.add(new ItemData(201, 0.010256410256410256f, "1", false));
        drops.add(new ItemData(203, 0.007692307692307693f, "1", false));
        drops.add(new ItemData(205, 0.005980861244019139f, "1", false));
        drops.add(new ItemData(207, 0.004699248120300752f, "1", false));
        drops.add(new ItemData(209, 0.003417634996582365f, "1", false));
        drops.add(new ItemData(211, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(826, 0.0078125f, "5", false));
        drops.add(new ItemData(213, 0.0021362956633198035f, "1", false));
        drops.add(new ItemData(215, 0.0017091095539224065f, "1", false));
        drops.add(new ItemData(2485, 0.001281722635221738f, "1", false));
        drops.add(new ItemData(217, 0.001281722635221738f, "1", false));
        drops.add(new ItemData(995, 0.0625f, "1", false));
        drops.add(new ItemData(995, 0.09375f, "5", false));
        drops.add(new ItemData(995, 0.265625f, "15", false));
        drops.add(new ItemData(995, 0.09375f, "28", false));
        drops.add(new ItemData(995, 0.0234375f, "42", false));
        drops.add(new ItemData(995, 0.03125f, "62", false));
        drops.add(new ItemData(1207, 0.0234375f, "1", false));
        drops.add(new ItemData(1823, 0.1640625f, "1", false));
        drops.add(new ItemData(1295, 0.0078125f, "1", false));
        drops.add(new ItemData(13489, 0.004f, "1", false));
        drops.add(new ItemData(23083, 0.0008802816901408451f, "1", false));
        drops.add(new ItemData(1131, 0.015625f, "1", false));
        drops.add(new ItemData(559, 0.015625f, "6", false));
        drops.add(new ItemData(564, 0.0078125f, "2", false));
        drops.add(new ItemData(562, 0.015625f, "3", false));
        drops.add(new ItemData(554, 0.015625f, "7", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
