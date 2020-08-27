package ru.shakov.lesson31;

import java.util.Stack;

public class Program2 {
    public static void main(String[] args) {
        String string = "Мадам";
        char[] chars = string.toCharArray();

        Stack stack = new Stack();
        for (char ch : chars) {
            System.out.println(stack.push(ch));
        }
        System.out.println();

        String st = "";
        while (!stack.isEmpty()) {
            st += stack.pop();
        }
        System.out.println(st);

        if (st.equals(string)) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
