package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class SulphurLizard implements BaseNPC {
    public List<ItemData> drops;

    public SulphurLizard() {
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
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(436, 0.0234375f, "10-15", false));
        drops.add(new ItemData(442, 0.0234375f, "5-10", false));
        drops.add(new ItemData(2355, 0.015625f, "3-5", false));
        drops.add(new ItemData(447, 0.0078125f, "3-5", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(554, 0.203125f, "10-25", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(5318, 0.025f, "4", false));
        drops.add(new ItemData(5319, 0.018867924528301886f, "4", false));
        drops.add(new ItemData(5324, 0.0125f, "4", false));
        drops.add(new ItemData(5322, 0.00625f, "3", false));
        drops.add(new ItemData(5320, 0.003115264797507788f, "3", false));
        drops.add(new ItemData(554, 0.03125f, "40-60", false));
        drops.add(new ItemData(5323, 0.001557632398753894f, "2", false));
        drops.add(new ItemData(5321, 0.0007446016381236039f, "2", false));
        drops.add(new ItemData(22879, 0.0005414185165132648f, "2", false));
        drops.add(new ItemData(5305, 0.0004830917874396135f, "4", false));
        drops.add(new ItemData(5307, 0.000481000481000481f, "3", false));
        drops.add(new ItemData(5308, 0.000362844702467344f, "3", false));
        drops.add(new ItemData(5306, 0.00036075036075036075f, "2", false));
        drops.add(new ItemData(5309, 0.0002405002405002405f, "2", false));
        drops.add(new ItemData(5310, 0.00012023566189731875f, "2", false));
        drops.add(new ItemData(5311, 0.00006117330397014743f, "1", false));
        drops.add(new ItemData(561, 0.03125f, "5-10", false));
        drops.add(new ItemData(10136, 0.1015625f, "1", false));
        drops.add(new ItemData(4115, 0.001953125f, "1", false));
        drops.add(new ItemData(440, 0.16796875f, "5-10", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(453, 0.1015625f, "5-10", false));
        drops.add(new ItemData(2351, 0.03125f, "6-10", false));
        drops.add(new ItemData(2353, 0.03125f, "3-5", false));
        drops.add(new ItemData(438, 0.03125f, "10-15", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
