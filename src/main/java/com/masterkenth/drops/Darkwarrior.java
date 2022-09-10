package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Darkwarrior implements BaseNPC {
    public List<ItemData> drops;

    public Darkwarrior() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(562, 0.0078125f, "2", false));
        drops.add(new ItemData(561, 0.015625f, "3", false));
        drops.add(new ItemData(199, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(201, 0.004393673110720563f, "1", false));
        drops.add(new ItemData(203, 0.0032959789057350032f, "1", false));
        drops.add(new ItemData(205, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(207, 0.002014098690835851f, "1", false));
        drops.add(new ItemData(209, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(211, 0.001098659635245001f, "1", false));
        drops.add(new ItemData(213, 0.0009154994049253868f, "1", false));
        drops.add(new ItemData(1139, 0.0234375f, "1", false));
        drops.add(new ItemData(215, 0.0007324397568300008f, "1", false));
        drops.add(new ItemData(2485, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(217, 0.0005493298176225005f, "1", false));
        drops.add(new ItemData(995, 0.2421875f, "1", false));
        drops.add(new ItemData(995, 0.15625f, "2", false));
        drops.add(new ItemData(995, 0.15625f, "6", false));
        drops.add(new ItemData(995, 0.0546875f, "13", false));
        drops.add(new ItemData(995, 0.046875f, "20", false));
        drops.add(new ItemData(995, 0.0234375f, "10", false));
        drops.add(new ItemData(995, 0.015625f, "30", false));
        drops.add(new ItemData(1420, 0.0078125f, "1", false));
        drops.add(new ItemData(440, 0.0078125f, "1", false));
        drops.add(new ItemData(325, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
        drops.add(new ItemData(1151, 0.0078125f, "1", false));
        drops.add(new ItemData(1426, 0.0078125f, "1", false));
        drops.add(new ItemData(558, 0.0234375f, "2", false));
        drops.add(new ItemData(555, 0.015625f, "3", false));
        drops.add(new ItemData(557, 0.0078125f, "2", false));
        drops.add(new ItemData(882, 0.03125f, "8", false));
        drops.add(new ItemData(1145, 0.0234375f, "1", false));
        drops.add(new ItemData(1428, 0.0078125f, "1", false));
        drops.add(new ItemData(558, 0.0234375f, "12", false));
        drops.add(new ItemData(555, 0.015625f, "12", false));
        drops.add(new ItemData(557, 0.0078125f, "12", false));
        drops.add(new ItemData(882, 0.03125f, "28", false));
        drops.add(new ItemData(562, 0.0078125f, "8", false));
        drops.add(new ItemData(561, 0.015625f, "9", false));
        drops.add(new ItemData(995, 0.2421875f, "100", false));
        drops.add(new ItemData(995, 0.15625f, "20", false));
        drops.add(new ItemData(995, 0.15625f, "60", false));
        drops.add(new ItemData(995, 0.0546875f, "130", false));
        drops.add(new ItemData(995, 0.046875f, "200", false));
        drops.add(new ItemData(995, 0.015625f, "90", false));
        drops.add(new ItemData(11940, 0.015625f, "10-24", false));
        drops.add(new ItemData(440, 0.0078125f, "3", false));
        drops.add(new ItemData(325, 0.0078125f, "3", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(1141, 0.0234375f, "1", false));
        drops.add(new ItemData(1424, 0.0078125f, "1", false));
        drops.add(new ItemData(882, 0.03125f, "12", false));
        drops.add(new ItemData(558, 0.0234375f, "10", false));
        drops.add(new ItemData(555, 0.015625f, "10", false));
        drops.add(new ItemData(561, 0.015625f, "8", false));
        drops.add(new ItemData(557, 0.0078125f, "10", false));
        drops.add(new ItemData(995, 0.2421875f, "50", false));
        drops.add(new ItemData(995, 0.15625f, "30", false));
        drops.add(new ItemData(995, 0.140625f, "10", false));
        drops.add(new ItemData(995, 0.0703125f, "80", false));
        drops.add(new ItemData(995, 0.046875f, "100", false));
        drops.add(new ItemData(325, 0.0078125f, "2", false));
        drops.add(new ItemData(2801, 0.010416666666666666f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
