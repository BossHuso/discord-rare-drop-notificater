package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Repugnantspectre implements BaseNPC {
    public List<ItemData> drops;

    public Repugnantspectre() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0625f, "1", false));
        drops.add(new ItemData(1621, 0.03125f, "1", false));
        drops.add(new ItemData(1619, 0.015625f, "1", false));
        drops.add(new ItemData(1452, 0.005858917272088118f, "1", false));
        drops.add(new ItemData(1462, 0.005858917272088118f, "1", false));
        drops.add(new ItemData(1617, 0.00390625f, "1", false));
        drops.add(new ItemData(830, 0.001953125f, "5", false));
        drops.add(new ItemData(987, 0.001953125f, "1", false));
        drops.add(new ItemData(985, 0.001953125f, "1", false));
        drops.add(new ItemData(1247, 0.0001220703125f, "1", false));
        drops.add(new ItemData(2366, 0.00006103515625f, "1", false));
        drops.add(new ItemData(1249, 0.00004577279118818842f, "1", false));
        drops.add(new ItemData(1391, 0.0390625f, "1", false));
        drops.add(new ItemData(205, 0.03937007874015748f, "1-3", false));
        drops.add(new ItemData(207, 0.030864197530864196f, "1-3", false));
        drops.add(new ItemData(209, 0.02247191011235955f, "1-3", false));
        drops.add(new ItemData(211, 0.016835016835016835f, "1-3", false));
        drops.add(new ItemData(213, 0.014044943820224719f, "1-3", false));
        drops.add(new ItemData(215, 0.011235955056179775f, "1-3", false));
        drops.add(new ItemData(2485, 0.008424599831508003f, "1-3", false));
        drops.add(new ItemData(217, 0.008424599831508003f, "1-3", false));
        drops.add(new ItemData(5296, 0.024875621890547265f, "1", false));
        drops.add(new ItemData(5297, 0.01694915254237288f, "1", false));
        drops.add(new ItemData(1077, 0.0390625f, "1", false));
        drops.add(new ItemData(5281, 0.016420361247947456f, "1", false));
        drops.add(new ItemData(5106, 0.011655011655011656f, "1", false));
        drops.add(new ItemData(5298, 0.011655011655011656f, "1", false));
        drops.add(new ItemData(5280, 0.011123470522803115f, "1", false));
        drops.add(new ItemData(22873, 0.007942811755361398f, "1", false));
        drops.add(new ItemData(5299, 0.007942811755361398f, "1", false));
        drops.add(new ItemData(5300, 0.005296610169491525f, "1", false));
        drops.add(new ItemData(5301, 0.0037078235076010383f, "1", false));
        drops.add(new ItemData(5302, 0.0026483050847457626f, "1", false));
        drops.add(new ItemData(22879, 0.00211864406779661f, "3", false));
        drops.add(new ItemData(1369, 0.0390625f, "1", false));
        drops.add(new ItemData(5303, 0.0015890672175433022f, "1", false));
        drops.add(new ItemData(5304, 0.001059322033898305f, "1", false));
        drops.add(new ItemData(5100, 0.078125f, "3-11", false));
        drops.add(new ItemData(449, 0.0390625f, "1", false));
        drops.add(new ItemData(1163, 0.015625f, "1", false));
        drops.add(new ItemData(2722, 0.078125f, "1", false));
        drops.add(new ItemData(23083, 0.023809523809523808f, "1", false));
        drops.add(new ItemData(4103, 0.001953125f, "1", false));
        drops.add(new ItemData(19677, 0.0136986301369863f, "1", false));
        drops.add(new ItemData(19679, 1f, "1", false));
        drops.add(new ItemData(3053, 0.0078125f, "1", false));
        drops.add(new ItemData(19681, 1f, "1", false));
        drops.add(new ItemData(19683, 1f, "1", false));
        drops.add(new ItemData(20730, 0.004608294930875576f, "1", false));
        drops.add(new ItemData(20736, 0.004608294930875576f, "1", false));
        drops.add(new ItemData(21270, 0.0013157894736842105f, "1", false));
        drops.add(new ItemData(20724, 0.0013157894736842105f, "1", false));
        drops.add(new ItemData(1113, 0.0078125f, "1", false));
        drops.add(new ItemData(199, 0.09009009009009009f, "1-3", false));
        drops.add(new ItemData(201, 0.06756756756756757f, "1-3", false));
        drops.add(new ItemData(203, 0.050505050505050504f, "1-3", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
