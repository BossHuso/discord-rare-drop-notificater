package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Wizard implements BaseNPC {
    public List<ItemData> drops;

    public Wizard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(554, 0.0234375f, "5", false));
        drops.add(new ItemData(558, 0.0234375f, "5", false));
        drops.add(new ItemData(555, 0.0234375f, "5", false));
        drops.add(new ItemData(556, 0.015625f, "12", false));
        drops.add(new ItemData(559, 0.015625f, "12", false));
        drops.add(new ItemData(557, 0.015625f, "12", false));
        drops.add(new ItemData(554, 0.015625f, "12", false));
        drops.add(new ItemData(558, 0.015625f, "12", false));
        drops.add(new ItemData(555, 0.015625f, "12", false));
        drops.add(new ItemData(565, 0.0078125f, "2", false));
        drops.add(new ItemData(1379, 0.0625f, "1", false));
        drops.add(new ItemData(563, 0.0078125f, "2", false));
        drops.add(new ItemData(1444, 0.0234375f, "1", false));
        drops.add(new ItemData(1448, 0.03125f, "1", false));
        drops.add(new ItemData(995, 0.1796875f, "1", false));
        drops.add(new ItemData(995, 0.0703125f, "2", false));
        drops.add(new ItemData(995, 0.0546875f, "18", false));
        drops.add(new ItemData(995, 0.0078125f, "30", false));
        drops.add(new ItemData(577, 0.0546875f, "1", false));
        drops.add(new ItemData(579, 0.0234375f, "1", false));
        drops.add(new ItemData(562, 0.0625f, "2", false));
        drops.add(new ItemData(561, 0.0625f, "2", false));
        drops.add(new ItemData(556, 0.0234375f, "5", false));
        drops.add(new ItemData(559, 0.0234375f, "5", false));
        drops.add(new ItemData(557, 0.0234375f, "5", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
