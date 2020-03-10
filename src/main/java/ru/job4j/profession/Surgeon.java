package ru.job4j.profession;

public class Surgeon extends Doctor {
    public Surgeon(String pName) {
        super(pName);
    }

    public Surgeon(String pName, int pHeal, int pTeeth, int pEyes, int pExperience) {
        super(pName, pHeal, pTeeth, pEyes, pExperience);
    }

    public void heal(Profession obj1) {
        int fullEyaes = 100;
        int load = fullEyaes - obj1.getEyes();
        if (work(load) >= 0) {
            levalUp();
        }
        obj1.setEyes(obj1.getEyes() + load);
    }
}
