package ru.job4j.myStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MyStream {
    static public List<Integer> arrayList = new ArrayList<>();
    static public List<Integer> fillInTheArray(List<Integer> array) {
        for (int index = 0; index < 100; index++) {
            array.add((int) (Math.random() * 1000) - 500);
        }
        return array;
    }
    static public List<Integer> filterArrayPos(List<Integer> array) {
        List<Integer> filterArray = array.stream().filter(x -> x < 0).collect(Collectors.toList());
        return filterArray;
    }
    public static void main(String[] args) {
        fillInTheArray(arrayList);
        List<Integer> arrayInt = filterArrayPos(arrayList);
        arrayInt.forEach(System.out::println);


    }
};



