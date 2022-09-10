package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Vorkath implements BaseNPC {
    public List<ItemData> drops;

    public Vorkath() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22124, 1f, "2", false));
        drops.add(new ItemData(562, 0.04f, "650-1000", false));
        drops.add(new ItemData(560, 0.04f, "300-500", false));
        drops.add(new ItemData(21880, 0.02f, "30-60", false));
        drops.add(new ItemData(1751, 0.05333333333333334f, "25-30", false));
        drops.add(new ItemData(1753, 0.04666666666666667f, "25-30", false));
        drops.add(new ItemData(1749, 0.04666666666666667f, "20-25", false));
        drops.add(new ItemData(1747, 0.04666666666666667f, "15-25", false));
        drops.add(new ItemData(21930, 0.05333333333333334f, "50-100", false));
        drops.add(new ItemData(9189, 0.0018018018018018018f, "25-30", false));
        drops.add(new ItemData(9190, 0.007207207207207207f, "25-30", false));
        drops.add(new ItemData(1751, 1f, "2", false));
        drops.add(new ItemData(9191, 0.007207207207207207f, "25-30", false));
        drops.add(new ItemData(9192, 0.009009009009009009f, "25-30", false));
        drops.add(new ItemData(9193, 0.03333333333333333f, "11-25", false));
        drops.add(new ItemData(9193, 0.005405405405405406f, "25-30", false));
        drops.add(new ItemData(9194, 0.02666666666666667f, "5-10", false));
        drops.add(new ItemData(9194, 0.002702702702702703f, "25-30", false));
        drops.add(new ItemData(824, 0.02f, "75-100", false));
        drops.add(new ItemData(11232, 0.04f, "10-50", false));
        drops.add(new ItemData(11237, 0.02f, "25-50", false));
        drops.add(new ItemData(5295, 0.0023998080153587713f, "1", false));
        drops.add(new ItemData(1303, 0.03333333333333333f, "2-3", false));
        drops.add(new ItemData(5300, 0.008904719501335707f, "1", false));
        drops.add(new ItemData(5304, 0.008424599831508003f, "1", false));
        drops.add(new ItemData(5321, 0.0016f, "15", false));
        drops.add(new ItemData(5313, 0.0016f, "1", false));
        drops.add(new ItemData(21488, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(5314, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(21486, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(5315, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(5288, 0.0011199462425803561f, "1", false));
        drops.add(new ItemData(5316, 0.0009599692809830085f, "1", false));
        drops.add(new ItemData(1201, 0.03333333333333333f, "2-3", false));
        drops.add(new ItemData(5289, 0.0008f, "1", false));
        drops.add(new ItemData(5317, 0.00064f, "1", false));
        drops.add(new ItemData(22877, 0.00048000768012288196f, "1", false));
        drops.add(new ItemData(22869, 0.00032f, "1", false));
        drops.add(new ItemData(22871, 0.00032f, "1", false));
        drops.add(new ItemData(449, 0.04666666666666667f, "10-30", false));
        drops.add(new ItemData(995, 0.03333333333333333f, "20000-81000", false));
        drops.add(new ItemData(1987, 0.03333333333333333f, "250-300", false));
        drops.add(new ItemData(1513, 0.03333333333333333f, "50", false));
        drops.add(new ItemData(391, 0.02666666666666667f, "35-55", false));
        drops.add(new ItemData(1391, 0.02666666666666667f, "5-15", false));
        drops.add(new ItemData(536, 0.02666666666666667f, "15-20", false));
        drops.add(new ItemData(1601, 0.02666666666666667f, "10-20", false));
        drops.add(new ItemData(1615, 0.02f, "2-3", false));
        drops.add(new ItemData(22118, 0.02f, "1", false));
        drops.add(new ItemData(1377, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(1305, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(4087, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(21907, 0.02f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(12073, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(22111, 0.001f, "1", false));
        drops.add(new ItemData(22106, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(21992, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(11286, 0.0002f, "1", false));
        drops.add(new ItemData(22006, 0.0002f, "1", false));
        drops.add(new ItemData(4585, 0.013333333333333334f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
