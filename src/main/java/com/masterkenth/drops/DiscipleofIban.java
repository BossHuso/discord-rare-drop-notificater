package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class DiscipleofIban implements BaseNPC {
    public List<ItemData> drops;

    public DiscipleofIban() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1035, 1f, "1", false));
        drops.add(new ItemData(1033, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
