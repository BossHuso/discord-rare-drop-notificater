package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Tortoise implements BaseNPC {
    public List<ItemData> drops;

    public Tortoise() {
        drops = new ArrayList<>();
        drops.add(new ItemData(10995, 0.015625f, "1-3", false));
        drops.add(new ItemData(6333, 0.015625f, "2", false));
        drops.add(new ItemData(6333, 0.0078125f, "4", false));
        drops.add(new ItemData(626, 0.0078125f, "1", false));
        drops.add(new ItemData(646, 0.0078125f, "1", false));
        drops.add(new ItemData(636, 0.0078125f, "1", false));
        drops.add(new ItemData(557, 0.078125f, "10-14", false));
        drops.add(new ItemData(888, 0.15625f, "6-11", false));
        drops.add(new ItemData(561, 0.078125f, "1-3", false));
        drops.add(new ItemData(886, 0.078125f, "12-23", false));
        drops.add(new ItemData(199, 0.01953125f, "1", false));
        drops.add(new ItemData(201, 0.014641288433382138f, "1", false));
        drops.add(new ItemData(203, 0.01098901098901099f, "1", false));
        drops.add(new ItemData(205, 0.008547008547008548f, "1", false));
        drops.add(new ItemData(207, 0.006715916722632639f, "1", false));
        drops.add(new ItemData(209, 0.0048828125f, "1", false));
        drops.add(new ItemData(211, 0.003661662394727206f, "1", false));
        drops.add(new ItemData(213, 0.003051571559353067f, "1", false));
        drops.add(new ItemData(215, 0.00244140625f, "1", false));
        drops.add(new ItemData(2485, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(217, 0.0018311664530305805f, "1", false));
        drops.add(new ItemData(5324, 0.078125f, "10-19", false));
        drops.add(new ItemData(5318, 0.015151515151515152f, "4", false));
        drops.add(new ItemData(5319, 0.011363636363636364f, "4", false));
        drops.add(new ItemData(5324, 0.007518796992481203f, "4", false));
        drops.add(new ItemData(5322, 0.0037593984962406013f, "3", false));
        drops.add(new ItemData(5320, 0.0018796992481203006f, "3", false));
        drops.add(new ItemData(5323, 0.0009398496240601503f, "2", false));
        drops.add(new ItemData(5321, 0.0004496402877697842f, "2", false));
        drops.add(new ItemData(22879, 0.00032690421706440013f, "2", false));
        drops.add(new ItemData(5305, 0.004739336492890996f, "4", false));
        drops.add(new ItemData(5307, 0.0047169811320754715f, "3", false));
        drops.add(new ItemData(5308, 0.0035587188612099642f, "3", false));
        drops.add(new ItemData(5306, 0.0035335689045936395f, "2", false));
        drops.add(new ItemData(5309, 0.002352941176470588f, "2", false));
        drops.add(new ItemData(5310, 0.001176470588235294f, "2", false));
        drops.add(new ItemData(5311, 0.0005984440454817474f, "1", false));
        drops.add(new ItemData(5096, 0.00390625f, "1", false));
        drops.add(new ItemData(5098, 0.002583979328165375f, "1", false));
        drops.add(new ItemData(5097, 0.001669449081803005f, "1", false));
        drops.add(new ItemData(5099, 0.0012330456226880395f, "1", false));
        drops.add(new ItemData(5100, 0.000984251968503937f, "1", false));
        drops.add(new ItemData(5101, 0.002380952380952381f, "1", false));
        drops.add(new ItemData(5102, 0.0016666666666666668f, "1", false));
        drops.add(new ItemData(5103, 0.0011890606420927466f, "1", false));
        drops.add(new ItemData(5104, 0.0004757373929590866f, "1", false));
        drops.add(new ItemData(5105, 0.00017241379310344826f, "1", false));
        drops.add(new ItemData(5106, 0.0000653893938403191f, "1", false));
        drops.add(new ItemData(1965, 0.15625f, "20-59", false));
        drops.add(new ItemData(2114, 0.078125f, "1", false));
        drops.add(new ItemData(2217, 0.078125f, "1", false));
        drops.add(new ItemData(2253, 0.03125f, "1", false));
        drops.add(new ItemData(2064, 0.0078125f, "1", false));
        drops.add(new ItemData(7939, 0.0625f, "1-3", false));
        drops.add(new ItemData(2150, 0.0390625f, "1", false));
        drops.add(new ItemData(6332, 0.015625f, "2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
