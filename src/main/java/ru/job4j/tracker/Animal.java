package ru.job4j.tracker;

import javax.swing.*;

public class Animal {
    private String name;

    public Animal() {
        System.out.println(" ");
        System.out.println("Animal");
    }

    public Animal(String pName) {
        name = pName;
        System.out.println(" ");
        System.out.println("Animal");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();

        Animal animal1 = new Animal("Name 1");
        Predator predator1 = new Predator("Name 2");
        Tiger tiger1 = new Tiger("Name 3");
    }

}
