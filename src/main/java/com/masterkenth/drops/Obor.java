package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Obor implements BaseNPC {
    public List<ItemData> drops;

    public Obor() {
        drops = new ArrayList<>();
        drops.add(new ItemData(532, 1f, "1", false));
        drops.add(new ItemData(1373, 0.03389830508474576f, "1", false));
        drops.add(new ItemData(1303, 0.0423728813559322f, "1", false));
        drops.add(new ItemData(1319, 0.025423728813559324f, "1", false));
        drops.add(new ItemData(20756, 0.00847457627118644f, "1", false));
        drops.add(new ItemData(563, 0.1016949152542373f, "50-99", false));
        drops.add(new ItemData(564, 0.1016949152542373f, "60-119", false));
        drops.add(new ItemData(562, 0.0847457627118644f, "100-199", false));
        drops.add(new ItemData(560, 0.0847457627118644f, "40-79", false));
        drops.add(new ItemData(561, 0.059322033898305086f, "40-79", false));
        drops.add(new ItemData(995, 0.0847457627118644f, "10000-20000", false));
        drops.add(new ItemData(23182, 1f, "1", false));
        drops.add(new ItemData(225, 0.06779661016949153f, "20", false));
        drops.add(new ItemData(532, 0.06779661016949153f, "50", false));
        drops.add(new ItemData(1619, 0.0423728813559322f, "5", false));
        drops.add(new ItemData(1617, 0.0423728813559322f, "5", false));
        drops.add(new ItemData(20754, 0.0625f, "1", false));
        drops.add(new ItemData(10976, 0.0025f, "1", false));
        drops.add(new ItemData(6800, 0.0002f, "1", false));
        drops.add(new ItemData(10977, 0.00019950124688279303f, "1", false));
        drops.add(new ItemData(13474, 1f, "1", false));
        drops.add(new ItemData(1201, 0.025423728813559324f, "1", false));
        drops.add(new ItemData(1163, 0.0423728813559322f, "1", false));
        drops.add(new ItemData(1147, 0.05084745762711865f, "1", false));
        drops.add(new ItemData(1113, 0.025423728813559324f, "1", false));
        drops.add(new ItemData(1079, 0.025423728813559324f, "1", false));
        drops.add(new ItemData(1093, 0.025423728813559324f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
