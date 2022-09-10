package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class AncientZygomite implements BaseNPC {
    public List<ItemData> drops;

    public AncientZygomite() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.012711864406779662f, "1", false));
        drops.add(new ItemData(1621, 0.006355932203389831f, "1", false));
        drops.add(new ItemData(1619, 0.0031779661016949155f, "1", false));
        drops.add(new ItemData(1452, 0.0011916441909331766f, "1", false));
        drops.add(new ItemData(1462, 0.0011916441909331766f, "1", false));
        drops.add(new ItemData(1617, 0.0007944915254237289f, "1", false));
        drops.add(new ItemData(830, 0.00039724576271186443f, "5", false));
        drops.add(new ItemData(987, 0.00039724576271186443f, "1", false));
        drops.add(new ItemData(985, 0.00039724576271186443f, "1", false));
        drops.add(new ItemData(1247, 0.000024827860169491527f, "1", false));
        drops.add(new ItemData(2366, 0.000012413930084745764f, "1", false));
        drops.add(new ItemData(1249, 0.000009309720241665442f, "1", false));
        drops.add(new ItemData(2970, 1f, "1", false));
        drops.add(new ItemData(217, 0.025423728813559324f, "1-2", false));
        drops.add(new ItemData(2485, 0.019067796610169493f, "1-2", false));
        drops.add(new ItemData(5282, 0.0847457627118644f, "1", false));
        drops.add(new ItemData(5295, 0.0010169836265636124f, "1", false));
        drops.add(new ItemData(5300, 0.0009491268033409263f, "1", false));
        drops.add(new ItemData(5304, 0.0007457677679170706f, "1", false));
        drops.add(new ItemData(5321, 0.0006779661016949153f, "15", false));
        drops.add(new ItemData(5313, 0.0006779661016949153f, "1", false));
        drops.add(new ItemData(21488, 0.0006101653548111538f, "1", false));
        drops.add(new ItemData(5314, 0.0006101653548111538f, "1", false));
        drops.add(new ItemData(1359, 0.025423728813559324f, "1", false));
        drops.add(new ItemData(21486, 0.0006101653548111538f, "1", false));
        drops.add(new ItemData(5315, 0.0006101653548111538f, "1", false));
        drops.add(new ItemData(5288, 0.00047458592378150065f, "1", false));
        drops.add(new ItemData(5316, 0.0004067851767481593f, "1", false));
        drops.add(new ItemData(5289, 0.00033898305084745765f, "1", false));
        drops.add(new ItemData(5317, 0.0002711864406779661f, "1", false));
        drops.add(new ItemData(22877, 0.00020338845160371795f, "1", false));
        drops.add(new ItemData(22869, 0.00013559322033898305f, "1", false));
        drops.add(new ItemData(22871, 0.00013559322033898305f, "1", false));
        drops.add(new ItemData(21545, 0.15254237288135594f, "1", false));
        drops.add(new ItemData(557, 0.15254237288135594f, "100", false));
        drops.add(new ItemData(21543, 0.15254237288135594f, "1", false));
        drops.add(new ItemData(6034, 0.10847457627118644f, "2", false));
        drops.add(new ItemData(2970, 0.0847457627118644f, "5", false));
        drops.add(new ItemData(21622, 0.02711864406779661f, "2", false));
        drops.add(new ItemData(563, 0.05084745762711865f, "15", false));
        drops.add(new ItemData(21555, 0.32f, "5-19", false));
        drops.add(new ItemData(21562, 0.02f, "1", false));
        drops.add(new ItemData(21564, 0.01f, "1", false));
        drops.add(new ItemData(21566, 0.008f, "1", false));
        drops.add(new ItemData(21568, 0.002f, "1", false));
        drops.add(new ItemData(564, 0.05084745762711865f, "15", false));
        drops.add(new ItemData(23083, 0.01282051282051282f, "1", false));
        drops.add(new ItemData(2801, 0.0078125f, "1", false));
        drops.add(new ItemData(561, 0.05084745762711865f, "15", false));
        drops.add(new ItemData(213, 0.03177966101694915f, "1-2", false));
        drops.add(new ItemData(219, 0.05084745762711865f, "1", false));
        drops.add(new ItemData(215, 0.025423728813559324f, "1-2", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
