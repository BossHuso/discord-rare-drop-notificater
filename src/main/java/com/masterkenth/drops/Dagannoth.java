package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Dagannoth implements BaseNPC {
    public List<ItemData> drops;

    public Dagannoth() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(5281, 0.018484288354898338f, "1", false));
        drops.add(new ItemData(5106, 0.01310615989515072f, "1", false));
        drops.add(new ItemData(5298, 0.01310615989515072f, "1", false));
        drops.add(new ItemData(5280, 0.012515644555694618f, "1", false));
        drops.add(new ItemData(22873, 0.008936550491510277f, "1", false));
        drops.add(new ItemData(5299, 0.008936550491510277f, "1", false));
        drops.add(new ItemData(5300, 0.0059594755661501785f, "1", false));
        drops.add(new ItemData(5301, 0.004171881518564873f, "1", false));
        drops.add(new ItemData(5302, 0.0029797377830750892f, "1", false));
        drops.add(new ItemData(22879, 0.0023832221163012394f, "3", false));
        drops.add(new ItemData(1239, 0.046875f, "1", false));
        drops.add(new ItemData(5303, 0.001787629603146228f, "1", false));
        drops.add(new ItemData(5304, 0.001191753068764152f, "1", false));
        drops.add(new ItemData(301, 0.09375f, "1", false));
        drops.add(new ItemData(345, 0.03125f, "3", false));
        drops.add(new ItemData(327, 0.03125f, "5", false));
        drops.add(new ItemData(311, 0.0234375f, "1", false));
        drops.add(new ItemData(314, 0.015625f, "15", false));
        drops.add(new ItemData(313, 0.015625f, "50", false));
        drops.add(new ItemData(377, 0.015625f, "1", false));
        drops.add(new ItemData(359, 0.015625f, "1", false));
        drops.add(new ItemData(1237, 0.0390625f, "1", false));
        drops.add(new ItemData(401, 0.015625f, "10", false));
        drops.add(new ItemData(413, 0.0078125f, "1", false));
        drops.add(new ItemData(411, 0.0078125f, "2", false));
        drops.add(new ItemData(995, 0.2265625f, "56", false));
        drops.add(new ItemData(995, 0.0703125f, "25", false));
        drops.add(new ItemData(995, 0.0625f, "44", false));
        drops.add(new ItemData(995, 0.046875f, "41", false));
        drops.add(new ItemData(405, 0.0078125f, "1", false));
        drops.add(new ItemData(45, 0.015625f, "12", false));
        drops.add(new ItemData(1243, 0.0078125f, "1", false));
        drops.add(new ItemData(555, 0.03125f, "15", false));
        drops.add(new ItemData(7857, 0.25f, "1", false));
        drops.add(new ItemData(13492, 0.025f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(23083, 0.00425531914893617f, "1", false));
        drops.add(new ItemData(886, 0.015625f, "15", false));
        drops.add(new ItemData(828, 0.0078125f, "3", false));
        drops.add(new ItemData(5296, 0.028011204481792718f, "1", false));
        drops.add(new ItemData(5297, 0.019083969465648856f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
