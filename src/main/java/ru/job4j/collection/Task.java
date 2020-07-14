package ru.job4j.collection;

public class Task {
    private String number;
    private String description;

    public Task(String pNumder, String pDescription ) {
        number = pNumder;
        description = pDescription;
    }

    public String getNumber() {
        return number;
    }
}
