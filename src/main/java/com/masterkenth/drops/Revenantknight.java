package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantknight implements BaseNPC {
    public List<ItemData> drops;

    public Revenantknight() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-24", false));
        drops.add(new ItemData(22299, 0.000125f, "1", false));
        drops.add(new ItemData(22302, 0.000125f, "1", false));
        drops.add(new ItemData(22305, 0.000125f, "1", false));
        drops.add(new ItemData(21816, 0.14084507042253522f, "1", false));
        drops.add(new ItemData(1391, 0.04697040864255519f, "3", false));
        drops.add(new ItemData(1163, 0.0187863986473793f, "1", false));
        drops.add(new ItemData(1127, 0.0187863986473793f, "1", false));
        drops.add(new ItemData(1079, 0.0187863986473793f, "1", false));
        drops.add(new ItemData(1201, 0.0187863986473793f, "1", false));
        drops.add(new ItemData(1347, 0.0187863986473793f, "1", false));
        drops.add(new ItemData(22557, 0.00005f, "1", false));
        drops.add(new ItemData(4087, 0.004697040864255519f, "1", false));
        drops.add(new ItemData(4585, 0.004697040864255519f, "1", false));
        drops.add(new ItemData(1215, 0.009394081728511038f, "1", false));
        drops.add(new ItemData(1305, 0.009394081728511038f, "1", false));
        drops.add(new ItemData(1149, 0.001625012187591407f, "1", false));
        drops.add(new ItemData(453, 0.05636978579481398f, "25-40", false));
        drops.add(new ItemData(2361, 0.05636978579481398f, "4-6", false));
        drops.add(new ItemData(451, 0.03757985719654265f, "1-3", false));
        drops.add(new ItemData(2363, 0.02818489289740699f, "1-2", false));
        drops.add(new ItemData(1747, 0.03757985719654265f, "3-4", false));
        drops.add(new ItemData(22550, 0.000025f, "1", false));
        drops.add(new ItemData(8782, 0.02818489289740699f, "5-12", false));
        drops.add(new ItemData(391, 0.03757985719654265f, "10-15", false));
        drops.add(new ItemData(1515, 0.03757985719654265f, "20-40", false));
        drops.add(new ItemData(1513, 0.0187863986473793f, "5-12", false));
        drops.add(new ItemData(1631, 0.009394081728511038f, "2-5", false));
        drops.add(new ItemData(5315, 0.0005f, "2-7", false));
        drops.add(new ItemData(5316, 0.0005f, "2-7", false));
        drops.add(new ItemData(995, 0.06501950585175553f, "1-276", false));
        drops.add(new ItemData(21802, 0.04697040864255519f, "1", false));
        drops.add(new ItemData(3024, 0.02818489289740699f, "1-3", false));
        drops.add(new ItemData(22555, 0.000025f, "1", false));
        drops.add(new ItemData(9193, 0.02818489289740699f, "15-30", false));
        drops.add(new ItemData(9194, 0.02818489289740699f, "2-4", false));
        drops.add(new ItemData(563, 0.04697040864255519f, "20-45", false));
        drops.add(new ItemData(560, 0.04697040864255519f, "15-30", false));
        drops.add(new ItemData(565, 0.04697040864255519f, "10-20", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(21257, 0.0048543689320388345f, "1", false));
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
