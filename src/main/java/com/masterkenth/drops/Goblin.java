package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Goblin implements BaseNPC {
    public List<ItemData> drops;

    public Goblin() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.0234375f, "15", false));
        drops.add(new ItemData(995, 0.015625f, "20", false));
        drops.add(new ItemData(995, 0.0078125f, "1", false));
        drops.add(new ItemData(2347, 0.1171875f, "1", false));
        drops.add(new ItemData(10999, 0.015625f, "1", false));
        drops.add(new ItemData(288, 0.0390625f, "1", false));
        drops.add(new ItemData(1949, 0.0234375f, "1", false));
        drops.add(new ItemData(1917, 0.015625f, "1", false));
        drops.add(new ItemData(1009, 0.0078125f, "1", false));
        drops.add(new ItemData(1438, 0.0078125f, "1", false));
        drops.add(new ItemData(1173, 0.0234375f, "1", false));
        drops.add(new ItemData(7812, 0.25f, "1", false));
        drops.add(new ItemData(13447, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(23182, 0.015625f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(6801, 0.0002f, "1", false));
        drops.add(new ItemData(1237, 0.03125f, "1", false));
        drops.add(new ItemData(559, 0.0390625f, "7", false));
        drops.add(new ItemData(555, 0.046875f, "6", false));
        drops.add(new ItemData(557, 0.0234375f, "4", false));
        drops.add(new ItemData(877, 0.0234375f, "8", false));
        drops.add(new ItemData(995, 0.21875f, "5", false));
        drops.add(new ItemData(995, 0.0234375f, "9", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
