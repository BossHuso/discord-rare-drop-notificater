package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class KrilTsutsaroth implements BaseNPC {
    public List<ItemData> drops;

    public KrilTsutsaroth() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25778, 1f, "1", false));
        drops.add(new ItemData(1333, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1123, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1079, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(5698, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(145, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(157, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(3026, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(189, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(995, 0.2889763779527559f, "19500-20000", false));
        drops.add(new ItemData(2485, 0.06299212598425197f, "10", false));
        drops.add(new ItemData(11787, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(5302, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(560, 0.06299212598425197f, "120-125", false));
        drops.add(new ItemData(565, 0.06299212598425197f, "80-85", false));
        drops.add(new ItemData(1289, 0.0024606299212598425f, "1", false));
        drops.add(new ItemData(11824, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(11791, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(12073, 0.004f, "1", false));
        drops.add(new ItemData(11816, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(12652, 0.0002f, "1", false));
        drops.add(new ItemData(11818, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11820, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11822, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(5626, 0.06299212598425197f, "295-300", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
