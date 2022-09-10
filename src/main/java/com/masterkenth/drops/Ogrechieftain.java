package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Ogrechieftain implements BaseNPC {
    public List<ItemData> drops;

    public Ogrechieftain() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(22879, 0.0056657223796034f, "1", false));
        drops.add(new ItemData(5295, 0.0055248618784530384f, "1", false));
        drops.add(new ItemData(5105, 0.004814636494944632f, "1", false));
        drops.add(new ItemData(5282, 0.004106776180698152f, "1", false));
        drops.add(new ItemData(5296, 0.0038240917782026767f, "1", false));
        drops.add(new ItemData(5281, 0.0025497195308516064f, "1", false));
        drops.add(new ItemData(5297, 0.0025497195308516064f, "1", false));
        drops.add(new ItemData(5106, 0.0018412815319462346f, "1", false));
        drops.add(new ItemData(5298, 0.001699524133242692f, "1", false));
        drops.add(new ItemData(5280, 0.001699524133242692f, "1", false));
        drops.add(new ItemData(5100, 0.019417475728155338f, "1", false));
        drops.add(new ItemData(5299, 0.0012746972594008922f, "1", false));
        drops.add(new ItemData(22873, 0.0011331444759206798f, "1", false));
        drops.add(new ItemData(5300, 0.000708215297450425f, "1", false));
        drops.add(new ItemData(5301, 0.0005665401393688743f, "1", false));
        drops.add(new ItemData(5302, 0.0004249171411574743f, "1", false));
        drops.add(new ItemData(5303, 0.00028327809410498285f, "1", false));
        drops.add(new ItemData(5304, 0.00014163904705249142f, "1", false));
        drops.add(new ItemData(13477, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(5323, 0.01855287569573284f, "1", false));
        drops.add(new ItemData(5292, 0.017699115044247787f, "1", false));
        drops.add(new ItemData(5104, 0.01303780964797914f, "1", false));
        drops.add(new ItemData(5293, 0.012033694344163659f, "1", false));
        drops.add(new ItemData(5311, 0.011750881316098707f, "1", false));
        drops.add(new ItemData(5321, 0.008920606601248885f, "1", false));
        drops.add(new ItemData(5294, 0.007930214115781126f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
