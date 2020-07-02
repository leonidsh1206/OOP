package ru.shakov.lesson8.part1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double addition = Calculator.addition(a, b);
        System.out.println(addition);

        double subtraction = Calculator.subtraction(a,b);
        System.out.println(subtraction);

        double multiplication = Calculator.multiplication(a,b);
        System.out.println(multiplication);

        double division = Calculator.division(a,b);
        System.out.println(division);

        double percentage = Calculator.percentage(a,b);
        System.out.println(percentage);

    }
}
