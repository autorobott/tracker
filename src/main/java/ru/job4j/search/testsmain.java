package ru.job4j.search;

import java.util.LinkedList;

public class testsmain {
    public static void main(String[] args) {
        PhoneDicInter phones = new PhoneDictionary();
        phones.add( new Person("Nik", "King", "9821738912", "sadfsadf"));
        LinkedList<String> names = new LinkedList<String>();
        names.add(0, "Lox0");
        names.add(0, "Lox1");
        names.add(0, "Lox2");
        for (String value : names) {
            System.out.println(value);
        }



    }
}
