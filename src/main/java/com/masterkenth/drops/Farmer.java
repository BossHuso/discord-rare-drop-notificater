package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Farmer implements BaseNPC {
    public List<ItemData> drops;

    public Farmer() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.1796875f, "10", false));
        drops.add(new ItemData(995, 0.0703125f, "5", false));
        drops.add(new ItemData(995, 0.03125f, "15", false));
        drops.add(new ItemData(995, 0.0078125f, "25", false));
        drops.add(new ItemData(313, 0.0390625f, "1", false));
        drops.add(new ItemData(436, 0.015625f, "1", false));
        drops.add(new ItemData(1440, 0.015625f, "1", false));
        drops.add(new ItemData(1965, 0.0078125f, "1", false));
        drops.add(new ItemData(23182, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(1139, 0.015625f, "1", false));
        drops.add(new ItemData(557, 0.015625f, "4", false));
        drops.add(new ItemData(554, 0.015625f, "6", false));
        drops.add(new ItemData(558, 0.015625f, "9", false));
        drops.add(new ItemData(562, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.021505376344086023f, "1", false));
        drops.add(new ItemData(201, 0.01610305958132045f, "1", false));
        drops.add(new ItemData(203, 0.012091898428053204f, "1", false));
        drops.add(new ItemData(205, 0.009398496240601503f, "1", false));
        drops.add(new ItemData(207, 0.007385524372230428f, "1", false));
        drops.add(new ItemData(209, 0.0053705692803437165f, "1", false));
        drops.add(new ItemData(1203, 0.0078125f, "1", false));
        drops.add(new ItemData(211, 0.0040290088638195f, "1", false));
        drops.add(new ItemData(213, 0.003356831151393085f, "1", false));
        drops.add(new ItemData(215, 0.0026852846401718583f, "1", false));
        drops.add(new ItemData(2485, 0.002014098690835851f, "1", false));
        drops.add(new ItemData(217, 0.002014098690835851f, "1", false));
        drops.add(new ItemData(5318, 0.10526315789473684f, "1-4", false));
        drops.add(new ItemData(5319, 0.05263157894736842f, "1-3", false));
        drops.add(new ItemData(5324, 0.026385224274406333f, "1-3", false));
        drops.add(new ItemData(5322, 0.013175230566534914f, "1-2", false));
        drops.add(new ItemData(5320, 0.0065919578114700065f, "1-2", false));
        drops.add(new ItemData(882, 0.0234375f, "7", false));
        drops.add(new ItemData(5323, 0.0032959789057350032f, "1", false));
        drops.add(new ItemData(5321, 0.0016479894528675016f, "1", false));
        drops.add(new ItemData(22879, 0.0016479894528675016f, "1", false));
        drops.add(new ItemData(995, 0.296875f, "3", false));
        drops.add(new ItemData(5341, 0.0234375f, "1", false));
        drops.add(new ItemData(5345, 0.015625f, "1", false));
        drops.add(new ItemData(5343, 0.015625f, "1", false));
        drops.add(new ItemData(5329, 0.0078125f, "1", false));
        drops.add(new ItemData(5340, 0.0078125f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.9609375f, "9", false));
        drops.add(new ItemData(5318, 0.0390625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
