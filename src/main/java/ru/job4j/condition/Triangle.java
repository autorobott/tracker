package ru.job4j.condition;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        first = ap;
        second = bp;
        third = cp;
    }
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
        //return result;
    }
    public double area() {
        double result = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (exist(a, b, c)) {
            result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return result;
    }
    private boolean exist(double a, double b, double c) {
        return ((a + b) > c) && ((a + c) > b) && ((c + a) > b);
    }
}
