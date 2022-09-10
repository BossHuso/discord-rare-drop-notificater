package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class PeeHat implements BaseNPC {
    public List<ItemData> drops;

    public PeeHat() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.009765625f, "1", false));
        drops.add(new ItemData(1621, 0.0048828125f, "1", false));
        drops.add(new ItemData(1619, 0.00244140625f, "1", false));
        drops.add(new ItemData(1452, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1462, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1617, 0.0006103515625f, "1", false));
        drops.add(new ItemData(830, 0.00030517578125f, "5", false));
        drops.add(new ItemData(987, 0.00030517578125f, "1", false));
        drops.add(new ItemData(985, 0.00030517578125f, "1", false));
        drops.add(new ItemData(1247, 0.000019073486328125f, "1", false));
        drops.add(new ItemData(2366, 0.0000095367431640625f, "1", false));
        drops.add(new ItemData(1249, 0.0000071519986231544404f, "1", false));
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(557, 0.0625f, "80", false));
        drops.add(new ItemData(561, 0.0390625f, "16", false));
        drops.add(new ItemData(563, 0.0234375f, "4", false));
        drops.add(new ItemData(557, 0.0078125f, "65", false));
        drops.add(new ItemData(557, 0.0078125f, "25", false));
        drops.add(new ItemData(199, 0.02932551319648094f, "1", false));
        drops.add(new ItemData(201, 0.02197802197802198f, "1", false));
        drops.add(new ItemData(203, 0.016474464579901153f, "1", false));
        drops.add(new ItemData(205, 0.01282051282051282f, "1", false));
        drops.add(new ItemData(207, 0.010070493454179255f, "1", false));
        drops.add(new ItemData(1119, 0.03125f, "1", false));
        drops.add(new ItemData(209, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(211, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(213, 0.004576659038901602f, "1", false));
        drops.add(new ItemData(215, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(2485, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(217, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(995, 0.2265625f, "40", false));
        drops.add(new ItemData(995, 0.1953125f, "135", false));
        drops.add(new ItemData(995, 0.078125f, "190", false));
        drops.add(new ItemData(995, 0.03125f, "20", false));
        drops.add(new ItemData(1341, 0.0234375f, "1", false));
        drops.add(new ItemData(995, 0.0078125f, "420", false));
        drops.add(new ItemData(453, 0.0234375f, "6", false));
        drops.add(new ItemData(359, 0.015625f, "4", false));
        drops.add(new ItemData(1339, 0.0234375f, "1", false));
        drops.add(new ItemData(7884, 0.25f, "1", false));
        drops.add(new ItemData(13483, 0.03571428571428571f, "1", false));
        drops.add(new ItemData(23083, 0.008620689655172414f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(1357, 0.015625f, "1", false));
        drops.add(new ItemData(1183, 0.0078125f, "1", false));
        drops.add(new ItemData(3122, 0.0078125f, "1", false));
        drops.add(new ItemData(1121, 0.0078125f, "1", false));
        drops.add(new ItemData(1347, 0.0078125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
