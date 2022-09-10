package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Penda implements BaseNPC {
    public List<ItemData> drops;

    public Penda() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(199, 0.04484304932735426f, "1", false));
        drops.add(new ItemData(201, 0.03367003367003367f, "1", false));
        drops.add(new ItemData(203, 0.025252525252525252f, "1", false));
        drops.add(new ItemData(205, 0.019646365422396856f, "1", false));
        drops.add(new ItemData(207, 0.015432098765432098f, "1", false));
        drops.add(new ItemData(209, 0.011235955056179775f, "1", false));
        drops.add(new ItemData(211, 0.008424599831508003f, "1", false));
        drops.add(new ItemData(213, 0.007017543859649123f, "1", false));
        drops.add(new ItemData(215, 0.005614823133071308f, "1", false));
        drops.add(new ItemData(2485, 0.004212299915754001f, "1", false));
        drops.add(new ItemData(1139, 0.015625f, "1", false));
        drops.add(new ItemData(217, 0.004212299915754001f, "1", false));
        drops.add(new ItemData(995, 0.296875f, "3", false));
        drops.add(new ItemData(995, 0.0703125f, "5", false));
        drops.add(new ItemData(995, 0.03125f, "15", false));
        drops.add(new ItemData(995, 0.0078125f, "25", false));
        drops.add(new ItemData(313, 0.0390625f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "1", false));
        drops.add(new ItemData(1440, 0.015625f, "1", false));
        drops.add(new ItemData(1965, 0.0078125f, "1", false));
        drops.add(new ItemData(1203, 0.0078125f, "1", false));
        drops.add(new ItemData(23182, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(877, 0.171875f, "2-12", false));
        drops.add(new ItemData(882, 0.0234375f, "7", false));
        drops.add(new ItemData(557, 0.015625f, "4", false));
        drops.add(new ItemData(554, 0.015625f, "6", false));
        drops.add(new ItemData(558, 0.015625f, "9", false));
        drops.add(new ItemData(562, 0.0078125f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
