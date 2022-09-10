package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Scorpia implements BaseNPC {
    public List<ItemData> drops;

    public Scorpia() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11930, 0.00390625f, "1", false));
        drops.add(new ItemData(4587, 0.0078125f, "1", false));
        drops.add(new ItemData(213, 0.0625f, "4", false));
        drops.add(new ItemData(1783, 0.046875f, "25", false));
        drops.add(new ItemData(6016, 0.046875f, "10", false));
        drops.add(new ItemData(1621, 0.0390625f, "6", false));
        drops.add(new ItemData(1623, 0.0390625f, "4", false));
        drops.add(new ItemData(7198, 0.0625f, "3", false));
        drops.add(new ItemData(2434, 0.0625f, "1", false));
        drops.add(new ItemData(385, 0.0625f, "1", false));
        drops.add(new ItemData(2297, 0.03125f, "8", false));
        drops.add(new ItemData(11933, 0.00390625f, "1", false));
        drops.add(new ItemData(2448, 0.015625f, "1", false));
        drops.add(new ItemData(995, 0.140625f, "499-3998", false));
        drops.add(new ItemData(11090, 0.0546875f, "1", false));
        drops.add(new ItemData(4696, 0.03125f, "30", false));
        drops.add(new ItemData(5940, 0.03125f, "1", false));
        drops.add(new ItemData(1319, 0.0390625f, "1", false));
        drops.add(new ItemData(1275, 0.0390625f, "1", false));
        drops.add(new ItemData(1247, 0.0390625f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(13459, 0.05555555555555555f, "1", false));
        drops.add(new ItemData(23083, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(2722, 0.01f, "1", false));
        drops.add(new ItemData(13181, 0.0004960932655339203f, "1", false));
        drops.add(new ItemData(23490, 0.013888888888888888f, "1", false));
        drops.add(new ItemData(21257, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(1113, 0.03125f, "1", false));
        drops.add(new ItemData(1333, 0.03125f, "1", false));
        drops.add(new ItemData(1289, 0.03125f, "1", false));
        drops.add(new ItemData(1347, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
