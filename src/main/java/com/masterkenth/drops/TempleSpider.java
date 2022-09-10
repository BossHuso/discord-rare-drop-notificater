package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class TempleSpider implements BaseNPC {
    public List<ItemData> drops;

    public TempleSpider() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0025f, "1", false));
        drops.add(new ItemData(1621, 0.00125f, "1", false));
        drops.add(new ItemData(1619, 0.000625f, "1", false));
        drops.add(new ItemData(1452, 0.0002343566908835247f, "1", false));
        drops.add(new ItemData(1462, 0.0002343566908835247f, "1", false));
        drops.add(new ItemData(1617, 0.00015625f, "1", false));
        drops.add(new ItemData(830, 0.000078125f, "5", false));
        drops.add(new ItemData(987, 0.000078125f, "1", false));
        drops.add(new ItemData(985, 0.000078125f, "1", false));
        drops.add(new ItemData(1247, 0.0000048828125f, "1", false));
        drops.add(new ItemData(2366, 0.00000244140625f, "1", false));
        drops.add(new ItemData(1249, 0.0000018309116475275367f, "1", false));
        drops.add(new ItemData(1301, 0.04f, "1", false));
        drops.add(new ItemData(564, 0.02f, "10-15", false));
        drops.add(new ItemData(560, 0.02f, "10-15", false));
        drops.add(new ItemData(561, 0.02f, "10-15", false));
        drops.add(new ItemData(563, 0.01f, "4-5", false));
        drops.add(new ItemData(566, 0.01f, "5", false));
        drops.add(new ItemData(199, 0.03745318352059925f, "1", false));
        drops.add(new ItemData(201, 0.028089887640449437f, "1", false));
        drops.add(new ItemData(203, 0.02109704641350211f, "1", false));
        drops.add(new ItemData(205, 0.01639344262295082f, "1", false));
        drops.add(new ItemData(207, 0.01288659793814433f, "1", false));
        drops.add(new ItemData(1145, 0.04f, "1", false));
        drops.add(new ItemData(209, 0.00937207122774133f, "1", false));
        drops.add(new ItemData(211, 0.007032348804500703f, "1", false));
        drops.add(new ItemData(213, 0.005858230814294083f, "1", false));
        drops.add(new ItemData(215, 0.0046882325363338025f, "1", false));
        drops.add(new ItemData(2485, 0.0035161744022503515f, "1", false));
        drops.add(new ItemData(217, 0.0035161744022503515f, "1", false));
        drops.add(new ItemData(5100, 0.00784313725490196f, "1", false));
        drops.add(new ItemData(5323, 0.007501875468867217f, "1", false));
        drops.add(new ItemData(5292, 0.0071581961345740875f, "1", false));
        drops.add(new ItemData(5104, 0.0052659294365455505f, "1", false));
        drops.add(new ItemData(1213, 0.01f, "1", false));
        drops.add(new ItemData(5293, 0.004866180048661801f, "1", false));
        drops.add(new ItemData(5311, 0.004752851711026616f, "1", false));
        drops.add(new ItemData(5321, 0.0036075036075036075f, "1", false));
        drops.add(new ItemData(5294, 0.0032061558191728116f, "1", false));
        drops.add(new ItemData(22879, 0.002289901534234028f, "1", false));
        drops.add(new ItemData(5295, 0.0022326412145568207f, "1", false));
        drops.add(new ItemData(5105, 0.0019466614755693985f, "1", false));
        drops.add(new ItemData(5282, 0.0016603021749958492f, "1", false));
        drops.add(new ItemData(5296, 0.001545833977430824f, "1", false));
        drops.add(new ItemData(5281, 0.001030502885408079f, "1", false));
        drops.add(new ItemData(1147, 0.01f, "1", false));
        drops.add(new ItemData(5297, 0.001030502885408079f, "1", false));
        drops.add(new ItemData(5106, 0.0007442691277165823f, "1", false));
        drops.add(new ItemData(5298, 0.0006870019236053861f, "1", false));
        drops.add(new ItemData(5280, 0.0006870019236053861f, "1", false));
        drops.add(new ItemData(5299, 0.0005152779924769413f, "1", false));
        drops.add(new ItemData(22873, 0.00045802225988183023f, "1", false));
        drops.add(new ItemData(5300, 0.0002862622734949761f, "1", false));
        drops.add(new ItemData(5301, 0.0002290058854512561f, "1", false));
        drops.add(new ItemData(5302, 0.00017175638074954483f, "1", false));
        drops.add(new ItemData(5303, 0.0001145042538330299f, "1", false));
        drops.add(new ItemData(556, 0.05f, "30-50", false));
        drops.add(new ItemData(5304, 0.000057251799137787903f, "1", false));
        drops.add(new ItemData(995, 0.17f, "400-600", false));
        drops.add(new ItemData(223, 0.08f, "3-5", false));
        drops.add(new ItemData(183, 0.08f, "1", false));
        drops.add(new ItemData(5937, 0.02f, "1", false));
        drops.add(new ItemData(557, 0.05f, "30-50", false));
        drops.add(new ItemData(23510, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(23512, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(23514, 0.03333333333333333f, "1", false));
        drops.add(new ItemData(23499, 0.01f, "1", false));
        drops.add(new ItemData(554, 0.05f, "30-50", false));
        drops.add(new ItemData(2722, 0.005f, "1", false));
        drops.add(new ItemData(555, 0.05f, "30-50", false));
        drops.add(new ItemData(562, 0.02f, "10-15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
