package ru.shakov.lesson12;

public class HelloWorldThrow {
    public static void main(String[] args) throws RuntimeException {

        // спомощью оператора throw самостоятельно вызываем ошибку
        throw new RuntimeException();
    }
}
