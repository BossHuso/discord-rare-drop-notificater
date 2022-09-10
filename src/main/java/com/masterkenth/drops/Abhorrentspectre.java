package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Abhorrentspectre implements BaseNPC {
    public List<ItemData> drops;

    public Abhorrentspectre() {
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
        drops.add(new ItemData(1353, 0.0234375f, "1", false));
        drops.add(new ItemData(205, 0.06666666666666667f, "1-3", false));
        drops.add(new ItemData(207, 0.05235602094240838f, "1-3", false));
        drops.add(new ItemData(209, 0.03802281368821293f, "1-3", false));
        drops.add(new ItemData(211, 0.02857142857142857f, "1-3", false));
        drops.add(new ItemData(213, 0.023809523809523808f, "1-3", false));
        drops.add(new ItemData(215, 0.01904761904761905f, "1-3", false));
        drops.add(new ItemData(2485, 0.014285714285714285f, "1-3", false));
        drops.add(new ItemData(217, 0.014285714285714285f, "1-3", false));
        drops.add(new ItemData(5296, 0.029585798816568046f, "1", false));
        drops.add(new ItemData(5297, 0.02012072434607646f, "1", false));
        drops.add(new ItemData(1197, 0.0078125f, "1", false));
        drops.add(new ItemData(5281, 0.01949317738791423f, "1", false));
        drops.add(new ItemData(5106, 0.013831258644536652f, "1", false));
        drops.add(new ItemData(5298, 0.013831258644536652f, "1", false));
        drops.add(new ItemData(5280, 0.013210039630118891f, "1", false));
        drops.add(new ItemData(22873, 0.009433962264150943f, "1", false));
        drops.add(new ItemData(5299, 0.009433962264150943f, "1", false));
        drops.add(new ItemData(5300, 0.006289308176100629f, "1", false));
        drops.add(new ItemData(5301, 0.004403346543372964f, "1", false));
        drops.add(new ItemData(5302, 0.0031446540880503146f, "1", false));
        drops.add(new ItemData(22879, 0.0025157232704402514f, "3", false));
        drops.add(new ItemData(3053, 0.0078125f, "1", false));
        drops.add(new ItemData(5303, 0.0018867924528301887f, "1", false));
        drops.add(new ItemData(5304, 0.001258019876714052f, "1", false));
        drops.add(new ItemData(995, 0.0078125f, "460", false));
        drops.add(new ItemData(1073, 0.0078125f, "1", false));
        drops.add(new ItemData(23083, 0.01818181818181818f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(20730, 0.004608294930875576f, "1", false));
        drops.add(new ItemData(20736, 0.004608294930875576f, "1", false));
        drops.add(new ItemData(21270, 0.0013157894736842105f, "1", false));
        drops.add(new ItemData(20724, 0.0013157894736842105f, "1", false));
        drops.add(new ItemData(1163, 0.0078125f, "1", false));
        drops.add(new ItemData(4103, 0.001953125f, "1", false));
        drops.add(new ItemData(199, 0.15151515151515152f, "1-3", false));
        drops.add(new ItemData(201, 0.11363636363636363f, "1-3", false));
        drops.add(new ItemData(203, 0.08547008547008547f, "1-3", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
