package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Brutalblackdragon implements BaseNPC {
    public List<ItemData> drops;

    public Brutalblackdragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1163, 0.046875f, "2", false));
        drops.add(new ItemData(811, 0.0390625f, "20", false));
        drops.add(new ItemData(1303, 0.0390625f, "1", false));
        drops.add(new ItemData(2503, 0.015625f, "1", false));
        drops.add(new ItemData(868, 0.015625f, "25", false));
        drops.add(new ItemData(805, 0.015625f, "30", false));
        drops.add(new ItemData(2491, 0.0078125f, "1", false));
        drops.add(new ItemData(1127, 0.0078125f, "1", false));
        drops.add(new ItemData(1149, 0.0078125f, "1", false));
        drops.add(new ItemData(1305, 0.0078125f, "1", false));
        drops.add(new ItemData(1747, 1f, "2", false));
        drops.add(new ItemData(1215, 0.0078125f, "1", false));
        drops.add(new ItemData(830, 0.0625f, "50", false));
        drops.add(new ItemData(560, 0.0546875f, "75", false));
        drops.add(new ItemData(565, 0.0625f, "50", false));
        drops.add(new ItemData(566, 0.0625f, "50", false));
        drops.add(new ItemData(563, 0.0546875f, "75", false));
        drops.add(new ItemData(892, 0.0546875f, "75", false));
        drops.add(new ItemData(11992, 0.03125f, "5", false));
        drops.add(new ItemData(11232, 0.0234375f, "40", false));
        drops.add(new ItemData(451, 0.015625f, "3", false));
        drops.add(new ItemData(4087, 0.001953125f, "1", false));
        drops.add(new ItemData(11237, 0.015625f, "40", false));
        drops.add(new ItemData(19582, 0.015625f, "40", false));
        drops.add(new ItemData(995, 0.0859375f, "370", false));
        drops.add(new ItemData(995, 0.0078125f, "540-929", false));
        drops.add(new ItemData(995, 0.015625f, "2200", false));
        drops.add(new ItemData(13441, 0.0625f, "2", false));
        drops.add(new ItemData(4585, 0.001953125f, "1", false));
        drops.add(new ItemData(1249, 0.001953125f, "1", false));
        drops.add(new ItemData(1631, 0.001953125f, "1", false));
        drops.add(new ItemData(13510, 0.05f, "1", false));
        drops.add(new ItemData(23083, 0.017857142857142856f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(12073, 0.004f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(19677, 0.008130081300813009f, "1", false));
        drops.add(new ItemData(19679, 0.005405405405405406f, "1", false));
        drops.add(new ItemData(19681, 0.005405405405405406f, "1", false));
        drops.add(new ItemData(11377, 0.078125f, "1", false));
        drops.add(new ItemData(19683, 0.005405405405405406f, "1", false));
        drops.add(new ItemData(1247, 0.078125f, "1", false));
        drops.add(new ItemData(1079, 0.0546875f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
