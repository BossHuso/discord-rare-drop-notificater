package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SkeletonMage implements BaseNPC {
    public List<ItemData> drops;

    public SkeletonMage() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(6806, 0.0002f, "1", false));
        drops.add(new ItemData(201, 0.01757469244288225f, "1", false));
        drops.add(new ItemData(203, 0.013175230566534914f, "1", false));
        drops.add(new ItemData(205, 0.010256410256410256f, "1", false));
        drops.add(new ItemData(207, 0.008058017727639f, "1", false));
        drops.add(new ItemData(209, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(211, 0.004393673110720563f, "1", false));
        drops.add(new ItemData(213, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(215, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(2485, 0.002197319270490002f, "1", false));
        drops.add(new ItemData(217, 0.002197319270490002f, "1", false));
        drops.add(new ItemData(1625, 0.078125f, "1", false));
        drops.add(new ItemData(1933, 0.078125f, "1", false));
        drops.add(new ItemData(2351, 0.0390625f, "1-2", false));
        drops.add(new ItemData(995, 0.2578125f, "25-54", false));
        drops.add(new ItemData(532, 0.046875f, "2-4", false));
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(1013, 0.015625f, "1", false));
        drops.add(new ItemData(558, 0.09375f, "7-9", false));
        drops.add(new ItemData(562, 0.078125f, "3-4", false));
        drops.add(new ItemData(563, 0.09375f, "2-3", false));
        drops.add(new ItemData(561, 0.0859375f, "1-3", false));
        drops.add(new ItemData(199, 0.0234192037470726f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
