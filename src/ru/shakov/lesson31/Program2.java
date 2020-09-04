package ru.shakov.lesson31;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Программа проверяет, является ли исходная строка палиндромом, используя Stack
public class Program2 {
    public static void main(String[] args) {
        String string = "Мадам";
        // Преобразование строки в массив символов
        char[] chars = string.toCharArray();

        // Добавлем элементы массива в Стек
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : chars) {
            stack.push(ch);
        }
        System.out.println();

        // Создаем новую строку и добавляем в нее извлекаемы из стека элементы
        StringBuilder st = new StringBuilder();
        while (!stack.isEmpty()) {
            st.append(stack.pop());
        }
        System.out.println(st); // Выводим получившуюся строку

        // сравниваем получившуюся строку с исходной и выводим, являетс яли она палиндромом
        System.out.println(st.toString().equals(string) ? "Палиндром" : "Не палиндром");
    }
}
