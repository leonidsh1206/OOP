package ru.shakov.lesson11;


import java.util.Scanner;

public class Censor2 {
    public static void main(String[] args) {

        //Кулебяка бяка БЯКА Бяка ,ябак кабя бяка, бякаБяка бякА   бяка  Бякабяка

        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        System.out.println(string1);

        String string3 = string1.replaceAll("\\b[Б,б][Я,я][К,к][А,а]\\b", "«цензура»");
        System.out.println(string3);

    }
}
