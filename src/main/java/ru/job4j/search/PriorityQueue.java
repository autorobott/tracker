package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task pValue) {
        if(tasks.size() == 0) {
            tasks.add(pValue);
        } else {
            int index = 0;
            int indexFind = pValue.getPriority();
            for (Task value : tasks) {
                if (value.getPriority() >= indexFind) {
                    tasks.add(index, pValue);
                    break;
                }
                index++;
            }
        }
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
        PriorityQueue pq = new PriorityQueue();
        Task p1 = new Task("123" , 1);
        Task p2 = new Task("123" , 3);
        Task p3 = new Task("123" , 2);
        Task p4 = new Task("123" , 6);
        pq.put(p3);
        pq.put(p3);
        pq.put(p3);
        pq.getAll();
        pq.put(p1);
        pq.getAll();
    }
}
