package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class VerzikVitur implements BaseNPC {
    public List<ItemData> drops;

    public VerzikVitur() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22514, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
