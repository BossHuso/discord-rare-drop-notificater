package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SergeantSteelwill implements BaseNPC {
    public List<ItemData> drops;

    public SergeantSteelwill() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(886, 0.05511811023622047f, "95-100", false));
        drops.add(new ItemData(808, 0.06299212598425197f, "95-100", false));
        drops.add(new ItemData(561, 0.06299212598425197f, "15-20", false));
        drops.add(new ItemData(564, 0.06299212598425197f, "25-30", false));
        drops.add(new ItemData(385, 0.06299212598425197f, "2", false));
        drops.add(new ItemData(7054, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(995, 0.5196850393700787f, "1400-1500", false));
        drops.add(new ItemData(225, 0.06299212598425197f, "5", false));
        drops.add(new ItemData(9741, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(157, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(11832, 0.00006151574803149606f, "1", false));
        drops.add(new ItemData(1917, 0.16666666666666666f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(6801, 0.0002f, "1", false));
        drops.add(new ItemData(11834, 0.00006151574803149606f, "1", false));
        drops.add(new ItemData(11836, 0.00006151574803149606f, "1", false));
        drops.add(new ItemData(995, 0.007689468503937008f, "1400-1500", false));
        drops.add(new ItemData(11818, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11820, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11822, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(995, 0.005905511811023622f, "1400-1500", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
