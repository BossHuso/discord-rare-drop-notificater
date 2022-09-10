package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Killerwatt implements BaseNPC {
    public List<ItemData> drops;

    public Killerwatt() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(1621, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(1619, 0.002232142857142857f, "1", false));
        drops.add(new ItemData(1452, 0.0008369881817268739f, "1", false));
        drops.add(new ItemData(1462, 0.0008369881817268739f, "1", false));
        drops.add(new ItemData(1617, 0.0005580357142857143f, "1", false));
        drops.add(new ItemData(830, 0.00027901785714285713f, "5", false));
        drops.add(new ItemData(987, 0.00027901785714285713f, "1", false));
        drops.add(new ItemData(985, 0.00027901785714285713f, "1", false));
        drops.add(new ItemData(1247, 0.00001743861607142857f, "1", false));
        drops.add(new ItemData(2366, 0.000008719308035714285f, "1", false));
        drops.add(new ItemData(1249, 0.000006538970169741202f, "1", false));
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(554, 0.05714285714285714f, "45", false));
        drops.add(new ItemData(561, 0.07857142857142857f, "8", false));
        drops.add(new ItemData(561, 0.007142857142857143f, "37", false));
        drops.add(new ItemData(562, 0.06428571428571428f, "4", false));
        drops.add(new ItemData(560, 0.02142857142857143f, "2", false));
        drops.add(new ItemData(4694, 0.014285714285714285f, "2", false));
        drops.add(new ItemData(2, 0.014285714285714285f, "3", false));
        drops.add(new ItemData(199, 0.0625f, "1", false));
        drops.add(new ItemData(201, 0.046948356807511735f, "1", false));
        drops.add(new ItemData(203, 0.035211267605633804f, "1", false));
        drops.add(new ItemData(1387, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(205, 0.0273224043715847f, "1", false));
        drops.add(new ItemData(207, 0.021505376344086023f, "1", false));
        drops.add(new ItemData(209, 0.015625f, "1", false));
        drops.add(new ItemData(211, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(213, 0.009765625f, "1", false));
        drops.add(new ItemData(215, 0.0078125f, "1", false));
        drops.add(new ItemData(2485, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(217, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(995, 0.16428571428571428f, "11", false));
        drops.add(new ItemData(995, 0.2f, "44", false));
        drops.add(new ItemData(1381, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(995, 0.007142857142857143f, "76", false));
        drops.add(new ItemData(995, 0.007142857142857143f, "127", false));
        drops.add(new ItemData(995, 0.07857142857142857f, "200", false));
        drops.add(new ItemData(569, 0.007142857142857143f, "2", false));
        drops.add(new ItemData(1781, 0.007142857142857143f, "4", false));
        drops.add(new ItemData(1393, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(1397, 0.007142857142857143f, "1", false));
        drops.add(new ItemData(1401, 0.001953125f, "1", false));
        drops.add(new ItemData(556, 0.02142857142857143f, "5", false));
        drops.add(new ItemData(556, 0.014285714285714285f, "17", false));
        drops.add(new ItemData(554, 0.03571428571428571f, "18", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
