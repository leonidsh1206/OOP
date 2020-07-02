package ru.shakov.lesson9.part3.forExtends;

public abstract class Human implements Run, Swim {

    int age;

    public abstract void setName();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
