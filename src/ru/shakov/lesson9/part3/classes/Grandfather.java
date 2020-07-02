package ru.shakov.lesson9.part3.classes;

import ru.shakov.lesson9.part3.forExtends.Human;

public class Grandfather extends Human {

    @Override
    public void setName() {
        System.out.printf("Дед ");
    }

    @Override
    public String getCanRun() {
        System.out.println(" медленно бегает");
        return (" медленно бегает");
    }

    @Override
    public String getCanSwim() {
        System.out.println(" плохо плавает");
        return (" плохо плавает");
    }

}
