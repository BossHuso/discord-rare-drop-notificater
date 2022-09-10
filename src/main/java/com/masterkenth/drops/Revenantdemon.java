package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantdemon implements BaseNPC {
    public List<ItemData> drops;

    public Revenantdemon() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-20", false));
        drops.add(new ItemData(22299, 0.00010245901639344262f, "1", false));
        drops.add(new ItemData(22302, 0.00010245901639344262f, "1", false));
        drops.add(new ItemData(22305, 0.00010245901639344262f, "1", false));
        drops.add(new ItemData(21816, 0.0856898029134533f, "1", false));
        drops.add(new ItemData(1391, 0.028563267637817767f, "3", false));
        drops.add(new ItemData(1163, 0.011425959780621572f, "1", false));
        drops.add(new ItemData(1127, 0.011425959780621572f, "1", false));
        drops.add(new ItemData(1079, 0.011425959780621572f, "1", false));
        drops.add(new ItemData(1201, 0.011425959780621572f, "1", false));
        drops.add(new ItemData(1347, 0.011425959780621572f, "1", false));
        drops.add(new ItemData(22557, 0.00004098360655737705f, "1", false));
        drops.add(new ItemData(4087, 0.002856408352138022f, "1", false));
        drops.add(new ItemData(4585, 0.002856408352138022f, "1", false));
        drops.add(new ItemData(1215, 0.005712979890310786f, "1", false));
        drops.add(new ItemData(1305, 0.005712979890310786f, "1", false));
        drops.add(new ItemData(1149, 0.0013319658483956472f, "1", false));
        drops.add(new ItemData(453, 0.03428179636612959f, "25-40", false));
        drops.add(new ItemData(2361, 0.03428179636612959f, "4-6", false));
        drops.add(new ItemData(451, 0.022851919561243144f, "1-3", false));
        drops.add(new ItemData(2363, 0.01713796058269066f, "1-2", false));
        drops.add(new ItemData(1747, 0.022851919561243144f, "3-4", false));
        drops.add(new ItemData(22550, 0.000020491803278688525f, "1", false));
        drops.add(new ItemData(8782, 0.01713796058269066f, "5-12", false));
        drops.add(new ItemData(391, 0.022851919561243144f, "10-15", false));
        drops.add(new ItemData(1515, 0.022851919561243144f, "20-40", false));
        drops.add(new ItemData(1513, 0.011425959780621572f, "5-12", false));
        drops.add(new ItemData(1631, 0.005712979890310786f, "2-5", false));
        drops.add(new ItemData(5315, 0.0004098360655737705f, "2-7", false));
        drops.add(new ItemData(5316, 0.0004098360655737705f, "2-7", false));
        drops.add(new ItemData(995, 0.43103448275862066f, "1-226", false));
        drops.add(new ItemData(21802, 0.028563267637817767f, "1", false));
        drops.add(new ItemData(3024, 0.01713796058269066f, "1-3", false));
        drops.add(new ItemData(22555, 0.000020491803278688525f, "1", false));
        drops.add(new ItemData(9193, 0.01713796058269066f, "15-30", false));
        drops.add(new ItemData(9194, 0.01713796058269066f, "2-4", false));
        drops.add(new ItemData(563, 0.028563267637817767f, "20-45", false));
        drops.add(new ItemData(560, 0.028563267637817767f, "15-30", false));
        drops.add(new ItemData(565, 0.028563267637817767f, "10-20", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.010526315789473684f, "1", false));
        drops.add(new ItemData(21257, 0.00390625f, "1", false));
        drops.add(new ItemData(22545, 0.000020491803278688525f, "1", false));
        drops.add(new ItemData(21807, 0.0006147528386212323f, "1", false));
        drops.add(new ItemData(21810, 0.0004098360655737705f, "1", false));
        drops.add(new ItemData(21813, 0.00020491803278688525f, "1", false));
        drops.add(new ItemData(21804, 0.00030737736411615173f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
