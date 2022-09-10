package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Icegiant implements BaseNPC {
    public List<ItemData> drops;

    public Icegiant() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0078125f, "1", false));
        drops.add(new ItemData(1621, 0.00390625f, "1", false));
        drops.add(new ItemData(1619, 0.001953125f, "1", false));
        drops.add(new ItemData(1452, 0.0007323646590110147f, "1", false));
        drops.add(new ItemData(1462, 0.0007323646590110147f, "1", false));
        drops.add(new ItemData(1617, 0.00048828125f, "1", false));
        drops.add(new ItemData(830, 0.000244140625f, "5", false));
        drops.add(new ItemData(987, 0.000244140625f, "1", false));
        drops.add(new ItemData(985, 0.000244140625f, "1", false));
        drops.add(new ItemData(1247, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(2366, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(1249, 0.000005721598898523552f, "1", false));
        drops.add(new ItemData(5295, 0.003779289493575208f, "1", false));
        drops.add(new ItemData(5105, 0.0032948929159802307f, "1", false));
        drops.add(new ItemData(5282, 0.002810567734682406f, "1", false));
        drops.add(new ItemData(5296, 0.0026164311878597592f, "1", false));
        drops.add(new ItemData(5281, 0.0017442874585731729f, "1", false));
        drops.add(new ItemData(5297, 0.0017442874585731729f, "1", false));
        drops.add(new ItemData(5106, 0.0012597631645250692f, "1", false));
        drops.add(new ItemData(5298, 0.001162925921618793f, "1", false));
        drops.add(new ItemData(5280, 0.001162925921618793f, "1", false));
        drops.add(new ItemData(5299, 0.0008722197993894462f, "1", false));
        drops.add(new ItemData(22873, 0.0007753140021708792f, "1", false));
        drops.add(new ItemData(5300, 0.00048454307587944567f, "1", false));
        drops.add(new ItemData(5301, 0.00038764197387293096f, "1", false));
        drops.add(new ItemData(5302, 0.00029073148040469825f, "1", false));
        drops.add(new ItemData(5303, 0.00019382098693646548f, "1", false));
        drops.add(new ItemData(5304, 0.00009691049346823274f, "1", false));
        drops.add(new ItemData(995, 0.34375f, "150-299", false));
        drops.add(new ItemData(995, 0.078125f, "200-399", false));
        drops.add(new ItemData(995, 0.0703125f, "250", false));
        drops.add(new ItemData(995, 0.0546875f, "100", false));
        drops.add(new ItemData(995, 0.015625f, "400-799", false));
        drops.add(new ItemData(1993, 0.0234375f, "1", false));
        drops.add(new ItemData(447, 0.0078125f, "3", false));
        drops.add(new ItemData(7946, 0.0078125f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(7875, 0.25f, "1", false));
        drops.add(new ItemData(13474, 0.047619047619047616f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(6800, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(23490, 0.007692307692307693f, "1", false));
        drops.add(new ItemData(21257, 0.004166666666666667f, "1", false));
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(1355, 0.03125f, "1", false));
        drops.add(new ItemData(1287, 0.03125f, "1", false));
        drops.add(new ItemData(1071, 0.0078125f, "1", false));
        drops.add(new ItemData(1211, 0.0078125f, "1", false));
        drops.add(new ItemData(1430, 0.0078125f, "1", false));
        drops.add(new ItemData(1183, 0.0078125f, "1", false));
        drops.add(new ItemData(1199, 0.0078125f, "1", false));
        drops.add(new ItemData(1213, 0.0078125f, "1", false));
        drops.add(new ItemData(890, 0.046875f, "5-14", false));
        drops.add(new ItemData(561, 0.03125f, "6", false));
        drops.add(new ItemData(560, 0.0234375f, "5", false));
        drops.add(new ItemData(563, 0.015625f, "3", false));
        drops.add(new ItemData(565, 0.015625f, "5", false));
        drops.add(new ItemData(564, 0.0078125f, "4", false));
        drops.add(new ItemData(562, 0.0078125f, "15", false));
        drops.add(new ItemData(560, 0.0078125f, "3", false));
        drops.add(new ItemData(5100, 0.013280212483399735f, "1", false));
        drops.add(new ItemData(5323, 0.012690355329949238f, "1", false));
        drops.add(new ItemData(5292, 0.012106537530266344f, "1", false));
        drops.add(new ItemData(5104, 0.008912655971479501f, "1", false));
        drops.add(new ItemData(5293, 0.008237232289950576f, "1", false));
        drops.add(new ItemData(5311, 0.008045052292839904f, "1", false));
        drops.add(new ItemData(5321, 0.006105006105006105f, "1", false));
        drops.add(new ItemData(5294, 0.005425935973955507f, "1", false));
        drops.add(new ItemData(22879, 0.003875968992248062f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
