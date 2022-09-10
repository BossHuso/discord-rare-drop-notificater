package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Magicaxe implements BaseNPC {
    public List<ItemData> drops;

    public Magicaxe() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1363, 1f, "1", false));
        drops.add(new ItemData(1373, 0.002f, "1", false));
        drops.add(new ItemData(2801, 0.00390625f, "1", false));
        drops.add(new ItemData(19677, 0.0033003300330033004f, "1", false));
        drops.add(new ItemData(19679, 0.002197802197802198f, "1", false));
        drops.add(new ItemData(19681, 0.002197802197802198f, "1", false));
        drops.add(new ItemData(19683, 0.002197802197802198f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.001876172607879925f, "1", false));
        drops.add(new ItemData(21257, 0.0035211267605633804f, "1", false));
        drops.add(new ItemData(1363, 0.95f, "1", false));
        drops.add(new ItemData(1365, 0.02f, "1", false));
        drops.add(new ItemData(1369, 0.02f, "1", false));
        drops.add(new ItemData(1371, 0.008f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
