package ru.shakov.lesson24;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        // Исходный список
        List<String> words = Arrays.asList("foo", "buzz", "bar", "fork", "bort",
                "spoon", "!", "dude");
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.addAll(words);
        for (String entry : stringSet) {
            System.out.println(entry);
        }
        System.out.println();

        Set<String> newStringSet;
        newStringSet = removeEvenLength(stringSet);
        for (String entry : newStringSet) {
            System.out.println(entry);
        }
    }

    // Метод принимает на вход список. Возвращает список на основе принятого,
    // но с исключенными "словами" в которых четное количество букв.
    public static Set<String> removeEvenLength(Set<String> set){
        Set<String> newStringSet = new LinkedHashSet<>();
        Iterator<String> iterator = set.iterator();
        String st;
        while (iterator.hasNext()) {
            st = iterator.next();
            // Если остаток от деления длины слова не равен 0
            // (количество символов в слове нечетное), то добавляем это слово в новый список
            if ((st.length() % 2) != 0) {
                newStringSet.add(st);
            }
        }
        return newStringSet;
    }
}
