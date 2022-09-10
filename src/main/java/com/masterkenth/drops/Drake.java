package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Drake implements BaseNPC {
    public List<ItemData> drops;

    public Drake() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0029411764705882353f, "1", false));
        drops.add(new ItemData(1621, 0.0014705882352941176f, "1", false));
        drops.add(new ItemData(1619, 0.0007352941176470588f, "1", false));
        drops.add(new ItemData(1452, 0.0002757137539806173f, "1", false));
        drops.add(new ItemData(1462, 0.0002757137539806173f, "1", false));
        drops.add(new ItemData(1617, 0.0001838235294117647f, "1", false));
        drops.add(new ItemData(830, 0.00009191176470588235f, "5", false));
        drops.add(new ItemData(987, 0.00009191176470588235f, "1", false));
        drops.add(new ItemData(985, 0.00009191176470588235f, "1", false));
        drops.add(new ItemData(1247, 0.000005744485294117647f, "1", false));
        drops.add(new ItemData(2366, 0.0000028722426470588235f, "1", false));
        drops.add(new ItemData(1249, 0.0000021540137029735725f, "1", false));
        drops.add(new ItemData(22783, 1f, "1", false));
        drops.add(new ItemData(1434, 0.011764705882352941f, "1", false));
        drops.add(new ItemData(554, 0.11764705882352941f, "100-200", false));
        drops.add(new ItemData(561, 0.11764705882352941f, "30-60", false));
        drops.add(new ItemData(563, 0.11764705882352941f, "25-50", false));
        drops.add(new ItemData(560, 0.11764705882352941f, "20-40", false));
        drops.add(new ItemData(892, 0.11764705882352941f, "35-65", false));
        drops.add(new ItemData(199, 0.014705882352941176f, "1-3", false));
        drops.add(new ItemData(201, 0.011025358324145534f, "1-3", false));
        drops.add(new ItemData(203, 0.008271298593879239f, "1-3", false));
        drops.add(new ItemData(205, 0.006435006435006435f, "1-3", false));
        drops.add(new ItemData(22960, 0.000390625f, "1", false));
        drops.add(new ItemData(207, 0.005055611729019211f, "1-3", false));
        drops.add(new ItemData(209, 0.003676470588235294f, "1-3", false));
        drops.add(new ItemData(211, 0.0027570995312930797f, "1-3", false));
        drops.add(new ItemData(213, 0.002297794117647059f, "1-3", false));
        drops.add(new ItemData(215, 0.001838235294117647f, "1-3", false));
        drops.add(new ItemData(2485, 0.0013787398317937406f, "1-3", false));
        drops.add(new ItemData(217, 0.0013787398317937406f, "1-3", false));
        drops.add(new ItemData(211, 0.011025358324145534f, "1-3", false));
        drops.add(new ItemData(213, 0.011025358324145534f, "1-3", false));
        drops.add(new ItemData(207, 0.0088261253309797f, "1-3", false));
        drops.add(new ItemData(22957, 0.000390625f, "1", false));
        drops.add(new ItemData(3051, 0.0088261253309797f, "1-3", false));
        drops.add(new ItemData(215, 0.0088261253309797f, "1-3", false));
        drops.add(new ItemData(217, 0.0088261253309797f, "1-3", false));
        drops.add(new ItemData(2485, 0.0066181336863004635f, "1-3", false));
        drops.add(new ItemData(219, 0.0066181336863004635f, "1-3", false));
        drops.add(new ItemData(5296, 0.0023430178069353325f, "1", false));
        drops.add(new ItemData(5297, 0.0015951507417450949f, "1", false));
        drops.add(new ItemData(5281, 0.0015453562046051615f, "1", false));
        drops.add(new ItemData(5106, 0.0010967317394165387f, "1", false));
        drops.add(new ItemData(5298, 0.0010967317394165387f, "1", false));
        drops.add(new ItemData(20849, 0.0001f, "100-200", false));
        drops.add(new ItemData(5280, 0.0010469011725293131f, "1", false));
        drops.add(new ItemData(22873, 0.0007477753682793689f, "1", false));
        drops.add(new ItemData(5299, 0.0007477753682793689f, "1", false));
        drops.add(new ItemData(5300, 0.0004985044865403788f, "1", false));
        drops.add(new ItemData(5301, 0.0003489548801339987f, "1", false));
        drops.add(new ItemData(5302, 0.0002492522432701894f, "1", false));
        drops.add(new ItemData(22879, 0.00019940179461615153f, "3", false));
        drops.add(new ItemData(5303, 0.00014955060044566078f, "1", false));
        drops.add(new ItemData(5304, 0.00009970089730807577f, "1", false));
        drops.add(new ItemData(995, 0.047058823529411764f, "1000-2000", false));
        drops.add(new ItemData(22804, 0.0001f, "100-200", false));
        drops.add(new ItemData(995, 0.011764705882352941f, "5000-7000", false));
        drops.add(new ItemData(1601, 0.047058823529411764f, "3-6", false));
        drops.add(new ItemData(373, 0.047058823529411764f, "1-2", false));
        drops.add(new ItemData(1163, 0.03529411764705882f, "1", false));
        drops.add(new ItemData(23083, 0.015625f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(2501, 0.023529411764705882f, "1", false));
        drops.add(new ItemData(2491, 0.011764705882352941f, "1", false));
        drops.add(new ItemData(1407, 0.011764705882352941f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
