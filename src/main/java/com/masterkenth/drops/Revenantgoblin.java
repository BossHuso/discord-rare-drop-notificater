package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantgoblin implements BaseNPC {
    public List<ItemData> drops;

    public Revenantgoblin() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-8", false));
        drops.add(new ItemData(22299, 0.00003410641200545703f, "1", false));
        drops.add(new ItemData(22302, 0.00003410641200545703f, "1", false));
        drops.add(new ItemData(22305, 0.00003410641200545703f, "1", false));
        drops.add(new ItemData(21816, 0.008681309141418526f, "1", false));
        drops.add(new ItemData(1391, 0.0028938534552610255f, "3", false));
        drops.add(new ItemData(1163, 0.001157554781280024f, "1", false));
        drops.add(new ItemData(1127, 0.001157554781280024f, "1", false));
        drops.add(new ItemData(1079, 0.001157554781280024f, "1", false));
        drops.add(new ItemData(1201, 0.001157554781280024f, "1", false));
        drops.add(new ItemData(1347, 0.001157554781280024f, "1", false));
        drops.add(new ItemData(22557, 0.00001364256480218281f, "1", false));
        drops.add(new ItemData(4087, 0.0002893878578642597f, "1", false));
        drops.add(new ItemData(4585, 0.0002893878578642597f, "1", false));
        drops.add(new ItemData(1215, 0.0005787740408267208f, "1", false));
        drops.add(new ItemData(1305, 0.0005787740408267208f, "1", false));
        drops.add(new ItemData(1149, 0.0004433842634057232f, "1", false));
        drops.add(new ItemData(453, 0.003472704542297541f, "25-40", false));
        drops.add(new ItemData(2361, 0.003472704542297541f, "4-6", false));
        drops.add(new ItemData(451, 0.0023150827642088203f, "1-3", false));
        drops.add(new ItemData(2363, 0.0017363221224801625f, "1-2", false));
        drops.add(new ItemData(1747, 0.0023150827642088203f, "3-4", false));
        drops.add(new ItemData(22550, 0.000006821282401091405f, "1", false));
        drops.add(new ItemData(8782, 0.0017363221224801625f, "5-12", false));
        drops.add(new ItemData(391, 0.0023150827642088203f, "10-15", false));
        drops.add(new ItemData(1515, 0.0023150827642088203f, "20-40", false));
        drops.add(new ItemData(1513, 0.001157554781280024f, "5-12", false));
        drops.add(new ItemData(1631, 0.0005787740408267208f, "2-5", false));
        drops.add(new ItemData(5315, 0.00013642564802182812f, "2-7", false));
        drops.add(new ItemData(5316, 0.00013642564802182812f, "2-7", false));
        drops.add(new ItemData(995, 0.9433962264150944f, "1-76", false));
        drops.add(new ItemData(21802, 0.0028938534552610255f, "1", false));
        drops.add(new ItemData(3024, 0.0017363221224801625f, "1-3", false));
        drops.add(new ItemData(22555, 0.000006821282401091405f, "1", false));
        drops.add(new ItemData(9193, 0.0017363221224801625f, "15-30", false));
        drops.add(new ItemData(9194, 0.0017363221224801625f, "2-4", false));
        drops.add(new ItemData(563, 0.0028938534552610255f, "20-45", false));
        drops.add(new ItemData(560, 0.0028938534552610255f, "15-30", false));
        drops.add(new ItemData(565, 0.0028938534552610255f, "10-20", false));
        drops.add(new ItemData(11941, 0.1f, "1", false));
        drops.add(new ItemData(23490, 0.000731528895391368f, "1", false));
        drops.add(new ItemData(21257, 0.003236245954692557f, "1", false));
        drops.add(new ItemData(22545, 0.000006821282401091405f, "1", false));
        drops.add(new ItemData(21807, 0.0002046383324431566f, "1", false));
        drops.add(new ItemData(21810, 0.00013642564802182812f, "1", false));
        drops.add(new ItemData(21813, 0.00006821282401091406f, "1", false));
        drops.add(new ItemData(21804, 0.00010231927091380317f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
