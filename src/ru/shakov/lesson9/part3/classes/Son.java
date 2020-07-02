package ru.shakov.lesson9.part3.classes;

import ru.shakov.lesson9.part3.forExtends.Human;

public class Son extends Human {

    @Override
    public void setName() {
        System.out.printf("Сын ");
    }

    @Override
    public String getCanRun() {
        System.out.println(" много бегает");
        return (" много бегает");
    }

    @Override
    public String getCanSwim() {
        System.out.println(" барахтается в воде");
        return (" барахтается в воде");
    }
}
