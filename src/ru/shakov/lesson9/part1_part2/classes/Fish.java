package ru.shakov.lesson9.part1_part2.classes;

import ru.shakov.lesson9.part1_part2.exceptions.CannotFlyException;
import ru.shakov.lesson9.part1_part2.interfaces.Swim;

public class Fish extends Animal implements Swim {
    @Override
    public void getName() {
        System.out.println("Рыба");
    }

    @Override
    public String getCanSwim() {
        System.out.println(" может только плавать");
        return (" может только плавать");
    }

    @Override
    public String getCanFly() throws CannotFlyException {
        return null;
    }

    @Override
    public String getCanRun() {
        return null;
    }
}
