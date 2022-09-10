package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TstanonKarlak implements BaseNPC {
    public List<ItemData> drops;

    public TstanonKarlak() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25772, 1f, "1", false));
        drops.add(new ItemData(560, 0.06299212598425197f, "5-10", false));
        drops.add(new ItemData(565, 0.06299212598425197f, "5-10", false));
        drops.add(new ItemData(995, 0.5196850393700787f, "1300-1400", false));
        drops.add(new ItemData(385, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(7060, 0.06299212598425197f, "2", false));
        drops.add(new ItemData(245, 0.06299212598425197f, "5-10", false));
        drops.add(new ItemData(145, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(157, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(11824, 0.000186000372000744f, "1", false));
        drops.add(new ItemData(995, 0.007688015376030752f, "1300-1400", false));
        drops.add(new ItemData(11818, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11820, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11822, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(995, 0.005905511811023622f, "1300-1400", false));
        drops.add(new ItemData(886, 0.05511811023622047f, "95-100", false));
        drops.add(new ItemData(808, 0.06299212598425197f, "95-100", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
