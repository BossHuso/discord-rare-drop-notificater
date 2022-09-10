package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class PenanceRanger implements BaseNPC {
    public List<ItemData> drops;

    public PenanceRanger() {
        drops = new ArrayList<>();
        drops.add(new ItemData(10533, 1f, "2", false));
        drops.add(new ItemData(10531, 1f, "2", false));
        drops.add(new ItemData(10532, 1f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
