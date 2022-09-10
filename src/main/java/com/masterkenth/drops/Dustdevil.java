package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dustdevil implements BaseNPC {
    public List<ItemData> drops;

    public Dustdevil() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.021484375f, "1", false));
        drops.add(new ItemData(1621, 0.0107421875f, "1", false));
        drops.add(new ItemData(1619, 0.00537109375f, "1", false));
        drops.add(new ItemData(1452, 0.0020140028122802903f, "1", false));
        drops.add(new ItemData(1462, 0.0020140028122802903f, "1", false));
        drops.add(new ItemData(1617, 0.0013427734375f, "1", false));
        drops.add(new ItemData(830, 0.00067138671875f, "5", false));
        drops.add(new ItemData(987, 0.00067138671875f, "1", false));
        drops.add(new ItemData(985, 0.00067138671875f, "1", false));
        drops.add(new ItemData(1247, 0.000041961669921875f, "1", false));
        drops.add(new ItemData(2366, 0.0000209808349609375f, "1", false));
        drops.add(new ItemData(1249, 0.000015734396970939768f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1215, 0.0078125f, "1", false));
        drops.add(new ItemData(20736, 0.00025f, "1", false));
        drops.add(new ItemData(3140, 0.000030517578125f, "1", false));
        drops.add(new ItemData(4696, 0.078125f, "200", false));
        drops.add(new ItemData(557, 0.078125f, "300", false));
        drops.add(new ItemData(554, 0.078125f, "300", false));
        drops.add(new ItemData(554, 0.0078125f, "50", false));
        drops.add(new ItemData(562, 0.0546875f, "80", false));
        drops.add(new ItemData(892, 0.0390625f, "12", false));
        drops.add(new ItemData(566, 0.03125f, "20", false));
        drops.add(new ItemData(1357, 0.0234375f, "1", false));
        drops.add(new ItemData(566, 0.0078125f, "50", false));
        drops.add(new ItemData(199, 0.03717472118959108f, "1", false));
        drops.add(new ItemData(201, 0.027855153203342618f, "1", false));
        drops.add(new ItemData(203, 0.020876826722338204f, "1", false));
        drops.add(new ItemData(205, 0.016233766233766232f, "1", false));
        drops.add(new ItemData(207, 0.012755102040816327f, "1", false));
        drops.add(new ItemData(209, 0.00927643784786642f, "1", false));
        drops.add(new ItemData(211, 0.006958942240779402f, "1", false));
        drops.add(new ItemData(213, 0.005797101449275362f, "1", false));
        drops.add(new ItemData(215, 0.00463821892393321f, "1", false));
        drops.add(new ItemData(1213, 0.015625f, "1", false));
        drops.add(new ItemData(2485, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(217, 0.003479471120389701f, "1", false));
        drops.add(new ItemData(995, 0.21875f, "2000-4000", false));
        drops.add(new ItemData(1885, 0.015625f, "4", false));
        drops.add(new ItemData(2359, 0.0234375f, "10", false));
        drops.add(new ItemData(2361, 0.0078125f, "4", false));
        drops.add(new ItemData(2489, 0.015625f, "1", false));
        drops.add(new ItemData(23083, 0.011494252873563218f, "1", false));
        drops.add(new ItemData(2491, 0.0078125f, "1", false));
        drops.add(new ItemData(1397, 0.015625f, "1", false));
        drops.add(new ItemData(1399, 0.015625f, "1", false));
        drops.add(new ItemData(1405, 0.0078125f, "1", false));
        drops.add(new ItemData(1407, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
