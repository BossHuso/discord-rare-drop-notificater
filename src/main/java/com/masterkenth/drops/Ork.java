package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ork implements BaseNPC {
    public List<ItemData> drops;

    public Ork() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1420, 0.0390625f, "1", false));
        drops.add(new ItemData(1323, 0.0390625f, "1", false));
        drops.add(new ItemData(1353, 0.0390625f, "1", false));
        drops.add(new ItemData(1207, 0.0390625f, "1", false));
        drops.add(new ItemData(1424, 0.0390625f, "1", false));
        drops.add(new ItemData(1239, 0.03125f, "1", false));
        drops.add(new ItemData(1321, 0.0078125f, "1", false));
        drops.add(new ItemData(1139, 0.0390625f, "1", false));
        drops.add(new ItemData(1155, 0.0390625f, "1", false));
        drops.add(new ItemData(1075, 0.0390625f, "1", false));
        drops.add(new ItemData(1307, 0.0390625f, "1", false));
        drops.add(new ItemData(1101, 0.0390625f, "1", false));
        drops.add(new ItemData(1141, 0.0390625f, "1", false));
        drops.add(new ItemData(995, 0.0625f, "10", false));
        drops.add(new ItemData(995, 0.0390625f, "5", false));
        drops.add(new ItemData(995, 0.0390625f, "8", false));
        drops.add(new ItemData(995, 0.0390625f, "12", false));
        drops.add(new ItemData(995, 0.0390625f, "23", false));
        drops.add(new ItemData(946, 0.0390625f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(1375, 0.0390625f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(806, 0.0390625f, "2", false));
        drops.add(new ItemData(3190, 0.0390625f, "1", false));
        drops.add(new ItemData(1321, 0.0390625f, "1", false));
        drops.add(new ItemData(1337, 0.0390625f, "1", false));
        drops.add(new ItemData(807, 0.0390625f, "2", false));
        drops.add(new ItemData(1293, 0.0390625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
