package ru.shakov.lesson9.part1_part2.classes;

import ru.shakov.lesson9.part1_part2.interfaces.Run;

public class Horse extends Animal implements Run {
    @Override
    public void getName() {
        System.out.println("Лошадь");
    }

    @Override
    public String getCanRun() {
        System.out.println(" может быстро бегать");
        return (" может быстро бегать");
    }
}
