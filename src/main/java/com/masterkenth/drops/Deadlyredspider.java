package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Deadlyredspider implements BaseNPC {
    public List<ItemData> drops;

    public Deadlyredspider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11941, 0.25f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.0013623978201634877f, "1", false));
        drops.add(new ItemData(21257, 0.003424657534246575f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
