package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class BlackHeather implements BaseNPC {
    public List<ItemData> drops;

    public BlackHeather() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
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
        drops.add(new ItemData(1295, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.234375f, "48", false));
        drops.add(new ItemData(995, 0.140625f, "15", false));
        drops.add(new ItemData(995, 0.1171875f, "10", false));
        drops.add(new ItemData(995, 0.0859375f, "8", false));
        drops.add(new ItemData(995, 0.078125f, "70", false));
        drops.add(new ItemData(995, 0.0390625f, "5", false));
        drops.add(new ItemData(995, 0.015625f, "150", false));
        drops.add(new ItemData(442, 0.0859375f, "1", false));
        drops.add(new ItemData(373, 0.015625f, "5", false));
        drops.add(new ItemData(1157, 0.0078125f, "1", false));
        drops.add(new ItemData(563, 0.03125f, "2", false));
        drops.add(new ItemData(11941, 0.25f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.0013623978201634877f, "1", false));
        drops.add(new ItemData(21257, 0.003436426116838488f, "1", false));
        drops.add(new ItemData(561, 0.03125f, "4", false));
        drops.add(new ItemData(559, 0.0234375f, "12", false));
        drops.add(new ItemData(562, 0.0234375f, "3", false));
        drops.add(new ItemData(555, 0.0234375f, "30", false));
        drops.add(new ItemData(199, 0.02932551319648094f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
