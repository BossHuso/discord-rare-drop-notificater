package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class JungleDemonhard implements BaseNPC {
    public List<ItemData> drops;

    public JungleDemonhard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(592, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
