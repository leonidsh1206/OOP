package ru.shakov.lesson22;

import java.util.Arrays;
import java.util.Comparator;

public class HardComparator {
    public static void main(String[] args) {
        // Исходный список в виде массива
        Person[] person = new Person[]{
                new Person("Вова", 21),
                new Person("Вова", 3),
                new Person("Вова", 19),
                new Person("Ваня", 15),
                new Person("Ваня", 5),
                new Person("Ваня", 17)
        };
        for (Person persons : person) {
            System.out.println(persons.toString());
        }
        System.out.println();

        // Сортировка по возрасту
        Arrays.sort(person, new PersonAgeComparator());
        for (Person persons : person) {
            System.out.println(persons.toString());
        }
        System.out.println();

        // Сортировка по имени
        Arrays.sort(person, new PersonNameComparator());
        for (Person persons : person) {
            System.out.println(persons.toString());
        }

    }

    // Класс для сортировки по имени
    static class PersonNameComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            int compareName = (o1.getName()).compareTo(o2.getName());
            return compareName;
        }
    }

    // Класс для сортировки по возрасту
    static class PersonAgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            int compareAge;
            if (o1.getAge() > o2.getAge()) {
                compareAge = 1;
            } else if (o1.getAge() < o2.getAge()) {
                compareAge = -1;
            } else {
                compareAge = 0;
            }
            return compareAge;
        }
    }
}
