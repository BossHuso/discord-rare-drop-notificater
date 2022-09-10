package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class MutatedBloodveld implements BaseNPC {
    public List<ItemData> drops;

    public MutatedBloodveld() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25769, 1f, "1", false));
        drops.add(new ItemData(1147, 0.015625f, "1", false));
        drops.add(new ItemData(4125, 0.0078125f, "1", false));
        drops.add(new ItemData(1301, 0.0078125f, "1", false));
        drops.add(new ItemData(1213, 0.0078125f, "1", false));
        drops.add(new ItemData(1373, 0.0078125f, "1", false));
        drops.add(new ItemData(556, 0.0546875f, "105", false));
        drops.add(new ItemData(554, 0.0703125f, "75", false));
        drops.add(new ItemData(565, 0.1015625f, "30", false));
        drops.add(new ItemData(565, 0.078125f, "7", false));
        drops.add(new ItemData(566, 0.0546875f, "4", false));
        drops.add(new ItemData(1159, 0.0625f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "350", false));
        drops.add(new ItemData(995, 0.0234375f, "11", false));
        drops.add(new ItemData(1777, 0.03125f, "1", false));
        drops.add(new ItemData(444, 0.0546875f, "1", false));
        drops.add(new ItemData(2327, 0.0390625f, "1", false));
        drops.add(new ItemData(2359, 0.0390625f, "1", false));
        drops.add(new ItemData(1698, 0.015625f, "1", false));
        drops.add(new ItemData(1369, 0.046875f, "1", false));
        drops.add(new ItemData(1151, 0.0390625f, "1", false));
        drops.add(new ItemData(1355, 0.0390625f, "1", false));
        drops.add(new ItemData(20543, 1f, "1", false));
        drops.add(new ItemData(13495, 0.05f, "1", false));
        drops.add(new ItemData(23962, 0.041666666666666664f, "1", false));
        drops.add(new ItemData(23083, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(19677, 0.004545454545454545f, "1", false));
        drops.add(new ItemData(867, 0.0234375f, "2", false));
        drops.add(new ItemData(19679, 0.0030303030303030303f, "1", false));
        drops.add(new ItemData(19681, 0.0030303030303030303f, "1", false));
        drops.add(new ItemData(19683, 0.0030303030303030303f, "1", false));
        drops.add(new ItemData(1111, 0.0234375f, "1", false));
        drops.add(new ItemData(1331, 0.0234375f, "1", false));
        drops.add(new ItemData(1121, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
