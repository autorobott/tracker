package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public static List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] array = new int[3][5];
        toList(array);
    }
}
