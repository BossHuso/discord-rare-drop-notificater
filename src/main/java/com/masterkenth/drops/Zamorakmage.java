package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zamorakmage implements BaseNPC {
    public List<ItemData> drops;

    public Zamorakmage() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(554, 0.04f, "7", false));
        drops.add(new ItemData(555, 0.04f, "6", false));
        drops.add(new ItemData(556, 0.04f, "5", false));
        drops.add(new ItemData(561, 0.04f, "2", false));
        drops.add(new ItemData(563, 0.02f, "2", false));
        drops.add(new ItemData(565, 0.02f, "1", false));
        drops.add(new ItemData(995, 0.8f, "100", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
