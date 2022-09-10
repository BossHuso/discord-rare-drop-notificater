package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Muttadile implements BaseNPC {
    public List<ItemData> drops;

    public Muttadile() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(20897, 1f, "1", false));
        drops.add(new ItemData(20996, 1f, "1", false));
        drops.add(new ItemData(20972, 1f, "1", false));
        drops.add(new ItemData(20984, 1f, "1", false));
        drops.add(new ItemData(20960, 1f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
