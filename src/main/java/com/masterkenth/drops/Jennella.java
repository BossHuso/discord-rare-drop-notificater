package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Jennella implements BaseNPC {
    public List<ItemData> drops;

    public Jennella() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.00048828125f, "1", false));
        drops.add(new ItemData(1621, 0.000244140625f, "1", false));
        drops.add(new ItemData(1619, 0.0001220703125f, "1", false));
        drops.add(new ItemData(1452, 0.00004577279118818842f, "1", false));
        drops.add(new ItemData(1462, 0.00004577279118818842f, "1", false));
        drops.add(new ItemData(1617, 0.000030517578125f, "1", false));
        drops.add(new ItemData(830, 0.0000152587890625f, "5", false));
        drops.add(new ItemData(987, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(985, 0.0000152587890625f, "1", false));
        drops.add(new ItemData(1247, 0.00000095367431640625f, "1", false));
        drops.add(new ItemData(2366, 0.000000476837158203125f, "1", false));
        drops.add(new ItemData(1249, 0.000000357599931157722f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(205, 0.0021362956633198035f, "1", false));
        drops.add(new ItemData(207, 0.0016784155756965425f, "1", false));
        drops.add(new ItemData(209, 0.001220703125f, "1", false));
        drops.add(new ItemData(211, 0.0009154994049253868f, "1", false));
        drops.add(new ItemData(213, 0.0007629510948348211f, "1", false));
        drops.add(new ItemData(215, 0.0006103515625f, "1", false));
        drops.add(new ItemData(2485, 0.00045777065690089265f, "1", false));
        drops.add(new ItemData(217, 0.00045777065690089265f, "1", false));
        drops.add(new ItemData(436, 0.01953125f, "5", false));
        drops.add(new ItemData(438, 0.01953125f, "5", false));
        drops.add(new ItemData(1337, 0.1953125f, "1", false));
        drops.add(new ItemData(440, 0.01953125f, "5", false));
        drops.add(new ItemData(453, 0.01953125f, "1", false));
        drops.add(new ItemData(2353, 0.01953125f, "1", false));
        drops.add(new ItemData(995, 0.0390625f, "6", false));
        drops.add(new ItemData(995, 0.029296875f, "15", false));
        drops.add(new ItemData(995, 0.01953125f, "16", false));
        drops.add(new ItemData(995, 0.01953125f, "20", false));
        drops.add(new ItemData(995, 0.009765625f, "38", false));
        drops.add(new ItemData(590, 0.09765625f, "1", false));
        drops.add(new ItemData(229, 0.09765625f, "1", false));
        drops.add(new ItemData(1335, 0.13671875f, "1", false));
        drops.add(new ItemData(227, 0.09765625f, "1", false));
        drops.add(new ItemData(1925, 0.033203125f, "1", false));
        drops.add(new ItemData(3689, 0.05859375f, "1", false));
        drops.add(new ItemData(1917, 0.00390625f, "1", false));
        drops.add(new ItemData(221, 0.0078125f, "1", false));
        drops.add(new ItemData(231, 0.00390625f, "1", false));
        drops.add(new ItemData(247, 0.00390625f, "1", false));
        drops.add(new ItemData(1582, 0.001953125f, "1", false));
        drops.add(new ItemData(3757, 0.001953125f, "1", false));
        drops.add(new ItemData(2677, 0.0078125f, "1", false));
        drops.add(new ItemData(3758, 0.001953125f, "1", false));
        drops.add(new ItemData(995, 1f, "40", false));
        drops.add(new ItemData(3748, 0.001953125f, "1", false));
        drops.add(new ItemData(199, 0.0048828125f, "1", false));
        drops.add(new ItemData(201, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(203, 0.0027464982147761604f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
