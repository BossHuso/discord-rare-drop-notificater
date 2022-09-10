package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zamorakwarrior implements BaseNPC {
    public List<ItemData> drops;

    public Zamorakwarrior() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1213, 0.04f, "1", false));
        drops.add(new ItemData(1301, 0.02f, "1", false));
        drops.add(new ItemData(1325, 0.04f, "1", false));
        drops.add(new ItemData(1207, 0.04f, "1", false));
        drops.add(new ItemData(1333, 0.02f, "1", false));
        drops.add(new ItemData(995, 0.8f, "100", false));
        drops.add(new ItemData(379, 0.04f, "3", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
