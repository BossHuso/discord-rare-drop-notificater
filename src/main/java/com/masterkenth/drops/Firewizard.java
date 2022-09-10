package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Firewizard implements BaseNPC {
    public List<ItemData> drops;

    public Firewizard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(554, 0.95f, "5-10", false));
        drops.add(new ItemData(1442, 0.05f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
