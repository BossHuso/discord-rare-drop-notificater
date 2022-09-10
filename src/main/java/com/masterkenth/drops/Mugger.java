package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mugger implements BaseNPC {
    public List<ItemData> drops;

    public Mugger() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(207, 0.008726003490401396f, "1", false));
        drops.add(new ItemData(209, 0.006349206349206349f, "1", false));
        drops.add(new ItemData(211, 0.00475963826749167f, "1", false));
        drops.add(new ItemData(213, 0.003966679888932963f, "1", false));
        drops.add(new ItemData(215, 0.0031735956839098697f, "1", false));
        drops.add(new ItemData(2485, 0.00238038562247084f, "1", false));
        drops.add(new ItemData(217, 0.00238038562247084f, "1", false));
        drops.add(new ItemData(995, 0.1015625f, "10", false));
        drops.add(new ItemData(995, 0.09375f, "5", false));
        drops.add(new ItemData(995, 0.0234375f, "15", false));
        drops.add(new ItemData(877, 0.2109375f, "2-12", false));
        drops.add(new ItemData(995, 0.0078125f, "25", false));
        drops.add(new ItemData(954, 0.3125f, "1", false));
        drops.add(new ItemData(946, 0.0078125f, "1", false));
        drops.add(new ItemData(313, 0.046875f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "1", false));
        drops.add(new ItemData(1139, 0.015625f, "1", false));
        drops.add(new ItemData(1965, 0.0078125f, "1", false));
        drops.add(new ItemData(23182, 0.0125f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(558, 0.0234375f, "9", false));
        drops.add(new ItemData(555, 0.015625f, "6", false));
        drops.add(new ItemData(557, 0.015625f, "5", false));
        drops.add(new ItemData(199, 0.025380710659898477f, "1", false));
        drops.add(new ItemData(201, 0.01904761904761905f, "1", false));
        drops.add(new ItemData(203, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(205, 0.011111111111111112f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
