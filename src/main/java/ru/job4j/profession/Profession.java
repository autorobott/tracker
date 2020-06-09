package ru.job4j.profession;

public abstract class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;
    private Body body;

    public Profession(String pName) {
        name = pName;
    }

    public String getName() {
        return name;
    }
}
