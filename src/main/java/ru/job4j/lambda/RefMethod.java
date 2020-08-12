package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Iven",
                "Petr Arsentev"
        );
        Consumer<String> consumer = (name) -> System.out.println(name);
        Consumer<String> refLam = RefMethod::cutOut;
        names.forEach(consumer);
        names.forEach(refLam);
    }
    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }
}
