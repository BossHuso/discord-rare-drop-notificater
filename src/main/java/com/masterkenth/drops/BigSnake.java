package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BigSnake implements BaseNPC {
    public List<ItemData> drops;

    public BigSnake() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(7576, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
