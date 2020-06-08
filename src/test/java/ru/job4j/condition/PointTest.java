package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double expected = 1.414;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.001);
    }
    @Test
    public void distance3d() {
        Point a = new Point(1,1,1);
        Point b = new Point(2,2,2);
        double expected = 1.7;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}
