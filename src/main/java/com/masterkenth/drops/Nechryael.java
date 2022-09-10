package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Nechryael implements BaseNPC {
    public List<ItemData> drops;

    public Nechryael() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25772, 1f, "1", false));
        drops.add(new ItemData(563, 0.04310344827586207f, "25-35", false));
        drops.add(new ItemData(565, 0.034482758620689655f, "15-20", false));
        drops.add(new ItemData(5100, 0.05172413793103448f, "1", false));
        drops.add(new ItemData(5296, 0.030864197530864196f, "1-2", false));
        drops.add(new ItemData(5297, 0.021052631578947368f, "1-2", false));
        drops.add(new ItemData(5281, 0.020366598778004074f, "1-2", false));
        drops.add(new ItemData(5106, 0.01447178002894356f, "1-2", false));
        drops.add(new ItemData(5298, 0.01447178002894356f, "1-2", false));
        drops.add(new ItemData(5280, 0.013812154696132596f, "1-2", false));
        drops.add(new ItemData(22873, 0.009861932938856016f, "1-2", false));
        drops.add(new ItemData(1073, 0.034482758620689655f, "1", false));
        drops.add(new ItemData(5299, 0.009861932938856016f, "1-2", false));
        drops.add(new ItemData(5300, 0.006574621959237344f, "1-2", false));
        drops.add(new ItemData(5301, 0.004601932811780948f, "1-2", false));
        drops.add(new ItemData(5302, 0.003287310979618672f, "1-2", false));
        drops.add(new ItemData(22879, 0.0026301946344029457f, "3-6", false));
        drops.add(new ItemData(5303, 0.0019723865877712033f, "1-2", false));
        drops.add(new ItemData(5304, 0.0013150973172014729f, "1-2", false));
        drops.add(new ItemData(995, 0.11206896551724138f, "1000-1499", false));
        drops.add(new ItemData(995, 0.09051724137931035f, "1500-2000", false));
        drops.add(new ItemData(995, 0.05172413793103448f, "2500-2999", false));
        drops.add(new ItemData(1319, 0.034482758620689655f, "1", false));
        drops.add(new ItemData(995, 0.02586206896551724f, "3000-3500", false));
        drops.add(new ItemData(995, 0.021551724137931036f, "500-999", false));
        drops.add(new ItemData(995, 0.008620689655172414f, "5000", false));
        drops.add(new ItemData(1761, 0.034482758620689655f, "25", false));
        drops.add(new ItemData(361, 0.02586206896551724f, "1", false));
        drops.add(new ItemData(1163, 0.02586206896551724f, "1", false));
        drops.add(new ItemData(1199, 0.017241379310344827f, "1", false));
        drops.add(new ItemData(4131, 0.008620689655172414f, "1", false));
        drops.add(new ItemData(23083, 0.012987012987012988f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(562, 0.06896551724137931f, "37", false));
        drops.add(new ItemData(560, 0.05172413793103448f, "5", false));
        drops.add(new ItemData(560, 0.05172413793103448f, "10", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
