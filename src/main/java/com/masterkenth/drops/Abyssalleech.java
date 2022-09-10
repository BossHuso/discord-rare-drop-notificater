package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Abyssalleech implements BaseNPC {
    public List<ItemData> drops;

    public Abyssalleech() {
        drops = new ArrayList<>();
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(1462, 0.0078125f, "1", false));
        drops.add(new ItemData(5516, 0.00390625f, "1", false));
        drops.add(new ItemData(5509, 0.023809523809523808f, "1", false));
        drops.add(new ItemData(5510, 0.023809523809523808f, "1", false));
        drops.add(new ItemData(5512, 0.023809523809523808f, "1", false));
        drops.add(new ItemData(5514, 0.023809523809523808f, "1", false));
        drops.add(new ItemData(7936, 0.140625f, "1", false));
        drops.add(new ItemData(7936, 0.1328125f, "1", false));
        drops.add(new ItemData(7936, 0.015625f, "5", false));
        drops.add(new ItemData(7936, 0.015625f, "10", false));
        drops.add(new ItemData(1438, 0.01953125f, "1", false));
        drops.add(new ItemData(7936, 0.015625f, "15", false));
        drops.add(new ItemData(5521, 0.01171875f, "1", false));
        drops.add(new ItemData(2801, 0.00390625f, "1", false));
        drops.add(new ItemData(1444, 0.01953125f, "1", false));
        drops.add(new ItemData(1440, 0.01953125f, "1", false));
        drops.add(new ItemData(1442, 0.01953125f, "1", false));
        drops.add(new ItemData(1448, 0.01953125f, "1", false));
        drops.add(new ItemData(1446, 0.01953125f, "1", false));
        drops.add(new ItemData(1454, 0.0078125f, "1", false));
        drops.add(new ItemData(1452, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
