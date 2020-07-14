package ru.shakov.lesson11;

import java.util.Arrays;
import java.util.Scanner;

public class Cenzor {
    public static void main(String[] args) {

        //"Кулебяка бяка БЯКА Бяка бякаБяка бякА Бякабяка";

        final String s1 = "бяка";
        final String s2 = "«цензура»";

        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        System.out.println(string1);

        String[] string2 = string1.split(" ");
        System.out.println(Arrays.toString(string2));   // проверка, как разделен введенный

        //int n = string4.length;       //количество слов в введенном тексте
        //System.out.println(string4.length);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string2.length; i++) {
            if (s1.equalsIgnoreCase(string2[i])) {
                string2[i] = s2;
            }
            stringBuilder.append(" ").append(string2[i]);
        }
        System.out.println(stringBuilder);
    }
}
