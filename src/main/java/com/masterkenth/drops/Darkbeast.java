package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Darkbeast implements BaseNPC {
    public List<ItemData> drops;

    public Darkbeast() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(560, 0.0625f, "20", false));
        drops.add(new ItemData(562, 0.0546875f, "30", false));
        drops.add(new ItemData(565, 0.03125f, "15", false));
        drops.add(new ItemData(199, 0.046948356807511735f, "1-2", false));
        drops.add(new ItemData(201, 0.035211267605633804f, "1-2", false));
        drops.add(new ItemData(203, 0.026385224274406333f, "1-2", false));
        drops.add(new ItemData(205, 0.020491803278688523f, "1-2", false));
        drops.add(new ItemData(207, 0.01610305958132045f, "1-2", false));
        drops.add(new ItemData(209, 0.011723329425556858f, "1-2", false));
        drops.add(new ItemData(211, 0.008787346221441126f, "1-2", false));
        drops.add(new ItemData(1367, 0.0234375f, "1", false));
        drops.add(new ItemData(213, 0.007326007326007326f, "1-2", false));
        drops.add(new ItemData(215, 0.005858230814294083f, "1-2", false));
        drops.add(new ItemData(2485, 0.004393673110720563f, "1-2", false));
        drops.add(new ItemData(217, 0.004393673110720563f, "1-2", false));
        drops.add(new ItemData(5296, 0.006222775357809583f, "1", false));
        drops.add(new ItemData(5297, 0.00423728813559322f, "1", false));
        drops.add(new ItemData(5281, 0.004105090311986864f, "1", false));
        drops.add(new ItemData(5106, 0.0029129041654529565f, "1", false));
        drops.add(new ItemData(5298, 0.0029129041654529565f, "1", false));
        drops.add(new ItemData(5280, 0.0027808676307007787f, "1", false));
        drops.add(new ItemData(1183, 0.0078125f, "1", false));
        drops.add(new ItemData(22873, 0.0019860973187686196f, "1", false));
        drops.add(new ItemData(5299, 0.0019860973187686196f, "1", false));
        drops.add(new ItemData(5300, 0.0013241525423728813f, "1", false));
        drops.add(new ItemData(5301, 0.0009268699601445917f, "1", false));
        drops.add(new ItemData(5302, 0.0006620762711864406f, "1", false));
        drops.add(new ItemData(22879, 0.0005296610169491525f, "3", false));
        drops.add(new ItemData(5303, 0.000397251022921384f, "1", false));
        drops.add(new ItemData(5304, 0.00026483050847457627f, "1", false));
        drops.add(new ItemData(995, 0.3125f, "152", false));
        drops.add(new ItemData(995, 0.046875f, "64", false));
        drops.add(new ItemData(1113, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.046875f, "95", false));
        drops.add(new ItemData(995, 0.0390625f, "220", false));
        drops.add(new ItemData(385, 0.0234375f, "1", false));
        drops.add(new ItemData(2361, 0.015625f, "3", false));
        drops.add(new ItemData(449, 0.0078125f, "5", false));
        drops.add(new ItemData(1456, 0.0078125f, "1", false));
        drops.add(new ItemData(451, 0.0078125f, "1", false));
        drops.add(new ItemData(385, 0.0078125f, "2", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(1319, 0.0078125f, "1", false));
        drops.add(new ItemData(23962, 0.041666666666666664f, "1", false));
        drops.add(new ItemData(23083, 0.015151515151515152f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(12073, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(1373, 0.0078125f, "1", false));
        drops.add(new ItemData(11235, 0.001953125f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
