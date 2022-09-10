package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class MonkeyZombie implements BaseNPC {
    public List<ItemData> drops;

    public MonkeyZombie() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3185, 1f, "1", false));
        drops.add(new ItemData(3186, 1f, "1", false));
        drops.add(new ItemData(7854, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
