package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class NylocasVasilias implements BaseNPC {
    public List<ItemData> drops;

    public NylocasVasilias() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22508, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
