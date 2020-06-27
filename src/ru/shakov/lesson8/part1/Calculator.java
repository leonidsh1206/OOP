package ru.shakov.lesson8.part1;

public class Calculator {

    public static double Addition(double a, double b) { //Сложение
        double addition = a + b;
        return addition;
    }

    public static double Subtraction(double a, double b) {
        double subtraction = a - b;
        return subtraction;
    }

    public static double Multiplication(double a, double b) {
        double multiplication = a * b;
        return multiplication;
    }

    public static double Division(double a, double b) {
        double division = a / b;
        return division;
    }

    public static double Percentage(double a, double b) {
        double percentage = a * 100 / b;
        return percentage;
    }

}
