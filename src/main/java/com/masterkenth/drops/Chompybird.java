package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Chompybird implements BaseNPC {
    public List<ItemData> drops;

    public Chompybird() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(2876, 1f, "1", false));
        drops.add(new ItemData(13071, 0.002f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
