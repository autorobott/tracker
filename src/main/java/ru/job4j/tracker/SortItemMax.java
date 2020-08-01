package ru.job4j.tracker;

import java.util.Comparator;

public class SortItemMax implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        int rsl = first.getName().compareTo(second.getName());
        if (rsl == 0) {
            rsl = first.getId().compareTo(second.getId());
        }
        return rsl;
    }
}
