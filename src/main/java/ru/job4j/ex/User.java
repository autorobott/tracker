package ru.job4j.ex;

public class User {
    private String userName;
    private boolean valid;

    public User(String pUserName, boolean pValid) {
        userName = pUserName;
        valid = pValid;
    }

    public String getUserName() {
        return userName;
    }

    public boolean isValid() {
        return valid;
    }
}
