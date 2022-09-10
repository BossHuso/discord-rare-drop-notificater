package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mogre implements BaseNPC {
    public List<ItemData> drops;

    public Mogre() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(5311, 0.008045052292839904f, "1", false));
        drops.add(new ItemData(5321, 0.006105006105006105f, "1", false));
        drops.add(new ItemData(5294, 0.005425935973955507f, "1", false));
        drops.add(new ItemData(22879, 0.003875968992248062f, "1", false));
        drops.add(new ItemData(5295, 0.003779289493575208f, "1", false));
        drops.add(new ItemData(5105, 0.0032948929159802307f, "1", false));
        drops.add(new ItemData(5282, 0.002810567734682406f, "1", false));
        drops.add(new ItemData(5296, 0.0026164311878597592f, "1", false));
        drops.add(new ItemData(5281, 0.0017442874585731729f, "1", false));
        drops.add(new ItemData(5297, 0.0017442874585731729f, "1", false));
        drops.add(new ItemData(555, 0.03125f, "5", false));
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
        drops.add(new ItemData(555, 0.03125f, "7", false));
        drops.add(new ItemData(371, 0.15625f, "1", false));
        drops.add(new ItemData(359, 0.0703125f, "1", false));
        drops.add(new ItemData(349, 0.0546875f, "1", false));
        drops.add(new ItemData(331, 0.03125f, "1", false));
        drops.add(new ItemData(345, 0.0234375f, "1", false));
        drops.add(new ItemData(327, 0.0234375f, "1", false));
        drops.add(new ItemData(383, 0.0234375f, "1", false));
        drops.add(new ItemData(313, 0.234375f, "5", false));
        drops.add(new ItemData(313, 0.078125f, "15", false));
        drops.add(new ItemData(6665, 0.0390625f, "1", false));
        drops.add(new ItemData(555, 0.03125f, "14", false));
        drops.add(new ItemData(407, 0.0234375f, "1", false));
        drops.add(new ItemData(6666, 0.015625f, "1", false));
        drops.add(new ItemData(401, 0.015625f, "1", false));
        drops.add(new ItemData(1383, 0.0078125f, "1", false));
        drops.add(new ItemData(6668, 0.0078125f, "1", false));
        drops.add(new ItemData(7851, 0.25f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(5100, 0.013280212483399735f, "1", false));
        drops.add(new ItemData(5323, 0.012690355329949238f, "1", false));
        drops.add(new ItemData(5292, 0.012106537530266344f, "1", false));
        drops.add(new ItemData(5104, 0.008912655971479501f, "1", false));
        drops.add(new ItemData(5293, 0.008237232289950576f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
