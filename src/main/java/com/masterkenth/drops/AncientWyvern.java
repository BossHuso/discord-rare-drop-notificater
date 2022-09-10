package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AncientWyvern implements BaseNPC {
    public List<ItemData> drops;

    public AncientWyvern() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6812, 1f, "1", false));
        drops.add(new ItemData(21643, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(890, 0.022727272727272728f, "50-76", false));
        drops.add(new ItemData(561, 0.030303030303030304f, "37-43", false));
        drops.add(new ItemData(560, 0.030303030303030304f, "47-53", false));
        drops.add(new ItemData(565, 0.030303030303030304f, "27-33", false));
        drops.add(new ItemData(892, 0.022727272727272728f, "25-50", false));
        drops.add(new ItemData(9144, 0.007575757575757576f, "30-60", false));
        drops.add(new ItemData(213, 0.01893939393939394f, "3", false));
        drops.add(new ItemData(215, 0.015151515151515152f, "3", false));
        drops.add(new ItemData(2485, 0.011363636363636364f, "3", false));
        drops.add(new ItemData(1397, 0.030303030303030304f, "2", false));
        drops.add(new ItemData(217, 0.015151515151515152f, "3", false));
        drops.add(new ItemData(219, 0.030303030303030304f, "1", false));
        drops.add(new ItemData(207, 0.030303030303030304f, "2-4", false));
        drops.add(new ItemData(21490, 0.015151515151515152f, "16-24", false));
        drops.add(new ItemData(5295, 0.007575757575757576f, "2-3", false));
        drops.add(new ItemData(5316, 0.005050505050505051f, "1", false));
        drops.add(new ItemData(5315, 0.015151515151515152f, "1", false));
        drops.add(new ItemData(21488, 0.010101010101010102f, "1", false));
        drops.add(new ItemData(5295, 0.0018181818181818182f, "1", false));
        drops.add(new ItemData(5300, 0.0016969285593076533f, "1", false));
        drops.add(new ItemData(1405, 0.022727272727272728f, "1", false));
        drops.add(new ItemData(5304, 0.0013333333333333333f, "1", false));
        drops.add(new ItemData(5321, 0.0012121212121212121f, "15", false));
        drops.add(new ItemData(5313, 0.0012121212121212121f, "1", false));
        drops.add(new ItemData(21488, 0.0010908694229300752f, "1", false));
        drops.add(new ItemData(5314, 0.0010908694229300752f, "1", false));
        drops.add(new ItemData(21486, 0.0010908694229300752f, "1", false));
        drops.add(new ItemData(5315, 0.0010908694229300752f, "1", false));
        drops.add(new ItemData(5288, 0.0008484642796538266f, "1", false));
        drops.add(new ItemData(5316, 0.0007272727272727272f, "1", false));
        drops.add(new ItemData(5289, 0.0006060606060606061f, "1", false));
        drops.add(new ItemData(1275, 0.022727272727272728f, "1", false));
        drops.add(new ItemData(5317, 0.00048484848484848484f, "1", false));
        drops.add(new ItemData(22877, 0.0003636363636363636f, "1", false));
        drops.add(new ItemData(22869, 0.00024242424242424242f, "1", false));
        drops.add(new ItemData(22871, 0.00024242424242424242f, "1", false));
        drops.add(new ItemData(2361, 0.045454545454545456f, "3", false));
        drops.add(new ItemData(449, 0.03787878787878788f, "20", false));
        drops.add(new ItemData(451, 0.022727272727272728f, "2-3", false));
        drops.add(new ItemData(1601, 0.022727272727272728f, "3-5", false));
        drops.add(new ItemData(9194, 0.030303030303030304f, "10-15", false));
        drops.add(new ItemData(21622, 0.045454545454545456f, "80-120", false));
        drops.add(new ItemData(1373, 0.015151515151515152f, "1", false));
        drops.add(new ItemData(6332, 0.03787878787878788f, "25-30", false));
        drops.add(new ItemData(385, 0.06060606060606061f, "5", false));
        drops.add(new ItemData(12699, 0.03787878787878788f, "1", false));
        drops.add(new ItemData(3024, 0.06060606060606061f, "2", false));
        drops.add(new ItemData(995, 0.05303030303030303f, "2000-6000", false));
        drops.add(new ItemData(9465, 0.022727272727272728f, "1", false));
        drops.add(new ItemData(6034, 0.022727272727272728f, "7-10", false));
        drops.add(new ItemData(1201, 0.015151515151515152f, "1", false));
        drops.add(new ItemData(1163, 0.015151515151515152f, "1", false));
        drops.add(new ItemData(1391, 0.030303030303030304f, "6", false));
        drops.add(new ItemData(23083, 0.016129032258064516f, "1", false));
        drops.add(new ItemData(12073, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(21637, 0.0001f, "1", false));
        drops.add(new ItemData(21555, 0.6171428571428571f, "5-24", false));
        drops.add(new ItemData(21562, 0.03428571428571429f, "1", false));
        drops.add(new ItemData(21564, 0.017142857142857144f, "1", false));
        drops.add(new ItemData(21566, 0.013714285714285714f, "1", false));
        drops.add(new ItemData(21646, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(21568, 0.0034285714285714284f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
