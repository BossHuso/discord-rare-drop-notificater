package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Hellhound implements BaseNPC {
    public List<ItemData> drops;

    public Hellhound() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25769, 1f, "1", false));
        drops.add(new ItemData(23490, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(21257, 0.0043859649122807015f, "1", false));
        drops.add(new ItemData(13233, 0.000030517578125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(2722, 0.015625f, "1", false));
        drops.add(new ItemData(23083, 0.010526315789473684f, "1", false));
        drops.add(new ItemData(19677, 0.00390625f, "1", false));
        drops.add(new ItemData(19679, 0.0026041666666666665f, "1", false));
        drops.add(new ItemData(19681, 0.0026041666666666665f, "1", false));
        drops.add(new ItemData(19683, 0.0026041666666666665f, "1", false));
        drops.add(new ItemData(13233, 0.00006103515625f, "1", false));
        drops.add(new ItemData(23490, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(21257, 0.005f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
