package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Treespirit implements BaseNPC {
    public List<ItemData> drops;

    public Treespirit() {
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
        drops.add(new ItemData(1353, 0.078125f, "1", false));
        drops.add(new ItemData(201, 0.02197802197802198f, "1", false));
        drops.add(new ItemData(203, 0.016474464579901153f, "1", false));
        drops.add(new ItemData(205, 0.01282051282051282f, "1", false));
        drops.add(new ItemData(207, 0.010070493454179255f, "1", false));
        drops.add(new ItemData(209, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(211, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(213, 0.004576659038901602f, "1", false));
        drops.add(new ItemData(215, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(2485, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(217, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(1355, 0.15625f, "1", false));
        drops.add(new ItemData(3051, 0.046875f, "1", false));
        drops.add(new ItemData(3049, 0.046875f, "1", false));
        drops.add(new ItemData(5296, 0.02178649237472767f, "1", false));
        drops.add(new ItemData(5297, 0.01483679525222552f, "1", false));
        drops.add(new ItemData(5281, 0.014367816091954023f, "1", false));
        drops.add(new ItemData(5106, 0.010193679918450561f, "1", false));
        drops.add(new ItemData(5298, 0.010193679918450561f, "1", false));
        drops.add(new ItemData(5280, 0.009737098344693282f, "1", false));
        drops.add(new ItemData(22873, 0.006954102920723227f, "1", false));
        drops.add(new ItemData(5299, 0.006954102920723227f, "1", false));
        drops.add(new ItemData(1357, 0.0625f, "1", false));
        drops.add(new ItemData(5300, 0.004633920296570899f, "1", false));
        drops.add(new ItemData(5301, 0.003244646333549643f, "1", false));
        drops.add(new ItemData(5302, 0.002317497103128621f, "1", false));
        drops.add(new ItemData(22879, 0.0018539117538005192f, "3", false));
        drops.add(new ItemData(5303, 0.0013904338153503894f, "1", false));
        drops.add(new ItemData(5304, 0.0009268699601445917f, "1", false));
        drops.add(new ItemData(946, 0.0078125f, "1", false));
        drops.add(new ItemData(1359, 0.03125f, "1", false));
        drops.add(new ItemData(561, 0.2421875f, "22", false));
        drops.add(new ItemData(561, 0.015625f, "10", false));
        drops.add(new ItemData(561, 0.015625f, "5", false));
        drops.add(new ItemData(561, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.02932551319648094f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
