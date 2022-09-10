package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Thug implements BaseNPC {
    public List<ItemData> drops;

    public Thug() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(199, 0.046948356807511735f, "1", false));
        drops.add(new ItemData(201, 0.035211267605633804f, "1", false));
        drops.add(new ItemData(203, 0.026385224274406333f, "1", false));
        drops.add(new ItemData(205, 0.020491803278688523f, "1", false));
        drops.add(new ItemData(207, 0.01610305958132045f, "1", false));
        drops.add(new ItemData(209, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(211, 0.008787346221441126f, "1", false));
        drops.add(new ItemData(213, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(215, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(2485, 0.004393673110720563f, "1", false));
        drops.add(new ItemData(1137, 0.03125f, "1", false));
        drops.add(new ItemData(217, 0.004393673110720563f, "1", false));
        drops.add(new ItemData(440, 0.03125f, "1", false));
        drops.add(new ItemData(2351, 0.0234375f, "1", false));
        drops.add(new ItemData(453, 0.015625f, "1", false));
        drops.add(new ItemData(995, 0.1796875f, "8", false));
        drops.add(new ItemData(995, 0.09375f, "15", false));
        drops.add(new ItemData(995, 0.015625f, "30", false));
        drops.add(new ItemData(995, 0.0078125f, "20", false));
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(1363, 0.015625f, "1", false));
        drops.add(new ItemData(1353, 0.0078125f, "1", false));
        drops.add(new ItemData(561, 0.1015625f, "2", false));
        drops.add(new ItemData(562, 0.03125f, "2", false));
        drops.add(new ItemData(564, 0.0078125f, "2", false));
        drops.add(new ItemData(563, 0.0078125f, "2", false));
        drops.add(new ItemData(560, 0.0078125f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
