package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Spiritualwarrior implements BaseNPC {
    public List<ItemData> drops;

    public Spiritualwarrior() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1621, 0.003937007874015748f, "1", false));
        drops.add(new ItemData(1619, 0.001968503937007874f, "1", false));
        drops.add(new ItemData(1452, 0.0007381313098693691f, "1", false));
        drops.add(new ItemData(1462, 0.0007381313098693691f, "1", false));
        drops.add(new ItemData(1617, 0.0004921259842519685f, "1", false));
        drops.add(new ItemData(830, 0.00024606299212598425f, "5", false));
        drops.add(new ItemData(987, 0.00024606299212598425f, "1", false));
        drops.add(new ItemData(985, 0.00024606299212598425f, "1", false));
        drops.add(new ItemData(1247, 0.000015378937007874016f, "1", false));
        drops.add(new ItemData(2366, 0.000007689468503937008f, "1", false));
        drops.add(new ItemData(1249, 0.0000057666508583544465f, "1", false));
        drops.add(new ItemData(1279, 0.023622047244094488f, "1", false));
        drops.add(new ItemData(1355, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1317, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1303, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(3202, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1059, 0.07086614173228346f, "1", false));
        drops.add(new ItemData(1071, 0.08661417322834646f, "1", false));
        drops.add(new ItemData(1105, 0.14173228346456693f, "1", false));
        drops.add(new ItemData(1161, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1195, 0.023622047244094488f, "1", false));
        drops.add(new ItemData(1081, 0.031496062992125984f, "1", false));
        drops.add(new ItemData(1323, 0.06299212598425197f, "1", false));
        drops.add(new ItemData(1201, 0.007874015748031496f, "1", false));
        drops.add(new ItemData(1295, 0.11811023622047244f, "1", false));
        drops.add(new ItemData(11941, 0.3333333333333333f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(2722, 0.0078125f, "1", false));
        drops.add(new ItemData(23490, 0.0136986301369863f, "1", false));
        drops.add(new ItemData(21257, 0.004132231404958678f, "1", false));
        drops.add(new ItemData(1281, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(1341, 0.03937007874015748f, "1", false));
        drops.add(new ItemData(1428, 0.05511811023622047f, "1", false));
        drops.add(new ItemData(1217, 0.015748031496062992f, "1", false));
        drops.add(new ItemData(1257, 0.07086614173228346f, "1", false));
        drops.add(new ItemData(1371, 0.015748031496062992f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
