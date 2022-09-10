package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Darkwizard implements BaseNPC {
    public List<ItemData> drops;

    public Darkwizard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1379, 0.03125f, "1", false));
        drops.add(new ItemData(1017, 0.046875f, "1", false));
        drops.add(new ItemData(581, 0.0234375f, "1", false));
        drops.add(new ItemData(557, 0.03125f, "36", false));
        drops.add(new ItemData(556, 0.0234375f, "10", false));
        drops.add(new ItemData(555, 0.0234375f, "10", false));
        drops.add(new ItemData(557, 0.0234375f, "10", false));
        drops.add(new ItemData(554, 0.0234375f, "10", false));
        drops.add(new ItemData(556, 0.015625f, "18", false));
        drops.add(new ItemData(555, 0.015625f, "18", false));
        drops.add(new ItemData(557, 0.015625f, "18", false));
        drops.add(new ItemData(554, 0.015625f, "18", false));
        drops.add(new ItemData(561, 0.0546875f, "4", false));
        drops.add(new ItemData(562, 0.046875f, "4", false));
        drops.add(new ItemData(558, 0.0234375f, "10", false));
        drops.add(new ItemData(559, 0.0234375f, "10", false));
        drops.add(new ItemData(558, 0.015625f, "18", false));
        drops.add(new ItemData(559, 0.015625f, "18", false));
        drops.add(new ItemData(565, 0.015625f, "2", false));
        drops.add(new ItemData(564, 0.0078125f, "2", false));
        drops.add(new ItemData(563, 0.0078125f, "3", false));
        drops.add(new ItemData(995, 0.1328125f, "1", false));
        drops.add(new ItemData(995, 0.125f, "2", false));
        drops.add(new ItemData(995, 0.0703125f, "4", false));
        drops.add(new ItemData(995, 0.0234375f, "29", false));
        drops.add(new ItemData(995, 0.0078125f, "30", false));
        drops.add(new ItemData(1444, 0.015625f, "1", false));
        drops.add(new ItemData(1442, 0.015625f, "1", false));
        drops.add(new ItemData(11941, 0.14285714285714285f, "1", false));
        drops.add(new ItemData(23182, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(562, 0.046875f, "5", false));
        drops.add(new ItemData(1379, 0.0625f, "1", false));
        drops.add(new ItemData(995, 0.0546875f, "4", false));
        drops.add(new ItemData(1444, 0.0078125f, "1", false));
        drops.add(new ItemData(1442, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
        drops.add(new ItemData(23182, 0.02f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
