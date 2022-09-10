package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GuardianofArmadyl implements BaseNPC {
    public List<ItemData> drops;

    public GuardianofArmadyl() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(87, 0.125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
