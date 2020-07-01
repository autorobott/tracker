package ru.job4j.ex;

public class UserInvalidException extends UserNotFoundException {
    public void println() {
        System.out.println("the user is not valid");
    }
}
