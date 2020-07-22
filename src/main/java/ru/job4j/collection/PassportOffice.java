package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen pCitizen) {
        boolean rsl = false;
            if (!citizens.containsKey(pCitizen.getPassport()) && (pCitizen.getUsername() != null)) {
                citizens.put(pCitizen.getPassport(), pCitizen);
                rsl = true;
            }
    return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
