package ru.shakov.lesson8.part1;

public class Run {
    public static void main(String[] args) {

        double addition = Calculator.Addition(10, 30);
        System.out.println(addition);

        double subtraction = Calculator.Subtraction(50,30);
        System.out.println(subtraction);

        double multiplication = Calculator.Multiplication(50,30);
        System.out.println(multiplication);

        double division = Calculator.Division(50,30);
        System.out.println(division);

        double percentage = Calculator.Percentage(50,30);
        System.out.println(percentage);

    }
}
