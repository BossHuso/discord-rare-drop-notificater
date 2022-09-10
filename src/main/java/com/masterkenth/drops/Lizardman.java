package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Lizardman implements BaseNPC {
    public List<ItemData> drops;

    public Lizardman() {
        drops = new ArrayList<>();
        drops.add(new ItemData(526, 1f, "1", false));
        drops.add(new ItemData(22879, 0.006578947368421052f, "1", false));
        drops.add(new ItemData(5295, 0.006414368184733804f, "1", false));
        drops.add(new ItemData(5105, 0.005592841163310962f, "1", false));
        drops.add(new ItemData(5282, 0.004770992366412214f, "1", false));
        drops.add(new ItemData(5296, 0.00444247001332741f, "1", false));
        drops.add(new ItemData(5281, 0.002961208172934557f, "1", false));
        drops.add(new ItemData(5297, 0.002961208172934557f, "1", false));
        drops.add(new ItemData(5106, 0.00213857998289136f, "1", false));
        drops.add(new ItemData(5298, 0.0019743336623889436f, "1", false));
        drops.add(new ItemData(5280, 0.0019743336623889436f, "1", false));
        drops.add(new ItemData(5100, 0.02252252252252252f, "1", false));
        drops.add(new ItemData(5299, 0.0014806040864672786f, "1", false));
        drops.add(new ItemData(22873, 0.0013161358252171624f, "1", false));
        drops.add(new ItemData(5300, 0.0008225713580653121f, "1", false));
        drops.add(new ItemData(5301, 0.0006580679126085812f, "1", false));
        drops.add(new ItemData(5302, 0.0004935590543408519f, "1", false));
        drops.add(new ItemData(5303, 0.0003290339563042906f, "1", false));
        drops.add(new ItemData(5304, 0.0001645169781521453f, "1", false));
        drops.add(new ItemData(13391, 0.11494252873563218f, "1", false));
        drops.add(new ItemData(13383, 0.06896551724137931f, "1", false));
        drops.add(new ItemData(13393, 0.004f, "1", false));
        drops.add(new ItemData(5323, 0.021551724137931036f, "1", false));
        drops.add(new ItemData(23083, 0.0018484288354898336f, "1", false));
        drops.add(new ItemData(5100, 0.02512562814070352f, "1", false));
        drops.add(new ItemData(5323, 0.02403846153846154f, "1", false));
        drops.add(new ItemData(5292, 0.022935779816513763f, "1", false));
        drops.add(new ItemData(5104, 0.016891891891891893f, "1", false));
        drops.add(new ItemData(5293, 0.015600624024960999f, "1", false));
        drops.add(new ItemData(5311, 0.015220700152207f, "1", false));
        drops.add(new ItemData(5321, 0.011560693641618497f, "1", false));
        drops.add(new ItemData(5294, 0.010277492291880781f, "1", false));
        drops.add(new ItemData(5292, 0.0205761316872428f, "1", false));
        drops.add(new ItemData(22879, 0.007342143906020558f, "1", false));
        drops.add(new ItemData(5295, 0.0071581961345740875f, "1", false));
        drops.add(new ItemData(5105, 0.006238303181534623f, "1", false));
        drops.add(new ItemData(5282, 0.005321979776476849f, "1", false));
        drops.add(new ItemData(5296, 0.004955401387512388f, "1", false));
        drops.add(new ItemData(5281, 0.0033025099075297227f, "1", false));
        drops.add(new ItemData(5297, 0.0033025099075297227f, "1", false));
        drops.add(new ItemData(5106, 0.002385496183206107f, "1", false));
        drops.add(new ItemData(5298, 0.002202158114952654f, "1", false));
        drops.add(new ItemData(5280, 0.002202158114952654f, "1", false));
        drops.add(new ItemData(5104, 0.015128593040847202f, "1", false));
        drops.add(new ItemData(5299, 0.0016515276630883566f, "1", false));
        drops.add(new ItemData(22873, 0.001467997651203758f, "1", false));
        drops.add(new ItemData(5300, 0.0009175153683824204f, "1", false));
        drops.add(new ItemData(5301, 0.000733998825601879f, "1", false));
        drops.add(new ItemData(5302, 0.0005505092210294523f, "1", false));
        drops.add(new ItemData(5303, 0.0003669994128009395f, "1", false));
        drops.add(new ItemData(5304, 0.00018349970640046975f, "1", false));
        drops.add(new ItemData(13391, 0.1794871794871795f, "1", false));
        drops.add(new ItemData(13383, 0.10256410256410256f, "1", false));
        drops.add(new ItemData(5293, 0.013986013986013986f, "1", false));
        drops.add(new ItemData(23083, 0.002577319587628866f, "1", false));
        drops.add(new ItemData(5311, 0.01366120218579235f, "1", false));
        drops.add(new ItemData(5321, 0.010362694300518135f, "1", false));
        drops.add(new ItemData(5294, 0.009216589861751152f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
