package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TzHaarXil implements BaseNPC {
    public List<ItemData> drops;

    public TzHaarXil() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6522, 0.001953125f, "9-29", false));
        drops.add(new ItemData(6523, 0.001953125f, "1", false));
        drops.add(new ItemData(6525, 0.001953125f, "1", false));
        drops.add(new ItemData(6568, 0.001953125f, "1", false));
        drops.add(new ItemData(6529, 0.125f, "1-59", false));
        drops.add(new ItemData(1623, 0.03125f, "1", false));
        drops.add(new ItemData(1621, 0.03125f, "1", false));
        drops.add(new ItemData(1619, 0.03125f, "1", false));
        drops.add(new ItemData(1617, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
