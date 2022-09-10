package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zamorakwizard implements BaseNPC {
    public List<ItemData> drops;

    public Zamorakwizard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(555, 0.0234375f, "42", false));
        drops.add(new ItemData(555, 0.015625f, "126", false));
        drops.add(new ItemData(557, 0.0234375f, "79", false));
        drops.add(new ItemData(557, 0.03125f, "86", false));
        drops.add(new ItemData(557, 0.015625f, "107", false));
        drops.add(new ItemData(554, 0.0234375f, "51", false));
        drops.add(new ItemData(554, 0.015625f, "180", false));
        drops.add(new ItemData(564, 0.0078125f, "25", false));
        drops.add(new ItemData(561, 0.0546875f, "30", false));
        drops.add(new ItemData(563, 0.0078125f, "9", false));
        drops.add(new ItemData(1035, 0.0234375f, "1", false));
        drops.add(new ItemData(560, 0.046875f, "45", false));
        drops.add(new ItemData(565, 0.09375f, "8", false));
        drops.add(new ItemData(995, 0.1328125f, "77", false));
        drops.add(new ItemData(995, 0.1953125f, "89", false));
        drops.add(new ItemData(995, 0.0234375f, "240", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(1033, 0.03125f, "1", false));
        drops.add(new ItemData(1397, 0.015625f, "1", false));
        drops.add(new ItemData(1395, 0.0234375f, "1", false));
        drops.add(new ItemData(1399, 0.0234375f, "1", false));
        drops.add(new ItemData(1393, 0.0078125f, "1", false));
        drops.add(new ItemData(556, 0.0234375f, "60", false));
        drops.add(new ItemData(556, 0.015625f, "189", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
