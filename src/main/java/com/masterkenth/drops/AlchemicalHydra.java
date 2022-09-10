package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AlchemicalHydra implements BaseNPC {
    public List<ItemData> drops;

    public AlchemicalHydra() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22786, 1f, "2", false));
        drops.add(new ItemData(1401, 0.07920792079207921f, "1", false));
        drops.add(new ItemData(1403, 0.07920792079207921f, "1", false));
        drops.add(new ItemData(1391, 0.04950495049504951f, "8-12", false));
        drops.add(new ItemData(2503, 0.04950495049504951f, "1", false));
        drops.add(new ItemData(1305, 0.0297029702970297f, "1", false));
        drops.add(new ItemData(1149, 0.0297029702970297f, "1", false));
        drops.add(new ItemData(1127, 0.0297029702970297f, "1", false));
        drops.add(new ItemData(1377, 0.019801980198019802f, "1", false));
        drops.add(new ItemData(1079, 0.01485148514851485f, "1", false));
        drops.add(new ItemData(1093, 0.01485148514851485f, "1", false));
        drops.add(new ItemData(22973, 0.0055248618784530384f, "1", false));
        drops.add(new ItemData(4111, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(4113, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(562, 0.0594059405940594f, "150-300", false));
        drops.add(new ItemData(560, 0.0594059405940594f, "150-300", false));
        drops.add(new ItemData(565, 0.0594059405940594f, "150-300", false));
        drops.add(new ItemData(9075, 0.0594059405940594f, "150-300", false));
        drops.add(new ItemData(9244, 0.019801980198019802f, "100-120", false));
        drops.add(new ItemData(9245, 0.009900990099009901f, "35-50", false));
        drops.add(new ItemData(211, 0.015479876160990712f, "10-15", false));
        drops.add(new ItemData(213, 0.015479876160990712f, "25-30", false));
        drops.add(new ItemData(22971, 0.0055248618784530384f, "1", false));
        drops.add(new ItemData(207, 0.012376237623762377f, "10-15", false));
        drops.add(new ItemData(3051, 0.012376237623762377f, "10-15", false));
        drops.add(new ItemData(215, 0.012376237623762377f, "25-30", false));
        drops.add(new ItemData(217, 0.012376237623762377f, "25-30", false));
        drops.add(new ItemData(2485, 0.009285051067780872f, "25-30", false));
        drops.add(new ItemData(219, 0.009285051067780872f, "10-15", false));
        drops.add(new ItemData(5295, 0.002376425855513308f, "2-3", false));
        drops.add(new ItemData(5300, 0.0022177866489243737f, "2-3", false));
        drops.add(new ItemData(5304, 0.0017424638438752395f, "2-3", false));
        drops.add(new ItemData(5321, 0.0015842839036755386f, "30-45", false));
        drops.add(new ItemData(22969, 0.0055248618784530384f, "1", false));
        drops.add(new ItemData(5313, 0.0015842839036755386f, "2-3", false));
        drops.add(new ItemData(21488, 0.00142571998859424f, "2-3", false));
        drops.add(new ItemData(5314, 0.00142571998859424f, "2-3", false));
        drops.add(new ItemData(21486, 0.00142571998859424f, "2-3", false));
        drops.add(new ItemData(5315, 0.00142571998859424f, "2-3", false));
        drops.add(new ItemData(5288, 0.0011088933244621868f, "2-3", false));
        drops.add(new ItemData(5316, 0.0009504799923961601f, "2-3", false));
        drops.add(new ItemData(5289, 0.0007920792079207921f, "2-3", false));
        drops.add(new ItemData(5317, 0.0006336734047272036f, "2-3", false));
        drops.add(new ItemData(22877, 0.00047523999619808005f, "2-3", false));
        drops.add(new ItemData(22988, 0.001949317738791423f, "1", false));
        drops.add(new ItemData(22869, 0.0003168367023636018f, "2-3", false));
        drops.add(new ItemData(22871, 0.0003168367023636018f, "2-3", false));
        drops.add(new ItemData(995, 0.0049504950495049506f, "5550-25550", false));
        drops.add(new ItemData(995, 0.09405940594059406f, "40000-60000", false));
        drops.add(new ItemData(385, 0.06930693069306931f, "2-4", false));
        drops.add(new ItemData(169, 0.06930693069306931f, "1", false));
        drops.add(new ItemData(3026, 0.06930693069306931f, "2", false));
        drops.add(new ItemData(536, 0.0594059405940594f, "30", false));
        drops.add(new ItemData(989, 0.009900990099009901f, "1", false));
        drops.add(new ItemData(22983, 0.0019455252918287938f, "1", false));
        drops.add(new ItemData(22966, 0.000999000999000999f, "1", false));
        drops.add(new ItemData(20849, 0.0005f, "500-1000", false));
        drops.add(new ItemData(23083, 0.025f, "1", false));
        drops.add(new ItemData(2722, 0.01f, "1", false));
        drops.add(new ItemData(23077, 0.00390625f, "1", false));
        drops.add(new ItemData(12073, 0.00390625f, "1", false));
        drops.add(new ItemData(23064, 0.0005f, "1", false));
        drops.add(new ItemData(22804, 0.0004997501249375312f, "500-1000", false));
        drops.add(new ItemData(22746, 0.0003333333333333333f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
