package ru.shakov.lesson8.part2;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("GoodBoy", 3);
        System.out.println(dog1.name);
        Dog dog2 = new Dog("GoodGirl", 2);
        System.out.println(dog2.name);
        Dog dog3 = new Dog("GoodPuppy", 1);
        System.out.println(dog3.name);

        System.out.println(Counter.counter);

    }
}
