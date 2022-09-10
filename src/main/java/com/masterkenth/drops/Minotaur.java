package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Minotaur implements BaseNPC {
    public List<ItemData> drops;

    public Minotaur() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0024752475247524753f, "1", false));
        drops.add(new ItemData(1621, 0.0012376237623762376f, "1", false));
        drops.add(new ItemData(1619, 0.0006188118811881188f, "1", false));
        drops.add(new ItemData(1452, 0.0002320363276074502f, "1", false));
        drops.add(new ItemData(1462, 0.0002320363276074502f, "1", false));
        drops.add(new ItemData(1617, 0.0001547029702970297f, "1", false));
        drops.add(new ItemData(830, 0.00007735148514851485f, "5", false));
        drops.add(new ItemData(987, 0.00007735148514851485f, "1", false));
        drops.add(new ItemData(985, 0.00007735148514851485f, "1", false));
        drops.add(new ItemData(1247, 0.000004834467821782178f, "1", false));
        drops.add(new ItemData(2366, 0.000002417233910891089f, "1", false));
        drops.add(new ItemData(1249, 0.0000018127838094332047f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(995, 0.06930693069306931f, "5-84", false));
        drops.add(new ItemData(436, 0.0594059405940594f, "1", false));
        drops.add(new ItemData(438, 0.0594059405940594f, "1", false));
        drops.add(new ItemData(7936, 0.04950495049504951f, "15", false));
        drops.add(new ItemData(1436, 0.04950495049504951f, "5", false));
        drops.add(new ItemData(2142, 0.0297029702970297f, "1", false));
        drops.add(new ItemData(9007, 0.0297029702970297f, "1", false));
        drops.add(new ItemData(884, 0.09900990099009901f, "5-14", false));
        drops.add(new ItemData(13456, 0.02f, "1", false));
        drops.add(new ItemData(23182, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(1237, 0.09900990099009901f, "1", false));
        drops.add(new ItemData(2677, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(1155, 0.09900990099009901f, "1", false));
        drops.add(new ItemData(882, 0.0297029702970297f, "3", false));
        drops.add(new ItemData(1205, 0.039603960396039604f, "1", false));
        drops.add(new ItemData(558, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(995, 0.10891089108910891f, "2", false));
        drops.add(new ItemData(995, 0.19801980198019803f, "7", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
