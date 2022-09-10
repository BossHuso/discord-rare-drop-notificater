package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Airwizard implements BaseNPC {
    public List<ItemData> drops;

    public Airwizard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(556, 0.95f, "5-10", false));
        drops.add(new ItemData(1438, 0.05f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
