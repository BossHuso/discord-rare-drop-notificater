package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Giantfrog implements BaseNPC {
    public List<ItemData> drops;

    public Giantfrog() {
        drops = new ArrayList<>();
        drops.add(new ItemData(565, 0.0078125f, "1", false));
        drops.add(new ItemData(564, 0.0234375f, "5", false));
        drops.add(new ItemData(884, 0.015625f, "22", false));
        drops.add(new ItemData(886, 0.0078125f, "45", false));
        drops.add(new ItemData(995, 0.0625f, "2", false));
        drops.add(new ItemData(995, 0.078125f, "30", false));
        drops.add(new ItemData(995, 0.0390625f, "37", false));
        drops.add(new ItemData(4517, 0.5f, "1", false));
        drops.add(new ItemData(453, 0.0078125f, "1", false));
        drops.add(new ItemData(1969, 0.0078125f, "1", false));
        drops.add(new ItemData(23182, 0.015625f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(1243, 0.015625f, "1", false));
        drops.add(new ItemData(561, 0.078125f, "1", false));
        drops.add(new ItemData(561, 0.078125f, "3", false));
        drops.add(new ItemData(561, 0.078125f, "9", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
