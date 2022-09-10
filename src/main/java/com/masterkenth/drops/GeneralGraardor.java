package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GeneralGraardor implements BaseNPC {
    public List<ItemData> drops;

    public GeneralGraardor() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(1319, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1127, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1275, 0.047244094488188976f, "1", false));
        drops.add(new ItemData(995, 0.24960629921259841f, "19500-20000", false));
        drops.add(new ItemData(3051, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(5300, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(3024, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(449, 0.06299212598425197f, "15-20", false));
        drops.add(new ItemData(453, 0.06299212598425197f, "115-120", false));
        drops.add(new ItemData(1513, 0.06299212598425197f, "15-20", false));
        drops.add(new ItemData(11832, 0.0026246719160104987f, "1", false));
        drops.add(new ItemData(561, 0.06299212598425197f, "65-70", false));
        drops.add(new ItemData(995, 0.00984251968503937f, "20100-20600", false));
        drops.add(new ItemData(1289, 0.0024606299212598425f, "1", false));
        drops.add(new ItemData(11834, 0.0026246719160104987f, "1", false));
        drops.add(new ItemData(11836, 0.0026246719160104987f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(12073, 0.004f, "1", false));
        drops.add(new ItemData(11812, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(12650, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(11818, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11820, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11822, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(1303, 0.06299212598425197f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
