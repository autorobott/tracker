package ru.job4j.search;

public class Task {
    private String desc;
    private int priority;
    public Task(String pDesc, int pPpiority) {
        desc = pDesc;
        priority = pPpiority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
