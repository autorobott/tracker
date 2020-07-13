package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> pList) {
        List<Integer> rls = new ArrayList<Integer>();
            for (int[] var1 : pList) {
                for (int var2 : var1) {
                    rls.add(var2);
                }
        }
        return rls;
    }
}
