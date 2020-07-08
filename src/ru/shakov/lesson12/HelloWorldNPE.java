package ru.shakov.lesson12;

public class HelloWorldNPE {
    public static void main(String[] args) {

        System.out.println("Hello, world!");
        String string = null;

        // Пытаясь вывести значение по null-ссылке получим NullPointerException
        System.out.println(string.toString());
    }

}
