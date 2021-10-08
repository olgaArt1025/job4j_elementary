package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return max(
                left,
                max(right, third)
        );
    }

    public static int max(int left, int right, int third, int fourth) {
        return max(
                left,
                right,
                max(third, fourth)
        );
    }

    public static void main(String[] args) {
        int msg = Max.max(10, 15);
        System.out.println(msg);
    }
}
