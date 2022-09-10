package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mammoth implements BaseNPC {
    public List<ItemData> drops;

    public Mammoth() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(215, 0.001953125f, "1", false));
        drops.add(new ItemData(2485, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(217, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(5318, 0.046875f, "3", false));
        drops.add(new ItemData(5319, 0.03125f, "3", false));
        drops.add(new ItemData(5324, 0.025f, "3", false));
        drops.add(new ItemData(5322, 0.021875f, "3", false));
        drops.add(new ItemData(5320, 0.015625f, "3", false));
        drops.add(new ItemData(5323, 0.0125f, "3", false));
        drops.add(new ItemData(5321, 0.003125f, "3", false));
        drops.add(new ItemData(199, 0.015625f, "1", false));
        drops.add(new ItemData(5101, 0.046875f, "2", false));
        drops.add(new ItemData(5102, 0.03125f, "2", false));
        drops.add(new ItemData(5103, 0.025f, "2", false));
        drops.add(new ItemData(5104, 0.021875f, "2", false));
        drops.add(new ItemData(5105, 0.015625f, "2", false));
        drops.add(new ItemData(5106, 0.015625f, "2", false));
        drops.add(new ItemData(5305, 0.046875f, "4", false));
        drops.add(new ItemData(5307, 0.03125f, "4", false));
        drops.add(new ItemData(5308, 0.025f, "4", false));
        drops.add(new ItemData(5306, 0.021875f, "4", false));
        drops.add(new ItemData(201, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(5309, 0.015625f, "4", false));
        drops.add(new ItemData(5310, 0.0125f, "4", false));
        drops.add(new ItemData(5311, 0.003125f, "4", false));
        drops.add(new ItemData(5283, 0.028125f, "1", false));
        drops.add(new ItemData(5284, 0.01875f, "1", false));
        drops.add(new ItemData(5285, 0.015625f, "1", false));
        drops.add(new ItemData(5286, 0.009375f, "1", false));
        drops.add(new ItemData(5287, 0.0046875f, "1", false));
        drops.add(new ItemData(5288, 0.0015625f, "1", false));
        drops.add(new ItemData(995, 0.1015625f, "30", false));
        drops.add(new ItemData(203, 0.008787346221441126f, "1", false));
        drops.add(new ItemData(995, 0.0546875f, "180", false));
        drops.add(new ItemData(5312, 0.0390625f, "1", false));
        drops.add(new ItemData(5100, 0.0390625f, "2", false));
        drops.add(new ItemData(143, 0.0390625f, "1", false));
        drops.add(new ItemData(886, 0.0390625f, "15", false));
        drops.add(new ItemData(379, 0.0234375f, "2", false));
        drops.add(new ItemData(11940, 0.015625f, "12", false));
        drops.add(new ItemData(205, 0.00683526999316473f, "1", false));
        drops.add(new ItemData(207, 0.0053705692803437165f, "1", false));
        drops.add(new ItemData(209, 0.00390625f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(23490, 0.01f, "1", false));
        drops.add(new ItemData(21257, 0.004629629629629629f, "1", false));
        drops.add(new ItemData(211, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(213, 0.00244140625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
