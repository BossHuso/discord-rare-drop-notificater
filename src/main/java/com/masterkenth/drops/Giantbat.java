package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Giantbat implements BaseNPC {
    public List<ItemData> drops;

    public Giantbat() {
        drops = new ArrayList<>();
        drops.add(new ItemData(530, 1f, "1", false));
        drops.add(new ItemData(7827, 1f, "1", false));
        drops.add(new ItemData(11941, 0.2f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
