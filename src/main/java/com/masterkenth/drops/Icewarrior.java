package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Icewarrior implements BaseNPC {
    public List<ItemData> drops;

    public Icewarrior() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.005859375f, "1", false));
        drops.add(new ItemData(1621, 0.0029296875f, "1", false));
        drops.add(new ItemData(1619, 0.00146484375f, "1", false));
        drops.add(new ItemData(1452, 0.000549273494258261f, "1", false));
        drops.add(new ItemData(1462, 0.000549273494258261f, "1", false));
        drops.add(new ItemData(1617, 0.0003662109375f, "1", false));
        drops.add(new ItemData(830, 0.00018310546875f, "5", false));
        drops.add(new ItemData(987, 0.00018310546875f, "1", false));
        drops.add(new ItemData(985, 0.00018310546875f, "1", false));
        drops.add(new ItemData(1247, 0.000011444091796875f, "1", false));
        drops.add(new ItemData(2366, 0.0000057220458984375f, "1", false));
        drops.add(new ItemData(1249, 0.000004291199173892664f, "1", false));
        drops.add(new ItemData(1363, 0.0234375f, "1", false));
        drops.add(new ItemData(565, 0.0078125f, "2", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(1428, 0.0078125f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(5100, 0.01838235294117647f, "1", false));
        drops.add(new ItemData(5323, 0.01757469244288225f, "1", false));
        drops.add(new ItemData(5292, 0.016778523489932886f, "1", false));
        drops.add(new ItemData(5104, 0.012345679012345678f, "1", false));
        drops.add(new ItemData(5293, 0.011402508551881414f, "1", false));
        drops.add(new ItemData(5311, 0.011135857461024499f, "1", false));
        drops.add(new ItemData(5321, 0.0084530853761623f, "1", false));
        drops.add(new ItemData(5294, 0.007513148009015778f, "1", false));
        drops.add(new ItemData(561, 0.078125f, "4", false));
        drops.add(new ItemData(22879, 0.005367686527106817f, "1", false));
        drops.add(new ItemData(5295, 0.0052328623757195184f, "1", false));
        drops.add(new ItemData(5105, 0.004562043795620438f, "1", false));
        drops.add(new ItemData(5282, 0.0038910505836575876f, "1", false));
        drops.add(new ItemData(5296, 0.0036231884057971015f, "1", false));
        drops.add(new ItemData(5281, 0.0024154589371980675f, "1", false));
        drops.add(new ItemData(5297, 0.0024154589371980675f, "1", false));
        drops.add(new ItemData(5106, 0.0017442874585731729f, "1", false));
        drops.add(new ItemData(5298, 0.001610305958132045f, "1", false));
        drops.add(new ItemData(5280, 0.001610305958132045f, "1", false));
        drops.add(new ItemData(562, 0.0625f, "3", false));
        drops.add(new ItemData(5299, 0.0012077294685990338f, "1", false));
        drops.add(new ItemData(22873, 0.00107342206955775f, "1", false));
        drops.add(new ItemData(5300, 0.0006709158000670916f, "1", false));
        drops.add(new ItemData(5301, 0.0005367398421984864f, "1", false));
        drops.add(new ItemData(5302, 0.00040256028340243953f, "1", false));
        drops.add(new ItemData(5303, 0.0002683699210992432f, "1", false));
        drops.add(new ItemData(5304, 0.0001341849605496216f, "1", false));
        drops.add(new ItemData(995, 0.3046875f, "15", false));
        drops.add(new ItemData(995, 0.140625f, "5", false));
        drops.add(new ItemData(995, 0.078125f, "10", false));
        drops.add(new ItemData(563, 0.0546875f, "2", false));
        drops.add(new ItemData(564, 0.0390625f, "2", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.003875968992248062f, "1", false));
        drops.add(new ItemData(21257, 0.003663003663003663f, "1", false));
        drops.add(new ItemData(888, 0.0390625f, "3", false));
        drops.add(new ItemData(890, 0.0234375f, "2", false));
        drops.add(new ItemData(560, 0.0234375f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
