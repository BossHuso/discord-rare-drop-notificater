package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Necromancer implements BaseNPC {
    public List<ItemData> drops;

    public Necromancer() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(561, 0.057692307692307696f, "10-15", false));
        drops.add(new ItemData(563, 0.057692307692307696f, "10-15", false));
        drops.add(new ItemData(560, 0.038461538461538464f, "4-8", false));
        drops.add(new ItemData(565, 0.038461538461538464f, "4-8", false));
        drops.add(new ItemData(995, 0.038461538461538464f, "10-50", false));
        drops.add(new ItemData(1379, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(1438, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1444, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1440, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(1442, 0.019230769230769232f, "1", false));
        drops.add(new ItemData(556, 0.07692307692307693f, "20-30", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.07692307692307693f, "20-30", false));
        drops.add(new ItemData(557, 0.07692307692307693f, "20-30", false));
        drops.add(new ItemData(554, 0.07692307692307693f, "20-30", false));
        drops.add(new ItemData(558, 0.07692307692307693f, "20-30", false));
        drops.add(new ItemData(559, 0.07692307692307693f, "20-30", false));
        drops.add(new ItemData(564, 0.057692307692307696f, "10-15", false));
        drops.add(new ItemData(562, 0.057692307692307696f, "10-15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
