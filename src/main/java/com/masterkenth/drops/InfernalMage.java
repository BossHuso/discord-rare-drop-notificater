package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class InfernalMage implements BaseNPC {
    public List<ItemData> drops;

    public InfernalMage() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(556, 0.0234375f, "10", false));
        drops.add(new ItemData(555, 0.0234375f, "10", false));
        drops.add(new ItemData(556, 0.015625f, "18", false));
        drops.add(new ItemData(555, 0.015625f, "18", false));
        drops.add(new ItemData(557, 0.015625f, "18", false));
        drops.add(new ItemData(554, 0.015625f, "18", false));
        drops.add(new ItemData(558, 0.015625f, "18", false));
        drops.add(new ItemData(559, 0.015625f, "18", false));
        drops.add(new ItemData(565, 0.015625f, "4", false));
        drops.add(new ItemData(560, 0.140625f, "7", false));
        drops.add(new ItemData(4107, 0.001953125f, "1", false));
        drops.add(new ItemData(995, 0.1484375f, "1", false));
        drops.add(new ItemData(995, 0.109375f, "2", false));
        drops.add(new ItemData(995, 0.0625f, "4", false));
        drops.add(new ItemData(995, 0.0234375f, "29", false));
        drops.add(new ItemData(4099, 0.001953125f, "1", false));
        drops.add(new ItemData(1379, 0.0625f, "1", false));
        drops.add(new ItemData(1387, 0.0078125f, "1", false));
        drops.add(new ItemData(3053, 0.001f, "1", false));
        drops.add(new ItemData(557, 0.046875f, "10", false));
        drops.add(new ItemData(554, 0.046875f, "10", false));
        drops.add(new ItemData(557, 0.03125f, "36", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
