package ru.shakov.lesson25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        // Исходный список по которомы метод должен выдать true
        Map<String, String> map1 = new HashMap<>();
        map1.put("Василий", "Иванов");
        map1.put("Петр", "Петров");
        map1.put("Виктор", "Сидоров");
        map1.put("Сергей", "Савельев");
        map1.put("Вадим", "Викторов");
        for (Map.Entry<String, String> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(isUnique(map1));
        System.out.println();

        // Исходный список по которомы метод должен выдать false
        Map<String, String> map2 = new HashMap<>();
        map2.put("Василий", "Иванов");
        map2.put("Петр", "Петров");
        map2.put("Виктор", "Иванов");
        map2.put("Сергей", "Савельев");
        map2.put("Вадим", "Петров");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        System.out.println(isUnique(map2));
    }

    // Метод принимает на вход карту Map, на выходе true или false в соответствии с исходным условием
    public static boolean isUnique(Map<String, String> map) {
        // Значения values исходной карты map преобразуем в множество set
        // повторяющиеся значения "соединятся" и размер множество изменится
        Set<String> set = new TreeSet<>(map.values());
        // Если размер множества  сохраняется,то выводим true, иначе false
        return set.size() == map.size();
    }
}
