package ru.job4j.encapsulation;

public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String pName) {
        name = pName;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return seatch(key);
    }

    private String seatch(String key) {
        return key;
    }
}
