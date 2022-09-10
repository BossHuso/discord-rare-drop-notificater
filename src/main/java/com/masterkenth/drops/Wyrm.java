package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Wyrm implements BaseNPC {
    public List<ItemData> drops;

    public Wyrm() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.003289473684210526f, "1", false));
        drops.add(new ItemData(1621, 0.001644736842105263f, "1", false));
        drops.add(new ItemData(1619, 0.0008223684210526315f, "1", false));
        drops.add(new ItemData(1452, 0.00030836406695200616f, "1", false));
        drops.add(new ItemData(1462, 0.00030836406695200616f, "1", false));
        drops.add(new ItemData(1617, 0.00020559210526315788f, "1", false));
        drops.add(new ItemData(830, 0.00010279605263157894f, "5", false));
        drops.add(new ItemData(987, 0.00010279605263157894f, "1", false));
        drops.add(new ItemData(985, 0.00010279605263157894f, "1", false));
        drops.add(new ItemData(1247, 0.000006424753289473684f, "1", false));
        drops.add(new ItemData(2366, 0.000003212376644736842f, "1", false));
        drops.add(new ItemData(1249, 0.000002409094273062548f, "1", false));
        drops.add(new ItemData(22780, 1f, "1", false));
        drops.add(new ItemData(1317, 0.02631578947368421f, "1", false));
        drops.add(new ItemData(1399, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(1147, 0.02631578947368421f, "1", false));
        drops.add(new ItemData(1373, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(1215, 0.013157894736842105f, "1", false));
        drops.add(new ItemData(554, 0.13157894736842105f, "200", false));
        drops.add(new ItemData(557, 0.13157894736842105f, "75-150", false));
        drops.add(new ItemData(566, 0.06578947368421052f, "15-20", false));
        drops.add(new ItemData(565, 0.06578947368421052f, "25-30", false));
        drops.add(new ItemData(199, 0.013157894736842105f, "1-2", false));
        drops.add(new ItemData(21009, 0.0001f, "1", false));
        drops.add(new ItemData(201, 0.009871668311944718f, "1-2", false));
        drops.add(new ItemData(203, 0.007401924500370096f, "1-2", false));
        drops.add(new ItemData(205, 0.0057570523891767415f, "1-2", false));
        drops.add(new ItemData(207, 0.004522840343735866f, "1-2", false));
        drops.add(new ItemData(209, 0.003289473684210526f, "1-2", false));
        drops.add(new ItemData(211, 0.002467308166790032f, "1-2", false));
        drops.add(new ItemData(213, 0.002055921052631579f, "1-2", false));
        drops.add(new ItemData(215, 0.001644736842105263f, "1-2", false));
        drops.add(new ItemData(2485, 0.0012335019119279634f, "1-2", false));
        drops.add(new ItemData(217, 0.0012335019119279634f, "1-2", false));
        drops.add(new ItemData(21028, 0.0001f, "1", false));
        drops.add(new ItemData(5296, 0.007861635220125786f, "1", false));
        drops.add(new ItemData(5297, 0.0053533190578158455f, "1", false));
        drops.add(new ItemData(5281, 0.005184033177812338f, "1", false));
        drops.add(new ItemData(5106, 0.003679175864606328f, "1", false));
        drops.add(new ItemData(5298, 0.003679175864606328f, "1", false));
        drops.add(new ItemData(5280, 0.0035124692658939235f, "1", false));
        drops.add(new ItemData(22873, 0.002508780732563974f, "1", false));
        drops.add(new ItemData(5299, 0.002508780732563974f, "1", false));
        drops.add(new ItemData(5300, 0.0016725204883759827f, "1", false));
        drops.add(new ItemData(5301, 0.001170823088631308f, "1", false));
        drops.add(new ItemData(22804, 0.0001f, "75-150", false));
        drops.add(new ItemData(5302, 0.0008363301831563101f, "1", false));
        drops.add(new ItemData(22879, 0.0006690305746972637f, "3", false));
        drops.add(new ItemData(5303, 0.0005017813236991319f, "1", false));
        drops.add(new ItemData(5304, 0.00033452647777071554f, "1", false));
        drops.add(new ItemData(995, 0.10526315789473684f, "950-1450", false));
        drops.add(new ItemData(365, 0.09210526315789473f, "1", false));
        drops.add(new ItemData(7936, 0.039473684210526314f, "200-300", false));
        drops.add(new ItemData(44, 0.02631578947368421f, "8-12", false));
        drops.add(new ItemData(43, 0.02631578947368421f, "8-12", false));
        drops.add(new ItemData(20849, 0.0001f, "75-150", false));
        drops.add(new ItemData(1357, 0.02631578947368421f, "1", false));
        drops.add(new ItemData(23083, 0.0125f, "1", false));
        drops.add(new ItemData(2722, 0.00390625f, "1", false));
        drops.add(new ItemData(2495, 0.039473684210526314f, "1", false));
        drops.add(new ItemData(1183, 0.02631578947368421f, "1", false));
        drops.add(new ItemData(1371, 0.02631578947368421f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
