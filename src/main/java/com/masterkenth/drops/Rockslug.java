package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Rockslug implements BaseNPC {
    public List<ItemData> drops;

    public Rockslug() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.01171875f, "1", false));
        drops.add(new ItemData(1621, 0.005859375f, "1", false));
        drops.add(new ItemData(1619, 0.0029296875f, "1", false));
        drops.add(new ItemData(1452, 0.001098546988516522f, "1", false));
        drops.add(new ItemData(1462, 0.001098546988516522f, "1", false));
        drops.add(new ItemData(1617, 0.000732421875f, "1", false));
        drops.add(new ItemData(830, 0.0003662109375f, "5", false));
        drops.add(new ItemData(987, 0.0003662109375f, "1", false));
        drops.add(new ItemData(985, 0.0003662109375f, "1", false));
        drops.add(new ItemData(1247, 0.00002288818359375f, "1", false));
        drops.add(new ItemData(2366, 0.000011444091796875f, "1", false));
        drops.add(new ItemData(1249, 0.000008582398347785329f, "1", false));
        drops.add(new ItemData(4115, 0.001953125f, "1", false));
        drops.add(new ItemData(438, 0.0625f, "1", false));
        drops.add(new ItemData(447, 0.0078125f, "1", false));
        drops.add(new ItemData(5318, 0.02631578947368421f, "4", false));
        drops.add(new ItemData(5319, 0.0196078431372549f, "4", false));
        drops.add(new ItemData(5324, 0.012987012987012988f, "4", false));
        drops.add(new ItemData(5322, 0.0064516129032258064f, "3", false));
        drops.add(new ItemData(5320, 0.003215434083601286f, "3", false));
        drops.add(new ItemData(5323, 0.0016051364365971107f, "2", false));
        drops.add(new ItemData(5321, 0.0007674597083653108f, "2", false));
        drops.add(new ItemData(22879, 0.0005580357142857143f, "2", false));
        drops.add(new ItemData(557, 0.234375f, "5", false));
        drops.add(new ItemData(1913, 0.1015625f, "1", false));
        drops.add(new ItemData(2347, 0.078125f, "1", false));
        drops.add(new ItemData(557, 0.03125f, "42", false));
        drops.add(new ItemData(562, 0.03125f, "2", false));
        drops.add(new ItemData(453, 0.1015625f, "1", false));
        drops.add(new ItemData(440, 0.171875f, "1", false));
        drops.add(new ItemData(2349, 0.015625f, "1", false));
        drops.add(new ItemData(2351, 0.0234375f, "1", false));
        drops.add(new ItemData(436, 0.0234375f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
