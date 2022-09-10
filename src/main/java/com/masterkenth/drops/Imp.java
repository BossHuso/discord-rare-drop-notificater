package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Imp implements BaseNPC {
    public List<ItemData> drops;

    public Imp() {
        drops = new ArrayList<>();
        drops.add(new ItemData(25766, 1f, "1", false));
        drops.add(new ItemData(2311, 0.03125f, "1", false));
        drops.add(new ItemData(2146, 0.03125f, "1", false));
        drops.add(new ItemData(1965, 0.015625f, "1", false));
        drops.add(new ItemData(2307, 0.015625f, "1", false));
        drops.add(new ItemData(2309, 0.0078125f, "1", false));
        drops.add(new ItemData(2142, 0.0078125f, "1", false));
        drops.add(new ItemData(2347, 0.0625f, "1", false));
        drops.add(new ItemData(590, 0.0390625f, "1", false));
        drops.add(new ItemData(1735, 0.03125f, "1", false));
        drops.add(new ItemData(1925, 0.03125f, "1", false));
        drops.add(new ItemData(1474, 0.0390625f, "1", false));
        drops.add(new ItemData(1929, 0.015625f, "1", false));
        drops.add(new ItemData(1935, 0.015625f, "1", false));
        drops.add(new ItemData(1937, 0.015625f, "1", false));
        drops.add(new ItemData(1931, 0.015625f, "1", false));
        drops.add(new ItemData(1933, 0.015625f, "1", false));
        drops.add(new ItemData(1759, 0.0625f, "1", false));
        drops.add(new ItemData(1448, 0.0546875f, "1", false));
        drops.add(new ItemData(592, 0.046875f, "1", false));
        drops.add(new ItemData(434, 0.03125f, "1", false));
        drops.add(new ItemData(753, 0.03125f, "1", false));
        drops.add(new ItemData(1470, 0.0390625f, "1", false));
        drops.add(new ItemData(1947, 0.0234375f, "1", false));
        drops.add(new ItemData(1949, 0.015625f, "1", false));
        drops.add(new ItemData(956, 0.015625f, "1", false));
        drops.add(new ItemData(195, 0.0078125f, "1", false));
        drops.add(new ItemData(13453, 0.04f, "1", false));
        drops.add(new ItemData(11941, 0.06666666666666667f, "1", false));
        drops.add(new ItemData(11942, 0.016666666666666666f, "1", false));
        drops.add(new ItemData(6803, 0.0002f, "1", false));
        drops.add(new ItemData(1476, 0.0390625f, "1", false));
        drops.add(new ItemData(1472, 0.0390625f, "1", false));
        drops.add(new ItemData(877, 0.0625f, "1", false));
        drops.add(new ItemData(579, 0.0625f, "1", false));
        drops.add(new ItemData(1944, 0.0390625f, "1", false));
        drops.add(new ItemData(2138, 0.0390625f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
