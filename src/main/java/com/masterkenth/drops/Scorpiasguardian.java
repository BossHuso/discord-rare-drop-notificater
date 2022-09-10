package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Scorpiasguardian implements BaseNPC {
    public List<ItemData> drops;

    public Scorpiasguardian() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(13459, 0.04f, "1", false));
        drops.add(new ItemData(23490, 0.002347417840375587f, "1", false));
        drops.add(new ItemData(21257, 0.003787878787878788f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
