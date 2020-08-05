package ru.job4j.tracker;

public interface InputItem {
    public String getId();
    public void setId(String pId);
    public String getName();
    public void setName(String pName);
    public int hashCode();
    public boolean equals(Object o);
    public String toString();
    public int compareTo(Item another);
}
