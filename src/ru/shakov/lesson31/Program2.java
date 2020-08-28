package ru.shakov.lesson31;

import java.util.Stack;

// Программа проверяет, является ли исходная строка палиндромом, используя Stack
public class Program2 {
    public static void main(String[] args) {
        String string = "Мадам";
        // Преобразование строки в массив символов
        char[] chars = string.toCharArray();

        // Добавлем элементы массива в Стек
        Stack stack = new Stack();
        for (char ch : chars) {
            System.out.print(stack.push(ch) + " ");
        }
        System.out.println();

        // Создаем новую строку и добавляем в нее извлекаемы из стека элементы
        String st = "";
        while (!stack.isEmpty()) {
            st += stack.pop();
        }
        System.out.println(st); // Выводим получившуюся строку

        if (st.equals(string)) {    // сравниваем получившуюся строку с исходной и выводим, являетс яли она палиндромом
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
