package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Brutalgreendragon implements BaseNPC {
    public List<ItemData> drops;

    public Brutalgreendragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1111, 0.0078125f, "1", false));
        drops.add(new ItemData(1199, 0.0078125f, "1", false));
        drops.add(new ItemData(1073, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(1113, 0.0078125f, "1", false));
        drops.add(new ItemData(565, 0.2265625f, "20", false));
        drops.add(new ItemData(4699, 0.0625f, "35", false));
        drops.add(new ItemData(4694, 0.046875f, "37", false));
        drops.add(new ItemData(561, 0.0390625f, "17", false));
        drops.add(new ItemData(563, 0.0234375f, "15", false));
        drops.add(new ItemData(1753, 1f, "2", false));
        drops.add(new ItemData(890, 0.0234375f, "8", false));
        drops.add(new ItemData(199, 0.02932551319648094f, "1", false));
        drops.add(new ItemData(201, 0.02197802197802198f, "1", false));
        drops.add(new ItemData(203, 0.016474464579901153f, "1", false));
        drops.add(new ItemData(205, 0.01282051282051282f, "1", false));
        drops.add(new ItemData(207, 0.010070493454179255f, "1", false));
        drops.add(new ItemData(209, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(211, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(213, 0.004576659038901602f, "1", false));
        drops.add(new ItemData(215, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(816, 0.0390625f, "25", false));
        drops.add(new ItemData(2485, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(217, 0.0027464982147761604f, "1", false));
        drops.add(new ItemData(19582, 0.078125f, "12", false));
        drops.add(new ItemData(447, 0.0234375f, "5", false));
        drops.add(new ItemData(995, 0.0859375f, "242", false));
        drops.add(new ItemData(995, 0.078125f, "621", false));
        drops.add(new ItemData(2011, 0.015625f, "1-2", false));
        drops.add(new ItemData(1317, 0.03125f, "1", false));
        drops.add(new ItemData(11373, 0.0234375f, "1", false));
        drops.add(new ItemData(867, 0.0234375f, "8", false));
        drops.add(new ItemData(13510, 0.03571428571428571f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(1145, 0.0234375f, "1", false));
        drops.add(new ItemData(805, 0.0234375f, "8", false));
        drops.add(new ItemData(1245, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
