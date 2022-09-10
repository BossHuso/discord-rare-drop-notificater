package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Runedragon implements BaseNPC {
    public List<ItemData> drops;

    public Runedragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(4585, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1149, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(892, 0.06299212598425197f, "30-40", false));
        drops.add(new ItemData(21880, 0.06299212598425197f, "30-50", false));
        drops.add(new ItemData(562, 0.05511811023622047f, "75-150", false));
        drops.add(new ItemData(560, 0.05511811023622047f, "50-100", false));
        drops.add(new ItemData(211, 0.01968503937007874f, "1", false));
        drops.add(new ItemData(207, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(3051, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(219, 0.011810558639423645f, "1", false));
        drops.add(new ItemData(2363, 1f, "1", false));
        drops.add(new ItemData(9381, 0.08661417322834646f, "20-30", false));
        drops.add(new ItemData(19580, 0.11811023622047244f, "20-30", false));
        drops.add(new ItemData(1615, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(451, 0.047244094488188976f, "2-5", false));
        drops.add(new ItemData(19582, 0.03937007874015748f, "30-40", false));
        drops.add(new ItemData(21930, 0.007874015748031496f, "20-40", false));
        drops.add(new ItemData(22118, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1127, 0.07086614173228346f, "1", false));
        drops.add(new ItemData(1303, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1432, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(12073, 0.0033333333333333335f, "1", false));
        drops.add(new ItemData(21918, 0.00125f, "1", false));
        drops.add(new ItemData(22103, 0.0002f, "1", false));
        drops.add(new ItemData(11286, 0.000125f, "1", false));
        drops.add(new ItemData(1333, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(1347, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(1079, 0.047244094488188976f, "1", false));
        drops.add(new ItemData(4087, 0.007874015748031496f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
