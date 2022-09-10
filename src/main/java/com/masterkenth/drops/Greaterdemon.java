package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Greaterdemon implements BaseNPC {
    public List<ItemData> drops;

    public Greaterdemon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25769, 1f, "1", false));
        drops.add(new ItemData(560, 0.0234375f, "5", false));
        drops.add(new ItemData(554, 0.0078125f, "37", false));
        drops.add(new ItemData(995, 0.3125f, "132", false));
        drops.add(new ItemData(995, 0.2265625f, "44", false));
        drops.add(new ItemData(995, 0.078125f, "220", false));
        drops.add(new ItemData(995, 0.0546875f, "11", false));
        drops.add(new ItemData(995, 0.0078125f, "460", false));
        drops.add(new ItemData(361, 0.0234375f, "1", false));
        drops.add(new ItemData(2357, 0.015625f, "1", false));
        drops.add(new ItemData(1734, 0.0078125f, "10", false));
        drops.add(new ItemData(1311, 0.03125f, "1", false));
        drops.add(new ItemData(1353, 0.0234375f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(13501, 0.025f, "1", false));
        drops.add(new ItemData(23083, 0.008928571428571428f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(19677, 0.00390625f, "1", false));
        drops.add(new ItemData(19679, 0.0025974025974025974f, "1", false));
        drops.add(new ItemData(19681, 0.0025974025974025974f, "1", false));
        drops.add(new ItemData(19683, 0.0025974025974025974f, "1", false));
        drops.add(new ItemData(1365, 0.0234375f, "1", false));
        drops.add(new ItemData(23490, 0.010416666666666666f, "1", false));
        drops.add(new ItemData(21257, 0.004016064257028112f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1073, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.0625f, "75", false));
        drops.add(new ItemData(562, 0.0234375f, "15", false));
        drops.add(new ItemData(1317, 0.03125f, "1", false));
        drops.add(new ItemData(1357, 0.0234375f, "1", false));
        drops.add(new ItemData(1371, 0.015625f, "1", false));
        drops.add(new ItemData(1199, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.0390625f, "40", false));
        drops.add(new ItemData(560, 0.0390625f, "5", false));
        drops.add(new ItemData(560, 0.015625f, "15", false));
        drops.add(new ItemData(565, 0.0078125f, "20", false));
        drops.add(new ItemData(995, 0.34375f, "250-499", false));
        drops.add(new ItemData(995, 0.2265625f, "250", false));
        drops.add(new ItemData(995, 0.0546875f, "150", false));
        drops.add(new ItemData(995, 0.078125f, "500-749", false));
        drops.add(new ItemData(995, 0.0078125f, "500-999", false));
        drops.add(new ItemData(385, 0.015625f, "1", false));
        drops.add(new ItemData(7946, 0.0078125f, "1", false));
        drops.add(new ItemData(2357, 0.0234375f, "10", false));
        drops.add(new ItemData(444, 0.0078125f, "10", false));
        drops.add(new ItemData(23490, 0.012345679012345678f, "1", false));
        drops.add(new ItemData(21257, 0.004464285714285714f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
