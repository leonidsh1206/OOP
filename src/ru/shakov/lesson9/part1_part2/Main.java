package ru.shakov.lesson9.part1_part2;

import ru.shakov.lesson9.part1_part2.classes.*;
import ru.shakov.lesson9.part1_part2.exceptions.CannotFlyException;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.getName();
        dog.getCanRun();
        dog.getCanSwim();
        try {
            dog.getCanFly();
        } catch (CannotFlyException e) {
          System.err.println("Dogs cannot fly");
        }
        Animal duck = new Duck();
        duck.getName();
        try {
            duck.getCanFly();
        } catch (CannotFlyException e) {
            e.printStackTrace();
        }
        duck.getCanRun();
        duck.getCanSwim();
        Animal fish = new Fish();
        fish.getName();
        fish.getCanSwim();
        Animal horse = new Horse ();
        horse.getName();
        horse.getCanRun();
    }
}
