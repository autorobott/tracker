package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        char[] arrayLeft = left.toCharArray();
        char[] arrayRight = right.toCharArray();
        int buffLeft = 0;
        int buffRight = 0;
        ArrayList<Integer> arraySumLeft = new ArrayList<>();
        ArrayList<Integer> arraySumRight = new ArrayList<>();
        boolean stopAddSumLeft = true;
        boolean stopAddSumRight = true;
        for (int step1 = 0; step1 < Math.min(left.length(), right.length()); step1++) {
            buffLeft = (int) left.charAt(step1);
            buffRight = (int) right.charAt(step1);
            if (buffLeft <= 57 && buffLeft >= 48 && stopAddSumLeft) {
                arraySumLeft.add(buffLeft);
                buffLeft = (int) left.charAt(step1 + 1);
                if (buffLeft == 32) {
                    stopAddSumLeft = false;
                }
            }
            if (buffRight <= 57 && buffRight >= 48 && stopAddSumRight) {
                arraySumRight.add(buffRight);
                buffRight = right.charAt(step1 + 1);
                if (buffRight == 32) {
                    stopAddSumRight = false;
                }
            }
            if (!stopAddSumLeft && !stopAddSumRight) {
                break;
            }
        }
        if (arraySumLeft.hashCode() > arraySumRight.hashCode()) {
            rsl = 1;
        } else if (arraySumLeft.hashCode() < arraySumRight.hashCode()) {
            rsl = -1;
        }
        System.out.println(arraySumLeft);
        System.out.println(arraySumRight);
        return rsl;
    }
}
