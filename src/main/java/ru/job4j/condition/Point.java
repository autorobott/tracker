package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int pX, int pY) {
        x = pX;
        y = pY;
    }
    public Point(int pX, int pY, int pZ) {
        x = pX;
        y = pY;
        z = pZ;
    }
    public double distance(Point point) {
        return Math.sqrt((Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2)));
        }
    public double distance3d(Point point) {
        return Math.sqrt((Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2) + Math.pow((point.z - z), 2)));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}


