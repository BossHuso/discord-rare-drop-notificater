package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class PossessedPriest implements BaseNPC {
    public List<ItemData> drops;

    public PossessedPriest() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(3032, 0.001953125f, "1", false));
        drops.add(new ItemData(2428, 0.001953125f, "1", false));
        drops.add(new ItemData(2432, 0.001953125f, "1", false));
        drops.add(new ItemData(3040, 0.001953125f, "1", false));
        drops.add(new ItemData(113, 0.001953125f, "1", false));
        drops.add(new ItemData(995, 0.03125f, "1-1260", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
