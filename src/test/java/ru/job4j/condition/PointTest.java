package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
    double expected = 2;
    int x1 = 0;
    int y1 = 0;
    int x2 = 2;
    int y2 = 0;
    double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to23then283() {
    double expected = 2.83;
    int x1 = 0;
    int y1 = 1;
    int x2 = 2;
    int y2 = 3;
    double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when21to54then424() {
        double expected = 4.24;
        int x1 = 2;
        int y1 = 1;
        int x2 = 5;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to01then1() {
        double expected = 1;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}