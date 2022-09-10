package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Karamel implements BaseNPC {
    public List<ItemData> drops;

    public Karamel() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6794, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
