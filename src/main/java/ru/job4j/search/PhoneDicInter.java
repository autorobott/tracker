package ru.job4j.search;

import java.util.ArrayList;

public interface PhoneDicInter {
    public void add(Person pPerson) throws NullPointerException;
    public ArrayList<Person> find(String pKey) throws NullPointerException;
}
