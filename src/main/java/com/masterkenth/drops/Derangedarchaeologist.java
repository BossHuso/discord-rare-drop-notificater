package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Derangedarchaeologist implements BaseNPC {
    public List<ItemData> drops;

    public Derangedarchaeologist() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(5295, 0.0009374707040404988f, "1", false));
        drops.add(new ItemData(5300, 0.0008749671887304226f, "1", false));
        drops.add(new ItemData(5304, 0.0006875214850464077f, "1", false));
        drops.add(new ItemData(5321, 0.000625f, "15", false));
        drops.add(new ItemData(5313, 0.000625f, "1", false));
        drops.add(new ItemData(21488, 0.0005624929688378895f, "1", false));
        drops.add(new ItemData(5314, 0.0005624929688378895f, "1", false));
        drops.add(new ItemData(21486, 0.0005624929688378895f, "1", false));
        drops.add(new ItemData(5315, 0.0005624929688378895f, "1", false));
        drops.add(new ItemData(5288, 0.00043750273439208993f, "1", false));
        drops.add(new ItemData(2503, 0.046875f, "1", false));
        drops.add(new ItemData(5316, 0.00037499531255859303f, "1", false));
        drops.add(new ItemData(5289, 0.0003125f, "1", false));
        drops.add(new ItemData(5317, 0.00025f, "1", false));
        drops.add(new ItemData(22877, 0.00018750117188232426f, "1", false));
        drops.add(new ItemData(22869, 0.000125f, "1", false));
        drops.add(new ItemData(22871, 0.000125f, "1", false));
        drops.add(new ItemData(217, 0.0625f, "4", false));
        drops.add(new ItemData(239, 0.0546875f, "10", false));
        drops.add(new ItemData(9431, 0.0390625f, "1", false));
        drops.add(new ItemData(1747, 0.046875f, "8", false));
        drops.add(new ItemData(1319, 0.0234375f, "1", false));
        drops.add(new ItemData(444, 0.046875f, "10", false));
        drops.add(new ItemData(1617, 0.0390625f, "5", false));
        drops.add(new ItemData(9194, 0.046875f, "6", false));
        drops.add(new ItemData(2297, 0.03125f, "2", false));
        drops.add(new ItemData(139, 0.0625f, "1", false));
        drops.add(new ItemData(6705, 0.0625f, "3", false));
        drops.add(new ItemData(385, 0.0625f, "2", false));
        drops.add(new ItemData(989, 0.0546875f, "1", false));
        drops.add(new ItemData(10976, 0.015625f, "1", false));
        drops.add(new ItemData(1289, 0.03125f, "1", false));
        drops.add(new ItemData(555, 0.046875f, "100", false));
        drops.add(new ItemData(4698, 0.046875f, "40", false));
        drops.add(new ItemData(21555, 0.6171428571428571f, "5-32", false));
        drops.add(new ItemData(21562, 0.03428571428571429f, "1", false));
        drops.add(new ItemData(21564, 0.017142857142857144f, "1", false));
        drops.add(new ItemData(21566, 0.06857142857142857f, "1", false));
        drops.add(new ItemData(21568, 0.0034285714285714284f, "1", false));
        drops.add(new ItemData(868, 0.046875f, "25", false));
        drops.add(new ItemData(12073, 0.005f, "1", false));
        drops.add(new ItemData(11212, 0.0078125f, "60", false));
        drops.add(new ItemData(2, 0.03125f, "80", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
