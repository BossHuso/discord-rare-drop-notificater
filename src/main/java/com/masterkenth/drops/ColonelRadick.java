package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ColonelRadick implements BaseNPC {
    public List<ItemData> drops;

    public ColonelRadick() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(565, 0.0078125f, "2", false));
        drops.add(new ItemData(561, 0.0078125f, "2", false));
        drops.add(new ItemData(886, 0.0078125f, "8", false));
        drops.add(new ItemData(995, 0.2890625f, "9", false));
        drops.add(new ItemData(995, 0.125f, "8", false));
        drops.add(new ItemData(995, 0.0703125f, "24", false));
        drops.add(new ItemData(995, 0.0625f, "6", false));
        drops.add(new ItemData(995, 0.03125f, "30", false));
        drops.add(new ItemData(995, 0.03125f, "12", false));
        drops.add(new ItemData(995, 0.015625f, "35", false));
        drops.add(new ItemData(1295, 0.046875f, "1", false));
        drops.add(new ItemData(1448, 0.0234375f, "1", false));
        drops.add(new ItemData(440, 0.0078125f, "1", false));
        drops.add(new ItemData(1141, 0.0078125f, "1", false));
        drops.add(new ItemData(882, 0.0390625f, "4", false));
        drops.add(new ItemData(886, 0.03125f, "2", false));
        drops.add(new ItemData(556, 0.015625f, "8", false));
        drops.add(new ItemData(557, 0.015625f, "4", false));
        drops.add(new ItemData(554, 0.015625f, "6", false));
        drops.add(new ItemData(562, 0.0078125f, "3", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
