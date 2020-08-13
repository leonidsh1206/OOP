package ru.shakov.lesson24;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("foo", "buzz", "bar", "fork", "bort",
                "spoon", "!", "dude");
        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.addAll(words);
        for (String entry : stringSet) {
            System.out.println(entry);
        }
        System.out.println();

        Set<String> newStringSet = new LinkedHashSet<>();
        newStringSet = removeEvenLength(stringSet);
        for (String entry : newStringSet) {
            System.out.println(entry);
        }
    }
    public static Set<String> removeEvenLength(Set<String> set){
        Set<String> newStringSet = new LinkedHashSet<>();
        Iterator<String> iterator = set.iterator();
        String st;
        while (iterator.hasNext()) {
            st = iterator.next();
            if ((st.length() % 2) == 1) {
                newStringSet.add(st);
            }
        }
        return newStringSet;
    }
}
