package ru.shakov.lesson31;

// Программа проверяет, является ли исходная строка палиндромом, обход с помощью цикла for
public class Program1 {
    public static void main(String[] args) {
        String string = "121212121";
        // Преобразование строки в массив символов
        char[] chars = string.toCharArray();

        boolean b = false;  // Вспомогательная переменная
        //Обход массива
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - i - 1]) {
                b = true;
            } else {    // Если хотя бы раз наблюдается ассиметрия
                b = false;
            }
        }

        // Вывод сообщения, является ли исходная строка палиндромом
        if (b) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
