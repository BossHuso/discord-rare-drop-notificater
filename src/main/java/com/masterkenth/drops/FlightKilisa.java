package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class FlightKilisa implements BaseNPC {
    public List<ItemData> drops;

    public FlightKilisa() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.005905511811023622f, "1000-1100", false));
        drops.add(new ItemData(886, 0.05511811023622047f, "91-101", false));
        drops.add(new ItemData(808, 0.06299212598425197f, "91-101", false));
        drops.add(new ItemData(4697, 0.06299212598425197f, "10-15", false));
        drops.add(new ItemData(391, 0.06299212598425197f, "2", false));
        drops.add(new ItemData(7058, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(995, 0.5511811023622047f, "1000-1100", false));
        drops.add(new ItemData(6693, 0.06299212598425197f, "2", false));
        drops.add(new ItemData(213, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(23083, 0.011363636363636364f, "1", false));
        drops.add(new ItemData(314, 1f, "1-11", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(11826, 0.000062000124000248f, "1", false));
        drops.add(new ItemData(11828, 0.000062000124000248f, "1", false));
        drops.add(new ItemData(11830, 0.000062000124000248f, "1", false));
        drops.add(new ItemData(995, 0.007688015376030752f, "1000-1100", false));
        drops.add(new ItemData(11818, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11820, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11822, 0.0006561679790026247f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
