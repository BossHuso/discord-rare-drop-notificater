package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Torturedgorilla implements BaseNPC {
    public List<ItemData> drops;

    public Torturedgorilla() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(9143, 0.125f, "1", false));
        drops.add(new ItemData(557, 0.125f, "401-599", false));
        drops.add(new ItemData(564, 0.125f, "22-30", false));
        drops.add(new ItemData(560, 0.0078125f, "12-20", false));
        drops.add(new ItemData(215, 0.125f, "1", false));
        drops.add(new ItemData(213, 0.125f, "1", false));
        drops.add(new ItemData(217, 0.125f, "1", false));
        drops.add(new ItemData(5295, 0.0078125f, "1", false));
        drops.add(new ItemData(5300, 0.0078125f, "1", false));
        drops.add(new ItemData(5304, 0.0078125f, "1", false));
        drops.add(new ItemData(19529, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(5321, 0.0078125f, "15", false));
        drops.add(new ItemData(5313, 0.0078125f, "1", false));
        drops.add(new ItemData(21488, 0.0078125f, "1", false));
        drops.add(new ItemData(5314, 0.0078125f, "1", false));
        drops.add(new ItemData(21486, 0.0078125f, "1", false));
        drops.add(new ItemData(5315, 0.0078125f, "1", false));
        drops.add(new ItemData(5288, 0.0078125f, "1", false));
        drops.add(new ItemData(5316, 0.0078125f, "1", false));
        drops.add(new ItemData(5289, 0.0078125f, "1", false));
        drops.add(new ItemData(5317, 0.001953125f, "1", false));
        drops.add(new ItemData(19592, 0.0002f, "1", false));
        drops.add(new ItemData(22877, 0.001953125f, "1", false));
        drops.add(new ItemData(22869, 0.001953125f, "1", false));
        drops.add(new ItemData(22871, 0.001953125f, "1", false));
        drops.add(new ItemData(19584, 0.125f, "100-299", false));
        drops.add(new ItemData(2361, 0.03125f, "1-2", false));
        drops.add(new ItemData(1603, 0.03125f, "2-3", false));
        drops.add(new ItemData(19580, 0.03125f, "10", false));
        drops.add(new ItemData(19582, 0.0078125f, "5", false));
        drops.add(new ItemData(385, 0.03125f, "1", false));
        drops.add(new ItemData(143, 0.03125f, "1", false));
        drops.add(new ItemData(19601, 0.0002f, "1", false));
        drops.add(new ItemData(995, 0.125f, "1171-1969", false));
        drops.add(new ItemData(19586, 0.00013333333333333334f, "1", false));
        drops.add(new ItemData(19589, 0.00006666666666666667f, "1", false));
        drops.add(new ItemData(2722, 0.0033333333333333335f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(12073, 0.0006666666666666666f, "1", false));
        drops.add(new ItemData(19610, 0.00006666666666666667f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(1147, 0.03125f, "1", false));
        drops.add(new ItemData(1333, 0.03125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
