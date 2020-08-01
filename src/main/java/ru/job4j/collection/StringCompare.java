package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        int rsl = 0;
        int firstHash = first.hashCode();
        int secondHash = second.hashCode();
        if (firstHash == secondHash) {
            return rsl;
        }
        char[] buffFirst = first.toCharArray();
        char[] buffSecond = second.toCharArray();
        int firstLen = buffFirst.length;
        int secondLen = buffSecond.length;
        int len = firstLen - secondLen;
        boolean len1 = false;
        int stepMax = 0;
        if (len <= 0) {
            stepMax = firstLen;
        } else {
            stepMax = secondLen;
            len1 = true;
        }
        for (int step = 0; step < stepMax; step++) {
            int var1 = (int) buffFirst[step];
            int var2 = (int) buffSecond[step];
            int result = var1 - var2;
            if (result < 0) {
                rsl = -1;
                break;
            } else if (result > 0) {
                rsl = 1;
                break;
            }
        }
        if (rsl == 0) {
            if (len1) {
                rsl = 1;
            } else {
                rsl = -1;
            }
        }
        return rsl;
    }
}
