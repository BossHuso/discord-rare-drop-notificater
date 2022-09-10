package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Bigfrog implements BaseNPC {
    public List<ItemData> drops;

    public Bigfrog() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1440, 0.0078125f, "1", false));
        drops.add(new ItemData(7908, 1f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(555, 0.078125f, "12", false));
        drops.add(new ItemData(557, 0.078125f, "12", false));
        drops.add(new ItemData(561, 0.0546875f, "4", false));
        drops.add(new ItemData(564, 0.046875f, "2", false));
        drops.add(new ItemData(995, 0.25f, "5", false));
        drops.add(new ItemData(995, 0.1484375f, "15", false));
        drops.add(new ItemData(1444, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
