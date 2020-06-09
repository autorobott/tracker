package ru.job4j.pojo;

public class Product {
    private String name;
    private int count;

    public Product(String pName, int pCount) {
        name = pName;
        count = pCount;
    }
    public String getName() {
        return name;
    }
    public void setName(String pName) {
        name = pName;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int pCount) {
        count = pCount;
    }
}
