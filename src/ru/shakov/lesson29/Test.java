package ru.shakov.lesson29;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");

        Map<String, Person> book = new HashMap<>();
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);

        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        removeTheDuplicates(book);
        System.out.println();

        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        removeItemFromMapByValue(book, person1);
        System.out.println();

        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        removeTheDuplicates(book);
        System.out.println();

        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        removeItemFromMapByValue(book, person4);
        System.out.println();

        for (Map.Entry e : book.entrySet()) {
            System.out.println(e.toString());
        }


    }

    // Если в Map-е имеются дубликаты, то выбросится сообщение
    public static void removeTheDuplicates(Map<String, Person> map) {

        for (Map.Entry e : map.entrySet()) {
            int i = 0;
            for (Map.Entry ee : map.entrySet()) {
                if(e.getValue().equals(ee.getValue())) {
                    i++;
                    if (i > 1) {
                        System.out.println(" Есть дубликаты " + e.getValue());
                        return;
                    }
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
                System.out.println("Удалены позиции " + pair.getValue());
            }
        }
    }

}
