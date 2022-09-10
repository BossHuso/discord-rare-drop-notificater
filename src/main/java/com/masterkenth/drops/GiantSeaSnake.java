package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class GiantSeaSnake implements BaseNPC {
    public List<ItemData> drops;

    public GiantSeaSnake() {
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
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(209, 0.00244140625f, "1", false));
        drops.add(new ItemData(211, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(213, 0.0015257857796765334f, "1", false));
        drops.add(new ItemData(215, 0.001220703125f, "1", false));
        drops.add(new ItemData(2485, 0.0009154994049253868f, "1", false));
        drops.add(new ItemData(217, 0.0009154994049253868f, "1", false));
        drops.add(new ItemData(5100, 0.01430615164520744f, "1", false));
        drops.add(new ItemData(5323, 0.013679890560875513f, "1", false));
        drops.add(new ItemData(5292, 0.01303780964797914f, "1", false));
        drops.add(new ItemData(5104, 0.009606147934678195f, "1", false));
        drops.add(new ItemData(555, 0.015625f, "15", false));
        drops.add(new ItemData(5293, 0.008873114463176575f, "1", false));
        drops.add(new ItemData(5311, 0.008665511265164644f, "1", false));
        drops.add(new ItemData(5321, 0.006574621959237344f, "1", false));
        drops.add(new ItemData(5294, 0.0058445353594389245f, "1", false));
        drops.add(new ItemData(22879, 0.0041753653444676405f, "1", false));
        drops.add(new ItemData(5295, 0.00407000407000407f, "1", false));
        drops.add(new ItemData(5105, 0.0035486160397444995f, "1", false));
        drops.add(new ItemData(5282, 0.003026634382566586f, "1", false));
        drops.add(new ItemData(5296, 0.002817695125387433f, "1", false));
        drops.add(new ItemData(5281, 0.0018786398647379298f, "1", false));
        drops.add(new ItemData(4695, 0.015625f, "1", false));
        drops.add(new ItemData(5297, 0.0018786398647379298f, "1", false));
        drops.add(new ItemData(5106, 0.00135666802333469f, "1", false));
        drops.add(new ItemData(5298, 0.0012523481527864746f, "1", false));
        drops.add(new ItemData(5280, 0.0012523481527864746f, "1", false));
        drops.add(new ItemData(5299, 0.0009393199323689649f, "1", false));
        drops.add(new ItemData(22873, 0.0008349336227769892f, "1", false));
        drops.add(new ItemData(5300, 0.0005218389604967907f, "1", false));
        drops.add(new ItemData(5301, 0.0004174668113884946f, "1", false));
        drops.add(new ItemData(5302, 0.0003130968408528758f, "1", false));
        drops.add(new ItemData(5303, 0.00020872904882172452f, "1", false));
        drops.add(new ItemData(4160, 0.015625f, "4", false));
        drops.add(new ItemData(5304, 0.00010436561361762527f, "1", false));
        drops.add(new ItemData(995, 0.3203125f, "44", false));
        drops.add(new ItemData(995, 0.0859375f, "32", false));
        drops.add(new ItemData(995, 0.0703125f, "24", false));
        drops.add(new ItemData(995, 0.0546875f, "23", false));
        drops.add(new ItemData(823, 0.078125f, "2", false));
        drops.add(new ItemData(313, 0.03125f, "50", false));
        drops.add(new ItemData(46, 0.03125f, "3", false));
        drops.add(new ItemData(571, 0.0234375f, "1", false));
        drops.add(new ItemData(363, 0.03125f, "2", false));
        drops.add(new ItemData(199, 0.009765625f, "1", false));
        drops.add(new ItemData(377, 0.015625f, "1", false));
        drops.add(new ItemData(401, 0.015625f, "5", false));
        drops.add(new ItemData(403, 0.015625f, "5", false));
        drops.add(new ItemData(405, 0.015625f, "1", false));
        drops.add(new ItemData(411, 0.0078125f, "2", false));
        drops.add(new ItemData(413, 0.0078125f, "1", false));
        drops.add(new ItemData(201, 0.007326007326007326f, "1", false));
        drops.add(new ItemData(7959, 1f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(203, 0.005494505494505495f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(205, 0.004271678769756515f, "1", false));
        drops.add(new ItemData(207, 0.003356831151393085f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
