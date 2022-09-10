package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Cavecrawler implements BaseNPC {
    public List<ItemData> drops;

    public Cavecrawler() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.001953125f, "1", false));
        drops.add(new ItemData(1621, 0.0009765625f, "1", false));
        drops.add(new ItemData(1619, 0.00048828125f, "1", false));
        drops.add(new ItemData(1452, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(1462, 0.00018309116475275368f, "1", false));
        drops.add(new ItemData(1617, 0.0001220703125f, "1", false));
        drops.add(new ItemData(830, 0.00006103515625f, "5", false));
        drops.add(new ItemData(987, 0.00006103515625f, "1", false));
        drops.add(new ItemData(985, 0.00006103515625f, "1", false));
        drops.add(new ItemData(1247, 0.000003814697265625f, "1", false));
        drops.add(new ItemData(2366, 0.0000019073486328125f, "1", false));
        drops.add(new ItemData(1249, 0.000001430399724630888f, "1", false));
        drops.add(new ItemData(4119, 0.0078125f, "1", false));
        drops.add(new ItemData(5323, 0.0031735956839098697f, "1", false));
        drops.add(new ItemData(5321, 0.0015867978419549348f, "1", false));
        drops.add(new ItemData(22879, 0.0015867978419549348f, "1", false));
        drops.add(new ItemData(199, 0.04291845493562232f, "1", false));
        drops.add(new ItemData(201, 0.03225806451612903f, "1", false));
        drops.add(new ItemData(203, 0.024154589371980676f, "1", false));
        drops.add(new ItemData(205, 0.018796992481203006f, "1", false));
        drops.add(new ItemData(207, 0.014771048744460856f, "1", false));
        drops.add(new ItemData(209, 0.010741138560687433f, "1", false));
        drops.add(new ItemData(211, 0.008058017727639f, "1", false));
        drops.add(new ItemData(561, 0.046875f, "3-4", false));
        drops.add(new ItemData(213, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(215, 0.0053705692803437165f, "1", false));
        drops.add(new ItemData(2485, 0.0040290088638195f, "1", false));
        drops.add(new ItemData(217, 0.0040290088638195f, "1", false));
        drops.add(new ItemData(227, 0.1015625f, "1", false));
        drops.add(new ItemData(239, 0.0390625f, "1", false));
        drops.add(new ItemData(235, 0.015625f, "1", false));
        drops.add(new ItemData(221, 0.0078125f, "1", false));
        drops.add(new ItemData(223, 0.0078125f, "1", false));
        drops.add(new ItemData(225, 0.0078125f, "1", false));
        drops.add(new ItemData(554, 0.0390625f, "12", false));
        drops.add(new ItemData(231, 0.0078125f, "1", false));
        drops.add(new ItemData(995, 0.0390625f, "3", false));
        drops.add(new ItemData(995, 0.0234375f, "8", false));
        drops.add(new ItemData(995, 0.0234375f, "29", false));
        drops.add(new ItemData(995, 0.0078125f, "10", false));
        drops.add(new ItemData(557, 0.015625f, "9", false));
        drops.add(new ItemData(5318, 0.10204081632653061f, "1-4", false));
        drops.add(new ItemData(5319, 0.050761421319796954f, "1-3", false));
        drops.add(new ItemData(5324, 0.025380710659898477f, "1-3", false));
        drops.add(new ItemData(5322, 0.012690355329949238f, "1-2", false));
        drops.add(new ItemData(5320, 0.006349206349206349f, "1-2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
