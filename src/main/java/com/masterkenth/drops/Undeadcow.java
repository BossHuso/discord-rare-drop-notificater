package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Undeadcow implements BaseNPC {
    public List<ItemData> drops;

    public Undeadcow() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1739, 1f, "1", false));
        drops.add(new ItemData(4287, 1f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(7890, 0.25f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
