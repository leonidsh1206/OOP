package ru.shakov.lesson12;

public class HelloWorldAIOOBE {

    public static void main(String[] args) {

        System.out.println("Hello, world!");
        int [] a = {1, 2, 3};

        // Обращаясь к незаданному элементу массива получаем
        // ошибку ArrayIndexOutOfBoundsException
        System.out.println(a[5]);
    }

}
