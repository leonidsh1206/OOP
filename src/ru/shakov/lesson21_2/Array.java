package ru.shakov.lesson21_2;

public class Array {
    public static void main(String[] args) {
        // Задаем массив
        int[] m = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        // Вызываем метод для вывода элементов массива
        showArray(m);
        System.out.println();

        // Вызываем метод для реверса элементов массива
        reverseArray(m);

        // Вызываем метод для вывода элементов массива после реверса
        showArray(m);

    }

    // Метод для вывода элементов массива
    private static void showArray(int[] m) {
        for (int value : m) {
            System.out.printf("[%d] ", value);
        }
    }

    // Метод для реверса элементов массива
    private static void reverseArray(int[] m) {
        int k;
        for (int i = 0; i < (m.length / 2); i++) {
            k = m[i];
            m[i] = m[m.length - i - 1];
            m[m.length - i - 1] = k;
        }
    }
}
