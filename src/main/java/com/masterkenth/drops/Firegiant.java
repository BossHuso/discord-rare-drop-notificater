package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Firegiant implements BaseNPC {
    public List<ItemData> drops;

    public Firegiant() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(554, 0.0078125f, "37", false));
        drops.add(new ItemData(563, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.03717472118959108f, "1", false));
        drops.add(new ItemData(201, 0.027855153203342618f, "1", false));
        drops.add(new ItemData(203, 0.020876826722338204f, "1", false));
        drops.add(new ItemData(205, 0.016233766233766232f, "1", false));
        drops.add(new ItemData(207, 0.012755102040816327f, "1", false));
        drops.add(new ItemData(209, 0.00927643784786642f, "1", false));
        drops.add(new ItemData(211, 0.006958942240779402f, "1", false));
        drops.add(new ItemData(213, 0.005797101449275362f, "1", false));
        drops.add(new ItemData(1353, 0.0234375f, "1", false));
        drops.add(new ItemData(215, 0.00463821892393321f, "1", false));
        drops.add(new ItemData(2485, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(217, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(995, 0.3125f, "60", false));
        drops.add(new ItemData(995, 0.0546875f, "15", false));
        drops.add(new ItemData(995, 0.046875f, "25", false));
        drops.add(new ItemData(995, 0.015625f, "300", false));
        drops.add(new ItemData(995, 0.0078125f, "50", false));
        drops.add(new ItemData(379, 0.0234375f, "1", false));
        drops.add(new ItemData(2353, 0.015625f, "1", false));
        drops.add(new ItemData(1181, 0.015625f, "1", false));
        drops.add(new ItemData(117, 0.0078125f, "1", false));
        drops.add(new ItemData(1393, 0.0078125f, "1", false));
        drops.add(new ItemData(1333, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(7872, 0.25f, "1", false));
        drops.add(new ItemData(554, 0.078125f, "150", false));
        drops.add(new ItemData(13474, 0.05f, "1", false));
        drops.add(new ItemData(23083, 0.007194244604316547f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(6800, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(23490, 0.01020408163265306f, "1", false));
        drops.add(new ItemData(562, 0.0546875f, "5", false));
        drops.add(new ItemData(21257, 0.004310344827586207f, "1", false));
        drops.add(new ItemData(892, 0.0390625f, "12", false));
        drops.add(new ItemData(565, 0.03125f, "5", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
