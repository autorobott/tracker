package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task pValue) {
        int index = 0;
        int indexFind = pValue.getPriority();
        boolean check = true;
        for (Task value : tasks) {
            if (value.getPriority() >= indexFind) {
                tasks.add(index, pValue);
                check = false;
                break;
            }
            index++;
        }
        if (check) tasks.add(pValue);
    }

    public Task take() {
        return tasks.poll();
    }

    public void getAll() {
        for (Task value : tasks) {
            System.out.println(value.getDesc() + " : (" + value.getPriority() + ")");
        }
    }
}
