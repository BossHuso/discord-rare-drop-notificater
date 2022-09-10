package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Chokedevil implements BaseNPC {
    public List<ItemData> drops;

    public Chokedevil() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.015625f, "1", false));
        drops.add(new ItemData(1621, 0.0078125f, "1", false));
        drops.add(new ItemData(1619, 0.00390625f, "1", false));
        drops.add(new ItemData(1452, 0.0014647293180220294f, "1", false));
        drops.add(new ItemData(1462, 0.0014647293180220294f, "1", false));
        drops.add(new ItemData(1617, 0.0009765625f, "1", false));
        drops.add(new ItemData(830, 0.00048828125f, "5", false));
        drops.add(new ItemData(987, 0.00048828125f, "1", false));
        drops.add(new ItemData(985, 0.00048828125f, "1", false));
        drops.add(new ItemData(1247, 0.000030517578125f, "1", false));
        drops.add(new ItemData(2366, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(1249, 0.000011443197797047105f, "1", false));
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
        drops.add(new ItemData(199, 0.015625f, "1", false));
        drops.add(new ItemData(201, 0.011723329425556858f, "1", false));
        drops.add(new ItemData(203, 0.008787346221441126f, "1", false));
        drops.add(new ItemData(205, 0.00683526999316473f, "1", false));
        drops.add(new ItemData(207, 0.0053705692803437165f, "1", false));
        drops.add(new ItemData(209, 0.00390625f, "1", false));
        drops.add(new ItemData(211, 0.002929973630237328f, "1", false));
        drops.add(new ItemData(213, 0.00244140625f, "1", false));
        drops.add(new ItemData(215, 0.001953125f, "1", false));
        drops.add(new ItemData(1213, 0.015625f, "1", false));
        drops.add(new ItemData(2485, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(217, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(995, 0.25f, "2000-4000", false));
        drops.add(new ItemData(1885, 0.015625f, "4", false));
        drops.add(new ItemData(2359, 0.0234375f, "10", false));
        drops.add(new ItemData(2361, 0.0078125f, "4", false));
        drops.add(new ItemData(2489, 0.015625f, "1", false));
        drops.add(new ItemData(23083, 0.018867924528301886f, "1", false));
        drops.add(new ItemData(19677, 0.007518796992481203f, "1", false));
        drops.add(new ItemData(19679, 1f, "1", false));
        drops.add(new ItemData(2491, 0.0078125f, "1", false));
        drops.add(new ItemData(19681, 1f, "1", false));
        drops.add(new ItemData(19683, 1f, "1", false));
        drops.add(new ItemData(20730, 0.005154639175257732f, "1", false));
        drops.add(new ItemData(20736, 0.005154639175257732f, "1", false));
        drops.add(new ItemData(21270, 0.0014705882352941176f, "1", false));
        drops.add(new ItemData(20724, 0.0014705882352941176f, "1", false));
        drops.add(new ItemData(1397, 0.015625f, "1", false));
        drops.add(new ItemData(1399, 0.015625f, "1", false));
        drops.add(new ItemData(1405, 0.0078125f, "1", false));
        drops.add(new ItemData(1407, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
