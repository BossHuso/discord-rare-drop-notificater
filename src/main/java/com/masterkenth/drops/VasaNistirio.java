package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class VasaNistirio implements BaseNPC {
    public List<ItemData> drops;

    public VasaNistirio() {
        drops = new ArrayList<>();
        drops.add(new ItemData(20888, 1f, "1", false));
        drops.add(new ItemData(20911, 1f, "5", false));
        drops.add(new ItemData(20984, 1f, "2", false));
        drops.add(new ItemData(20936, 1f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
