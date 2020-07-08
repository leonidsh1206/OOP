package ru.shakov.lesson9.part1_part2.interfaces;

import ru.shakov.lesson9.part1_part2.exceptions.CannotFlyException;

public interface Fly {
    String getCanFly () throws CannotFlyException;
}
