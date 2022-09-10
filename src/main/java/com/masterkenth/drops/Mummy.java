package com.masterkenth.drops;

import com.masterkenth.ItemData;
import java.util.ArrayList;

import java.util.List;

public class Mummy implements BaseNPC {
    public List<ItemData> drops;

    public Mummy() {
        drops = new ArrayList<>();
        drops.add(new ItemData(1623, 0.0009746588693957114f, "1", false));
        drops.add(new ItemData(1621, 0.0004873294346978557f, "1", false));
        drops.add(new ItemData(1619, 0.00024366471734892786f, "1", false));
        drops.add(new ItemData(1452, 0.00009136713094874257f, "1", false));
        drops.add(new ItemData(1462, 0.00009136713094874257f, "1", false));
        drops.add(new ItemData(1617, 0.000060916179337231965f, "1", false));
        drops.add(new ItemData(830, 0.000030458089668615983f, "5", false));
        drops.add(new ItemData(987, 0.000030458089668615983f, "1", false));
        drops.add(new ItemData(985, 0.000030458089668615983f, "1", false));
        drops.add(new ItemData(1247, 0.000001903630604288499f, "1", false));
        drops.add(new ItemData(2366, 0.0000009518153021442495f, "1", false));
        drops.add(new ItemData(1249, 0.0000007138057105370513f, "1", false));
        drops.add(new ItemData(1656, 0.01949317738791423f, "1", false));
        drops.add(new ItemData(1637, 0.01949317738791423f, "1", false));
        drops.add(new ItemData(1677, 0.01949317738791423f, "1", false));
        drops.add(new ItemData(1639, 0.01949317738791423f, "1", false));
        drops.add(new ItemData(2566, 0.01949317738791423f, "1", false));
        drops.add(new ItemData(199, 0.0014619883040935672f, "1", false));
        drops.add(new ItemData(201, 0.0010964912280701754f, "1", false));
        drops.add(new ItemData(203, 0.0008223684210526315f, "1", false));
        drops.add(new ItemData(205, 0.0006396315722144045f, "1", false));
        drops.add(new ItemData(207, 0.000502563071665494f, "1", false));
        drops.add(new ItemData(209, 0.0003654970760233918f, "1", false));
        drops.add(new ItemData(211, 0.00027412280701754384f, "1", false));
        drops.add(new ItemData(213, 0.00022843567251461987f, "1", false));
        drops.add(new ItemData(215, 0.0001827485380116959f, "1", false));
        drops.add(new ItemData(2485, 0.00013706140350877192f, "1", false));
        drops.add(new ItemData(217, 0.00013706140350877192f, "1", false));
        drops.add(new ItemData(995, 0.03898635477582846f, "36", false));
        drops.add(new ItemData(995, 0.03898635477582846f, "95", false));
        drops.add(new ItemData(995, 0.03898635477582846f, "106", false));
        drops.add(new ItemData(995, 0.03898635477582846f, "183", false));
        drops.add(new ItemData(592, 1f, "1", false));
        drops.add(new ItemData(995, 0.03898635477582846f, "222", false));
        drops.add(new ItemData(995, 0.03313840155945419f, "46", false));
        drops.add(new ItemData(995, 0.01949317738791423f, "472", false));
        drops.add(new ItemData(1939, 0.05847953216374269f, "1", false));
        drops.add(new ItemData(444, 0.1949317738791423f, "1", false));
        drops.add(new ItemData(950, 0.07797270955165692f, "1", false));
        drops.add(new ItemData(970, 0.08576998050682261f, "1", false));
        drops.add(new ItemData(405, 0.005847953216374269f, "1", false));
        drops.add(new ItemData(2357, 0.03898635477582846f, "1", false));
        drops.add(new ItemData(1185, 0.005847953216374269f, "1", false));
        drops.add(new ItemData(1333, 0.005847953216374269f, "1", false));
        drops.add(new ItemData(2801, 0.001949317738791423f, "1", false));
        drops.add(new ItemData(4675, 0.001949317738791423f, "1", false));
        drops.add(new ItemData(1635, 0.07797270955165692f, "1", false));
        drops.add(new ItemData(1673, 0.04873294346978557f, "1", false));
        drops.add(new ItemData(1654, 0.03898635477582846f, "1", false));
        drops.add(new ItemData(526, 1f, "1", false));
    }

    public List<ItemData> getDrops() {
        return drops;
    }
}
