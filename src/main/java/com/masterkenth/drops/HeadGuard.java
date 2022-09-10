package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class HeadGuard implements BaseNPC {
    public List<ItemData> drops;

    public HeadGuard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(565, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.0078125f, "1", false));
        drops.add(new ItemData(561, 0.0078125f, "1", false));
        drops.add(new ItemData(886, 0.0078125f, "5", false));
        drops.add(new ItemData(5318, 0.030303030303030304f, "4", false));
        drops.add(new ItemData(5319, 0.022727272727272728f, "4", false));
        drops.add(new ItemData(5324, 0.014925373134328358f, "4", false));
        drops.add(new ItemData(5322, 0.007462686567164179f, "3", false));
        drops.add(new ItemData(5320, 0.0037174721189591076f, "3", false));
        drops.add(new ItemData(5323, 0.0018552875695732839f, "2", false));
        drops.add(new ItemData(1201, 0.001953125f, "1", false));
        drops.add(new ItemData(5321, 0.0008865248226950354f, "2", false));
        drops.add(new ItemData(22879, 0.0006447453255963894f, "2", false));
        drops.add(new ItemData(5305, 0.009345794392523364f, "4", false));
        drops.add(new ItemData(5307, 0.009345794392523364f, "3", false));
        drops.add(new ItemData(5308, 0.007042253521126761f, "3", false));
        drops.add(new ItemData(5306, 0.006993006993006993f, "2", false));
        drops.add(new ItemData(5309, 0.004651162790697674f, "2", false));
        drops.add(new ItemData(5310, 0.002320185614849188f, "2", false));
        drops.add(new ItemData(5311, 0.0011806375442739079f, "1", false));
        drops.add(new ItemData(5096, 0.0070921985815602835f, "1", false));
        drops.add(new ItemData(1333, 0.001953125f, "1", false));
        drops.add(new ItemData(5098, 0.004672897196261682f, "1", false));
        drops.add(new ItemData(5097, 0.0030211480362537764f, "1", false));
        drops.add(new ItemData(5099, 0.002232142857142857f, "1", false));
        drops.add(new ItemData(5100, 0.0017825311942959f, "1", false));
        drops.add(new ItemData(995, 0.1484375f, "1", false));
        drops.add(new ItemData(995, 0.125f, "7", false));
        drops.add(new ItemData(995, 0.0703125f, "12", false));
        drops.add(new ItemData(995, 0.0625f, "4", false));
        drops.add(new ItemData(995, 0.03125f, "25", false));
        drops.add(new ItemData(995, 0.03125f, "17", false));
        drops.add(new ItemData(9140, 0.078125f, "2-12", false));
        drops.add(new ItemData(995, 0.015625f, "30", false));
        drops.add(new ItemData(1203, 0.046875f, "1", false));
        drops.add(new ItemData(1446, 0.0234375f, "1", false));
        drops.add(new ItemData(1947, 0.0078125f, "1", false));
        drops.add(new ItemData(440, 0.0078125f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(886, 0.03125f, "1", false));
        drops.add(new ItemData(882, 0.0234375f, "1", false));
        drops.add(new ItemData(556, 0.015625f, "6", false));
        drops.add(new ItemData(557, 0.015625f, "3", false));
        drops.add(new ItemData(554, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
