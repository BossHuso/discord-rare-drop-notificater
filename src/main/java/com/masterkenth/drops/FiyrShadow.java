package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class FiyrShadow implements BaseNPC {
    public List<ItemData> drops;

    public FiyrShadow() {
        drops = new ArrayList<>();
        drops.add(new ItemData(3404, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
