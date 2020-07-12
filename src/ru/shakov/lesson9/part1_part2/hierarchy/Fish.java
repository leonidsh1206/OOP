package ru.shakov.lesson9.part1_part2.hierarchy;

public class Fish extends Animal {
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
    public String getCanFly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getCanRun() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
