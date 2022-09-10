package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class OgressShaman implements BaseNPC {
    public List<ItemData> drops;

    public OgressShaman() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(557, 0.04310344827586207f, "10-20", false));
        drops.add(new ItemData(554, 0.04310344827586207f, "10-20", false));
        drops.add(new ItemData(558, 0.04310344827586207f, "10-20", false));
        drops.add(new ItemData(555, 0.04310344827586207f, "10-20", false));
        drops.add(new ItemData(886, 0.04310344827586207f, "10-30", false));
        drops.add(new ItemData(884, 0.04310344827586207f, "20-40", false));
        drops.add(new ItemData(5100, 0.005633802816901409f, "1", false));
        drops.add(new ItemData(5323, 0.005387931034482759f, "1", false));
        drops.add(new ItemData(5292, 0.005141388174807198f, "1", false));
        drops.add(new ItemData(5104, 0.0037835792659856224f, "1", false));
        drops.add(new ItemData(1197, 0.0603448275862069f, "1", false));
        drops.add(new ItemData(5293, 0.0034965034965034965f, "1", false));
        drops.add(new ItemData(5311, 0.003414134516899966f, "1", false));
        drops.add(new ItemData(5321, 0.002591344908007256f, "1", false));
        drops.add(new ItemData(5294, 0.0023030861354214646f, "1", false));
        drops.add(new ItemData(22879, 0.0016452780519907865f, "1", false));
        drops.add(new ItemData(5295, 0.0016041065126724415f, "1", false));
        drops.add(new ItemData(5105, 0.0013984058173682002f, "1", false));
        drops.add(new ItemData(5282, 0.0011927480916030535f, "1", false));
        drops.add(new ItemData(5296, 0.001110494169905608f, "1", false));
        drops.add(new ItemData(5281, 0.0007403020432336393f, "1", false));
        drops.add(new ItemData(888, 0.0603448275862069f, "5-15", false));
        drops.add(new ItemData(5297, 0.0007403020432336393f, "1", false));
        drops.add(new ItemData(5106, 0.0005346735817783243f, "1", false));
        drops.add(new ItemData(5298, 0.0004935590543408519f, "1", false));
        drops.add(new ItemData(5280, 0.0004935590543408519f, "1", false));
        drops.add(new ItemData(5299, 0.00037016472330186933f, "1", false));
        drops.add(new ItemData(22873, 0.0003290339563042906f, "1", false));
        drops.add(new ItemData(5300, 0.00020564706850103852f, "1", false));
        drops.add(new ItemData(5301, 0.0001645169781521453f, "1", false));
        drops.add(new ItemData(5302, 0.0001233882411006231f, "1", false));
        drops.add(new ItemData(5303, 0.00008225848907607265f, "1", false));
        drops.add(new ItemData(562, 0.0603448275862069f, "15-30", false));
        drops.add(new ItemData(5304, 0.000041129244538036324f, "1", false));
        drops.add(new ItemData(225, 0.04310344827586207f, "1", false));
        drops.add(new ItemData(1617, 0.034482758620689655f, "1", false));
        drops.add(new ItemData(1621, 0.034482758620689655f, "1", false));
        drops.add(new ItemData(1619, 0.034482758620689655f, "1", false));
        drops.add(new ItemData(1623, 0.034482758620689655f, "1", false));
        drops.add(new ItemData(995, 0.07758620689655173f, "500-1000", false));
        drops.add(new ItemData(995, 0.04310344827586207f, "5", false));
        drops.add(new ItemData(329, 0.05f, "1-3", false));
        drops.add(new ItemData(13477, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(563, 0.0603448275862069f, "8-15", false));
        drops.add(new ItemData(1147, 0.025f, "1", false));
        drops.add(new ItemData(1163, 0.01f, "1", false));
        drops.add(new ItemData(1373, 0.01f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(21838, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(561, 0.0603448275862069f, "8-15", false));
        drops.add(new ItemData(560, 0.05172413793103448f, "8-15", false));
        drops.add(new ItemData(556, 0.04310344827586207f, "10-20", false));
        drops.add(new ItemData(564, 0.04310344827586207f, "10-15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
