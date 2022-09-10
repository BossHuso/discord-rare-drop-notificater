package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class PoisonScorpion implements BaseNPC {
    public List<ItemData> drops;

    public PoisonScorpion() {
        drops = new ArrayList<>();
        drops.add(new ItemData(13459, 0.04f, "1", false));
        drops.add(new ItemData(23182, 0.01f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
