package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SlashBash implements BaseNPC {
    public List<ItemData> drops;

    public SlashBash() {
        drops = new ArrayList<>();
        drops.add(new ItemData(4812, 1f, "2", false));
        drops.add(new ItemData(4834, 1f, "3", false));
        drops.add(new ItemData(4818, 1f, "1", false));
        drops.add(new ItemData(6807, 0.0002f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
