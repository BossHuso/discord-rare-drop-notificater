package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CorruptLizardman implements BaseNPC {
    public List<ItemData> drops;

    public CorruptLizardman() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(13383, 1f, "3", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
