package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Demonicgorilla implements BaseNPC {
    public List<ItemData> drops;

    public Demonicgorilla() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25772, 1f, "1", false));
        drops.add(new ItemData(1113, 0.04f, "1", false));
        drops.add(new ItemData(4587, 0.02f, "1", false));
        drops.add(new ItemData(563, 0.07f, "50-75", false));
        drops.add(new ItemData(560, 0.07f, "50-75", false));
        drops.add(new ItemData(9144, 0.05f, "100-150", false));
        drops.add(new ItemData(213, 0.01124859392575928f, "7-13", false));
        drops.add(new ItemData(215, 0.009000900090009001f, "7-13", false));
        drops.add(new ItemData(2485, 0.00675219446320054f, "7-13", false));
        drops.add(new ItemData(217, 0.009000900090009001f, "7-13", false));
        drops.add(new ItemData(5295, 0.00599880023995201f, "2", false));
        drops.add(new ItemData(19529, 0.0033333333333333335f, "1", false));
        drops.add(new ItemData(5300, 0.005599104143337066f, "2", false));
        drops.add(new ItemData(5304, 0.004399472063352398f, "2", false));
        drops.add(new ItemData(5321, 0.004f, "30", false));
        drops.add(new ItemData(5313, 0.004f, "2", false));
        drops.add(new ItemData(21488, 0.003599712023038157f, "2", false));
        drops.add(new ItemData(5314, 0.003599712023038157f, "2", false));
        drops.add(new ItemData(21486, 0.003599712023038157f, "2", false));
        drops.add(new ItemData(5315, 0.003599712023038157f, "2", false));
        drops.add(new ItemData(5288, 0.002800336040324839f, "2", false));
        drops.add(new ItemData(5316, 0.0023998080153587713f, "2", false));
        drops.add(new ItemData(19592, 0.002f, "1", false));
        drops.add(new ItemData(5289, 0.002f, "2", false));
        drops.add(new ItemData(5317, 0.0016f, "2", false));
        drops.add(new ItemData(22877, 0.0012000480019200767f, "2", false));
        drops.add(new ItemData(22869, 0.0008f, "2", false));
        drops.add(new ItemData(22871, 0.0008f, "2", false));
        drops.add(new ItemData(139, 0.08f, "2", false));
        drops.add(new ItemData(385, 0.07f, "2-3", false));
        drops.add(new ItemData(995, 0.05f, "5000-10000", false));
        drops.add(new ItemData(6689, 0.05f, "1", false));
        drops.add(new ItemData(2361, 0.04f, "6", false));
        drops.add(new ItemData(19601, 0.002f, "1", false));
        drops.add(new ItemData(19584, 0.05f, "750-1250", false));
        drops.add(new ItemData(19580, 0.05f, "45-55", false));
        drops.add(new ItemData(19582, 0.05f, "27-33", false));
        drops.add(new ItemData(1601, 0.034f, "4-6", false));
        drops.add(new ItemData(2363, 0.03f, "3", false));
        drops.add(new ItemData(19586, 0.0013333333333333333f, "1", false));
        drops.add(new ItemData(19589, 0.0006666666666666666f, "1", false));
        drops.add(new ItemData(19610, 0.0006666666666666666f, "1", false));
        drops.add(new ItemData(2722, 0.01f, "1", false));
        drops.add(new ItemData(12073, 0.002f, "1", false));
        drops.add(new ItemData(1079, 0.07f, "1", false));
        drops.add(new ItemData(1093, 0.07f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
