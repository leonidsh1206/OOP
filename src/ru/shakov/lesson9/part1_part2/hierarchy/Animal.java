package ru.shakov.lesson9.part1_part2.hierarchy;

import ru.shakov.lesson9.part1_part2.api.Fly;
import ru.shakov.lesson9.part1_part2.api.Run;
import ru.shakov.lesson9.part1_part2.api.Swim;

public abstract class Animal implements Fly, Run, Swim {
    public abstract void getName();

    @Override
    public String getCanFly() throws UnsupportedOperationException {
        return null;
    }

    @Override
    public String getCanRun() throws UnsupportedOperationException {
        return null;
    }

    @Override
    public String getCanSwim() throws UnsupportedOperationException {
        return null;
    }

    // todo: implement all methods with UnsupportedOperationException and force subclasses override the necessary ones
}
