package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Gargoyle implements BaseNPC {
    public List<ItemData> drops;

    public Gargoyle() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.009765625f, "1", false));
        drops.add(new ItemData(1621, 0.0048828125f, "1", false));
        drops.add(new ItemData(1619, 0.00244140625f, "1", false));
        drops.add(new ItemData(1452, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1462, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1617, 0.0006103515625f, "1", false));
        drops.add(new ItemData(830, 0.00030517578125f, "5", false));
        drops.add(new ItemData(987, 0.00030517578125f, "1", false));
        drops.add(new ItemData(985, 0.00030517578125f, "1", false));
        drops.add(new ItemData(1247, 0.000019073486328125f, "1", false));
        drops.add(new ItemData(2366, 0.0000095367431640625f, "1", false));
        drops.add(new ItemData(1249, 0.0000071519986231544404f, "1", false));
        drops.add(new ItemData(4153, 0.00390625f, "1", false));
        drops.add(new ItemData(562, 0.0625f, "30", false));
        drops.add(new ItemData(554, 0.046875f, "150", false));
        drops.add(new ItemData(560, 0.0390625f, "15", false));
        drops.add(new ItemData(444, 0.078125f, "10-20", false));
        drops.add(new ItemData(7936, 0.046875f, "150", false));
        drops.add(new ItemData(2353, 0.046875f, "15", false));
        drops.add(new ItemData(2357, 0.0234375f, "10-15", false));
        drops.add(new ItemData(2359, 0.015625f, "15", false));
        drops.add(new ItemData(451, 0.015625f, "1", false));
        drops.add(new ItemData(995, 0.21875f, "400-800", false));
        drops.add(new ItemData(4101, 0.001953125f, "1", false));
        drops.add(new ItemData(995, 0.15625f, "500-1000", false));
        drops.add(new ItemData(995, 0.0390625f, "10000", false));
        drops.add(new ItemData(1073, 0.03125f, "1", false));
        drops.add(new ItemData(23083, 0.012987012987012988f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(21724, 0.006666666666666667f, "1", false));
        drops.add(new ItemData(1163, 0.0234375f, "1", false));
        drops.add(new ItemData(1319, 0.015625f, "1", false));
        drops.add(new ItemData(4129, 0.0078125f, "1", false));
        drops.add(new ItemData(1373, 0.0078125f, "1", false));
        drops.add(new ItemData(1079, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.078125f, "75", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
