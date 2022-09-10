package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BasiliskSentinel implements BaseNPC {
    public List<ItemData> drops;

    public BasiliskSentinel() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(1621, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1619, 0.009615384615384616f, "1", false));
        drops.add(new ItemData(1452, 0.0036054875520542262f, "1", false));
        drops.add(new ItemData(1462, 0.0036054875520542262f, "1", false));
        drops.add(new ItemData(1617, 0.002403846153846154f, "1", false));
        drops.add(new ItemData(830, 0.001201923076923077f, "5", false));
        drops.add(new ItemData(987, 0.001201923076923077f, "1", false));
        drops.add(new ItemData(985, 0.001201923076923077f, "1", false));
        drops.add(new ItemData(1247, 0.00007512019230769231f, "1", false));
        drops.add(new ItemData(2366, 0.000037560096153846156f, "1", false));
        drops.add(new ItemData(1249, 0.000028167871500423642f, "1", false));
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(9075, 0.11538461538461539f, "15-35", false));
        drops.add(new ItemData(561, 0.11538461538461539f, "15-30", false));
        drops.add(new ItemData(563, 0.11538461538461539f, "20-30", false));
        drops.add(new ItemData(560, 0.057692307692307696f, "10-25", false));
        drops.add(new ItemData(565, 0.057692307692307696f, "8-20", false));
        drops.add(new ItemData(211, 0.01802776275464215f, "1", false));
        drops.add(new ItemData(207, 0.014423770373575652f, "1", false));
        drops.add(new ItemData(3051, 0.014423770373575652f, "1", false));
        drops.add(new ItemData(219, 0.010817827780181739f, "1", false));
        drops.add(new ItemData(995, 0.1346153846153846f, "500-2498", false));
        drops.add(new ItemData(1073, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(449, 0.019230769230769232f, "1-2", false));
        drops.add(new ItemData(1199, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(7899, 0.25f, "1", false));
        drops.add(new ItemData(2722, 0.052083333333333336f, "1", false));
        drops.add(new ItemData(23083, 0.025f, "1", false));
        drops.add(new ItemData(4109, 0.00390625f, "1", false));
        drops.add(new ItemData(7977, 0.001f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(24268, 0.001f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(1359, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(20730, 0.004608294930875576f, "1", false));
        drops.add(new ItemData(20736, 0.004608294930875576f, "1", false));
        drops.add(new ItemData(21270, 0.0013157894736842105f, "1", false));
        drops.add(new ItemData(20724, 0.0013157894736842105f, "1", false));
        drops.add(new ItemData(1373, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1213, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1333, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1247, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1147, 0.019230769230769232f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
