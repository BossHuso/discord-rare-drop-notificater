package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Junglehorror implements BaseNPC {
    public List<ItemData> drops;

    public Junglehorror() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.001937984496124031f, "1", false));
        drops.add(new ItemData(1621, 0.0009689922480620155f, "1", false));
        drops.add(new ItemData(1619, 0.00048449612403100775f, "1", false));
        drops.add(new ItemData(1452, 0.00018167185339808115f, "1", false));
        drops.add(new ItemData(1462, 0.00018167185339808115f, "1", false));
        drops.add(new ItemData(1617, 0.00012112403100775194f, "1", false));
        drops.add(new ItemData(830, 0.00006056201550387597f, "5", false));
        drops.add(new ItemData(987, 0.00006056201550387597f, "1", false));
        drops.add(new ItemData(985, 0.00006056201550387597f, "1", false));
        drops.add(new ItemData(1247, 0.000003785125968992248f, "1", false));
        drops.add(new ItemData(2366, 0.000001892562984496124f, "1", false));
        drops.add(new ItemData(1249, 0.000001419311354672509f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(201, 0.008718395815170008f, "1", false));
        drops.add(new ItemData(203, 0.006540222367560497f, "1", false));
        drops.add(new ItemData(205, 0.00508646998982706f, "1", false));
        drops.add(new ItemData(207, 0.003996802557953637f, "1", false));
        drops.add(new ItemData(209, 0.0029069767441860465f, "1", false));
        drops.add(new ItemData(211, 0.0021800741225201656f, "1", false));
        drops.add(new ItemData(213, 0.001816860465116279f, "1", false));
        drops.add(new ItemData(215, 0.0014534883720930232f, "1", false));
        drops.add(new ItemData(2485, 0.0010901558922925979f, "1", false));
        drops.add(new ItemData(217, 0.0010901558922925979f, "1", false));
        drops.add(new ItemData(1335, 0.13178294573643412f, "1", false));
        drops.add(new ItemData(5318, 0.05813953488372093f, "1-4", false));
        drops.add(new ItemData(5319, 0.029069767441860465f, "1-3", false));
        drops.add(new ItemData(5324, 0.014534883720930232f, "1-3", false));
        drops.add(new ItemData(5322, 0.007267441860465116f, "1-2", false));
        drops.add(new ItemData(5320, 0.003633720930232558f, "1-2", false));
        drops.add(new ItemData(5323, 0.001816860465116279f, "1", false));
        drops.add(new ItemData(5321, 0.0009084302325581395f, "1", false));
        drops.add(new ItemData(22879, 0.0009084302325581395f, "1", false));
        drops.add(new ItemData(440, 0.20930232558139536f, "1", false));
        drops.add(new ItemData(6333, 0.06976744186046512f, "3", false));
        drops.add(new ItemData(1191, 0.03875968992248062f, "1", false));
        drops.add(new ItemData(6332, 0.023255813953488372f, "1", false));
        drops.add(new ItemData(2114, 0.06201550387596899f, "2", false));
        drops.add(new ItemData(526, 0.03875968992248062f, "1", false));
        drops.add(new ItemData(532, 0.023255813953488372f, "1", false));
        drops.add(new ItemData(532, 0.015503875968992248f, "3", false));
        drops.add(new ItemData(1239, 0.031007751937984496f, "1", false));
        drops.add(new ItemData(13486, 0.025f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(826, 0.015503875968992248f, "5", false));
        drops.add(new ItemData(561, 0.05426356589147287f, "2", false));
        drops.add(new ItemData(561, 0.07751937984496124f, "4", false));
        drops.add(new ItemData(560, 0.03875968992248062f, "1", false));
        drops.add(new ItemData(199, 0.011627906976744186f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
