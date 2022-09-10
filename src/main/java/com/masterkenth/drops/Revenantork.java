package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantork implements BaseNPC {
    public List<ItemData> drops;

    public Revenantork() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-22", false));
        drops.add(new ItemData(22299, 0.00011363636363636364f, "1", false));
        drops.add(new ItemData(22302, 0.00011363636363636364f, "1", false));
        drops.add(new ItemData(22305, 0.00011363636363636364f, "1", false));
        drops.add(new ItemData(21816, 0.10330578512396695f, "1", false));
        drops.add(new ItemData(1391, 0.03443526170798898f, "3", false));
        drops.add(new ItemData(1163, 0.013774104683195593f, "1", false));
        drops.add(new ItemData(1127, 0.013774104683195593f, "1", false));
        drops.add(new ItemData(1079, 0.013774104683195593f, "1", false));
        drops.add(new ItemData(1201, 0.013774104683195593f, "1", false));
        drops.add(new ItemData(1347, 0.013774104683195593f, "1", false));
        drops.add(new ItemData(22557, 0.00004545454545454545f, "1", false));
        drops.add(new ItemData(4087, 0.003443526170798898f, "1", false));
        drops.add(new ItemData(4585, 0.003443526170798898f, "1", false));
        drops.add(new ItemData(1215, 0.006887052341597796f, "1", false));
        drops.add(new ItemData(1305, 0.006887052341597796f, "1", false));
        drops.add(new ItemData(1149, 0.0014772794421792827f, "1", false));
        drops.add(new ItemData(453, 0.04132231404958678f, "25-40", false));
        drops.add(new ItemData(2361, 0.04132231404958678f, "4-6", false));
        drops.add(new ItemData(451, 0.027548209366391185f, "1-3", false));
        drops.add(new ItemData(2363, 0.02066115702479339f, "1-2", false));
        drops.add(new ItemData(1747, 0.027548209366391185f, "3-4", false));
        drops.add(new ItemData(22550, 0.000022727272727272726f, "1", false));
        drops.add(new ItemData(8782, 0.02066115702479339f, "5-12", false));
        drops.add(new ItemData(391, 0.027548209366391185f, "10-15", false));
        drops.add(new ItemData(1515, 0.027548209366391185f, "20-40", false));
        drops.add(new ItemData(1513, 0.013774104683195593f, "5-12", false));
        drops.add(new ItemData(1631, 0.006887052341597796f, "2-5", false));
        drops.add(new ItemData(5315, 0.00045454545454545455f, "2-7", false));
        drops.add(new ItemData(5316, 0.00045454545454545455f, "2-7", false));
        drops.add(new ItemData(995, 0.31347962382445144f, "1-251", false));
        drops.add(new ItemData(21802, 0.03443526170798898f, "1", false));
        drops.add(new ItemData(3024, 0.02066115702479339f, "1-3", false));
        drops.add(new ItemData(22555, 0.000022727272727272726f, "1", false));
        drops.add(new ItemData(9193, 0.02066115702479339f, "15-30", false));
        drops.add(new ItemData(9194, 0.02066115702479339f, "2-4", false));
        drops.add(new ItemData(563, 0.03443526170798898f, "20-45", false));
        drops.add(new ItemData(560, 0.03443526170798898f, "15-30", false));
        drops.add(new ItemData(565, 0.03443526170798898f, "10-20", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.010638297872340425f, "1", false));
        drops.add(new ItemData(21257, 0.00423728813559322f, "1", false));
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
