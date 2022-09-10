package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class FeralVampyre implements BaseNPC {
    public List<ItemData> drops;

    public FeralVampyre() {
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
        drops.add(new ItemData(3325, 1f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(5100, 0.019417475728155338f, "1", false));
        drops.add(new ItemData(5323, 0.01855287569573284f, "1", false));
        drops.add(new ItemData(557, 0.078125f, "4", false));
        drops.add(new ItemData(5292, 0.017699115044247787f, "1", false));
        drops.add(new ItemData(5104, 0.01303780964797914f, "1", false));
        drops.add(new ItemData(5293, 0.012033694344163659f, "1", false));
        drops.add(new ItemData(5311, 0.011750881316098707f, "1", false));
        drops.add(new ItemData(5321, 0.008920606601248885f, "1", false));
        drops.add(new ItemData(5294, 0.007930214115781126f, "1", false));
        drops.add(new ItemData(22879, 0.0056657223796034f, "1", false));
        drops.add(new ItemData(5295, 0.0055248618784530384f, "1", false));
        drops.add(new ItemData(5105, 0.004814636494944632f, "1", false));
        drops.add(new ItemData(5282, 0.004106776180698152f, "1", false));
        drops.add(new ItemData(560, 0.078125f, "2", false));
        drops.add(new ItemData(5296, 0.0038240917782026767f, "1", false));
        drops.add(new ItemData(5281, 0.0025497195308516064f, "1", false));
        drops.add(new ItemData(5297, 0.0025497195308516064f, "1", false));
        drops.add(new ItemData(5106, 0.0018412815319462346f, "1", false));
        drops.add(new ItemData(5298, 0.001699524133242692f, "1", false));
        drops.add(new ItemData(5280, 0.001699524133242692f, "1", false));
        drops.add(new ItemData(5299, 0.0012746972594008922f, "1", false));
        drops.add(new ItemData(22873, 0.0011331444759206798f, "1", false));
        drops.add(new ItemData(5300, 0.000708215297450425f, "1", false));
        drops.add(new ItemData(5301, 0.0005665401393688743f, "1", false));
        drops.add(new ItemData(562, 0.0625f, "3", false));
        drops.add(new ItemData(5302, 0.0004249171411574743f, "1", false));
        drops.add(new ItemData(5303, 0.00028327809410498285f, "1", false));
        drops.add(new ItemData(5304, 0.00014163904705249142f, "1", false));
        drops.add(new ItemData(995, 0.3125f, "15", false));
        drops.add(new ItemData(1361, 0.0234375f, "1", false));
        drops.add(new ItemData(1440, 0.015625f, "1", false));
        drops.add(new ItemData(565, 0.0390625f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(565, 0.0078125f, "2", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
