package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item pItem) {
        if (position < items.length - 1) {
            pItem.setId(generateId());
            items[position++] = pItem;
        }
        return pItem;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);

    }

    public Item[] findByName(String pName) {
        int stepResult = 0;
        Item[] result = new Item[position];
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(pName)) {
                result[stepResult++] = items[index];
            }
        }
        return Arrays.copyOf(result, stepResult);

    }

    private int indexOf(String pId) {
        int result = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(pId)) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item findById(String pId) {
        int index = indexOf(pId);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(String pId, Item pItem) {
        boolean result = false;
        int index = indexOf(pId);
        if (index > -1) {
            items[index] = pItem;
            //items[index].setName(pItem.getName());
            //items[index].setId(pItem.getId());
            result = true;
        }
        return result;
    }

    public boolean delete(String pId) {
        boolean result = false;
        int indexDel = indexOf(pId);
        if (indexDel > -1) {
            System.arraycopy(items, indexDel + 1, items, indexDel, position - indexDel);
            position--;
        result = true;
        }
        return result;
    }
}
