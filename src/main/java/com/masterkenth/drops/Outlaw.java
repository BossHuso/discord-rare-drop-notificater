package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Outlaw implements BaseNPC {
    public List<ItemData> drops;

    public Outlaw() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(205, 0.0273224043715847f, "1", false));
        drops.add(new ItemData(207, 0.021505376344086023f, "1", false));
        drops.add(new ItemData(209, 0.015625f, "1", false));
        drops.add(new ItemData(211, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(213, 0.009765625f, "1", false));
        drops.add(new ItemData(215, 0.0078125f, "1", false));
        drops.add(new ItemData(2485, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(217, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(995, 0.25f, "10", false));
        drops.add(new ItemData(995, 0.09375f, "5", false));
        drops.add(new ItemData(11008, 1f, "1", false));
        drops.add(new ItemData(995, 0.03125f, "15", false));
        drops.add(new ItemData(995, 0.0078125f, "25", false));
        drops.add(new ItemData(954, 0.359375f, "1", false));
        drops.add(new ItemData(313, 0.1171875f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "1", false));
        drops.add(new ItemData(1965, 0.046875f, "1", false));
        drops.add(new ItemData(946, 0.0078125f, "1", false));
        drops.add(new ItemData(1139, 0.015625f, "1", false));
        drops.add(new ItemData(558, 0.015625f, "9", false));
        drops.add(new ItemData(555, 0.015625f, "6", false));
        drops.add(new ItemData(557, 0.015625f, "5", false));
        drops.add(new ItemData(199, 0.0625f, "1", false));
        drops.add(new ItemData(201, 0.046948356807511735f, "1", false));
        drops.add(new ItemData(203, 0.035211267605633804f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
