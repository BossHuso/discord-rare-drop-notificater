package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Spider implements BaseNPC {
    public List<ItemData> drops;

    public Spider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.0005070993914807302f, "1", false));
        drops.add(new ItemData(21257, 0.003134796238244514f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
