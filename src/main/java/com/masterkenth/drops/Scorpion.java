package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Scorpion implements BaseNPC {
    public List<ItemData> drops;

    public Scorpion() {
        drops = new ArrayList<>();
        drops.add(new ItemData(4569, 1f, "1", false));
        drops.add(new ItemData(11941, 0.1f, "1", false));
        drops.add(new ItemData(13459, 0.04f, "1", false));
        drops.add(new ItemData(23182, 0.01f, "1", false));
        drops.add(new ItemData(23490, 0.0007112375533428165f, "1", false));
        drops.add(new ItemData(21257, 0.003257328990228013f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
