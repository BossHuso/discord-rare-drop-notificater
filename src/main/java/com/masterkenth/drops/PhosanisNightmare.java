package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class PhosanisNightmare implements BaseNPC {
    public List<ItemData> drops;

    public PhosanisNightmare() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(564, 0.04f, "247-420", false));
        drops.add(new ItemData(561, 0.04f, "165-305", false));
        drops.add(new ItemData(560, 0.04f, "165-305", false));
        drops.add(new ItemData(565, 0.04f, "343-765", false));
        drops.add(new ItemData(566, 0.04f, "110-228", false));
        drops.add(new ItemData(2, 0.04f, "137-382", false));
        drops.add(new ItemData(892, 0.03f, "412-957", false));
        drops.add(new ItemData(447, 0.05f, "165-305", false));
        drops.add(new ItemData(453, 0.04f, "220-458", false));
        drops.add(new ItemData(444, 0.04f, "165-305", false));
        drops.add(new ItemData(24422, 0.0014992503748125937f, "1", false));
        drops.add(new ItemData(449, 0.04f, "40-95", false));
        drops.add(new ItemData(1513, 0.04f, "40-95", false));
        drops.add(new ItemData(215, 0.04f, "13-26", false));
        drops.add(new ItemData(219, 0.04f, "13-26", false));
        drops.add(new ItemData(5300, 0.03f, "5-10", false));
        drops.add(new ItemData(1621, 0.03f, "33-75", false));
        drops.add(new ItemData(1619, 0.03f, "27-60", false));
        drops.add(new ItemData(451, 0.02f, "11-26", false));
        drops.add(new ItemData(365, 0.06f, "16-29", false));
        drops.add(new ItemData(385, 0.06f, "13-26", false));
        drops.add(new ItemData(24419, 0.001f, "1", false));
        drops.add(new ItemData(139, 0.05f, "8-15", false));
        drops.add(new ItemData(10927, 0.05f, "6-12", false));
        drops.add(new ItemData(6687, 0.05f, "8-15", false));
        drops.add(new ItemData(189, 0.05f, "1-15", false));
        drops.add(new ItemData(995, 0.02f, "41417-72013", false));
        drops.add(new ItemData(12073, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(25837, 0.01f, "1", false));
        drops.add(new ItemData(25838, 0.005f, "1", false));
        drops.add(new ItemData(24491, 0.0007142857142857143f, "1", false));
        drops.add(new ItemData(24495, 0.00025f, "1", false));
        drops.add(new ItemData(24420, 0.001f, "1", false));
        drops.add(new ItemData(24421, 0.001f, "1", false));
        drops.add(new ItemData(24417, 0.0005f, "1", false));
        drops.add(new ItemData(24517, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(24511, 0.0003333333333333333f, "1", false));
        drops.add(new ItemData(24514, 0.0003333333333333333f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
