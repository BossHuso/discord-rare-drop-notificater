package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Lizardmanshaman implements BaseNPC {
    public List<ItemData> drops;

    public Lizardmanshaman() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(562, 0.05f, "40-60", false));
        drops.add(new ItemData(560, 0.05f, "20-30", false));
        drops.add(new ItemData(554, 0.05f, "60-80", false));
        drops.add(new ItemData(13383, 0.08f, "2", false));
        drops.add(new ItemData(453, 0.04f, "20-25", false));
        drops.add(new ItemData(440, 0.04f, "30-35", false));
        drops.add(new ItemData(451, 0.016f, "3-5", false));
        drops.add(new ItemData(213, 0.0281214848143982f, "2-3", false));
        drops.add(new ItemData(215, 0.022502250225022502f, "2-3", false));
        drops.add(new ItemData(217, 0.022502250225022502f, "2-3", false));
        drops.add(new ItemData(13576, 0.0002f, "1", false));
        drops.add(new ItemData(2485, 0.016874789065136685f, "2-3", false));
        drops.add(new ItemData(5295, 0.0023998080153587713f, "1", false));
        drops.add(new ItemData(5300, 0.002240143369175627f, "1", false));
        drops.add(new ItemData(5304, 0.0017599436818021823f, "1", false));
        drops.add(new ItemData(5321, 0.0016f, "15", false));
        drops.add(new ItemData(5313, 0.0016f, "1", false));
        drops.add(new ItemData(21488, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(5314, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(21486, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(5315, 0.0014400921658986176f, "1", false));
        drops.add(new ItemData(1147, 0.036f, "1", false));
        drops.add(new ItemData(5288, 0.0011199462425803561f, "1", false));
        drops.add(new ItemData(5316, 0.0009599692809830085f, "1", false));
        drops.add(new ItemData(5289, 0.0008f, "1", false));
        drops.add(new ItemData(5317, 0.00064f, "1", false));
        drops.add(new ItemData(22877, 0.00048000768012288196f, "1", false));
        drops.add(new ItemData(22869, 0.00032f, "1", false));
        drops.add(new ItemData(22871, 0.00032f, "1", false));
        drops.add(new ItemData(995, 0.14f, "100-6000", false));
        drops.add(new ItemData(13391, 0.076f, "10-14", false));
        drops.add(new ItemData(7054, 0.06f, "2", false));
        drops.add(new ItemData(1399, 0.034f, "1", false));
        drops.add(new ItemData(13393, 0.004f, "1", false));
        drops.add(new ItemData(1407, 0.034f, "1", false));
        drops.add(new ItemData(1347, 0.032f, "1", false));
        drops.add(new ItemData(23083, 0.011111111111111112f, "1", false));
        drops.add(new ItemData(2722, 0.005f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(1113, 0.024f, "1", false));
        drops.add(new ItemData(12073, 0.0008333333333333334f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(2489, 0.02f, "1", false));
        drops.add(new ItemData(556, 0.05f, "60-80", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
