package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Revenantpyrefiend implements BaseNPC {
    public List<ItemData> drops;

    public Revenantpyrefiend() {
        drops = new ArrayList<>();
        drops.add(new ItemData(21820, 1f, "2-16", false));
        drops.add(new ItemData(22299, 0.00007961783439490445f, "1", false));
        drops.add(new ItemData(22302, 0.00007961783439490445f, "1", false));
        drops.add(new ItemData(22305, 0.00007961783439490445f, "1", false));
        drops.add(new ItemData(21816, 0.03667033370003667f, "1", false));
        drops.add(new ItemData(1391, 0.01222344456667889f, "3", false));
        drops.add(new ItemData(1163, 0.004889736443205711f, "1", false));
        drops.add(new ItemData(1127, 0.004889736443205711f, "1", false));
        drops.add(new ItemData(1079, 0.004889736443205711f, "1", false));
        drops.add(new ItemData(1201, 0.004889736443205711f, "1", false));
        drops.add(new ItemData(1347, 0.004889736443205711f, "1", false));
        drops.add(new ItemData(22557, 0.00003184713375796178f, "1", false));
        drops.add(new ItemData(4087, 0.0012224191675325468f, "1", false));
        drops.add(new ItemData(4585, 0.0012224191675325468f, "1", false));
        drops.add(new ItemData(1215, 0.0024448084492580007f, "1", false));
        drops.add(new ItemData(1305, 0.0024448084492580007f, "1", false));
        drops.add(new ItemData(1149, 0.0010350359674998707f, "1", false));
        drops.add(new ItemData(453, 0.014669209329617133f, "25-40", false));
        drops.add(new ItemData(2361, 0.014669209329617133f, "4-6", false));
        drops.add(new ItemData(451, 0.009778994719342852f, "1-3", false));
        drops.add(new ItemData(2363, 0.0073346046648085665f, "1-2", false));
        drops.add(new ItemData(1747, 0.009778994719342852f, "3-4", false));
        drops.add(new ItemData(22550, 0.00001592356687898089f, "1", false));
        drops.add(new ItemData(8782, 0.0073346046648085665f, "5-12", false));
        drops.add(new ItemData(391, 0.009778994719342852f, "10-15", false));
        drops.add(new ItemData(1515, 0.009778994719342852f, "20-40", false));
        drops.add(new ItemData(1513, 0.004889736443205711f, "5-12", false));
        drops.add(new ItemData(1631, 0.0024448084492580007f, "2-5", false));
        drops.add(new ItemData(5315, 0.0003184713375796178f, "2-7", false));
        drops.add(new ItemData(5316, 0.0003184713375796178f, "2-7", false));
        drops.add(new ItemData(995, 0.7575757575757576f, "1-176", false));
        drops.add(new ItemData(21802, 0.01222344456667889f, "1", false));
        drops.add(new ItemData(3024, 0.0073346046648085665f, "1-3", false));
        drops.add(new ItemData(22555, 0.00001592356687898089f, "1", false));
        drops.add(new ItemData(9193, 0.0073346046648085665f, "15-30", false));
        drops.add(new ItemData(9194, 0.0073346046648085665f, "2-4", false));
        drops.add(new ItemData(563, 0.01222344456667889f, "20-45", false));
        drops.add(new ItemData(560, 0.01222344456667889f, "15-30", false));
        drops.add(new ItemData(565, 0.01222344456667889f, "10-20", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(23490, 0.0029850746268656717f, "1", false));
        drops.add(new ItemData(21257, 0.0035460992907801418f, "1", false));
        drops.add(new ItemData(22545, 0.00001592356687898089f, "1", false));
        drops.add(new ItemData(21807, 0.00047770776705058447f, "1", false));
        drops.add(new ItemData(21810, 0.0003184713375796178f, "1", false));
        drops.add(new ItemData(21813, 0.0001592356687898089f, "1", false));
        drops.add(new ItemData(21804, 0.00023885331301487818f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
