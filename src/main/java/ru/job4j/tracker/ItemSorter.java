package ru.job4j.tracker;

import java.util.*;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("A"),
                new Item("C"),
                new Item("B")
        );
        System.out.println(items);
        Collections.sort(items);
        System.out.println(items);
        Collections.sort(items, new SortByIdItem());
        System.out.println(items);
    }
}
