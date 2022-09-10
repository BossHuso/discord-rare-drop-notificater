package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class FleshCrawler implements BaseNPC {
    public List<ItemData> drops;

    public FleshCrawler() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.005f, "1", false));
        drops.add(new ItemData(1621, 0.0025f, "1", false));
        drops.add(new ItemData(1619, 0.00125f, "1", false));
        drops.add(new ItemData(1452, 0.0004687133817670494f, "1", false));
        drops.add(new ItemData(1462, 0.0004687133817670494f, "1", false));
        drops.add(new ItemData(1617, 0.0003125f, "1", false));
        drops.add(new ItemData(830, 0.00015625f, "5", false));
        drops.add(new ItemData(987, 0.00015625f, "1", false));
        drops.add(new ItemData(985, 0.00015625f, "1", false));
        drops.add(new ItemData(1247, 0.000009765625f, "1", false));
        drops.add(new ItemData(2366, 0.0000048828125f, "1", false));
        drops.add(new ItemData(1249, 0.0000036618232950550734f, "1", false));
        drops.add(new ItemData(559, 0.17f, "3-12", false));
        drops.add(new ItemData(209, 0.010626992561105207f, "1", false));
        drops.add(new ItemData(211, 0.00796812749003984f, "1", false));
        drops.add(new ItemData(213, 0.006640106241699867f, "1", false));
        drops.add(new ItemData(215, 0.005313496280552604f, "1", false));
        drops.add(new ItemData(2485, 0.00398406374501992f, "1", false));
        drops.add(new ItemData(217, 0.00398406374501992f, "1", false));
        drops.add(new ItemData(995, 0.17f, "10", false));
        drops.add(new ItemData(995, 0.07f, "5-84", false));
        drops.add(new ItemData(440, 0.05f, "1", false));
        drops.add(new ItemData(440, 0.05f, "3-10", false));
        drops.add(new ItemData(554, 0.02f, "42", false));
        drops.add(new ItemData(592, 0.04f, "1", false));
        drops.add(new ItemData(9011, 0.03f, "1", false));
        drops.add(new ItemData(2355, 0.01f, "1", false));
        drops.add(new ItemData(4696, 0.04f, "3-9", false));
        drops.add(new ItemData(561, 0.02f, "5", false));
        drops.add(new ItemData(199, 0.0425531914893617f, "1", false));
        drops.add(new ItemData(201, 0.03184713375796178f, "1", false));
        drops.add(new ItemData(203, 0.023923444976076555f, "1", false));
        drops.add(new ItemData(205, 0.01858736059479554f, "1", false));
        drops.add(new ItemData(207, 0.014619883040935672f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
