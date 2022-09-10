package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Abyssaldemon implements BaseNPC {
    public List<ItemData> drops;

    public Abyssaldemon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25775, 1f, "1", false));
        drops.add(new ItemData(556, 0.0625f, "50", false));
        drops.add(new ItemData(562, 0.046875f, "10", false));
        drops.add(new ItemData(565, 0.03125f, "7", false));
        drops.add(new ItemData(563, 0.0078125f, "3", false));
        drops.add(new ItemData(199, 0.03717472118959108f, "1", false));
        drops.add(new ItemData(201, 0.027855153203342618f, "1", false));
        drops.add(new ItemData(203, 0.020876826722338204f, "1", false));
        drops.add(new ItemData(205, 0.016233766233766232f, "1", false));
        drops.add(new ItemData(207, 0.012755102040816327f, "1", false));
        drops.add(new ItemData(209, 0.00927643784786642f, "1", false));
        drops.add(new ItemData(1283, 0.03125f, "1", false));
        drops.add(new ItemData(211, 0.006958942240779402f, "1", false));
        drops.add(new ItemData(213, 0.005797101449275362f, "1", false));
        drops.add(new ItemData(215, 0.00463821892393321f, "1", false));
        drops.add(new ItemData(2485, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(217, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(7936, 0.0390625f, "60", false));
        drops.add(new ItemData(2361, 0.015625f, "1", false));
        drops.add(new ItemData(995, 0.2734375f, "132", false));
        drops.add(new ItemData(995, 0.0703125f, "220", false));
        drops.add(new ItemData(995, 0.0546875f, "30", false));
        drops.add(new ItemData(1365, 0.0234375f, "1", false));
        drops.add(new ItemData(995, 0.046875f, "44", false));
        drops.add(new ItemData(995, 0.0078125f, "460", false));
        drops.add(new ItemData(379, 0.015625f, "1", false));
        drops.add(new ItemData(1454, 0.0078125f, "1", false));
        drops.add(new ItemData(1452, 0.0078125f, "1", false));
        drops.add(new ItemData(133, 0.0078125f, "1", false));
        drops.add(new ItemData(1361, 0.015625f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1113, 0.0078125f, "1", false));
        drops.add(new ItemData(13507, 0.04f, "1", false));
        drops.add(new ItemData(23083, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(12073, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(7979, 0.00016666666666666666f, "1", false));
        drops.add(new ItemData(19677, 0.004291845493562232f, "1", false));
        drops.add(new ItemData(19679, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(19681, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(19683, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(4151, 0.001953125f, "1", false));
        drops.add(new ItemData(13265, 0.00003125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
