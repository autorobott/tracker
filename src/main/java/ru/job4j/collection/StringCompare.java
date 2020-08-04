package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
  public int compare(String left, String right) {
        int rsl = 0;
        for (int step1 = 0; step1 < Math.min(left.length(), right.length()) && rsl == 0; step1++) {
            rsl = Character.compare(left.charAt(step1), right.charAt(step1));
        }
        if (rsl == 0) {
            rsl = Integer.compare(left.length(), right.length());
        }
        return rsl;
    }
}
