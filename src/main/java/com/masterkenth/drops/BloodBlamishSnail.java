package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BloodBlamishSnail implements BaseNPC {
    public List<ItemData> drops;

    public BloodBlamishSnail() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3367, 1f, "1", false));
        drops.add(new ItemData(3347, 1f, "1", false));
        drops.add(new ItemData(3357, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
