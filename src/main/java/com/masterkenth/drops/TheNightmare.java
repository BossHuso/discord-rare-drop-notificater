package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TheNightmare implements BaseNPC {
    public List<ItemData> drops;

    public TheNightmare() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(24514, 0.0005555555555555556f, "1", false));
        drops.add(new ItemData(890, 0.03f, "32-533", false));
        drops.add(new ItemData(892, 0.03f, "12-539", false));
        drops.add(new ItemData(564, 0.04f, "15-218", false));
        drops.add(new ItemData(561, 0.04f, "6-165", false));
        drops.add(new ItemData(560, 0.04f, "24-176", false));
        drops.add(new ItemData(565, 0.04f, "13-129", false));
        drops.add(new ItemData(566, 0.04f, "12-126", false));
        drops.add(new ItemData(2, 0.001953125f, "72-192", false));
        drops.add(new ItemData(1621, 0.03f, "1-41", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1619, 0.03f, "2-35", false));
        drops.add(new ItemData(1515, 0.04f, "14-121", false));
        drops.add(new ItemData(1513, 0.04f, "3-55", false));
        drops.add(new ItemData(444, 0.04f, "14-174", false));
        drops.add(new ItemData(453, 0.04f, "16-253", false));
        drops.add(new ItemData(447, 0.04f, "15-168", false));
        drops.add(new ItemData(449, 0.04f, "8-50", false));
        drops.add(new ItemData(215, 0.04f, "1-14", false));
        drops.add(new ItemData(219, 0.04f, "1-16", false));
        drops.add(new ItemData(5300, 0.001953125f, "1-6", false));
        drops.add(new ItemData(24422, 0.0025f, "1", false));
        drops.add(new ItemData(385, 0.06f, "1-15", false));
        drops.add(new ItemData(365, 0.06f, "1-18", false));
        drops.add(new ItemData(139, 0.05f, "1-10", false));
        drops.add(new ItemData(6687, 0.05f, "1-10", false));
        drops.add(new ItemData(189, 0.05f, "1-10", false));
        drops.add(new ItemData(10927, 0.05f, "1-11", false));
        drops.add(new ItemData(995, 0.02f, "2717-43854", false));
        drops.add(new ItemData(12073, 0.005263157894736842f, "1", false));
        drops.add(new ItemData(24491, 0.00125f, "1", false));
        drops.add(new ItemData(24495, 0.0005263157894736842f, "1", false));
        drops.add(new ItemData(24419, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(24420, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(24421, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(24417, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(24517, 0.0005555555555555556f, "1", false));
        drops.add(new ItemData(24511, 0.0005555555555555556f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
