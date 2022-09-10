package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BrassicanMage implements BaseNPC {
    public List<ItemData> drops;

    public BrassicanMage() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(205, 0.010940919037199124f, "1", false));
        drops.add(new ItemData(207, 0.00859106529209622f, "1", false));
        drops.add(new ItemData(209, 0.00625f, "1", false));
        drops.add(new ItemData(211, 0.0046882325363338025f, "1", false));
        drops.add(new ItemData(213, 0.00390625f, "1", false));
        drops.add(new ItemData(215, 0.003125f, "1", false));
        drops.add(new ItemData(2485, 0.002343566908835247f, "1", false));
        drops.add(new ItemData(217, 0.002343566908835247f, "1", false));
        drops.add(new ItemData(5318, 0.03003003003003003f, "1-4", false));
        drops.add(new ItemData(5319, 0.014992503748125937f, "1-3", false));
        drops.add(new ItemData(1385, 0.02f, "1", false));
        drops.add(new ItemData(5324, 0.007501875468867217f, "1-3", false));
        drops.add(new ItemData(5322, 0.0037495313085864268f, "1-2", false));
        drops.add(new ItemData(5320, 0.0018751171948246765f, "1-2", false));
        drops.add(new ItemData(5323, 0.0009374707040404988f, "1", false));
        drops.add(new ItemData(5321, 0.0004687573243331927f, "1", false));
        drops.add(new ItemData(22879, 0.0004687573243331927f, "1", false));
        drops.add(new ItemData(1965, 0.1f, "10-19", false));
        drops.add(new ItemData(995, 0.2f, "50-249", false));
        drops.add(new ItemData(7936, 0.14f, "25", false));
        drops.add(new ItemData(1623, 0.02f, "1", false));
        drops.add(new ItemData(1399, 0.02f, "1", false));
        drops.add(new ItemData(2434, 0.04f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(556, 0.1f, "5-24", false));
        drops.add(new ItemData(557, 0.1f, "5-24", false));
        drops.add(new ItemData(560, 0.1f, "5-24", false));
        drops.add(new ItemData(199, 0.025f, "1", false));
        drops.add(new ItemData(201, 0.01876172607879925f, "1", false));
        drops.add(new ItemData(203, 0.014064697609001406f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
