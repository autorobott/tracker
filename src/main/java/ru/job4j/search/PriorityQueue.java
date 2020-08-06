package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task pValue) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() < pValue.getPriority()) {
                index++;
            }
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
    public static void main(String[] args) {
        Task p1 = new Task("1", 1);
        Task p2 = new Task("2", 2);
        Task p3 = new Task("3", 3);
        Task p4 = new Task("4", 4);
        PriorityQueue tasks = new PriorityQueue();
        tasks.put(p2);
        tasks.getAll();
        System.out.println("    ");
        tasks.put(p2);
        tasks.getAll();
        System.out.println("    ");
        tasks.put(p2);
        tasks.getAll();
        System.out.println("    ");
        tasks.put(p2);
        tasks.getAll();
        System.out.println("    ");
        tasks.put(p2);
        tasks.getAll();
        System.out.println("    ");
        tasks.put(p2);
        tasks.getAll();
        System.out.println("    ");

    }
}
