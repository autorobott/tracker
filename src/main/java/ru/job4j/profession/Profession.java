package ru.job4j.profession;

public abstract class Profession {
    private String name;
    private int heal;
    private int teeth;
    private int eyes;
    private int experience;

    public Profession(String pName) {
        name = pName;
        heal = 100;
        teeth = 32;
        eyes = 100;
        experience = 0;
    }

    public Profession(String pName, int pHeal, int pTeeth, int pEyes, int pExperience)   {
        name = pName;
        heal = pHeal;
        teeth = pTeeth;
        eyes = pEyes;
        experience = pExperience;

    }

    public String getName() {
        return name;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int pHeal) {
        heal = pHeal;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int pTeeth) {
        teeth = pTeeth;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int pEyes) {
        eyes = pEyes;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int pExperience) {
        experience = pExperience;
    }

    public void levalUp() {
        setExperience(getExperience() + 1);
    }

    public int work(int pWork) {
        return pWork - getExperience();
    }
}
