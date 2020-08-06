package ru.job4j.bank;

import java.util.Objects;

public class User /*implements Comparable<User>/* {
    private String passport;
    private String username;

    public User(String pPassport, String pUsername) {
        passport = pPassport;
        username = pUsername;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
/*
    @Override
    public int compareTo(User another) {
        return passport.compareTo(another.getPassport());
    }
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
