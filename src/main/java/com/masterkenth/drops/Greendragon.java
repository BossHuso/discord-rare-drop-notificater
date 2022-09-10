package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Greendragon implements BaseNPC {
    public List<ItemData> drops;

    public Greendragon() {
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
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(199, 0.02932551319648094f, "1", false));
        drops.add(new ItemData(201, 0.02197802197802198f, "1", false));
        drops.add(new ItemData(203, 0.016474464579901153f, "1", false));
        drops.add(new ItemData(205, 0.01282051282051282f, "1", false));
        drops.add(new ItemData(207, 0.010070493454179255f, "1", false));
        drops.add(new ItemData(209, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(1753, 1f, "1", false));
        drops.add(new ItemData(211, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(213, 0.004576659038901602f, "1", false));
        drops.add(new ItemData(215, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(2485, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(217, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(995, 0.2265625f, "44", false));
        drops.add(new ItemData(995, 0.1953125f, "132", false));
        drops.add(new ItemData(995, 0.078125f, "200", false));
        drops.add(new ItemData(995, 0.0390625f, "11", false));
        drops.add(new ItemData(995, 0.0078125f, "440", false));
        drops.add(new ItemData(1069, 0.03125f, "1", false));
        drops.add(new ItemData(365, 0.0234375f, "1", false));
        drops.add(new ItemData(449, 0.0234375f, "1", false));
        drops.add(new ItemData(1365, 0.0234375f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(13510, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.01f, "1", false));
        drops.add(new ItemData(21257, 0.0038461538461538464f, "1", false));
        drops.add(new ItemData(1355, 0.0234375f, "1", false));
        drops.add(new ItemData(1243, 0.015625f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1161, 0.0078125f, "1", false));
        drops.add(new ItemData(1213, 0.0078125f, "1", false));
        drops.add(new ItemData(1315, 0.0390625f, "1", false));
        drops.add(new ItemData(1071, 0.015625f, "1", false));
        drops.add(new ItemData(1369, 0.0078125f, "1", false));
        drops.add(new ItemData(1211, 0.0078125f, "1", false));
        drops.add(new ItemData(1287, 0.0078125f, "1", false));
        drops.add(new ItemData(1199, 0.0078125f, "1", false));
        drops.add(new ItemData(563, 0.0234375f, "3-10", false));
        drops.add(new ItemData(561, 0.0078125f, "10", false));
        drops.add(new ItemData(560, 0.0078125f, "15", false));
        drops.add(new ItemData(565, 0.0078125f, "5", false));
        drops.add(new ItemData(995, 0.2265625f, "100-199", false));
        drops.add(new ItemData(995, 0.1953125f, "250-499", false));
        drops.add(new ItemData(995, 0.109375f, "500-749", false));
        drops.add(new ItemData(995, 0.046875f, "110", false));
        drops.add(new ItemData(995, 0.046875f, "500-999", false));
        drops.add(new ItemData(7946, 0.0546875f, "1", false));
        drops.add(new ItemData(447, 0.0234375f, "2", false));
        drops.add(new ItemData(23490, 0.011904761904761904f, "1", false));
        drops.add(new ItemData(21257, 0.004166666666666667f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
