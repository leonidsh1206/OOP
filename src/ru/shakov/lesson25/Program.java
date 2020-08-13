package ru.shakov.lesson25;

import java.util.*;

public class Program {
    public static void main(String[] args) {
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

    public static boolean isUnique(Map<String, String> map) {
        Set<String> set = new TreeSet<>(map.values());
        if (set.size() == map.size()){
            return true;
        } else {
            return false;
        }
    }
}
