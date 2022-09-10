package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Growler implements BaseNPC {
    public List<ItemData> drops;

    public Growler() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(563, 0.06299212598425197f, "5-10", false));
        drops.add(new ItemData(7946, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(7218, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(995, 0.4881889763779528f, "1300-1400", false));
        drops.add(new ItemData(207, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(231, 0.05511811023622047f, "5", false));
        drops.add(new ItemData(237, 0.06299212598425197f, "6", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(11838, 0.000186000372000744f, "1", false));
        drops.add(new ItemData(995, 0.007688015376030752f, "1400-1500", false));
        drops.add(new ItemData(11818, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11820, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(11822, 0.0006561679790026247f, "1", false));
        drops.add(new ItemData(995, 0.005905511811023622f, "1300-1400", false));
        drops.add(new ItemData(886, 0.06299212598425197f, "95-100", false));
        drops.add(new ItemData(808, 0.06299212598425197f, "95-100", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
