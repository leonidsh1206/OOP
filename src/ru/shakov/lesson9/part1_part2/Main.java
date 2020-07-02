package ru.shakov.lesson9.part1_part2;

import ru.shakov.lesson9.part1_part2.classes.Dog;
import ru.shakov.lesson9.part1_part2.classes.Duck;
import ru.shakov.lesson9.part1_part2.classes.Fish;
import ru.shakov.lesson9.part1_part2.classes.Horse;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.getName();
        dog.getCanRun();
        dog.getCanSwim();
        Duck duck = new Duck();
        duck.getName();
        duck.getCanFly();
        duck.getCanRun();
        duck.getCanSwim();
        Fish fish = new Fish();
        fish.getName();
        fish.getCanSwim();
        Horse horse = new Horse ();
        horse.getName();
        horse.getCanRun();
    }
}
