package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra Tra Tra");
    }
    public void soug() {
        System.out.println("I believe I can fly");
    }

    static public void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.soug();
        petya.soug();
        petya.soug();
    }
}
