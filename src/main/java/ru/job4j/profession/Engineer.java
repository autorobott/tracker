package ru.job4j.profession;

import static java.lang.Math.abs;

public abstract class Engineer extends Profession {
    public Engineer(String pName) {
        super(pName);
    }

    public Engineer(String pName, int pHeal, int pTeeth, int pEyes, int pExperience) {
        super(pName, pHeal, pTeeth, pEyes, pExperience);
    }

    public void labor(int pLoad) {

    }
}
