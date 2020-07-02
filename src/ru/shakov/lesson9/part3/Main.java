package ru.shakov.lesson9.part3;

import ru.shakov.lesson9.part3.classes.Father;
import ru.shakov.lesson9.part3.classes.Grandfather;
import ru.shakov.lesson9.part3.classes.Son;
import ru.shakov.lesson9.part3.forExtends.Human;

public class Main {
    public static void main(String[] args) {
        Father father = new Father();
        father.setName();
        father.setAge(40);
        System.out.println(father.getAge());
        father.getCanRun();
        father.getCanSwim();

        Son son = new Son();
        father.setName();
        son.setAge(5);
        System.out.println(son.getAge());
        son.getCanRun();
        son.getCanSwim();

        Grandfather grandfather = new Grandfather();
        grandfather.setName();
        grandfather.setAge(70);
        System.out.println(grandfather.getAge());
        grandfather.getCanRun();
        grandfather.getCanSwim();

    }
}
