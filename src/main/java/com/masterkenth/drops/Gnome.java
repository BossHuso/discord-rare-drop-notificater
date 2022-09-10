package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Gnome implements BaseNPC {
    public List<ItemData> drops;

    public Gnome() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.234375f, "300", false));
        drops.add(new ItemData(557, 0.0390625f, "1", false));
        drops.add(new ItemData(444, 0.0625f, "1", false));
        drops.add(new ItemData(2150, 0.21875f, "1", false));
        drops.add(new ItemData(2162, 0.4296875f, "1", false));
        drops.add(new ItemData(569, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
