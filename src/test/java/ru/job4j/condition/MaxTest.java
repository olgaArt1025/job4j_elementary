package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5() {
        int left = 5;
        int right = 2;
        int third = 2;
        int result = Max.max(left, right, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4() {
        int left = 1;
        int right = 2;
        int third = 4;
        int fourth = 3;
        int result = Max.max(left, right, third, fourth);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}