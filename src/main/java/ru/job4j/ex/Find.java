package ru.job4j.ex;

public class Find {
    public static String get(String[] pData, int pIndex) {
        boolean run = true;
        while ((pIndex < 0) && (pIndex >= pData.length) ) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return pData[pIndex];
    }

    public static void main(String[] args) {
        System.out.println(Find.get(new String[] {"one", "two", "three"}, 1));
    }
}
