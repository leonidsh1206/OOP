package ru.shakov.lesson30;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        String string = "totqwooeal ";
        char[] chars = string.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i);
            System.out.println(map);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue());
        }

        List list = new ArrayList(map.keySet());
        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        List arrayList = new ArrayList(map.values());
        Integer minIndex = (Integer) arrayList.get(5);
        System.out.println(minIndex);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer nextIndex = iterator.next();
            if (minIndex > nextIndex) {
                minIndex = nextIndex;
            }
        }
        System.out.println(minIndex);

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("'" + entry.getKey() + "' - " + entry.getValue());
        }
        System.out.println(list.get(minIndex));

    }
}
