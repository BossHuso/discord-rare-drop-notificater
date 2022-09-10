package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class PestilentBloat implements BaseNPC {
    public List<ItemData> drops;

    public PestilentBloat() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22506, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
