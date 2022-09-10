package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Feverspider implements BaseNPC {
    public List<ItemData> drops;

    public Feverspider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6718, 1f, "1", false));
        drops.add(new ItemData(213, 0.08333333333333333f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
