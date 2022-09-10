package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TzTokJad implements BaseNPC {
    public List<ItemData> drops;

    public TzTokJad() {
        drops = new ArrayList<>();
        drops.add(new ItemData(13225, 0.005f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
