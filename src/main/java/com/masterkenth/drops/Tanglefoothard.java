package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Tanglefoothard implements BaseNPC {
    public List<ItemData> drops;

    public Tanglefoothard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(7410, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
