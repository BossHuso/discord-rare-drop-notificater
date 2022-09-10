package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Werewolf implements BaseNPC {
    public List<ItemData> drops;

    public Werewolf() {
        drops = new ArrayList<>();
        drops.add(new ItemData(2859, 1f, "1", false));
        drops.add(new ItemData(203, 0.0008239947264337508f, "1", false));
        drops.add(new ItemData(205, 0.000640861317610869f, "1", false));
        drops.add(new ItemData(207, 0.0005035500276952515f, "1", false));
        drops.add(new ItemData(209, 0.00036620646720621084f, "1", false));
        drops.add(new ItemData(211, 0.0002746573649372408f, "1", false));
        drops.add(new ItemData(213, 0.00022888008972099516f, "1", false));
        drops.add(new ItemData(215, 0.00018310658634391078f, "1", false));
        drops.add(new ItemData(2485, 0.0001373286824686204f, "1", false));
        drops.add(new ItemData(217, 0.0001373286824686204f, "1", false));
        drops.add(new ItemData(2138, 0.01953125f, "5", false));
        drops.add(new ItemData(1353, 0.048828125f, "1", false));
        drops.add(new ItemData(2132, 0.01953125f, "5", false));
        drops.add(new ItemData(2136, 0.01953125f, "5", false));
        drops.add(new ItemData(1993, 0.0390625f, "1", false));
        drops.add(new ItemData(995, 0.15625f, "10", false));
        drops.add(new ItemData(995, 0.0390625f, "90", false));
        drops.add(new ItemData(995, 0.0390625f, "120", false));
        drops.add(new ItemData(995, 0.0390625f, "222", false));
        drops.add(new ItemData(995, 0.0390625f, "364", false));
        drops.add(new ItemData(958, 0.1953125f, "1", false));
        drops.add(new ItemData(6814, 0.1953125f, "1", false));
        drops.add(new ItemData(1325, 0.0625f, "1", false));
        drops.add(new ItemData(1623, 0.0078125f, "1", false));
        drops.add(new ItemData(1157, 0.029296875f, "1", false));
        drops.add(new ItemData(7866, 0.25f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(2801, 0.001953125f, "1", false));
        drops.add(new ItemData(1109, 0.01953125f, "1", false));
        drops.add(new ItemData(1181, 0.01953125f, "1", false));
        drops.add(new ItemData(1147, 0.005859375f, "1", false));
        drops.add(new ItemData(199, 0.0014647722279185586f, "1", false));
        drops.add(new ItemData(201, 0.001098659635245001f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
