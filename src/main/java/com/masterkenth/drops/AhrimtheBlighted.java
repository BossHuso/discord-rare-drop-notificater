package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AhrimtheBlighted implements BaseNPC {
    public List<ItemData> drops;

    public AhrimtheBlighted() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23083, 0.01f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
