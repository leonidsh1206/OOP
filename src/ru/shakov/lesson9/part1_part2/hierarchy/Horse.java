package ru.shakov.lesson9.part1_part2.hierarchy;

public class Horse extends Animal {
    @Override
    public void getName() {
        System.out.println("Лошадь");
    }

    @Override
    public String getCanRun() {
        System.out.println(" может быстро бегать");
        return (" может быстро бегать");
    }

    @Override
    public String getCanFly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getCanSwim() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
