package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GuardBandit implements BaseNPC {
    public List<ItemData> drops;

    public GuardBandit() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(11941, 0.16666666666666666f, "1", false));
        drops.add(new ItemData(23490, 0.0009017132551848512f, "1", false));
        drops.add(new ItemData(21257, 0.0033444816053511705f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
