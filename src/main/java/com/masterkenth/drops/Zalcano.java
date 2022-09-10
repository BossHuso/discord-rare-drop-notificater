package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Zalcano implements BaseNPC {
    public List<ItemData> drops;

    public Zalcano() {
        drops = new ArrayList<>();
        drops.add(new ItemData(23962, 1f, "1-3", false));
        drops.add(new ItemData(453, 0.027777777777777776f, "169-926", false));
        drops.add(new ItemData(447, 0.05555555555555555f, "56-387", false));
        drops.add(new ItemData(449, 0.05555555555555555f, "51-289", false));
        drops.add(new ItemData(451, 0.05555555555555555f, "3-26", false));
        drops.add(new ItemData(444, 0.08333333333333333f, "86-721", false));
        drops.add(new ItemData(2353, 0.08333333333333333f, "78-534", false));
        drops.add(new ItemData(2359, 0.08333333333333333f, "54-459", false));
        drops.add(new ItemData(2361, 0.05555555555555555f, "15-107", false));
        drops.add(new ItemData(2363, 0.05555555555555555f, "3-27", false));
        drops.add(new ItemData(1617, 0.05555555555555555f, "2-21", false));
        drops.add(new ItemData(25778, 1f, "1", false));
        drops.add(new ItemData(1631, 0.05555555555555555f, "1-11", false));
        drops.add(new ItemData(9194, 0.05555555555555555f, "4-44", false));
        drops.add(new ItemData(7936, 0.027777777777777776f, "784-5500", false));
        drops.add(new ItemData(23953, 0.005f, "1", false));
        drops.add(new ItemData(23908, 0.0013333333333333333f, "1", false));
        drops.add(new ItemData(23760, 0.00044444444444444447f, "1", false));
        drops.add(new ItemData(6571, 0.000125f, "1", false));
        drops.add(new ItemData(565, 0.027777777777777776f, "64-480", false));
        drops.add(new ItemData(564, 0.027777777777777776f, "295-926", false));
        drops.add(new ItemData(560, 0.027777777777777776f, "201-831", false));
        drops.add(new ItemData(563, 0.027777777777777776f, "166-770", false));
        drops.add(new ItemData(566, 0.027777777777777776f, "57-388", false));
        drops.add(new ItemData(561, 0.027777777777777776f, "1-842", false));
        drops.add(new ItemData(442, 0.08333333333333333f, "102-800", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
