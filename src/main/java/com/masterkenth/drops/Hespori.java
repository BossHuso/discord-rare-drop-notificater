package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Hespori implements BaseNPC {
    public List<ItemData> drops;

    public Hespori() {
        drops = new ArrayList<>();
        drops.add(new ItemData(22881, 0.3333333333333333f, "1-2", false));
        drops.add(new ItemData(5105, 0.025f, "10-16", false));
        drops.add(new ItemData(5106, 0.025f, "8-16", false));
        drops.add(new ItemData(5297, 0.0375f, "2-8", false));
        drops.add(new ItemData(5298, 0.0375f, "2-5", false));
        drops.add(new ItemData(5299, 0.0375f, "2-5", false));
        drops.add(new ItemData(5296, 0.0375f, "2-5", false));
        drops.add(new ItemData(5301, 0.0375f, "2-5", false));
        drops.add(new ItemData(5302, 0.0375f, "2-5", false));
        drops.add(new ItemData(5303, 0.0375f, "2-5", false));
        drops.add(new ItemData(5295, 0.025f, "1-2", false));
        drops.add(new ItemData(22883, 0.3333333333333333f, "1-2", false));
        drops.add(new ItemData(5300, 0.025f, "1", false));
        drops.add(new ItemData(5304, 0.025f, "1", false));
        drops.add(new ItemData(5314, 0.05f, "2-4", false));
        drops.add(new ItemData(5313, 0.0375f, "2-5", false));
        drops.add(new ItemData(5315, 0.025f, "1", false));
        drops.add(new ItemData(5316, 0.0125f, "1", false));
        drops.add(new ItemData(5287, 0.0375f, "3-6", false));
        drops.add(new ItemData(5288, 0.0375f, "1-3", false));
        drops.add(new ItemData(5289, 0.0375f, "1-3", false));
        drops.add(new ItemData(22877, 0.025f, "1", false));
        drops.add(new ItemData(22885, 0.3333333333333333f, "1-2", false));
        drops.add(new ItemData(21486, 0.05f, "2-5", false));
        drops.add(new ItemData(21488, 0.0375f, "1-3", false));
        drops.add(new ItemData(5280, 0.025f, "4-14", false));
        drops.add(new ItemData(22873, 0.025f, "4-14", false));
        drops.add(new ItemData(22869, 0.025f, "1", false));
        drops.add(new ItemData(5317, 0.0125f, "1", false));
        drops.add(new ItemData(22871, 0.0125f, "1", false));
        drops.add(new ItemData(20661, 0.00018604651162790697f, "1", false));
        drops.add(new ItemData(22994, 0.02857142857142857f, "1", false));
        drops.add(new ItemData(5321, 0.025f, "10-20", false));
        drops.add(new ItemData(22879, 0.025f, "6-16", false));
        drops.add(new ItemData(22887, 0.0625f, "8-18", false));
        drops.add(new ItemData(5100, 0.025f, "6-14", false));
        drops.add(new ItemData(5311, 0.025f, "10-20", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
