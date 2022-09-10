package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class MyreBlamishSnail implements BaseNPC {
    public List<ItemData> drops;

    public MyreBlamishSnail() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3345, 1f, "1", false));
        drops.add(new ItemData(3355, 1f, "1", false));
        drops.add(new ItemData(3363, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
