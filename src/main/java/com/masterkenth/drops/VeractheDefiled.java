package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class VeractheDefiled implements BaseNPC {
    public List<ItemData> drops;

    public VeractheDefiled() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23083, 0.010309278350515464f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
