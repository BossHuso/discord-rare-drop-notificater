package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Wallbeast implements BaseNPC {
    public List<ItemData> drops;

    public Wallbeast() {
        drops = new ArrayList<>();
        drops.add(new ItemData(556, 0.125f, "3", false));
        drops.add(new ItemData(1159, 0.03125f, "1", false));
        drops.add(new ItemData(1145, 0.03125f, "1", false));
        drops.add(new ItemData(4109, 0.001953125f, "1", false));
        drops.add(new ItemData(199, 0.125f, "1", false));
        drops.add(new ItemData(995, 0.125f, "15", false));
        drops.add(new ItemData(590, 0.125f, "1", false));
        drops.add(new ItemData(4542, 0.125f, "1", false));
        drops.add(new ItemData(595, 0.125f, "1", false));
        drops.add(new ItemData(221, 0.03125f, "1", false));
        drops.add(new ItemData(4544, 0.0078125f, "1", false));
        drops.add(new ItemData(564, 0.0078125f, "2", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.0078125f, "3-7", false));
        drops.add(new ItemData(1139, 0.125f, "1", false));
        drops.add(new ItemData(1155, 0.125f, "1", false));
        drops.add(new ItemData(1137, 0.125f, "1", false));
        drops.add(new ItemData(1141, 0.125f, "1", false));
        drops.add(new ItemData(1157, 0.125f, "1", false));
        drops.add(new ItemData(1143, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
