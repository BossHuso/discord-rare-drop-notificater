package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dessourthard implements BaseNPC {
    public List<ItemData> drops;

    public Dessourthard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1975, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
