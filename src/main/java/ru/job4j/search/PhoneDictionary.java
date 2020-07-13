package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary implements PhoneDicInter{
    private ArrayList<Person> persons = new ArrayList<Person>();

    @Override
    public void add(Person pPerson) throws IllegalArgumentException{
        if (pPerson == null) {
            throw new NullPointerException("Key is NULL !");
        }
        persons.add(pPerson);
    }

    @Override
    public ArrayList<Person> find(String pKey) throws IllegalArgumentException{
        if (pKey == null) {
            throw new NullPointerException("Key is NULL !");
        }
        ArrayList<Person> personList = new ArrayList<Person>();
        for (Person value : persons) {
            if (    value.getName().contains(pKey) ||
                    value.getSurname().contains(pKey) ||
                    value.getPhone().contains(pKey) ||
                    value.getAddress().contains(pKey))
            {
                personList.add(value);
            }
        }
        return personList;
    }
}
