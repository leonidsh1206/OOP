package ru.shakov.lesson9.part1_part2.classes;

import ru.shakov.lesson9.part1_part2.interfaces.Run;
import ru.shakov.lesson9.part1_part2.interfaces.Swim;

public class Dog extends Animal implements Run, Swim {

    @Override
    public void getName() {
        System.out.println("Собака");
    }


    @Override
    public String getCanRun() {
        System.out.println(" может много бегать");
        return (" может много бегать");
    }

    @Override
    public String getCanSwim() {
        System.out.println(" немного может плавать");
        return (" немного может плавать");
    }
}
