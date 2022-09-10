package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Earthwizard implements BaseNPC {
    public List<ItemData> drops;

    public Earthwizard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(557, 0.95f, "5-10", false));
        drops.add(new ItemData(1440, 0.05f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
