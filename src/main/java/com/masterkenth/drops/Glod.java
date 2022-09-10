package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Glod implements BaseNPC {
    public List<ItemData> drops;

    public Glod() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "2", false));
        drops.add(new ItemData(1623, 1f, "1", false));
        drops.add(new ItemData(1619, 1f, "1", false));
        drops.add(new ItemData(5336, 1f, "1", false));
        drops.add(new ItemData(11210, 1f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
