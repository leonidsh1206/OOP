package ru.shakov.lesson8.part2;

public class Dog {
    int age;
    String name;

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
        Counter.Count();
    }

}
