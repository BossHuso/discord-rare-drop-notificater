package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Molanisk implements BaseNPC {
    public List<ItemData> drops;

    public Molanisk() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.013671875f, "1", false));
        drops.add(new ItemData(1621, 0.0068359375f, "1", false));
        drops.add(new ItemData(1619, 0.00341796875f, "1", false));
        drops.add(new ItemData(1452, 0.0012816381532692756f, "1", false));
        drops.add(new ItemData(1462, 0.0012816381532692756f, "1", false));
        drops.add(new ItemData(1617, 0.0008544921875f, "1", false));
        drops.add(new ItemData(830, 0.00042724609375f, "5", false));
        drops.add(new ItemData(987, 0.00042724609375f, "1", false));
        drops.add(new ItemData(985, 0.00042724609375f, "1", false));
        drops.add(new ItemData(1247, 0.000026702880859375f, "1", false));
        drops.add(new ItemData(2366, 0.0000133514404296875f, "1", false));
        drops.add(new ItemData(1249, 0.000010012798072416216f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(205, 0.0273224043715847f, "1", false));
        drops.add(new ItemData(207, 0.021505376344086023f, "1", false));
        drops.add(new ItemData(209, 0.015625f, "1", false));
        drops.add(new ItemData(211, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(213, 0.009765625f, "1", false));
        drops.add(new ItemData(215, 0.0078125f, "1", false));
        drops.add(new ItemData(2485, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(217, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(10978, 0.2890625f, "1-4", false));
        drops.add(new ItemData(10978, 0.078125f, "5-8", false));
        drops.add(new ItemData(555, 0.078125f, "1-14", false));
        drops.add(new ItemData(995, 0.078125f, "1-75", false));
        drops.add(new ItemData(7416, 0.0078125f, "1", false));
        drops.add(new ItemData(557, 0.078125f, "1-20", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(561, 0.0234375f, "1-5", false));
        drops.add(new ItemData(564, 0.0390625f, "1-7", false));
        drops.add(new ItemData(4698, 0.015625f, "1-15", false));
        drops.add(new ItemData(199, 0.0625f, "1", false));
        drops.add(new ItemData(201, 0.046948356807511735f, "1", false));
        drops.add(new ItemData(203, 0.035211267605633804f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
