package ru.shakov.lesson8.part2;

public class Counter {      // отдельный класс в котором метод высчитывает количество обращений к static-переменной
    static int count = 0;

    public static int getCount() {
        count++;
        return count;
    }
}
