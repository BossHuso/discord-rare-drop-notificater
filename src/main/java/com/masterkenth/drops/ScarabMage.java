package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class ScarabMage implements BaseNPC {
    public List<ItemData> drops;

    public ScarabMage() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(564, 0.015625f, "35", false));
        drops.add(new ItemData(4699, 0.015625f, "150", false));
        drops.add(new ItemData(892, 0.015625f, "18", false));
        drops.add(new ItemData(199, 0.0390625f, "1", false));
        drops.add(new ItemData(201, 0.02932551319648094f, "1", false));
        drops.add(new ItemData(203, 0.02197802197802198f, "1", false));
        drops.add(new ItemData(205, 0.017094017094017096f, "1", false));
        drops.add(new ItemData(207, 0.013422818791946308f, "1", false));
        drops.add(new ItemData(209, 0.009765625f, "1", false));
        drops.add(new ItemData(211, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(1199, 0.0234375f, "1", false));
        drops.add(new ItemData(213, 0.006105006105006105f, "1", false));
        drops.add(new ItemData(215, 0.0048828125f, "1", false));
        drops.add(new ItemData(2485, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(217, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(5296, 0.0031113876789047915f, "1", false));
        drops.add(new ItemData(5297, 0.00211864406779661f, "1", false));
        drops.add(new ItemData(5281, 0.002052545155993432f, "1", false));
        drops.add(new ItemData(5106, 0.0014566642388929353f, "1", false));
        drops.add(new ItemData(5298, 0.0014566642388929353f, "1", false));
        drops.add(new ItemData(5280, 0.0013904338153503894f, "1", false));
        drops.add(new ItemData(1391, 0.015625f, "3", false));
        drops.add(new ItemData(22873, 0.000993147283742179f, "1", false));
        drops.add(new ItemData(5299, 0.000993147283742179f, "1", false));
        drops.add(new ItemData(5300, 0.0006620762711864406f, "1", false));
        drops.add(new ItemData(5301, 0.00046345645826574594f, "1", false));
        drops.add(new ItemData(5302, 0.0003310381355932203f, "1", false));
        drops.add(new ItemData(22879, 0.00026483050847457627f, "3", false));
        drops.add(new ItemData(5303, 0.00019862156632967208f, "1", false));
        drops.add(new ItemData(5304, 0.00013241525423728814f, "1", false));
        drops.add(new ItemData(377, 0.0546875f, "15", false));
        drops.add(new ItemData(449, 0.015625f, "14", false));
        drops.add(new ItemData(1213, 0.015625f, "1", false));
        drops.add(new ItemData(453, 0.046875f, "32", false));
        drops.add(new ItemData(9735, 0.015625f, "6", false));
        drops.add(new ItemData(2359, 0.015625f, "22", false));
        drops.add(new ItemData(363, 0.03125f, "24", false));
        drops.add(new ItemData(1623, 0.0234375f, "4", false));
        drops.add(new ItemData(995, 0.25f, "2000-3000", false));
        drops.add(new ItemData(1823, 0.0078125f, "1", false));
        drops.add(new ItemData(365, 0.03125f, "6", false));
        drops.add(new ItemData(379, 0.0078125f, "5", false));
        drops.add(new ItemData(10143, 0.0078125f, "80", false));
        drops.add(new ItemData(1432, 0.0078125f, "1", false));
        drops.add(new ItemData(1185, 0.0078125f, "1", false));
        drops.add(new ItemData(890, 0.03125f, "36", false));
        drops.add(new ItemData(565, 0.03125f, "18", false));
        drops.add(new ItemData(554, 0.015625f, "250", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
