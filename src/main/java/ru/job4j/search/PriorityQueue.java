package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task pValue) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() < pValue.getPriority()) index++;
        }
        tasks.add(index, pValue);
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
