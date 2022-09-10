package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class CommanderZilyana implements BaseNPC {
    public List<ItemData> drops;

    public CommanderZilyana() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(811, 0.06299212598425197f, "35-40", false));
        drops.add(new ItemData(1201, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1093, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(2434, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(6687, 0.047244094488188976f, "3", false));
        drops.add(new ItemData(3024, 0.047244094488188976f, "3", false));
        drops.add(new ItemData(163, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(3042, 0.06299212598425197f, "3", false));
        drops.add(new ItemData(995, 0.24566929133858267f, "19500-20000", false));
        drops.add(new ItemData(1601, 0.06299212598425197f, "6", false));
        drops.add(new ItemData(11838, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(563, 0.06299212598425197f, "95-100", false));
        drops.add(new ItemData(207, 0.06299212598425197f, "5", false));
        drops.add(new ItemData(5295, 0.06299212598425197f, "2", false));
        drops.add(new ItemData(5316, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1289, 0.0024606299212598425f, "1", false));
        drops.add(new ItemData(13256, 0.003937007874015748f, "1", false));
        drops.add(new ItemData(11785, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(11814, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(12073, 0.004f, "1", false));
        drops.add(new ItemData(12651, 0.0002f, "1", false));
        drops.add(new ItemData(11818, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11820, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(11822, 0.0013123359580052493f, "1", false));
        drops.add(new ItemData(1123, 0.06299212598425197f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
