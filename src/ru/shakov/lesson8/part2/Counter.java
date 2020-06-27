package ru.shakov.lesson8.part2;

public class Counter {      // отдельный класс в котором метод высчитывает количество обращений к static-переменной
    static int counter = 0;

    public static int Count() {     // Счетчик
        counter++;
        return counter;
    }
}
