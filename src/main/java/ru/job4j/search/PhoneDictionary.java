package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;
import static java.util.function.Predicate.*;

public class PhoneDictionary implements PhoneDicInter {
    private ArrayList<Person> persons = new ArrayList<Person>();
    @Override
    public void add(Person pPerson) throws IllegalArgumentException {
        if (pPerson == null) {
            throw new NullPointerException("Key is NULL !");
        }
        persons.add(pPerson);
    }

    @Override
    public ArrayList<Person> find(String pKey) throws IllegalArgumentException {
        if (pKey == null) {
            throw new NullPointerException("Key is NULL !");
        }
        Predicate<Person> personPredicate = p -> p.getName().contains(pKey);
        Predicate<Person> personPredicate1 = p -> p.getPhone().contains(pKey);
        Predicate<Person> personPredicate2 = p -> p.getSurname().contains(pKey);
        Predicate<Person> personPredicate3 = p -> p.getAddress().contains(pKey);
        Predicate<Person> personPredicate4 = personPredicate.or(personPredicate1).or(personPredicate2).or(personPredicate3);
        ArrayList<Person> personList = new ArrayList<Person>();
        for (Person value : persons) {
            if (personPredicate4.test(value)) {
                personList.add(value);
            }
        }
        return personList;
    }
}
