package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cavebug implements BaseNPC {
    public List<ItemData> drops;

    public Cavebug() {
        drops = new ArrayList<>();
        drops.add(new ItemData(557, 0.015625f, "6", false));
        drops.add(new ItemData(207, 0.015432098765432098f, "1", false));
        drops.add(new ItemData(209, 0.011235955056179775f, "1", false));
        drops.add(new ItemData(211, 0.008424599831508003f, "1", false));
        drops.add(new ItemData(213, 0.007017543859649123f, "1", false));
        drops.add(new ItemData(215, 0.005614823133071308f, "1", false));
        drops.add(new ItemData(2485, 0.004212299915754001f, "1", false));
        drops.add(new ItemData(217, 0.004212299915754001f, "1", false));
        drops.add(new ItemData(235, 0.015625f, "1", false));
        drops.add(new ItemData(221, 0.015625f, "1", false));
        drops.add(new ItemData(225, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.0390625f, "8", false));
        drops.add(new ItemData(231, 0.0078125f, "1", false));
        drops.add(new ItemData(223, 0.015625f, "1", false));
        drops.add(new ItemData(995, 0.0625f, "3", false));
        drops.add(new ItemData(995, 0.0234375f, "8", false));
        drops.add(new ItemData(590, 0.0234375f, "1", false));
        drops.add(new ItemData(4527, 0.0078125f, "1", false));
        drops.add(new ItemData(36, 0.0390625f, "1", false));
        drops.add(new ItemData(561, 0.0390625f, "1", false));
        drops.add(new ItemData(561, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.125f, "1", false));
        drops.add(new ItemData(199, 0.04484304932735426f, "1", false));
        drops.add(new ItemData(201, 0.03367003367003367f, "1", false));
        drops.add(new ItemData(203, 0.025252525252525252f, "1", false));
        drops.add(new ItemData(205, 0.019646365422396856f, "1", false));
        drops.add(new ItemData(1395, 0.0078125f, "1", false));
        drops.add(new ItemData(557, 0.1171875f, "1-10", false));
        drops.add(new ItemData(557, 0.015625f, "1-170", false));
        drops.add(new ItemData(555, 0.109375f, "1-15", false));
        drops.add(new ItemData(555, 0.015625f, "1-170", false));
        drops.add(new ItemData(554, 0.1015625f, "1-20", false));
        drops.add(new ItemData(554, 0.015625f, "1-170", false));
        drops.add(new ItemData(199, 0.03717472118959108f, "1", false));
        drops.add(new ItemData(201, 0.027855153203342618f, "1", false));
        drops.add(new ItemData(203, 0.020876826722338204f, "1", false));
        drops.add(new ItemData(205, 0.016233766233766232f, "1", false));
        drops.add(new ItemData(207, 0.012755102040816327f, "1", false));
        drops.add(new ItemData(209, 0.00927643784786642f, "1", false));
        drops.add(new ItemData(211, 0.006958942240779402f, "1", false));
        drops.add(new ItemData(213, 0.005797101449275362f, "1", false));
        drops.add(new ItemData(215, 0.00463821892393321f, "1", false));
        drops.add(new ItemData(2485, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(217, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(995, 0.109375f, "1-40", false));
        drops.add(new ItemData(10978, 0.2421875f, "1-4", false));
        drops.add(new ItemData(10978, 0.078125f, "5-8", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
