package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Babygreendragon implements BaseNPC {
    public List<ItemData> drops;

    public Babygreendragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(534, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
