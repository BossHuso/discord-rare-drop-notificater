package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ExperimentNo implements BaseNPC {
    public List<ItemData> drops;

    public ExperimentNo() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.01171875f, "1", false));
        drops.add(new ItemData(1621, 0.005859375f, "1", false));
        drops.add(new ItemData(1619, 0.0029296875f, "1", false));
        drops.add(new ItemData(1452, 0.001098546988516522f, "1", false));
        drops.add(new ItemData(1462, 0.001098546988516522f, "1", false));
        drops.add(new ItemData(1617, 0.000732421875f, "1", false));
        drops.add(new ItemData(830, 0.0003662109375f, "5", false));
        drops.add(new ItemData(987, 0.0003662109375f, "1", false));
        drops.add(new ItemData(985, 0.0003662109375f, "1", false));
        drops.add(new ItemData(1247, 0.00002288818359375f, "1", false));
        drops.add(new ItemData(2366, 0.000011444091796875f, "1", false));
        drops.add(new ItemData(1249, 0.000008582398347785329f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(203, 0.04830917874396135f, "1", false));
        drops.add(new ItemData(205, 0.03759398496240601f, "1", false));
        drops.add(new ItemData(207, 0.029498525073746312f, "1", false));
        drops.add(new ItemData(209, 0.021505376344086023f, "1", false));
        drops.add(new ItemData(211, 0.01610305958132045f, "1", false));
        drops.add(new ItemData(213, 0.013422818791946308f, "1", false));
        drops.add(new ItemData(215, 0.010741138560687433f, "1", false));
        drops.add(new ItemData(2485, 0.008058017727639f, "1", false));
        drops.add(new ItemData(217, 0.008058017727639f, "1", false));
        drops.add(new ItemData(995, 0.15625f, "1-99", false));
        drops.add(new ItemData(11205, 1f, "1", false));
        drops.add(new ItemData(7416, 0.0078125f, "1", false));
        drops.add(new ItemData(1407, 0.0078125f, "1", false));
        drops.add(new ItemData(557, 0.078125f, "1-20", false));
        drops.add(new ItemData(7893, 0.25f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.078125f, "1-14", false));
        drops.add(new ItemData(562, 0.0546875f, "1-15", false));
        drops.add(new ItemData(561, 0.0234375f, "1-5", false));
        drops.add(new ItemData(203, 0.203125f, "1-3", false));
        drops.add(new ItemData(199, 0.08620689655172414f, "1", false));
        drops.add(new ItemData(201, 0.06451612903225806f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
