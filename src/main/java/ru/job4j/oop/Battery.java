package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int pLoad) {
        load = pLoad;
    }

    public void exchange(Battery another) {
        another.load += load;
        load = 0;
    }
}
