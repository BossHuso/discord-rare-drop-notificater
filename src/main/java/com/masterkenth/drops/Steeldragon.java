package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Steeldragon implements BaseNPC {
    public List<ItemData> drops;

    public Steeldragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(565, 0.1484375f, "20", false));
        drops.add(new ItemData(830, 0.15625f, "7", false));
        drops.add(new ItemData(9144, 0.046875f, "2-12", false));
        drops.add(new ItemData(566, 0.0390625f, "5", false));
        drops.add(new ItemData(995, 0.1328125f, "470", false));
        drops.add(new ItemData(995, 0.0390625f, "650", false));
        drops.add(new ItemData(145, 0.1015625f, "1", false));
        drops.add(new ItemData(9431, 0.0625f, "1", false));
        drops.add(new ItemData(19582, 0.0390625f, "12", false));
        drops.add(new ItemData(2353, 1f, "5", false));
        drops.add(new ItemData(2363, 0.0234375f, "1", false));
        drops.add(new ItemData(165, 0.0234375f, "1", false));
        drops.add(new ItemData(2011, 0.0078125f, "1", false));
        drops.add(new ItemData(2011, 0.0078125f, "2", false));
        drops.add(new ItemData(4585, 0.001953125f, "1", false));
        drops.add(new ItemData(4087, 0.001953125f, "1", false));
        drops.add(new ItemData(817, 0.0546875f, "12", false));
        drops.add(new ItemData(2722, 0.015625f, "1", false));
        drops.add(new ItemData(23083, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(1432, 0.03125f, "1", false));
        drops.add(new ItemData(1199, 0.015625f, "1", false));
        drops.add(new ItemData(868, 0.0234375f, "7", false));
        drops.add(new ItemData(1359, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
