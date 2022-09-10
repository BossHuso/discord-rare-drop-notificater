package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BruiseBlamishSnail implements BaseNPC {
    public List<ItemData> drops;

    public BruiseBlamishSnail() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3367, 1f, "1", false));
        drops.add(new ItemData(3351, 1f, "1", false));
        drops.add(new ItemData(3361, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
