package ru.job4j.calculate;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                    + multiply(first, second);
        }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double total(double first, double second) {
        return sumAndMultiply(first, second)
                + differenceAndDivision(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + total(10, 20));
    }
}