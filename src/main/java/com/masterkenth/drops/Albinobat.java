package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Albinobat implements BaseNPC {
    public List<ItemData> drops;

    public Albinobat() {
        drops = new ArrayList<>();
        drops.add(new ItemData(530, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
