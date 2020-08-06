package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String dublicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = dublicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String buff : origin) {
            check.add(buff);
        }
        for (String buff : text) {
            if (!check.contains(buff)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
