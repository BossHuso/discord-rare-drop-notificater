package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Druid implements BaseNPC {
    public List<ItemData> drops;

    public Druid() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(203, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(205, 0.022222222222222223f, "1", false));
        drops.add(new ItemData(207, 0.017452006980802792f, "1", false));
        drops.add(new ItemData(209, 0.012690355329949238f, "1", false));
        drops.add(new ItemData(211, 0.009523809523809525f, "1", false));
        drops.add(new ItemData(213, 0.007936507936507936f, "1", false));
        drops.add(new ItemData(215, 0.006349206349206349f, "1", false));
        drops.add(new ItemData(2485, 0.00475963826749167f, "1", false));
        drops.add(new ItemData(217, 0.00475963826749167f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "2", false));
        drops.add(new ItemData(557, 0.03125f, "27", false));
        drops.add(new ItemData(995, 0.03125f, "4", false));
        drops.add(new ItemData(995, 0.0234375f, "1", false));
        drops.add(new ItemData(995, 0.0234375f, "15", false));
        drops.add(new ItemData(995, 0.0078125f, "20", false));
        drops.add(new ItemData(229, 0.078125f, "1", false));
        drops.add(new ItemData(1203, 0.046875f, "1", false));
        drops.add(new ItemData(540, 0.046875f, "1", false));
        drops.add(new ItemData(538, 0.0390625f, "1", false));
        drops.add(new ItemData(225, 0.0234375f, "1", false));
        drops.add(new ItemData(175, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.015625f, "9", false));
        drops.add(new ItemData(557, 0.015625f, "9", false));
        drops.add(new ItemData(554, 0.015625f, "9", false));
        drops.add(new ItemData(562, 0.015625f, "3", false));
        drops.add(new ItemData(563, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.050761421319796954f, "1", false));
        drops.add(new ItemData(201, 0.03802281368821293f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
