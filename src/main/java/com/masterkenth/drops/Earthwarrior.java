package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Earthwarrior implements BaseNPC {
    public List<ItemData> drops;

    public Earthwarrior() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00390625f, "1", false));
        drops.add(new ItemData(1621, 0.001953125f, "1", false));
        drops.add(new ItemData(1619, 0.0009765625f, "1", false));
        drops.add(new ItemData(1452, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1462, 0.00036618232950550735f, "1", false));
        drops.add(new ItemData(1617, 0.000244140625f, "1", false));
        drops.add(new ItemData(830, 0.0001220703125f, "5", false));
        drops.add(new ItemData(987, 0.0001220703125f, "1", false));
        drops.add(new ItemData(985, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1247, 0.00000762939453125f, "1", false));
        drops.add(new ItemData(2366, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(1249, 0.000002860799449261776f, "1", false));
        drops.add(new ItemData(1241, 0.0234375f, "1", false));
        drops.add(new ItemData(199, 0.0273224043715847f, "1", false));
        drops.add(new ItemData(201, 0.020491803278688523f, "1", false));
        drops.add(new ItemData(203, 0.015384615384615385f, "1", false));
        drops.add(new ItemData(205, 0.011961722488038277f, "1", false));
        drops.add(new ItemData(207, 0.009398496240601503f, "1", false));
        drops.add(new ItemData(209, 0.00683526999316473f, "1", false));
        drops.add(new ItemData(211, 0.005128205128205128f, "1", false));
        drops.add(new ItemData(213, 0.004271678769756515f, "1", false));
        drops.add(new ItemData(215, 0.003417634996582365f, "1", false));
        drops.add(new ItemData(2485, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(1385, 0.015625f, "1", false));
        drops.add(new ItemData(217, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(5100, 0.01838235294117647f, "1", false));
        drops.add(new ItemData(5323, 0.01757469244288225f, "1", false));
        drops.add(new ItemData(5292, 0.016778523489932886f, "1", false));
        drops.add(new ItemData(5104, 0.012345679012345678f, "1", false));
        drops.add(new ItemData(5293, 0.011402508551881414f, "1", false));
        drops.add(new ItemData(5311, 0.011135857461024499f, "1", false));
        drops.add(new ItemData(5321, 0.0084530853761623f, "1", false));
        drops.add(new ItemData(5294, 0.007513148009015778f, "1", false));
        drops.add(new ItemData(22879, 0.005367686527106817f, "1", false));
        drops.add(new ItemData(557, 0.1015625f, "12", false));
        drops.add(new ItemData(5295, 0.0052328623757195184f, "1", false));
        drops.add(new ItemData(5105, 0.004562043795620438f, "1", false));
        drops.add(new ItemData(5282, 0.0038910505836575876f, "1", false));
        drops.add(new ItemData(5296, 0.0036231884057971015f, "1", false));
        drops.add(new ItemData(5281, 0.0024154589371980675f, "1", false));
        drops.add(new ItemData(5297, 0.0024154589371980675f, "1", false));
        drops.add(new ItemData(5106, 0.0017442874585731729f, "1", false));
        drops.add(new ItemData(5298, 0.001610305958132045f, "1", false));
        drops.add(new ItemData(5280, 0.001610305958132045f, "1", false));
        drops.add(new ItemData(5299, 0.0012077294685990338f, "1", false));
        drops.add(new ItemData(561, 0.0703125f, "3", false));
        drops.add(new ItemData(22873, 0.00107342206955775f, "1", false));
        drops.add(new ItemData(5300, 0.0006709158000670916f, "1", false));
        drops.add(new ItemData(5301, 0.0005367398421984864f, "1", false));
        drops.add(new ItemData(5302, 0.00040256028340243953f, "1", false));
        drops.add(new ItemData(5303, 0.0002683699210992432f, "1", false));
        drops.add(new ItemData(5304, 0.0001341849605496216f, "1", false));
        drops.add(new ItemData(995, 0.140625f, "12", false));
        drops.add(new ItemData(562, 0.0546875f, "3", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(6798, 0.0002f, "1", false));
        drops.add(new ItemData(563, 0.046875f, "2", false));
        drops.add(new ItemData(23490, 0.002840909090909091f, "1", false));
        drops.add(new ItemData(21257, 0.0036101083032490976f, "1", false));
        drops.add(new ItemData(560, 0.03125f, "2", false));
        drops.add(new ItemData(557, 0.0234375f, "60", false));
        drops.add(new ItemData(565, 0.0078125f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
