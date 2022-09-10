package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BarkBlamishSnail implements BaseNPC {
    public List<ItemData> drops;

    public BarkBlamishSnail() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3353, 1f, "1", false));
        drops.add(new ItemData(3365, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
