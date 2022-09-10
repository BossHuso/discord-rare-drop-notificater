package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Adamantdragon implements BaseNPC {
    public List<ItemData> drops;

    public Adamantdragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(21880, 0.07272727272727272f, "10-30", false));
        drops.add(new ItemData(562, 0.06363636363636363f, "60-120", false));
        drops.add(new ItemData(560, 0.06363636363636363f, "30-60", false));
        drops.add(new ItemData(211, 0.022727272727272728f, "1", false));
        drops.add(new ItemData(207, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(3051, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(219, 0.013636983499249966f, "1", false));
        drops.add(new ItemData(19578, 0.07272727272727272f, "40-50", false));
        drops.add(new ItemData(9380, 0.1f, "20-40", false));
        drops.add(new ItemData(1601, 0.06363636363636363f, "1-3", false));
        drops.add(new ItemData(2361, 1f, "2", false));
        drops.add(new ItemData(19582, 0.06363636363636363f, "20-30", false));
        drops.add(new ItemData(449, 0.05454545454545454f, "8-20", false));
        drops.add(new ItemData(2361, 0.03636363636363636f, "5-35", false));
        drops.add(new ItemData(21930, 0.00909090909090909f, "15-20", false));
        drops.add(new ItemData(22118, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(1123, 0.08181818181818182f, "1", false));
        drops.add(new ItemData(1432, 0.06363636363636363f, "1", false));
        drops.add(new ItemData(1333, 0.06363636363636363f, "1", false));
        drops.add(new ItemData(23083, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(12073, 0.003125f, "1", false));
        drops.add(new ItemData(21918, 0.001f, "1", false));
        drops.add(new ItemData(22100, 0.0002f, "1", false));
        drops.add(new ItemData(11286, 0.00011111111111111112f, "1", false));
        drops.add(new ItemData(1149, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(4087, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(4585, 0.00909090909090909f, "1", false));
        drops.add(new ItemData(890, 0.07272727272727272f, "30-40", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
