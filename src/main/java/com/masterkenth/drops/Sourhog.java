package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Sourhog implements BaseNPC {
    public List<ItemData> drops;

    public Sourhog() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(199, 0.022727272727272728f, "1", false));
        drops.add(new ItemData(201, 0.017035775127768313f, "1", false));
        drops.add(new ItemData(203, 0.01278772378516624f, "1", false));
        drops.add(new ItemData(205, 0.009940357852882704f, "1", false));
        drops.add(new ItemData(207, 0.0078125f, "1", false));
        drops.add(new ItemData(209, 0.005681818181818182f, "1", false));
        drops.add(new ItemData(211, 0.004260758414997869f, "1", false));
        drops.add(new ItemData(213, 0.0035511363636363635f, "1", false));
        drops.add(new ItemData(215, 0.002840909090909091f, "1", false));
        drops.add(new ItemData(2485, 0.002130833155763904f, "1", false));
        drops.add(new ItemData(1331, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(217, 0.002130833155763904f, "1", false));
        drops.add(new ItemData(5100, 0.02849002849002849f, "1", false));
        drops.add(new ItemData(5323, 0.027247956403269755f, "1", false));
        drops.add(new ItemData(5292, 0.026041666666666668f, "1", false));
        drops.add(new ItemData(5104, 0.019157088122605363f, "1", false));
        drops.add(new ItemData(5293, 0.017699115044247787f, "1", false));
        drops.add(new ItemData(5311, 0.017271157167530225f, "1", false));
        drops.add(new ItemData(5321, 0.013123359580052493f, "1", false));
        drops.add(new ItemData(5294, 0.011655011655011656f, "1", false));
        drops.add(new ItemData(22879, 0.00832639467110741f, "1", false));
        drops.add(new ItemData(1199, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(5295, 0.008116883116883116f, "1", false));
        drops.add(new ItemData(5105, 0.007077140835102618f, "1", false));
        drops.add(new ItemData(5282, 0.006038647342995169f, "1", false));
        drops.add(new ItemData(5296, 0.005621135469364812f, "1", false));
        drops.add(new ItemData(5281, 0.003746721618583739f, "1", false));
        drops.add(new ItemData(5297, 0.003746721618583739f, "1", false));
        drops.add(new ItemData(5106, 0.0027063599458728013f, "1", false));
        drops.add(new ItemData(5298, 0.002498126405196103f, "1", false));
        drops.add(new ItemData(5280, 0.002498126405196103f, "1", false));
        drops.add(new ItemData(5299, 0.001873711823121604f, "1", false));
        drops.add(new ItemData(558, 0.05454545454545454f, "3-10", false));
        drops.add(new ItemData(22873, 0.0016655562958027982f, "1", false));
        drops.add(new ItemData(5300, 0.0010409076714895389f, "1", false));
        drops.add(new ItemData(5301, 0.0008327781479013991f, "1", false));
        drops.add(new ItemData(5302, 0.0006245706077072013f, "1", false));
        drops.add(new ItemData(5303, 0.00041637173668651373f, "1", false));
        drops.add(new ItemData(5304, 0.0002081902025690671f, "1", false));
        drops.add(new ItemData(995, 0.13636363636363635f, "5-30", false));
        drops.add(new ItemData(225, 0.045454545454545456f, "1", false));
        drops.add(new ItemData(1965, 0.045454545454545456f, "1", false));
        drops.add(new ItemData(1942, 0.045454545454545456f, "1", false));
        drops.add(new ItemData(556, 0.05454545454545454f, "5-15", false));
        drops.add(new ItemData(1955, 0.045454545454545456f, "1", false));
        drops.add(new ItemData(557, 0.05454545454545454f, "5-15", false));
        drops.add(new ItemData(561, 0.03636363636363636f, "1-5", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(562, 0.045454545454545456f, "1-5", false));
        drops.add(new ItemData(886, 0.045454545454545456f, "3-7", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
