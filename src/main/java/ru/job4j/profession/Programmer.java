package ru.job4j.profession;

public class Programmer extends Engineer {
    public Programmer(String pName) {
        super(pName);
    }

    public Programmer(String pName, int pHeal, int pTeeth, int pEyes, int pExperience) {
        super(pName, pHeal, pTeeth, pEyes, pExperience);
    }

    public void labor(int pLoad) {
        int load = work(pLoad);
        if (load >= getExperience()) {
            levalUp();
            setEyes(getEyes() - 1);
        }
    }
}
