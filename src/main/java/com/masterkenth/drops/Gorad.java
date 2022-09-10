package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Gorad implements BaseNPC {
    public List<ItemData> drops;

    public Gorad() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(22879, 0.004472271914132379f, "1", false));
        drops.add(new ItemData(5295, 0.00436109899694723f, "1", false));
        drops.add(new ItemData(5105, 0.0038022813688212928f, "1", false));
        drops.add(new ItemData(5282, 0.00324254215304799f, "1", false));
        drops.add(new ItemData(5296, 0.0030193236714975845f, "1", false));
        drops.add(new ItemData(5281, 0.002012882447665056f, "1", false));
        drops.add(new ItemData(5297, 0.002012882447665056f, "1", false));
        drops.add(new ItemData(5106, 0.0014536996656490768f, "1", false));
        drops.add(new ItemData(5298, 0.0013419216317767043f, "1", false));
        drops.add(new ItemData(5280, 0.0013419216317767043f, "1", false));
        drops.add(new ItemData(5100, 0.015313935681470138f, "1", false));
        drops.add(new ItemData(5299, 0.0010063399416322834f, "1", false));
        drops.add(new ItemData(22873, 0.0008945343948474819f, "1", false));
        drops.add(new ItemData(5300, 0.0005590965000559097f, "1", false));
        drops.add(new ItemData(5301, 0.0004472872031131189f, "1", false));
        drops.add(new ItemData(5302, 0.0003354579000335458f, "1", false));
        drops.add(new ItemData(5303, 0.00022363860002236387f, "1", false));
        drops.add(new ItemData(5304, 0.00011182055038074897f, "1", false));
        drops.add(new ItemData(2377, 1f, "1", false));
        drops.add(new ItemData(7842, 0.25f, "1", false));
        drops.add(new ItemData(13477, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(5323, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(5292, 0.013986013986013986f, "1", false));
        drops.add(new ItemData(5104, 0.0102880658436214f, "1", false));
        drops.add(new ItemData(5293, 0.009505703422053232f, "1", false));
        drops.add(new ItemData(5311, 0.009285051067780872f, "1", false));
        drops.add(new ItemData(5321, 0.007042253521126761f, "1", false));
        drops.add(new ItemData(5294, 0.006261740763932373f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
