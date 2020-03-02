package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist1() {
        double result;
        Point ap = new Point(0,0);
        Point bp = new Point(0, 2);
        Point cp = new Point(2, 0);
        Triangle triangle1 = new Triangle(ap, bp, cp);
        result = triangle1.area();
        Assert.assertEquals(1.9, result, 0.1);
    }
    @Test
    public void whenExist2() {
        double result;
        Point ap = new Point(0,0);
        Point bp = new Point(0, 0);
        Point cp = new Point(2, 0);
        Triangle triangle1 = new Triangle(ap, bp, cp);
        result = triangle1.area();
        Assert.assertEquals(-1, result, 0.1);
    }
}


