package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cavegoblinguard implements BaseNPC {
    public List<ItemData> drops;

    public Cavegoblinguard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(5018, 0.15625f, "1", false));
        drops.add(new ItemData(5016, 0.15625f, "1", false));
        drops.add(new ItemData(1101, 0.15625f, "1", false));
        drops.add(new ItemData(995, 0.15625f, "12", false));
        drops.add(new ItemData(4537, 0.15625f, "1", false));
        drops.add(new ItemData(590, 0.15625f, "1", false));
        drops.add(new ItemData(7905, 0.25f, "1", false));
        drops.add(new ItemData(6801, 0.0002f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
