package ru.shakov.kons4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Дано: пользоатель вводит элементы треугольника 3х типов: 1 - три стороны,
 * 2 - две стороны и угол между ними, 3 - сторона и два прилежащих угла
 * Найти: остальные элементы треугольника и вычислить периметр, площадь,
 * радиусы вписанной и описанной окружностей
 */


public class Main {
    public static <calculateAngelA> void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            // try - элемент тестирования, useLocale(Locale.US) - позволяет считывать
            // дробные числа 0.2 вместо 0,2
            System.out.println("Введите 1, 2 или 3");
            int code = scanner.nextInt();
            switch (code) {
                case 1: {
                    double sideA = scanner.nextDouble();
                    double sideB = scanner.nextDouble();
                    double sideC = scanner.nextDouble();
                    Triangle triangle = new Triangle(sideA, sideB, sideC, 0, 0, 0);
                    triangle.setAngleB(calculateAngelB(triangle));
                    triangle.setAngleC(calculateAngelC(triangle));
                    triangle.setAngleA(calculateAngelA(triangle));
                    System.out.printf(Locale.US, "%s", triangle);
                    System.out.println(triangle.getAngleC() + triangle.getAngleB() + triangle.getAngleA());
                    break;
                }
                case 2: {
                    double sideA = scanner.nextDouble();
                    double sideB = scanner.nextDouble();
                    double angleC = scanner.nextDouble();
                    Triangle triangle = new Triangle(sideA, sideB, 0, 0, 0, angleC);
                    triangle.setSideC(calculateSideC(triangle));
                    triangle.setAngleB(calculateAngelB(triangle));
                    triangle.setAngleA(calculateAngelA(triangle));
                    System.out.printf(Locale.US, "%s", triangle);
                    System.out.println(triangle.getAngleC() + triangle.getAngleB() + triangle.getAngleA());
                    break;
                }
                case 3: {
                    double sideA = scanner.nextDouble();
                    double angleB = scanner.nextDouble();
                    double angleC = scanner.nextDouble();
                    Triangle triangle = new Triangle(sideA, 0, 0, 0, angleB, angleC);
                    triangle.setSideB(calculateSideB(triangle));
                    triangle.setSideC(calculateSideC(triangle));
                    triangle.setAngleA(calculateAngelA(triangle));
                    System.out.printf(Locale.US, "%s", triangle);
                    System.out.println(triangle.getAngleC() + triangle.getAngleB() + triangle.getAngleA());
                    break;
                }
            }
        }
    }

    private static double calculateAngelA(Triangle triangle) {
        double angleA = Math.PI - triangle.getAngleB() - triangle.getAngleC();
        triangle.setAngleA(angleA);
        return angleA;
    }

    private static double calculateAngelB(Triangle triangle) {
        double angleB = Math.acos((triangle.getSideA() * triangle.getSideA() + triangle.getSideC() * triangle.getSideC()
                - triangle.getSideB() * triangle.getSideB()) / (2 * triangle.getSideA() * triangle.getSideC()));
        triangle.setAngleB(angleB);
        return angleB;
    }

    private static double calculateAngelC(Triangle triangle) {
        double angleC = Math.acos((triangle.getSideA() * triangle.getSideA() + triangle.getSideB() * triangle.getSideB()
                - triangle.getSideC() * triangle.getSideC()) / (2 * triangle.getSideA() * triangle.getSideB()));
        triangle.setAngleC(angleC);
        return angleC;
    }

    private static double calculateSideC(Triangle triangle) {
        double sideC = Math.sqrt(triangle.getSideA() * triangle.getSideA() + triangle.getSideB() * triangle.getSideB()
                - 2 * triangle.getSideA() * triangle.getSideB() * Math.cos(triangle.getAngleC()));
        triangle.setSideC(sideC);
        return sideC;
    }

    private static double calculateSideB(Triangle triangle) {
        double sideB = triangle.getSideA() * Math.sin(triangle.getAngleB() / Math.sin(Math.PI - triangle.getAngleB() - triangle.getAngleC()));
        triangle.setSideB(sideB);
        return sideB;
    }
}