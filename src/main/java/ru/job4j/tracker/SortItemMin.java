package ru.job4j.tracker;

import java.util.Comparator;

public class SortItemMin implements Comparator<Item> {
    @Override
    public int compare(Item first, Item secont) {
        int rsl = secont.getName().compareTo(first.getName());
        if (rsl == 0) {
            rsl = secont.getId().compareTo(first.getId());
        }
        return rsl;
    }
}
