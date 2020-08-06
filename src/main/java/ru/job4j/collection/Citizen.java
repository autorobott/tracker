package ru.job4j.collection;

import java.util.Objects;

public class Citizen {
    private String passport;
    private String username;

    public Citizen(String pPassport, String pUsername) {
        passport = pPassport;
        username = pUsername;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
