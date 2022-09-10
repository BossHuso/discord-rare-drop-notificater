package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Catablepon implements BaseNPC {
    public List<ItemData> drops;

    public Catablepon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0049504950495049506f, "1", false));
        drops.add(new ItemData(1621, 0.0024752475247524753f, "1", false));
        drops.add(new ItemData(1619, 0.0012376237623762376f, "1", false));
        drops.add(new ItemData(1452, 0.0004640726552149004f, "1", false));
        drops.add(new ItemData(1462, 0.0004640726552149004f, "1", false));
        drops.add(new ItemData(1617, 0.0003094059405940594f, "1", false));
        drops.add(new ItemData(830, 0.0001547029702970297f, "5", false));
        drops.add(new ItemData(987, 0.0001547029702970297f, "1", false));
        drops.add(new ItemData(985, 0.0001547029702970297f, "1", false));
        drops.add(new ItemData(1247, 0.000009668935643564357f, "1", false));
        drops.add(new ItemData(2366, 0.000004834467821782178f, "1", false));
        drops.add(new ItemData(1249, 0.0000036255676188664094f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(201, 0.005567928730512249f, "1", false));
        drops.add(new ItemData(203, 0.004177109440267335f, "1", false));
        drops.add(new ItemData(205, 0.003248862897985705f, "1", false));
        drops.add(new ItemData(207, 0.002552322613578356f, "1", false));
        drops.add(new ItemData(209, 0.0018563207722294413f, "1", false));
        drops.add(new ItemData(211, 0.001392369813422445f, "1", false));
        drops.add(new ItemData(213, 0.001160227404571296f, "1", false));
        drops.add(new ItemData(215, 0.00092824654228163f, "1", false));
        drops.add(new ItemData(2485, 0.0006961849067112225f, "1", false));
        drops.add(new ItemData(217, 0.0006961849067112225f, "1", false));
        drops.add(new ItemData(1145, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(5318, 0.0049504950495049506f, "1-4", false));
        drops.add(new ItemData(5319, 0.0024752475247524753f, "1-3", false));
        drops.add(new ItemData(5324, 0.0012376237623762376f, "1-3", false));
        drops.add(new ItemData(5322, 0.0006188118811881188f, "1-2", false));
        drops.add(new ItemData(5320, 0.0003094059405940594f, "1-2", false));
        drops.add(new ItemData(5323, 0.0001547029702970297f, "1", false));
        drops.add(new ItemData(5321, 0.00007735148514851485f, "1", false));
        drops.add(new ItemData(22879, 0.00007735148514851485f, "1", false));
        drops.add(new ItemData(1436, 0.04950495049504951f, "15", false));
        drops.add(new ItemData(7936, 0.04950495049504951f, "15", false));
        drops.add(new ItemData(554, 0.06930693069306931f, "15", false));
        drops.add(new ItemData(221, 0.06930693069306931f, "1", false));
        drops.add(new ItemData(453, 0.019801980198019802f, "3-7", false));
        drops.add(new ItemData(995, 0.039603960396039604f, "10", false));
        drops.add(new ItemData(995, 0.0594059405940594f, "15", false));
        drops.add(new ItemData(995, 0.1188118811881188f, "44", false));
        drops.add(new ItemData(995, 0.09900990099009901f, "5-104", false));
        drops.add(new ItemData(333, 0.019801980198019802f, "1", false));
        drops.add(new ItemData(595, 0.0891089108910891f, "1", false));
        drops.add(new ItemData(9010, 0.0297029702970297f, "1", false));
        drops.add(new ItemData(555, 0.0594059405940594f, "7", false));
        drops.add(new ItemData(562, 0.009900990099009901f, "7", false));
        drops.add(new ItemData(2801, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(563, 0.039603960396039604f, "2", false));
        drops.add(new ItemData(564, 0.0297029702970297f, "2", false));
        drops.add(new ItemData(888, 0.039603960396039604f, "5-14", false));
        drops.add(new ItemData(199, 0.007423904974016332f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
