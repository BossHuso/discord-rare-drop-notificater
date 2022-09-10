package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class KingBlackDragon implements BaseNPC {
    public List<ItemData> drops;

    public KingBlackDragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(884, 0.078125f, "690", false));
        drops.add(new ItemData(9144, 0.078125f, "10-20", false));
        drops.add(new ItemData(563, 0.0390625f, "30", false));
        drops.add(new ItemData(565, 0.0390625f, "30", false));
        drops.add(new ItemData(1515, 0.078125f, "150", false));
        drops.add(new ItemData(2361, 0.0390625f, "3", false));
        drops.add(new ItemData(2363, 0.0234375f, "1", false));
        drops.add(new ItemData(444, 0.015625f, "100", false));
        drops.add(new ItemData(1731, 0.0546875f, "1", false));
        drops.add(new ItemData(11237, 0.0390625f, "5-14", false));
        drops.add(new ItemData(1747, 1f, "2", false));
        drops.add(new ItemData(11232, 0.0390625f, "5-14", false));
        drops.add(new ItemData(19582, 0.0390625f, "15", false));
        drops.add(new ItemData(9431, 0.03125f, "1", false));
        drops.add(new ItemData(385, 0.03125f, "4", false));
        drops.add(new ItemData(11920, 0.0006666666666666666f, "1", false));
        drops.add(new ItemData(1303, 0.078125f, "1", false));
        drops.add(new ItemData(1123, 0.0703125f, "1", false));
        drops.add(new ItemData(23083, 0.015625f, "1", false));
        drops.add(new ItemData(7980, 0.0078125f, "1", false));
        drops.add(new ItemData(12073, 0.0022222222222222222f, "1", false));
        drops.add(new ItemData(12653, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(11286, 0.0002f, "1", false));
        drops.add(new ItemData(1199, 0.0234375f, "1", false));
        drops.add(new ItemData(1149, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.0390625f, "300", false));
        drops.add(new ItemData(556, 0.078125f, "300", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
