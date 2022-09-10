package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mourner implements BaseNPC {
    public List<ItemData> drops;

    public Mourner() {
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
        drops.add(new ItemData(6070, 1f, "1", false));
        drops.add(new ItemData(6069, 1f, "1", false));
        drops.add(new ItemData(6064, 1f, "1", false));
        drops.add(new ItemData(6068, 1f, "1", false));
        drops.add(new ItemData(1506, 1f, "1", false));
        drops.add(new ItemData(6066, 1f, "1", false));
        drops.add(new ItemData(6071, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
