package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        // Up casting
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object ostudent = student;
        // Down casting
        Object oobject = new Object();
        Student oostudent = (Student) oobject;
        Freshman oofreshman = (Freshman) oostudent;
    }
}
