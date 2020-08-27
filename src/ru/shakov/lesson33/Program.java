package ru.shakov.lesson33;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String string = "This is test message";

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();
        int maxValue = 1;
        char maxChar = ' ';
        for (char ch : chars) {
            if (map.containsKey(ch)) {
                int frequency = map.get(ch);
                if (frequency >= maxValue) {
                    maxValue = frequency + 1;
                    maxChar = ch;
                }
                map.put(ch, frequency + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character: '" + entry.getKey()
                    + "' has occurred times in String: " + entry.getValue());
        }

        System.out.println("Character: '" + maxChar
                + "' has occurred maximum times in String: " + maxValue);
    }
}
