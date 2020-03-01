package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;

    public Point(int first, int second) {
        x = first;
        y = second;
    }

    public double distence(Point that) {
        return sqrt(pow(x - that.x, 2) + pow(y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distence(b);
        System.out.println(dist);
    }
}
