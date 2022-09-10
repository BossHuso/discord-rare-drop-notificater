package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Irondragon implements BaseNPC {
    public List<ItemData> drops;

    public Irondragon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(536, 1f, "1", false));
        drops.add(new ItemData(1183, 0.0078125f, "1", false));
        drops.add(new ItemData(1147, 0.0078125f, "1", false));
        drops.add(new ItemData(1373, 0.0078125f, "1", false));
        drops.add(new ItemData(830, 0.15625f, "4", false));
        drops.add(new ItemData(565, 0.1484375f, "15", false));
        drops.add(new ItemData(9143, 0.046875f, "2-12", false));
        drops.add(new ItemData(566, 0.0390625f, "3", false));
        drops.add(new ItemData(995, 0.15625f, "270", false));
        drops.add(new ItemData(995, 0.078125f, "550", false));
        drops.add(new ItemData(995, 0.0078125f, "990", false));
        drops.add(new ItemData(2351, 1f, "5", false));
        drops.add(new ItemData(161, 0.0625f, "1", false));
        drops.add(new ItemData(9431, 0.0390625f, "1", false));
        drops.add(new ItemData(2361, 0.0234375f, "2", false));
        drops.add(new ItemData(2011, 0.0234375f, "1", false));
        drops.add(new ItemData(4585, 0.0009765625f, "1", false));
        drops.add(new ItemData(4087, 0.0009765625f, "1", false));
        drops.add(new ItemData(817, 0.0546875f, "9", false));
        drops.add(new ItemData(23083, 0.012195121951219513f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(11286, 0.0001f, "1", false));
        drops.add(new ItemData(1317, 0.03125f, "1", false));
        drops.add(new ItemData(1357, 0.0234375f, "1", false));
        drops.add(new ItemData(1371, 0.0234375f, "1", false));
        drops.add(new ItemData(868, 0.0234375f, "5", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
