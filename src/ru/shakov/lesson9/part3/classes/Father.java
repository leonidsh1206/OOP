package ru.shakov.lesson9.part3.classes;

import ru.shakov.lesson9.part3.forExtends.Human;

public class Father extends Human {

    @Override
    public void setName() {
        System.out.printf("Отец ");
    }

    @Override
    public String getCanRun() {
        System.out.println(" быстро бегает");
        return (" быстро бегает");
    }

    @Override
    public String getCanSwim() {
        System.out.println(" хорошо плавает");
        return (" хорошо плавает");
    }

}
