package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Kreearra implements BaseNPC {
    public List<ItemData> drops;

    public Kreearra() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(2503, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(9185, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(558, 0.06299212598425197f, "586-601", false));
        drops.add(new ItemData(892, 0.06299212598425197f, "100-105", false));
        drops.add(new ItemData(9144, 0.06299212598425197f, "20-25", false));
        drops.add(new ItemData(9244, 0.06299212598425197f, "5-10", false));
        drops.add(new ItemData(995, 0.34409448818897637f, "19500-20000", false));
        drops.add(new ItemData(169, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(163, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(217, 0.06299212598425197f, "8-13", false));
        drops.add(new ItemData(314, 1f, "1-16", false));
        drops.add(new ItemData(5303, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(995, 0.00984251968503937f, "20500-21000", false));
        drops.add(new ItemData(989, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(5315, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1289, 0.0024606299212598425f, "1", false));
        drops.add(new ItemData(11826, 0.0026246719160104987f, "1", false));
        drops.add(new ItemData(11828, 0.0026246719160104987f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(11830, 0.0026246719160104987f, "1", false));
        drops.add(new ItemData(12073, 0.004f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(12649, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(11810, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(11818, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11820, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11822, 0.0013123359580052493f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
