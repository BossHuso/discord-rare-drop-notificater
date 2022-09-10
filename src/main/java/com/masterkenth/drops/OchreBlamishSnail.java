package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class OchreBlamishSnail implements BaseNPC {
    public List<ItemData> drops;

    public OchreBlamishSnail() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3349, 1f, "1", false));
        drops.add(new ItemData(3359, 1f, "1", false));
        drops.add(new ItemData(3363, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
