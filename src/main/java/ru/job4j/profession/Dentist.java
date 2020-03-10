package ru.job4j.profession;

public class Dentist extends Doctor {
    public Dentist(String pName) {
        super(pName);
    }

    public Dentist(String pName, int pHeal, int pTeeth, int pEyes, int pExperience) {
        super(pName, pHeal, pTeeth, pEyes, pExperience);
    }

    public void heal(Profession obj1) {
        int fullTeeth = 32;
        int load = fullTeeth - obj1.getTeeth();
        if (work(load) >= 0) {
            levalUp();
        }
        obj1.setTeeth(obj1.getTeeth() + load);
    }
}
