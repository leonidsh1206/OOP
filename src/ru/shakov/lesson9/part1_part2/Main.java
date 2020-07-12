package ru.shakov.lesson9.part1_part2;

import ru.shakov.lesson9.part1_part2.hierarchy.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.getName();
        dog.getCanRun();
        dog.getCanSwim();
        try {
            dog.getCanFly();
        } catch (UnsupportedOperationException e) {
          System.err.println("Dogs cannot fly");
        }
        Animal duck = new Duck();
        duck.getName();
        duck.getCanFly();
        duck.getCanRun();
        duck.getCanSwim();
        Animal fish = new Fish();
        fish.getName();
        fish.getCanSwim();
        try {
            fish.getCanRun();
        } catch (UnsupportedOperationException e) {
            System.err.println("Fish cannot run");
        }
        try {
            fish.getCanFly();
        } catch (UnsupportedOperationException e) {
            System.err.println("Fish cannot fly");
        }
        Animal horse = new Horse ();
        horse.getName();
        horse.getCanRun();
        try {
            horse.getCanFly();
        } catch (UnsupportedOperationException e) {
            System.err.println("Horse cannot fly");
        }
        try {
            horse.getCanSwim();
        } catch (UnsupportedOperationException e) {
            System.err.println("Horse cannot swim");
        }
    }
}
