package ru.job4j.profession;

public class Builder extends Engineer {
    public Builder(String pName) {
        super(pName);
    }

    public Builder(String pName, int pHeal, int pTeeth, int pEyes, int pExperience) {
        super(pName, pHeal, pTeeth, pEyes, pExperience);
    }

    public void labor(int pLoad) {
        int load = work(pLoad);
        if (load >= getExperience()) {
            levalUp();
            setTeeth(getTeeth() - 1);
        }
    }
}
