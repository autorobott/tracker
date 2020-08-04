package ru.job4j.tracker;

import java.util.*;

public class Tracker {
  private List<Item> items = new ArrayList<Item>();

    public Item add(Item pItem) {
        pItem.setId(generateId());
        items.add(pItem);
        return pItem;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String pName) {
        List<Item> steck = new ArrayList<>();
        for (Item buff : items) {
            if (buff.getName().equals(pName)) {
                steck.add(buff);
            }
        }
        return steck;
    }

    private int indexOf(String pId) {
        int result = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(pId)) {
                result = index;
                break;
            }
        }
        return result;
    }

    public Item findById(String pId) {
        return items.get(indexOf(pId));
    }

    public boolean replace(String pId, Item pItem) {
        boolean rsl = false;
        int index = 0;
        for (Item buff : items) {
            if (buff.getId().equals(pId)) {
                pItem.setId(buff.getId());
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
        int index = 0;
        boolean rsl = false;
        for (Item buff : items) {
            if (buff.getId().equals(pId)) {
                items.remove(index);
                rsl = true;
                break;
            }
            index++;
        }
        return rsl;
    }
}
