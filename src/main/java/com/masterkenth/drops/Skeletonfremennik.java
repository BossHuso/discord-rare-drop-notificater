package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Skeletonfremennik implements BaseNPC {
    public List<ItemData> drops;

    public Skeletonfremennik() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(888, 0.015625f, "8", false));
        drops.add(new ItemData(555, 0.0234375f, "20", false));
        drops.add(new ItemData(564, 0.0078125f, "4", false));
        drops.add(new ItemData(5100, 0.02040816326530612f, "1", false));
        drops.add(new ItemData(5323, 0.01953125f, "1", false));
        drops.add(new ItemData(5292, 0.0186219739292365f, "1", false));
        drops.add(new ItemData(5104, 0.013717421124828532f, "1", false));
        drops.add(new ItemData(5293, 0.012674271229404309f, "1", false));
        drops.add(new ItemData(5311, 0.012376237623762377f, "1", false));
        drops.add(new ItemData(5321, 0.009389671361502348f, "1", false));
        drops.add(new ItemData(5294, 0.008347245409015025f, "1", false));
        drops.add(new ItemData(22879, 0.005963029218843173f, "1", false));
        drops.add(new ItemData(5295, 0.005813953488372093f, "1", false));
        drops.add(new ItemData(5105, 0.00506842372022301f, "1", false));
        drops.add(new ItemData(5282, 0.00432338953739732f, "1", false));
        drops.add(new ItemData(5296, 0.004025764895330112f, "1", false));
        drops.add(new ItemData(5281, 0.0026838432635534087f, "1", false));
        drops.add(new ItemData(5297, 0.0026838432635534087f, "1", false));
        drops.add(new ItemData(5106, 0.0019383601473153711f, "1", false));
        drops.add(new ItemData(5298, 0.001789228842368939f, "1", false));
        drops.add(new ItemData(1361, 0.015625f, "1", false));
        drops.add(new ItemData(5280, 0.001789228842368939f, "1", false));
        drops.add(new ItemData(5299, 0.0013419216317767043f, "1", false));
        drops.add(new ItemData(22873, 0.0011927480916030535f, "1", false));
        drops.add(new ItemData(5300, 0.000745489786789921f, "1", false));
        drops.add(new ItemData(5301, 0.0005963740458015267f, "1", false));
        drops.add(new ItemData(5302, 0.0004472872031131189f, "1", false));
        drops.add(new ItemData(5303, 0.00029818702290076337f, "1", false));
        drops.add(new ItemData(5304, 0.00014909351145038168f, "1", false));
        drops.add(new ItemData(995, 0.1796875f, "20", false));
        drops.add(new ItemData(995, 0.0625f, "50", false));
        drops.add(new ItemData(1141, 0.046875f, "1", false));
        drops.add(new ItemData(995, 0.1953125f, "80", false));
        drops.add(new ItemData(995, 0.03125f, "90", false));
        drops.add(new ItemData(995, 0.0234375f, "185", false));
        drops.add(new ItemData(995, 0.015625f, "200", false));
        drops.add(new ItemData(2359, 0.0390625f, "1", false));
        drops.add(new ItemData(1281, 0.03125f, "1", false));
        drops.add(new ItemData(1329, 0.0078125f, "1", false));
        drops.add(new ItemData(556, 0.0234375f, "60", false));
        drops.add(new ItemData(562, 0.0234375f, "9", false));
        drops.add(new ItemData(563, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
