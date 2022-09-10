package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Giantlobster implements BaseNPC {
    public List<ItemData> drops;

    public Giantlobster() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1265, 0.046875f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "3", false));
        drops.add(new ItemData(407, 0.09375f, "2", false));
        drops.add(new ItemData(407, 0.0703125f, "1", false));
        drops.add(new ItemData(409, 0.0234375f, "1", false));
        drops.add(new ItemData(409, 0.0078125f, "3", false));
        drops.add(new ItemData(411, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.2265625f, "4", false));
        drops.add(new ItemData(995, 0.046875f, "8", false));
        drops.add(new ItemData(995, 0.0625f, "36", false));
        drops.add(new ItemData(313, 0.015625f, "10", false));
        drops.add(new ItemData(1267, 0.0390625f, "1", false));
        drops.add(new ItemData(45, 0.015625f, "5", false));
        drops.add(new ItemData(9683, 0.015625f, "1", false));
        drops.add(new ItemData(1969, 0.0078125f, "1", false));
        drops.add(new ItemData(405, 0.0078125f, "1", false));
        drops.add(new ItemData(401, 0.03125f, "1", false));
        drops.add(new ItemData(401, 0.03125f, "2", false));
        drops.add(new ItemData(401, 0.015625f, "5", false));
        drops.add(new ItemData(403, 0.015625f, "2", false));
        drops.add(new ItemData(438, 0.03125f, "3", false));
        drops.add(new ItemData(440, 0.015625f, "1", false));
        drops.add(new ItemData(453, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
