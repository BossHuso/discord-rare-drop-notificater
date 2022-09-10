package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantdragon implements BaseNPC {
    public List<ItemData> drops;

    public Revenantdragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-24", false));
        drops.add(new ItemData(22299, 0.000125f, "1", false));
        drops.add(new ItemData(22302, 0.000125f, "1", false));
        drops.add(new ItemData(22305, 0.000125f, "1", false));
        drops.add(new ItemData(21816, 0.15082956259426847f, "1", false));
        drops.add(new ItemData(1391, 0.05025125628140704f, "3", false));
        drops.add(new ItemData(1163, 0.020100502512562814f, "1", false));
        drops.add(new ItemData(1127, 0.020100502512562814f, "1", false));
        drops.add(new ItemData(1079, 0.020100502512562814f, "1", false));
        drops.add(new ItemData(1201, 0.020100502512562814f, "1", false));
        drops.add(new ItemData(1347, 0.020100502512562814f, "1", false));
        drops.add(new ItemData(22557, 0.00005f, "1", false));
        drops.add(new ItemData(4087, 0.005025378159706518f, "1", false));
        drops.add(new ItemData(4585, 0.005025378159706518f, "1", false));
        drops.add(new ItemData(1215, 0.010050251256281407f, "1", false));
        drops.add(new ItemData(1305, 0.010050251256281407f, "1", false));
        drops.add(new ItemData(1149, 0.001625012187591407f, "1", false));
        drops.add(new ItemData(453, 0.06031363088057901f, "25-40", false));
        drops.add(new ItemData(2361, 0.06031363088057901f, "4-6", false));
        drops.add(new ItemData(451, 0.04020908725371934f, "1-3", false));
        drops.add(new ItemData(2363, 0.030147723846849564f, "1-2", false));
        drops.add(new ItemData(1747, 0.04020908725371934f, "3-4", false));
        drops.add(new ItemData(22550, 0.000025f, "1", false));
        drops.add(new ItemData(8782, 0.030147723846849564f, "5-12", false));
        drops.add(new ItemData(391, 0.04020908725371934f, "10-15", false));
        drops.add(new ItemData(1515, 0.04020908725371934f, "20-40", false));
        drops.add(new ItemData(1513, 0.020100502512562814f, "5-12", false));
        drops.add(new ItemData(1631, 0.010050251256281407f, "2-5", false));
        drops.add(new ItemData(5315, 0.0005f, "2-7", false));
        drops.add(new ItemData(5316, 0.0005f, "2-7", false));
        drops.add(new ItemData(21802, 0.05025125628140704f, "1", false));
        drops.add(new ItemData(3024, 0.030147723846849564f, "1-3", false));
        drops.add(new ItemData(9193, 0.030147723846849564f, "15-30", false));
        drops.add(new ItemData(22555, 0.000025f, "1", false));
        drops.add(new ItemData(9194, 0.030147723846849564f, "2-4", false));
        drops.add(new ItemData(563, 0.05025125628140704f, "20-45", false));
        drops.add(new ItemData(560, 0.05025125628140704f, "15-30", false));
        drops.add(new ItemData(565, 0.05025125628140704f, "10-20", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.011235955056179775f, "1", false));
        drops.add(new ItemData(21257, 0.00510204081632653f, "1", false));
        drops.add(new ItemData(22545, 0.000025f, "1", false));
        drops.add(new ItemData(21807, 0.0007500018750046876f, "1", false));
        drops.add(new ItemData(21810, 0.0005f, "1", false));
        drops.add(new ItemData(21813, 0.00025f, "1", false));
        drops.add(new ItemData(21804, 0.00037499953125058594f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
