package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Spiritualmage implements BaseNPC {
    public List<ItemData> drops;

    public Spiritualmage() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(11840, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.140625f, "10", false));
        drops.add(new ItemData(9075, 0.0703125f, "15", false));
        drops.add(new ItemData(560, 0.0625f, "15", false));
        drops.add(new ItemData(561, 0.0546875f, "25", false));
        drops.add(new ItemData(558, 0.03125f, "50", false));
        drops.add(new ItemData(561, 0.03125f, "18", false));
        drops.add(new ItemData(559, 0.0234375f, "35", false));
        drops.add(new ItemData(563, 0.015625f, "15", false));
        drops.add(new ItemData(559, 0.015625f, "25", false));
        drops.add(new ItemData(565, 0.015625f, "10", false));
        drops.add(new ItemData(556, 0.0703125f, "30", false));
        drops.add(new ItemData(562, 0.0078125f, "25", false));
        drops.add(new ItemData(7936, 0.046875f, "90", false));
        drops.add(new ItemData(175, 0.0390625f, "5", false));
        drops.add(new ItemData(555, 0.0625f, "15", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.013888888888888888f, "1", false));
        drops.add(new ItemData(21257, 0.0038461538461538464f, "1", false));
        drops.add(new ItemData(555, 0.0546875f, "50", false));
        drops.add(new ItemData(556, 0.015625f, "50", false));
        drops.add(new ItemData(554, 0.015625f, "65", false));
        drops.add(new ItemData(4696, 0.0859375f, "15", false));
        drops.add(new ItemData(4698, 0.0546875f, "20", false));
        drops.add(new ItemData(4695, 0.046875f, "20", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
