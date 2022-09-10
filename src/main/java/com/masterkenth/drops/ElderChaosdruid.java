package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ElderChaosdruid implements BaseNPC {
    public List<ItemData> drops;

    public ElderChaosdruid() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(559, 0.03875968992248062f, "19", false));
        drops.add(new ItemData(562, 0.03875968992248062f, "7", false));
        drops.add(new ItemData(557, 0.03875968992248062f, "19", false));
        drops.add(new ItemData(558, 0.03875968992248062f, "22", false));
        drops.add(new ItemData(561, 0.007751937984496124f, "12", false));
        drops.add(new ItemData(199, 0.10638297872340426f, "1-4", false));
        drops.add(new ItemData(201, 0.08f, "1-4", false));
        drops.add(new ItemData(203, 0.059880239520958084f, "1-4", false));
        drops.add(new ItemData(205, 0.04672897196261682f, "1-4", false));
        drops.add(new ItemData(207, 0.03663003663003663f, "1-4", false));
        drops.add(new ItemData(1035, 0.0028188865398167725f, "1", false));
        drops.add(new ItemData(209, 0.02666666666666667f, "1-4", false));
        drops.add(new ItemData(211, 0.02f, "1-4", false));
        drops.add(new ItemData(213, 0.016666666666666666f, "1-4", false));
        drops.add(new ItemData(215, 0.013315579227696404f, "1-4", false));
        drops.add(new ItemData(2485, 0.00999000999000999f, "1-4", false));
        drops.add(new ItemData(217, 0.00999000999000999f, "1-4", false));
        drops.add(new ItemData(995, 0.05426356589147287f, "80", false));
        drops.add(new ItemData(995, 0.046511627906976744f, "250", false));
        drops.add(new ItemData(227, 0.07751937984496124f, "4", false));
        drops.add(new ItemData(1295, 0.03875968992248062f, "1", false));
        drops.add(new ItemData(1033, 0.0028188865398167725f, "1", false));
        drops.add(new ItemData(11940, 0.015503875968992248f, "10-24", false));
        drops.add(new ItemData(231, 0.007751937984496124f, "4", false));
        drops.add(new ItemData(1594, 0.007751937984496124f, "1", false));
        drops.add(new ItemData(20595, 0.0007047216349541931f, "1", false));
        drops.add(new ItemData(20520, 0.0007047216349541931f, "1", false));
        drops.add(new ItemData(13471, 0.05f, "1", false));
        drops.add(new ItemData(20517, 0.0007047216349541931f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(21257, 0.005f, "1", false));
        drops.add(new ItemData(9142, 0.046511627906976744f, "8-28", false));
        drops.add(new ItemData(563, 0.05426356589147287f, "6", false));
        drops.add(new ItemData(556, 0.03875968992248062f, "56", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
