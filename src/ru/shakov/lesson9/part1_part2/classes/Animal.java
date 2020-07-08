package ru.shakov.lesson9.part1_part2.classes;

import ru.shakov.lesson9.part1_part2.interfaces.Fly;
import ru.shakov.lesson9.part1_part2.interfaces.Run;
import ru.shakov.lesson9.part1_part2.interfaces.Swim;

public abstract class Animal implements Fly, Run, Swim {
    public abstract void getName();

    // todo: implement all methods with UnsupportedOperationException and force subclasses override the necessary ones
}
