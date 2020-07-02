package ru.shakov.lesson9.part1_part2.classes;

import ru.shakov.lesson9.part1_part2.interfaces.Fly;
import ru.shakov.lesson9.part1_part2.interfaces.Run;
import ru.shakov.lesson9.part1_part2.interfaces.Swim;

public class Duck extends Animal implements Run, Swim, Fly {

    @Override
    public void getName() {
        System.out.println("Утка");
    }

    @Override
    public String getCanFly() {
        System.out.println(" может хорошо летать");
        return (" может хорошо летать");
    }

    @Override
    public String getCanRun() {
        System.out.println(" может медленно бегать");
        return (" может медленно бегать");
    }

    @Override
    public String getCanSwim() {
        System.out.println(" может плавать и нырять");
        return (" может плавать и нырять");
    }
}
