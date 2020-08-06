package ru.job4j.collection;

import java.util.List;


public class ConvertList2Array {
    public static int[][] toArray(List<Integer> pList, int pCells) {
        int groups = (int) Math.ceil((double) pList.size() / pCells);
        System.out.println(groups);
        int[][] array = new int[groups][pCells];
        int row = 0;
        int cell = 0;
        for (Integer num : pList) {
            array[row][cell] = num;
            if (cell < pCells - 1) {
                cell++;
            } else {
                cell = 0;
                row++;
            }

        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.println(cell + " ");
            }
            System.out.println();
        }
    }


}
