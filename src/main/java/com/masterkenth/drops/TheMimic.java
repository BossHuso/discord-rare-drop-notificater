package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TheMimic implements BaseNPC {
    public List<ItemData> drops;

    public TheMimic() {
        drops = new ArrayList<>();
        drops.add(new ItemData(8782, 1f, "1", false));
        drops.add(new ItemData(10346, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(23242, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10352, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10334, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10330, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10332, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10336, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10342, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10338, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10340, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(560, 0.125f, "480,600", false));
        drops.add(new ItemData(10344, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(12426, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(12424, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(12422, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(12437, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(23336, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(23339, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(23345, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(23342, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(20014, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(565, 0.125f, "400,500", false));
        drops.add(new ItemData(20011, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(207, 0.125f, "25", false));
        drops.add(new ItemData(389, 0.125f, "15", false));
        drops.add(new ItemData(245, 0.125f, "25", false));
        drops.add(new ItemData(23185, 0.025f, "1", false));
        drops.add(new ItemData(10350, 0.00019069412662090009f, "1", false));
        drops.add(new ItemData(10348, 0.00019069412662090009f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
