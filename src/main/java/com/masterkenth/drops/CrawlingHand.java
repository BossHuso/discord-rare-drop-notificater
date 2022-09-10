package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CrawlingHand implements BaseNPC {
    public List<ItemData> drops;

    public CrawlingHand() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.1640625f, "5", false));
        drops.add(new ItemData(995, 0.1796875f, "8", false));
        drops.add(new ItemData(1059, 0.1640625f, "1", false));
        drops.add(new ItemData(7975, 0.002f, "1", false));
        drops.add(new ItemData(2942, 0.015625f, "1", false));
        drops.add(new ItemData(2922, 0.015625f, "1", false));
        drops.add(new ItemData(2912, 0.015625f, "1", false));
        drops.add(new ItemData(2932, 0.015625f, "1", false));
        drops.add(new ItemData(1635, 0.0234375f, "1", false));
        drops.add(new ItemData(1637, 0.015625f, "1", false));
        drops.add(new ItemData(1639, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
