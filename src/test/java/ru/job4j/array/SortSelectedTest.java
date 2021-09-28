package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);

    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {3, 8, 10};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[]{3, 1, 9, 7, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 5, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}