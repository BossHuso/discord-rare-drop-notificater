package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Tyrasguard implements BaseNPC {
    public List<ItemData> drops;

    public Tyrasguard() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(560, 0.0234375f, "5", false));
        drops.add(new ItemData(554, 0.0078125f, "37", false));
        drops.add(new ItemData(995, 0.3125f, "132", false));
        drops.add(new ItemData(995, 0.2265625f, "44", false));
        drops.add(new ItemData(995, 0.078125f, "220", false));
        drops.add(new ItemData(995, 0.0546875f, "11", false));
        drops.add(new ItemData(995, 0.0078125f, "460", false));
        drops.add(new ItemData(361, 0.0234375f, "1", false));
        drops.add(new ItemData(2357, 0.015625f, "1", false));
        drops.add(new ItemData(1734, 0.0078125f, "10", false));
        drops.add(new ItemData(1311, 0.03125f, "1", false));
        drops.add(new ItemData(1353, 0.0234375f, "1", false));
        drops.add(new ItemData(1365, 0.0234375f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1073, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.0625f, "75", false));
        drops.add(new ItemData(562, 0.0390625f, "15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
