package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SpittingWyvern implements BaseNPC {
    public List<ItemData> drops;

    public SpittingWyvern() {
        drops = new ArrayList<>();
        drops.add(new ItemData(6812, 1f, "1", false));
        drops.add(new ItemData(890, 0.04878048780487805f, "38-42", false));
        drops.add(new ItemData(555, 0.032520325203252036f, "50", false));
        drops.add(new ItemData(562, 0.032520325203252036f, "15", false));
        drops.add(new ItemData(563, 0.032520325203252036f, "15", false));
        drops.add(new ItemData(560, 0.032520325203252036f, "15", false));
        drops.add(new ItemData(565, 0.032520325203252036f, "15", false));
        drops.add(new ItemData(566, 0.008130081300813009f, "10", false));
        drops.add(new ItemData(9144, 0.008130081300813009f, "12-30", false));
        drops.add(new ItemData(213, 0.02288329519450801f, "2", false));
        drops.add(new ItemData(215, 0.018281535648994516f, "2", false));
        drops.add(new ItemData(1397, 0.032520325203252036f, "1", false));
        drops.add(new ItemData(217, 0.018281535648994516f, "2", false));
        drops.add(new ItemData(2485, 0.013717421124828532f, "2", false));
        drops.add(new ItemData(207, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(219, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(21490, 0.016260162601626018f, "12", false));
        drops.add(new ItemData(5295, 0.017241379310344827f, "1", false));
        drops.add(new ItemData(5300, 0.0009105809506465125f, "1", false));
        drops.add(new ItemData(5304, 0.0007154611146884167f, "1", false));
        drops.add(new ItemData(5321, 0.0006504065040650406f, "15", false));
        drops.add(new ItemData(5313, 0.0006504065040650406f, "1", false));
        drops.add(new ItemData(1391, 0.024390243902439025f, "3-5", false));
        drops.add(new ItemData(21488, 0.0032948929159802307f, "1", false));
        drops.add(new ItemData(5314, 0.0005853772756541591f, "1", false));
        drops.add(new ItemData(21486, 0.006006006006006006f, "1", false));
        drops.add(new ItemData(5315, 0.008718395815170008f, "1", false));
        drops.add(new ItemData(5288, 0.00045529047532325625f, "1", false));
        drops.add(new ItemData(5316, 0.0003902439024390244f, "1", false));
        drops.add(new ItemData(5289, 0.0003252032520325203f, "1", false));
        drops.add(new ItemData(5317, 0.0002601592174410739f, "1", false));
        drops.add(new ItemData(22877, 0.0001951219512195122f, "1", false));
        drops.add(new ItemData(22869, 0.00013008130081300812f, "1", false));
        drops.add(new ItemData(1371, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(22871, 0.00013008130081300812f, "1", false));
        drops.add(new ItemData(7936, 0.06504065040650407f, "150", false));
        drops.add(new ItemData(2361, 0.04878048780487805f, "2-4", false));
        drops.add(new ItemData(6333, 0.04878048780487805f, "35", false));
        drops.add(new ItemData(231, 0.024390243902439025f, "10-15", false));
        drops.add(new ItemData(451, 0.024390243902439025f, "1-2", false));
        drops.add(new ItemData(379, 0.06504065040650407f, "2", false));
        drops.add(new ItemData(995, 0.08943089430894309f, "3000", false));
        drops.add(new ItemData(2434, 0.056910569105691054f, "1", false));
        drops.add(new ItemData(9463, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(1161, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(21543, 0.016260162601626018f, "2", false));
        drops.add(new ItemData(21545, 0.016260162601626018f, "2", false));
        drops.add(new ItemData(21622, 0.016260162601626018f, "20-60", false));
        drops.add(new ItemData(21555, 0.5263157894736842f, "4-25", false));
        drops.add(new ItemData(21562, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(21564, 0.014285714285714285f, "1", false));
        drops.add(new ItemData(21566, 0.011428571428571429f, "1", false));
        drops.add(new ItemData(21568, 0.002857142857142857f, "1", false));
        drops.add(new ItemData(23083, 0.0136986301369863f, "1", false));
        drops.add(new ItemData(2722, 0.00847457627118644f, "1", false));
        drops.add(new ItemData(1275, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(21637, 0.00008333333333333333f, "1", false));
        drops.add(new ItemData(1123, 0.016260162601626018f, "1", false));
        drops.add(new ItemData(21646, 0.001953125f, "1", false));
        drops.add(new ItemData(21643, 0.000390625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
