package ru.shakov.lesson29;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // Добавляем новые персоны
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");

        // Создаем Map-коллекцию с одинаковыми значениями Value
        Map<String, Person> book = new HashMap<>();
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);

        // Обход коллекции, вывод в консоль
        for (Map.Entry<String, Person> e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        // Проверяем, имеются ли дубликаты, выводим сообщение, если имеются
        removeTheDuplicates(book);
        System.out.println();

        // Удаляем найденные дубликаты из коллекции
        removeItemFromMapByValue(book, person1);
        System.out.println();

        // Вывод в консоль, демонстрация изменений
        for (Map.Entry<String, Person> e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        // Проверяем, имеются ли дубликаты, выводим сообщение, если имеются
        removeTheDuplicates(book);
        System.out.println();

        // Удаляем найденные дубликаты из коллекции
        removeItemFromMapByValue(book, person4);
        System.out.println();

        // Вывод в консоль, демонстрация изменений
        for (Map.Entry<String, Person> e : book.entrySet()) {
            System.out.println(e.toString());
        }
        System.out.println();

        // Проверяем, имеются ли дубликаты, выводим сообщение, если имеются
        removeTheDuplicates(book);
        System.out.println();

    }

    // Функция, которая выводит сообщение, если в Map-е имеются дубликаты
    private static void removeTheDuplicates(Map<String, Person> map) {

        for (Map.Entry<String, Person> e : map.entrySet()) {    // Обходим исходную Map
            int i = 0;          // Ввоодим счетчик количества, сколько раз встречается позиция
            // Повторно обходим исходную Map в другом цикле, сравниваем все элементы с каждым в отдельности
            for (Map.Entry<String, Person> ee : map.entrySet()) {
                if (e.getValue().equals(ee.getValue())) {
                    i++;            // В итоге i (счетчик) будет равен количеству, сколько раз значение встречается в Map
                    if (i > 1) {    // Если элемент встречается минимум 2 раза, то выводим сообщение
                        System.out.println("Есть дубликаты " + ee.getValue());
                        return;
                    }
                }
            }
        }
        System.out.println("Дубликатов нет");
    }

    // Функция удаляет указанный элемент из исходной Map
    private static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        for (Map.Entry<String, Person> pair : map.entrySet()) {     // Обход Map
            if (pair.getValue().equals(value)) {    // Если встречается элемент, равный указанному элементу
                map.remove(pair.getKey());
                System.out.println("Удалена позиция " + pair);
                return;     // Удаляем только один элемент и заканчиваем цикл
            }
        }
    }
}
