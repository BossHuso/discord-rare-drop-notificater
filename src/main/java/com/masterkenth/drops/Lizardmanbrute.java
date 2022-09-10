package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Lizardmanbrute implements BaseNPC {
    public List<ItemData> drops;

    public Lizardmanbrute() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(22879, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(5295, 0.008333333333333333f, "1", false));
        drops.add(new ItemData(5105, 0.007262164124909223f, "1", false));
        drops.add(new ItemData(5282, 0.006195786864931847f, "1", false));
        drops.add(new ItemData(5296, 0.0057670126874279125f, "1", false));
        drops.add(new ItemData(5281, 0.0038446751249519417f, "1", false));
        drops.add(new ItemData(5297, 0.0038446751249519417f, "1", false));
        drops.add(new ItemData(5106, 0.0027770063871146904f, "1", false));
        drops.add(new ItemData(5298, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(5280, 0.002563445270443476f, "1", false));
        drops.add(new ItemData(5100, 0.029239766081871343f, "1", false));
        drops.add(new ItemData(5299, 0.0019227071716977505f, "1", false));
        drops.add(new ItemData(22873, 0.0017091095539224065f, "1", false));
        drops.add(new ItemData(5300, 0.0010681478316599017f, "1", false));
        drops.add(new ItemData(5301, 0.000854481756814492f, "1", false));
        drops.add(new ItemData(5302, 0.000640861317610869f, "1", false));
        drops.add(new ItemData(5303, 0.0004272591326639607f, "1", false));
        drops.add(new ItemData(5304, 0.00021362500267031254f, "1", false));
        drops.add(new ItemData(13391, 0.208955223880597f, "1", false));
        drops.add(new ItemData(13383, 0.11940298507462686f, "1", false));
        drops.add(new ItemData(13393, 0.004f, "1", false));
        drops.add(new ItemData(5323, 0.028011204481792718f, "1", false));
        drops.add(new ItemData(23083, 0.004081632653061225f, "1", false));
        drops.add(new ItemData(5292, 0.026737967914438502f, "1", false));
        drops.add(new ItemData(5104, 0.019646365422396856f, "1", false));
        drops.add(new ItemData(5293, 0.018148820326678767f, "1", false));
        drops.add(new ItemData(5311, 0.01773049645390071f, "1", false));
        drops.add(new ItemData(5321, 0.013458950201884253f, "1", false));
        drops.add(new ItemData(5294, 0.011961722488038277f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
