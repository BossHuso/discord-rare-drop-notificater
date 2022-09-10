package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TzKalZuk implements BaseNPC {
    public List<ItemData> drops;

    public TzKalZuk() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21291, 0.01f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
