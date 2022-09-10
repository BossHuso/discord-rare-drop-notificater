package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class LoarShade implements BaseNPC {
    public List<ItemData> drops;

    public LoarShade() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3396, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
