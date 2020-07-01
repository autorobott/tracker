package ru.job4j.ex;

public class UserNotFoundException extends Exception {
    public void println() {
        System.out.println("the user is not found");
    }
}
