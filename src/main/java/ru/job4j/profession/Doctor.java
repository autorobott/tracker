package ru.job4j.profession;

public abstract class Doctor extends Profession {
    public Doctor(String pName) {
        super(pName);
    }

    public Doctor(String pName, int pHeal, int pTeeth, int pEyes, int pExperience) {
        super(pName, pHeal, pTeeth, pEyes, pExperience);
    }

    public void heal(Profession obj1) {

    }
}
