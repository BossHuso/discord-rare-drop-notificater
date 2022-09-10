package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Spiritualranger implements BaseNPC {
    public List<ItemData> drops;

    public Spiritualranger() {
        drops = new ArrayList<>();
        drops.add(new ItemData(843, 0.0390625f, "1", false));
        drops.add(new ItemData(559, 0.03125f, "12", false));
        drops.add(new ItemData(892, 0.015625f, "5", false));
        drops.add(new ItemData(890, 0.0078125f, "12", false));
        drops.add(new ItemData(5626, 0.0234375f, "3", false));
        drops.add(new ItemData(2538, 0.015625f, "4", false));
        drops.add(new ItemData(53, 0.078125f, "12", false));
        drops.add(new ItemData(40, 0.0859375f, "5", false));
        drops.add(new ItemData(43, 0.0703125f, "13", false));
        drops.add(new ItemData(1777, 0.140625f, "7", false));
        drops.add(new ItemData(687, 0.0078125f, "1", false));
        drops.add(new ItemData(9179, 0.0234375f, "1", false));
        drops.add(new ItemData(56, 0.0703125f, "12", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.0136986301369863f, "1", false));
        drops.add(new ItemData(21257, 0.004016064257028112f, "1", false));
        drops.add(new ItemData(851, 0.03125f, "1", false));
        drops.add(new ItemData(861, 0.0078125f, "1-2", false));
        drops.add(new ItemData(5619, 0.0859375f, "1", false));
        drops.add(new ItemData(886, 0.03125f, "12", false));
        drops.add(new ItemData(884, 0.1171875f, "12", false));
        drops.add(new ItemData(882, 0.1015625f, "16", false));
        drops.add(new ItemData(5616, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
