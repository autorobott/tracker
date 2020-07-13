
package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tracker {
    private List<Item> items = new ArrayList<Item>();

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item pItem) {
        pItem.setId(generateId());
        items.add(pItem);
        return pItem;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.size()];
        int index = 0;
        for (Item buff : items) {
            rsl[index++] = buff;
        }
        rsl = Arrays.copyOf(rsl, index);
        return rsl;
    }

    public Item[] findByName(String pName) {
        Item[] rsl = new Item[items.size()];
        int newSize = 0;
        for (Item buff : items) {
            if (buff.getName().equals(pName)) {
                rsl[newSize] = buff;
                newSize++;
            }
        }
        rsl = Arrays.copyOf(rsl, newSize);
        return rsl;
    }

    public Item findById(String pId) {
        Item rsl = new Item();
        for (Item buff : items) {
            if (buff.getId().equals(pId)) {
                rsl = buff;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String pId, Item pItem) {
        boolean rsl = false;
        int index = 0;
        for (Item buff : items) {
            if (buff.getId().equals(pId)) {
                pItem.setId(pId);
                items.remove(index);
                items.add(index, pItem);
                rsl = true;
                break;
            }
            index++;
        }
        return rsl;
    }

    public boolean delete(String pId) {
        boolean rsl = false;
        int index = 0;
        for (Item buff : items) {
            index++;
            if (buff.getId().equals(pId)) {
                items.remove(index);
                rsl = true;
                break;
            }
        }
        return rsl;
    }
}
/*
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
            pItem.setId(pId);
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
            items[position - 1] = null;
            position--;
        result = true;
        }
        return result;
    }
}

 */
