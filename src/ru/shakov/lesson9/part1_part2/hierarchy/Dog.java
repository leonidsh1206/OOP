package ru.shakov.lesson9.part1_part2.hierarchy;

public class Dog extends Animal {

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

    @Override
    public String getCanFly() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
