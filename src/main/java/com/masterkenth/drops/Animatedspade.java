package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Animatedspade implements BaseNPC {
    public List<ItemData> drops;

    public Animatedspade() {
        drops = new ArrayList<>();
        drops.add(new ItemData(952, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
