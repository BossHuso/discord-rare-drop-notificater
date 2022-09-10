package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Guard implements BaseNPC {
    public List<ItemData> drops;

    public Guard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(561, 0.0078125f, "1", false));
        drops.add(new ItemData(886, 0.0078125f, "5", false));
        drops.add(new ItemData(5318, 0.05263157894736842f, "4", false));
        drops.add(new ItemData(5319, 0.04f, "4", false));
        drops.add(new ItemData(5324, 0.02631578947368421f, "4", false));
        drops.add(new ItemData(5322, 0.012987012987012988f, "3", false));
        drops.add(new ItemData(5320, 0.0064516129032258064f, "3", false));
        drops.add(new ItemData(5323, 0.003215434083601286f, "2", false));
        drops.add(new ItemData(5321, 0.0015360983102918587f, "2", false));
        drops.add(new ItemData(22879, 0.0011160714285714285f, "2", false));
        drops.add(new ItemData(9140, 0.078125f, "2-12", false));
        drops.add(new ItemData(995, 0.1484375f, "1", false));
        drops.add(new ItemData(995, 0.125f, "7", false));
        drops.add(new ItemData(995, 0.140625f, "5", false));
        drops.add(new ItemData(995, 0.0703125f, "12", false));
        drops.add(new ItemData(995, 0.0625f, "4", false));
        drops.add(new ItemData(995, 0.03125f, "25", false));
        drops.add(new ItemData(995, 0.03125f, "17", false));
        drops.add(new ItemData(995, 0.015625f, "30", false));
        drops.add(new ItemData(1203, 0.046875f, "1", false));
        drops.add(new ItemData(1446, 0.0234375f, "1", false));
        drops.add(new ItemData(886, 0.03125f, "1", false));
        drops.add(new ItemData(1947, 0.0078125f, "1", false));
        drops.add(new ItemData(440, 0.0078125f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 1f, "30", false));
        drops.add(new ItemData(882, 0.0234375f, "1", false));
        drops.add(new ItemData(556, 0.015625f, "6", false));
        drops.add(new ItemData(557, 0.015625f, "3", false));
        drops.add(new ItemData(554, 0.015625f, "2", false));
        drops.add(new ItemData(565, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
