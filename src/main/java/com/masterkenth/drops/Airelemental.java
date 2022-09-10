package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Airelemental implements BaseNPC {
    public List<ItemData> drops;

    public Airelemental() {
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
        drops.add(new ItemData(556, 0.1015625f, "15", false));
        drops.add(new ItemData(203, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(205, 0.011961722488038277f, "1", false));
        drops.add(new ItemData(207, 0.009398496240601503f, "1", false));
        drops.add(new ItemData(209, 0.00683526999316473f, "1", false));
        drops.add(new ItemData(211, 0.005128205128205128f, "1", false));
        drops.add(new ItemData(213, 0.004271678769756515f, "1", false));
        drops.add(new ItemData(215, 0.003417634996582365f, "1", false));
        drops.add(new ItemData(2485, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(217, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(995, 0.28125f, "12", false));
        drops.add(new ItemData(561, 0.0703125f, "2", false));
        drops.add(new ItemData(995, 0.0234375f, "42", false));
        drops.add(new ItemData(1381, 0.015625f, "1", false));
        drops.add(new ItemData(562, 0.0546875f, "2", false));
        drops.add(new ItemData(563, 0.046875f, "1", false));
        drops.add(new ItemData(560, 0.03125f, "1", false));
        drops.add(new ItemData(556, 0.0234375f, "20", false));
        drops.add(new ItemData(565, 0.0078125f, "1", false));
        drops.add(new ItemData(199, 0.0273224043715847f, "1", false));
        drops.add(new ItemData(201, 0.020491803278688523f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
