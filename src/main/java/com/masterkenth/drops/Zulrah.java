package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zulrah implements BaseNPC {
    public List<ItemData> drops;

    public Zulrah() {
        drops = new ArrayList<>();
        drops.add(new ItemData(12934, 1f, "100-299", false));
        drops.add(new ItemData(3204, 0.008064516129032258f, "1", false));
        drops.add(new ItemData(560, 0.04838709677419355f, "300", false));
        drops.add(new ItemData(563, 0.04838709677419355f, "200", false));
        drops.add(new ItemData(562, 0.04838709677419355f, "500", false));
        drops.add(new ItemData(3000, 0.008064516129032258f, "10", false));
        drops.add(new ItemData(267, 0.008064516129032258f, "30", false));
        drops.add(new ItemData(2998, 0.008064516129032258f, "25", false));
        drops.add(new ItemData(269, 0.008064516129032258f, "10", false));
        drops.add(new ItemData(5289, 0.024193548387096774f, "1", false));
        drops.add(new ItemData(5288, 0.024193548387096774f, "3", false));
        drops.add(new ItemData(12922, 0.0009765625f, "1", false));
        drops.add(new ItemData(5290, 0.024193548387096774f, "2", false));
        drops.add(new ItemData(5316, 0.016129032258064516f, "1", false));
        drops.add(new ItemData(5296, 0.008064516129032258f, "2", false));
        drops.add(new ItemData(5300, 0.008064516129032258f, "1", false));
        drops.add(new ItemData(5303, 0.008064516129032258f, "2", false));
        drops.add(new ItemData(5304, 0.008064516129032258f, "1", false));
        drops.add(new ItemData(5317, 0.004032258064516129f, "1", false));
        drops.add(new ItemData(6289, 0.04435483870967742f, "35", false));
        drops.add(new ItemData(451, 0.04435483870967742f, "2", false));
        drops.add(new ItemData(7936, 0.04032258064516129f, "1500", false));
        drops.add(new ItemData(12932, 0.0009765625f, "1", false));
        drops.add(new ItemData(1779, 0.04032258064516129f, "1000", false));
        drops.add(new ItemData(1515, 0.04032258064516129f, "35", false));
        drops.add(new ItemData(2361, 0.03225806451612903f, "20", false));
        drops.add(new ItemData(453, 0.03225806451612903f, "200", false));
        drops.add(new ItemData(536, 0.03225806451612903f, "12", false));
        drops.add(new ItemData(6332, 0.03225806451612903f, "50", false));
        drops.add(new ItemData(12938, 0.06048387096774194f, "4", false));
        drops.add(new ItemData(391, 0.04838709677419355f, "35", false));
        drops.add(new ItemData(5952, 0.036290322580645164f, "10", false));
        drops.add(new ItemData(9193, 0.03225806451612903f, "12", false));
        drops.add(new ItemData(12927, 0.0009765625f, "1", false));
        drops.add(new ItemData(1987, 0.024193548387096774f, "250", false));
        drops.add(new ItemData(5974, 0.024193548387096774f, "20", false));
        drops.add(new ItemData(1939, 0.020161290322580645f, "1000", false));
        drops.add(new ItemData(12934, 0.020161290322580645f, "500", false));
        drops.add(new ItemData(6571, 0.0009765625f, "1", false));
        drops.add(new ItemData(13200, 0.00007630093087135663f, "1", false));
        drops.add(new ItemData(13201, 0.00007630093087135663f, "1", false));
        drops.add(new ItemData(23083, 0.02f, "1", false));
        drops.add(new ItemData(12073, 0.013333333333333334f, "1", false));
        drops.add(new ItemData(12936, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(12921, 0.00025f, "1", false));
        drops.add(new ItemData(1391, 0.04032258064516129f, "10", false));
        drops.add(new ItemData(1149, 0.008064516129032258f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
