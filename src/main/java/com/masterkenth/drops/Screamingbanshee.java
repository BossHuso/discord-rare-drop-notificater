package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Screamingbanshee implements BaseNPC {
    public List<ItemData> drops;

    public Screamingbanshee() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(1420, 0.015625f, "1", false));
        drops.add(new ItemData(199, 0.06622516556291391f, "1", false));
        drops.add(new ItemData(201, 0.04975124378109453f, "1", false));
        drops.add(new ItemData(203, 0.03731343283582089f, "1", false));
        drops.add(new ItemData(205, 0.029069767441860465f, "1", false));
        drops.add(new ItemData(207, 0.0228310502283105f, "1", false));
        drops.add(new ItemData(209, 0.016611295681063124f, "1", false));
        drops.add(new ItemData(211, 0.012453300124533f, "1", false));
        drops.add(new ItemData(213, 0.01037344398340249f, "1", false));
        drops.add(new ItemData(215, 0.008298755186721992f, "1", false));
        drops.add(new ItemData(2485, 0.0062266500622665f, "1", false));
        drops.add(new ItemData(1203, 0.015625f, "1", false));
        drops.add(new ItemData(217, 0.0062266500622665f, "1", false));
        drops.add(new ItemData(995, 0.078125f, "13", false));
        drops.add(new ItemData(995, 0.0625f, "26", false));
        drops.add(new ItemData(995, 0.0625f, "35", false));
        drops.add(new ItemData(7936, 0.171875f, "13", false));
        drops.add(new ItemData(313, 0.171875f, "15", false));
        drops.add(new ItemData(313, 0.0390625f, "7", false));
        drops.add(new ItemData(221, 0.0078125f, "1", false));
        drops.add(new ItemData(440, 0.0078125f, "1", false));
        drops.add(new ItemData(1191, 0.0078125f, "1", false));
        drops.add(new ItemData(4105, 0.001953125f, "1", false));
        drops.add(new ItemData(2677, 0.078125f, "1", false));
        drops.add(new ItemData(20730, 0.002717391304347826f, "1", false));
        drops.add(new ItemData(20736, 0.002717391304347826f, "1", false));
        drops.add(new ItemData(21270, 0.0007763975155279503f, "1", false));
        drops.add(new ItemData(20724, 0.0007763975155279503f, "1", false));
        drops.add(new ItemData(556, 0.0234375f, "3", false));
        drops.add(new ItemData(564, 0.0234375f, "2", false));
        drops.add(new ItemData(562, 0.015625f, "3", false));
        drops.add(new ItemData(554, 0.0078125f, "7", false));
        drops.add(new ItemData(562, 0.0078125f, "7", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
