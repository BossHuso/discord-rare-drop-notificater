package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Kingkurask implements BaseNPC {
    public List<ItemData> drops;

    public Kingkurask() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.012096774193548387f, "1", false));
        drops.add(new ItemData(1621, 0.006048387096774193f, "1", false));
        drops.add(new ItemData(1619, 0.0030241935483870967f, "1", false));
        drops.add(new ItemData(1452, 0.0011339839881460872f, "1", false));
        drops.add(new ItemData(1462, 0.0011339839881460872f, "1", false));
        drops.add(new ItemData(1617, 0.0007560483870967742f, "1", false));
        drops.add(new ItemData(830, 0.0003780241935483871f, "5", false));
        drops.add(new ItemData(987, 0.0003780241935483871f, "1", false));
        drops.add(new ItemData(985, 0.0003780241935483871f, "1", false));
        drops.add(new ItemData(1247, 0.000023626512096774193f, "1", false));
        drops.add(new ItemData(2366, 0.000011813256048387096f, "1", false));
        drops.add(new ItemData(1249, 0.000008859249907391306f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(561, 0.08064516129032258f, "10", false));
        drops.add(new ItemData(561, 0.056451612903225805f, "15", false));
        drops.add(new ItemData(561, 0.03225806451612903f, "30", false));
        drops.add(new ItemData(199, 0.036231884057971016f, "1-3", false));
        drops.add(new ItemData(201, 0.027247956403269755f, "1-3", false));
        drops.add(new ItemData(203, 0.02040816326530612f, "1-3", false));
        drops.add(new ItemData(205, 0.015873015873015872f, "1-3", false));
        drops.add(new ItemData(207, 0.012468827930174564f, "1-3", false));
        drops.add(new ItemData(209, 0.009074410163339383f, "1-3", false));
        drops.add(new ItemData(211, 0.006802721088435374f, "1-3", false));
        drops.add(new ItemData(23962, 1f, "1", false));
        drops.add(new ItemData(213, 0.005668934240362812f, "1-3", false));
        drops.add(new ItemData(215, 0.004537205081669692f, "1-3", false));
        drops.add(new ItemData(2485, 0.003402517863218782f, "1-3", false));
        drops.add(new ItemData(217, 0.003402517863218782f, "1-3", false));
        drops.add(new ItemData(5296, 0.024096385542168676f, "1", false));
        drops.add(new ItemData(5297, 0.01639344262295082f, "1", false));
        drops.add(new ItemData(5281, 0.01589825119236884f, "1", false));
        drops.add(new ItemData(5106, 0.011273957158962795f, "1", false));
        drops.add(new ItemData(5298, 0.011273957158962795f, "1", false));
        drops.add(new ItemData(5280, 0.010764262648008612f, "1", false));
        drops.add(new ItemData(1197, 0.024193548387096774f, "1", false));
        drops.add(new ItemData(22873, 0.007686395080707148f, "1", false));
        drops.add(new ItemData(5299, 0.007686395080707148f, "1", false));
        drops.add(new ItemData(5300, 0.005125576627370579f, "1", false));
        drops.add(new ItemData(5301, 0.003588087549336204f, "1", false));
        drops.add(new ItemData(5302, 0.0025627883136852894f, "1", false));
        drops.add(new ItemData(22879, 0.002050440844781628f, "3", false));
        drops.add(new ItemData(5303, 0.001537751806858373f, "1", false));
        drops.add(new ItemData(5304, 0.0010251153254741158f, "1", false));
        drops.add(new ItemData(5100, 0.04838709677419355f, "1", false));
        drops.add(new ItemData(995, 0.12903225806451613f, "2000-3000", false));
        drops.add(new ItemData(1303, 0.024193548387096774f, "1", false));
        drops.add(new ItemData(1779, 0.04838709677419355f, "100", false));
        drops.add(new ItemData(239, 0.04838709677419355f, "12", false));
        drops.add(new ItemData(532, 0.04032258064516129f, "20", false));
        drops.add(new ItemData(995, 0.04032258064516129f, "10000", false));
        drops.add(new ItemData(5972, 0.03225806451612903f, "10", false));
        drops.add(new ItemData(5974, 0.03225806451612903f, "10", false));
        drops.add(new ItemData(1123, 0.024193548387096774f, "1", false));
        drops.add(new ItemData(2722, 0.078125f, "1", false));
        drops.add(new ItemData(23083, 0.020833333333333332f, "1", false));
        drops.add(new ItemData(7978, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(1359, 0.024193548387096774f, "1", false));
        drops.add(new ItemData(20730, 0.005847953216374269f, "1", false));
        drops.add(new ItemData(20736, 0.005847953216374269f, "1", false));
        drops.add(new ItemData(21270, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(20724, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(11902, 0.0026041666666666665f, "1", false));
        drops.add(new ItemData(4111, 0.001953125f, "1", false));
        drops.add(new ItemData(20727, 0.0009746588693957114f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
