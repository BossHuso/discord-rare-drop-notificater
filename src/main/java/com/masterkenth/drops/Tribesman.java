package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Tribesman implements BaseNPC {
    public List<ItemData> drops;

    public Tribesman() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0036231884057971015f, "1", false));
        drops.add(new ItemData(1621, 0.0018115942028985507f, "1", false));
        drops.add(new ItemData(1619, 0.0009057971014492754f, "1", false));
        drops.add(new ItemData(1452, 0.0003396473780920648f, "1", false));
        drops.add(new ItemData(1462, 0.0003396473780920648f, "1", false));
        drops.add(new ItemData(1617, 0.00022644927536231884f, "1", false));
        drops.add(new ItemData(830, 0.00011322463768115942f, "5", false));
        drops.add(new ItemData(987, 0.00011322463768115942f, "1", false));
        drops.add(new ItemData(985, 0.00011322463768115942f, "1", false));
        drops.add(new ItemData(1247, 0.000007076539855072464f, "1", false));
        drops.add(new ItemData(2366, 0.000003538269927536232f, "1", false));
        drops.add(new ItemData(1249, 0.0000026534951413442564f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(1525, 0.036231884057971016f, "1", false));
        drops.add(new ItemData(199, 0.0199203187250996f, "1", false));
        drops.add(new ItemData(201, 0.014947683109118086f, "1", false));
        drops.add(new ItemData(203, 0.011210762331838564f, "1", false));
        drops.add(new ItemData(205, 0.008718395815170008f, "1", false));
        drops.add(new ItemData(207, 0.00684931506849315f, "1", false));
        drops.add(new ItemData(209, 0.004982561036372696f, "1", false));
        drops.add(new ItemData(211, 0.0037369207772795215f, "1", false));
        drops.add(new ItemData(213, 0.00311332503113325f, "1", false));
        drops.add(new ItemData(215, 0.0024906600249066002f, "1", false));
        drops.add(new ItemData(1237, 0.050724637681159424f, "1", false));
        drops.add(new ItemData(2485, 0.0018681113394358303f, "1", false));
        drops.add(new ItemData(217, 0.0018681113394358303f, "1", false));
        drops.add(new ItemData(6306, 0.18115942028985507f, "15", false));
        drops.add(new ItemData(231, 0.14492753623188406f, "1", false));
        drops.add(new ItemData(225, 0.08695652173913043f, "1", false));
        drops.add(new ItemData(3188, 0.08695652173913043f, "1", false));
        drops.add(new ItemData(561, 0.057971014492753624f, "3", false));
        drops.add(new ItemData(6306, 0.036231884057971016f, "62", false));
        drops.add(new ItemData(444, 0.036231884057971016f, "1", false));
        drops.add(new ItemData(183, 0.021739130434782608f, "1", false));
        drops.add(new ItemData(827, 0.021739130434782608f, "10", false));
        drops.add(new ItemData(181, 0.007246376811594203f, "1", false));
        drops.add(new ItemData(2309, 0.007246376811594203f, "1", false));
        drops.add(new ItemData(438, 0.007246376811594203f, "1", false));
        drops.add(new ItemData(1933, 0.007246376811594203f, "1", false));
        drops.add(new ItemData(2801, 0.007246376811594203f, "1", false));
        drops.add(new ItemData(1239, 0.014492753623188406f, "1", false));
        drops.add(new ItemData(887, 0.014492753623188406f, "5", false));
        drops.add(new ItemData(828, 0.014492753623188406f, "10", false));
        drops.add(new ItemData(1243, 0.007246376811594203f, "1", false));
        drops.add(new ItemData(1533, 0.036231884057971016f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
