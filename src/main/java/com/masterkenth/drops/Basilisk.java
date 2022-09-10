package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Basilisk implements BaseNPC {
    public List<ItemData> drops;

    public Basilisk() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.009765625f, "1", false));
        drops.add(new ItemData(1621, 0.0048828125f, "1", false));
        drops.add(new ItemData(1619, 0.00244140625f, "1", false));
        drops.add(new ItemData(1452, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1462, 0.0009154558237637684f, "1", false));
        drops.add(new ItemData(1617, 0.0006103515625f, "1", false));
        drops.add(new ItemData(830, 0.00030517578125f, "5", false));
        drops.add(new ItemData(987, 0.00030517578125f, "1", false));
        drops.add(new ItemData(985, 0.00030517578125f, "1", false));
        drops.add(new ItemData(1247, 0.000019073486328125f, "1", false));
        drops.add(new ItemData(2366, 0.0000095367431640625f, "1", false));
        drops.add(new ItemData(1249, 0.0000071519986231544404f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(561, 0.0390625f, "15", false));
        drops.add(new ItemData(563, 0.0234375f, "3", false));
        drops.add(new ItemData(561, 0.0078125f, "37", false));
        drops.add(new ItemData(199, 0.0684931506849315f, "1", false));
        drops.add(new ItemData(201, 0.05128205128205128f, "1", false));
        drops.add(new ItemData(203, 0.038461538461538464f, "1", false));
        drops.add(new ItemData(205, 0.029940119760479042f, "1", false));
        drops.add(new ItemData(207, 0.023474178403755867f, "1", false));
        drops.add(new ItemData(209, 0.017094017094017096f, "1", false));
        drops.add(new ItemData(211, 0.01282051282051282f, "1", false));
        drops.add(new ItemData(1355, 0.0234375f, "1", false));
        drops.add(new ItemData(213, 0.010683760683760684f, "1", false));
        drops.add(new ItemData(215, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(2485, 0.00641025641025641f, "1", false));
        drops.add(new ItemData(217, 0.00641025641025641f, "1", false));
        drops.add(new ItemData(449, 0.0234375f, "1", false));
        drops.add(new ItemData(995, 0.2265625f, "44", false));
        drops.add(new ItemData(995, 0.1328125f, "200", false));
        drops.add(new ItemData(995, 0.0390625f, "132", false));
        drops.add(new ItemData(995, 0.0390625f, "11", false));
        drops.add(new ItemData(995, 0.0078125f, "440", false));
        drops.add(new ItemData(1243, 0.015625f, "1", false));
        drops.add(new ItemData(1365, 0.0234375f, "1", false));
        drops.add(new ItemData(20543, 1f, "1", false));
        drops.add(new ItemData(7899, 0.25f, "1", false));
        drops.add(new ItemData(23083, 0.0030959752321981426f, "1", false));
        drops.add(new ItemData(7977, 0.0005f, "1", false));
        drops.add(new ItemData(1161, 0.0078125f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(1213, 0.0078125f, "1", false));
        drops.add(new ItemData(4109, 0.001953125f, "1", false));
        drops.add(new ItemData(555, 0.0625f, "75", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
