package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Lavadragon implements BaseNPC {
    public List<ItemData> drops;

    public Lavadragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(11943, 1f, "1", false));
        drops.add(new ItemData(1201, 0.015625f, "1", false));
        drops.add(new ItemData(1303, 0.015625f, "1", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(830, 0.078125f, "20", false));
        drops.add(new ItemData(554, 0.0546875f, "75", false));
        drops.add(new ItemData(565, 0.0546875f, "20", false));
        drops.add(new ItemData(9144, 0.046875f, "30", false));
        drops.add(new ItemData(560, 0.0390625f, "20", false));
        drops.add(new ItemData(563, 0.0390625f, "20", false));
        drops.add(new ItemData(1747, 1f, "1", false));
        drops.add(new ItemData(4699, 0.03125f, "15", false));
        drops.add(new ItemData(4699, 0.03125f, "30", false));
        drops.add(new ItemData(199, 0.009765625f, "1-2", false));
        drops.add(new ItemData(201, 0.007326007326007326f, "1-2", false));
        drops.add(new ItemData(203, 0.005494505494505495f, "1-2", false));
        drops.add(new ItemData(205, 0.004271678769756515f, "1-2", false));
        drops.add(new ItemData(207, 0.003356831151393085f, "1-2", false));
        drops.add(new ItemData(209, 0.00244140625f, "1-2", false));
        drops.add(new ItemData(211, 0.0018311664530305805f, "1-2", false));
        drops.add(new ItemData(213, 0.0015257857796765334f, "1-2", false));
        drops.add(new ItemData(11992, 1f, "1", false));
        drops.add(new ItemData(215, 0.001220703125f, "1-2", false));
        drops.add(new ItemData(2485, 0.0009154994049253868f, "1-2", false));
        drops.add(new ItemData(217, 0.0009154994049253868f, "1-2", false));
        drops.add(new ItemData(995, 0.1171875f, "66", false));
        drops.add(new ItemData(995, 0.0546875f, "2960", false));
        drops.add(new ItemData(995, 0.0078125f, "690", false));
        drops.add(new ItemData(1442, 0.0078125f, "1", false));
        drops.add(new ItemData(569, 0.0390625f, "15", false));
        drops.add(new ItemData(1897, 0.0234375f, "3", false));
        drops.add(new ItemData(2361, 0.0390625f, "2", false));
        drops.add(new ItemData(811, 0.046875f, "12", false));
        drops.add(new ItemData(9194, 0.0390625f, "12", false));
        drops.add(new ItemData(19582, 0.0546875f, "15", false));
        drops.add(new ItemData(868, 0.03125f, "8", false));
        drops.add(new ItemData(3053, 0.0234375f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(12073, 0.004f, "1", false));
        drops.add(new ItemData(1317, 0.015625f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(23490, 0.014925373134328358f, "1", false));
        drops.add(new ItemData(21257, 0.007352941176470588f, "1", false));
        drops.add(new ItemData(1123, 0.015625f, "1", false));
        drops.add(new ItemData(1359, 0.015625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
