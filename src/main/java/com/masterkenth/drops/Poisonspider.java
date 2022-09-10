package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Poisonspider implements BaseNPC {
    public List<ItemData> drops;

    public Poisonspider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23182, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.005681818181818182f, "1", false));
        drops.add(new ItemData(21257, 0.0037174721189591076f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
