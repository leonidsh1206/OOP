package ru.shakov.lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class Cenzor {
    public static void main(String[] args) {
        //"Кулебяка бяка БЯКА Бяка бякаБяка бякА Бякабяка";

        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);

        String string3 = scanner.nextLine();
        System.out.println(string3);

        String[] string4 = string3.split(" ");
        System.out.println(Arrays.toString(string4));   // проверка, как разделен введенный

        //int n = string4.length;       //количество слов в веденном тексте
        //System.out.println(string4.length);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string4.length; i++) {
            if ("бяка".equalsIgnoreCase(string4[i])) {
                string4[i] = "«цензура»";
            }
            stringBuilder.append(" ").append(string4[i]);
        }
        System.out.println(stringBuilder);
    }
}
