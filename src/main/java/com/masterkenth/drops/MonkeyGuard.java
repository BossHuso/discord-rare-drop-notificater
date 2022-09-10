package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class MonkeyGuard implements BaseNPC {
    public List<ItemData> drops;

    public MonkeyGuard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3181, 1f, "1", false));
        drops.add(new ItemData(3182, 1f, "1", false));
        drops.add(new ItemData(13450, 0.02857142857142857f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
