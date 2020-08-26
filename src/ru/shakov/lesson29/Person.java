package ru.shakov.lesson29;

import java.util.Objects;

public class Person {
    int age;
    String surname;
    String pol;

    public Person(int age, String surname, String pol) {
        this.age = age;
        this.surname = surname;
        this.pol = pol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(pol, person.pol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, surname, pol);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", surname='" + surname + '\'' +
                ", pol='" + pol + '\'' +
                '}';
    }
}
