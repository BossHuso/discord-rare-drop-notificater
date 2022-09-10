package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantdarkbeast implements BaseNPC {
    public List<ItemData> drops;

    public Revenantdarkbeast() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-22", false));
        drops.add(new ItemData(22299, 0.00011363636363636364f, "1", false));
        drops.add(new ItemData(22302, 0.00011363636363636364f, "1", false));
        drops.add(new ItemData(22305, 0.00011363636363636364f, "1", false));
        drops.add(new ItemData(21816, 0.12121212121212122f, "1", false));
        drops.add(new ItemData(1391, 0.04040404040404041f, "3", false));
        drops.add(new ItemData(1163, 0.01616031027795734f, "1", false));
        drops.add(new ItemData(1127, 0.01616031027795734f, "1", false));
        drops.add(new ItemData(1079, 0.01616031027795734f, "1", false));
        drops.add(new ItemData(1201, 0.01616031027795734f, "1", false));
        drops.add(new ItemData(1347, 0.01616031027795734f, "1", false));
        drops.add(new ItemData(22557, 0.00004545454545454545f, "1", false));
        drops.add(new ItemData(4087, 0.00404040404040404f, "1", false));
        drops.add(new ItemData(4585, 0.00404040404040404f, "1", false));
        drops.add(new ItemData(1215, 0.00808080808080808f, "1", false));
        drops.add(new ItemData(1305, 0.00808080808080808f, "1", false));
        drops.add(new ItemData(1149, 0.0014772794421792827f, "1", false));
        drops.add(new ItemData(453, 0.048473097430925836f, "25-40", false));
        drops.add(new ItemData(2361, 0.048473097430925836f, "4-6", false));
        drops.add(new ItemData(451, 0.03232062055591468f, "1-3", false));
        drops.add(new ItemData(2363, 0.024242424242424242f, "1-2", false));
        drops.add(new ItemData(1747, 0.03232062055591468f, "3-4", false));
        drops.add(new ItemData(22550, 0.000022727272727272726f, "1", false));
        drops.add(new ItemData(8782, 0.024242424242424242f, "5-12", false));
        drops.add(new ItemData(391, 0.03232062055591468f, "10-15", false));
        drops.add(new ItemData(1515, 0.03232062055591468f, "20-40", false));
        drops.add(new ItemData(1513, 0.01616031027795734f, "5-12", false));
        drops.add(new ItemData(1631, 0.00808080808080808f, "2-5", false));
        drops.add(new ItemData(5315, 0.00045454545454545455f, "2-7", false));
        drops.add(new ItemData(5316, 0.00045454545454545455f, "2-7", false));
        drops.add(new ItemData(995, 0.1953125f, "1-251", false));
        drops.add(new ItemData(21802, 0.04040404040404041f, "1", false));
        drops.add(new ItemData(3024, 0.024242424242424242f, "1-3", false));
        drops.add(new ItemData(22555, 0.000022727272727272726f, "1", false));
        drops.add(new ItemData(9193, 0.024242424242424242f, "15-30", false));
        drops.add(new ItemData(9194, 0.024242424242424242f, "2-4", false));
        drops.add(new ItemData(563, 0.04040404040404041f, "20-45", false));
        drops.add(new ItemData(560, 0.04040404040404041f, "15-30", false));
        drops.add(new ItemData(565, 0.04040404040404041f, "10-20", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(21257, 0.004807692307692308f, "1", false));
        drops.add(new ItemData(22545, 0.000022727272727272726f, "1", false));
        drops.add(new ItemData(21807, 0.0006818166322349268f, "1", false));
        drops.add(new ItemData(21810, 0.00045454545454545455f, "1", false));
        drops.add(new ItemData(21813, 0.00022727272727272727f, "1", false));
        drops.add(new ItemData(21804, 0.0003409094783062253f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
