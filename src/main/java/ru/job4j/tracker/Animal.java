package ru.job4j.tracker;

import javax.swing.*;

public class Animal {
    private String name;

    public Animal(String pName) {
        name = pName;
        System.out.println(" ");
        System.out.println("Animal");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Name 1");
        Predator predator = new Predator("Name 2");
        Tiger tiger = new Tiger("Name 3");
    }
}
