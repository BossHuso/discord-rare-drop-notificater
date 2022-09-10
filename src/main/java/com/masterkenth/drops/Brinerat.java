package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Brinerat implements BaseNPC {
    public List<ItemData> drops;

    public Brinerat() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(555, 0.015625f, "18", false));
        drops.add(new ItemData(565, 0.015625f, "4", false));
        drops.add(new ItemData(377, 0.046875f, "10", false));
        drops.add(new ItemData(383, 0.046875f, "3", false));
        drops.add(new ItemData(2134, 0.015625f, "18", false));
        drops.add(new ItemData(349, 0.015625f, "18", false));
        drops.add(new ItemData(383, 0.015625f, "8", false));
        drops.add(new ItemData(371, 0.015625f, "9", false));
        drops.add(new ItemData(383, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.1640625f, "1", false));
        drops.add(new ItemData(2134, 1f, "1", false));
        drops.add(new ItemData(995, 0.125f, "2", false));
        drops.add(new ItemData(995, 0.0703125f, "4", false));
        drops.add(new ItemData(995, 0.0234375f, "29", false));
        drops.add(new ItemData(1444, 0.0234375f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(23083, 0.004464285714285714f, "1", false));
        drops.add(new ItemData(11037, 0.001953125f, "1", false));
        drops.add(new ItemData(560, 0.140625f, "7", false));
        drops.add(new ItemData(556, 0.015625f, "18", false));
        drops.add(new ItemData(557, 0.046875f, "10", false));
        drops.add(new ItemData(557, 0.015625f, "18", false));
        drops.add(new ItemData(557, 0.03125f, "36", false));
        drops.add(new ItemData(555, 0.0234375f, "10", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
