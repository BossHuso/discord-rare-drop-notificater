package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Suqah implements BaseNPC {
    public List<ItemData> drops;

    public Suqah() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.009689922480620155f, "1", false));
        drops.add(new ItemData(1621, 0.0048449612403100775f, "1", false));
        drops.add(new ItemData(1619, 0.0024224806201550387f, "1", false));
        drops.add(new ItemData(1452, 0.0009083592669904058f, "1", false));
        drops.add(new ItemData(1462, 0.0009083592669904058f, "1", false));
        drops.add(new ItemData(1617, 0.0006056201550387597f, "1", false));
        drops.add(new ItemData(830, 0.00030281007751937984f, "5", false));
        drops.add(new ItemData(987, 0.00030281007751937984f, "1", false));
        drops.add(new ItemData(985, 0.00030281007751937984f, "1", false));
        drops.add(new ItemData(1247, 0.00001892562984496124f, "1", false));
        drops.add(new ItemData(2366, 0.00000946281492248062f, "1", false));
        drops.add(new ItemData(1249, 0.000007096556773362545f, "1", false));
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(2722, 0.007751937984496124f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(9080, 1f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(9103, 0.125f, "1", false));
        drops.add(new ItemData(9079, 0.5348837209302325f, "1", false));
        drops.add(new ItemData(199, 0.23255813953488372f, "1", false));
        drops.add(new ItemData(201, 0.1937984496124031f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
