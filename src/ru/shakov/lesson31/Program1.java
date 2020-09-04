package ru.shakov.lesson31;

// Программа проверяет, является ли исходная строка палиндромом, обход с помощью цикла for
public class Program1 {
    public static void main(String[] args) {
        String string = "121212121";
        // Преобразование строки в массив символов
        char[] chars = string.toCharArray();

        boolean isPalindrome = true;  // Вспомогательная переменная
        //Обход массива
        for (int i = 0; i < chars.length >> 1; i++) {
            // Если хотя бы раз наблюдается ассиметрия
            if (isPalindrome = chars[i] == chars[chars.length - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        // Вывод сообщения, является ли исходная строка палиндромом
        System.out.println(isPalindrome ? "Палиндром" : "Не палиндром");
    }
}
