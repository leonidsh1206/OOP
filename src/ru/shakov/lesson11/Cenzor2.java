package ru.shakov.lesson11;


public class Cenzor2 {
    public static void main(String[] args) {

        String string1 = "Кулебяка бяка БЯКА Бяка ,ябак кабя бяка, бякаБяка бякА   бяка  Бякабяка";
        System.out.println(string1);

        String string3 = string1.replaceAll("\\b[Б,б][Я,я][К,к][А,а]\\b", "«цензура»");
        System.out.println(string3);

    }
}
