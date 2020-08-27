package ru.shakov.lesson31;

public class Program1 {
    public static void main(String[] args) {
        String string = "121212121";
        char[] chars = string.toCharArray();

        boolean b = false;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - i - 1]) {
                b = true;
            } else {
                b = false;
            }
        }

        if (b) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
