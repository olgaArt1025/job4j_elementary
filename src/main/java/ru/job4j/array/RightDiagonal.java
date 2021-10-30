package ru.job4j.array;

import java.util.Arrays;

public class RightDiagonal {

    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            rsl[i] = data[i][data.length - i - 1];
        }
        return rsl;
    }

    public static void main(String[]args) {
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(diagonal(data)));
    }
}

