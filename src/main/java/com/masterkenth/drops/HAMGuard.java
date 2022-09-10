package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class HAMGuard implements BaseNPC {
    public List<ItemData> drops;

    public HAMGuard() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1207, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(1353, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(1269, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(4310, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(4298, 0.012090909090909091f, "1", false));
        drops.add(new ItemData(4300, 0.012090909090909091f, "1", false));
        drops.add(new ItemData(4306, 0.012090909090909091f, "1", false));
        drops.add(new ItemData(4302, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(4304, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(882, 0.024181818181818183f, "1-12", false));
        drops.add(new ItemData(1351, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(886, 0.01818181818181818f, "1-10", false));
        drops.add(new ItemData(199, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(201, 0.004545454545454545f, "1", false));
        drops.add(new ItemData(203, 0.003f, "1", false));
        drops.add(new ItemData(5318, 0.03225806451612903f, "4", false));
        drops.add(new ItemData(5319, 0.023809523809523808f, "4", false));
        drops.add(new ItemData(5324, 0.015873015873015872f, "4", false));
        drops.add(new ItemData(5322, 0.007936507936507936f, "3", false));
        drops.add(new ItemData(5320, 0.003952569169960474f, "3", false));
        drops.add(new ItemData(5323, 0.0019723865877712033f, "2", false));
        drops.add(new ItemData(1205, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(5321, 0.000942507068803016f, "2", false));
        drops.add(new ItemData(22879, 0.0006858710562414266f, "2", false));
        drops.add(new ItemData(1739, 0.02727272727272727f, "1-3", false));
        drops.add(new ItemData(1511, 0.02727272727272727f, "1-3", false));
        drops.add(new ItemData(1625, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(1627, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(440, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(453, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(321, 0.01818181818181818f, "1-3", false));
        drops.add(new ItemData(2138, 0.01818181818181818f, "1-3", false));
        drops.add(new ItemData(1265, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(995, 0.12272727272727273f, "1-20", false));
        drops.add(new ItemData(697, 0.03636363636363636f, "1", false));
        drops.add(new ItemData(686, 0.03636363636363636f, "1", false));
        drops.add(new ItemData(314, 0.02727272727272727f, "1-6", false));
        drops.add(new ItemData(1734, 0.01818181818181818f, "1-10", false));
        drops.add(new ItemData(946, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(1733, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(590, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(2677, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(1349, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(1267, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(1203, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(1129, 0.02727272727272727f, "1", false));
        drops.add(new ItemData(4308, 0.022727272727272728f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
