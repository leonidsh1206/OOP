package ru.shakov.lesson33;

import java.util.HashMap;
import java.util.Map;

// Программа, чтобы вывести максимально встречающийся символ в строке
public class Program {
    public static void main(String[] args) {
        // Тестовая строка
        String string = "This is test message";

        Map<Character, Integer> map = new HashMap<>();
        char[] chars = string.toCharArray();    // Преобразуем исходную строку в массив символов
        // Вводим переменные: количество встреч максимально встречающегося элемента,
        // сам элемент
        int maxValue = 1;
        char maxChar = ' ';

        // Обходим вспомогательную Map-коллекцию
        for (char ch : chars) {
            // Если элемент уже внесен в коллекцию, то преобразуем его Value(количество его встреч в строке)
            if (map.containsKey(ch)) {
                int frequency = map.get(ch);    //Вводим вспомогательную переменную
                if (frequency >= maxValue) {
                    maxValue = frequency + 1;   // Запоминаем, сколько раз встретился символ
                    maxChar = ch;       // Запоминаем сам символ
                }
                map.put(ch, frequency + 1);     // Добавляем элемент в коллекцию
            } else {    // Иначе добавляем элемент без преобразования
                map.put(ch, 1);
            }
        }

        // Обход коллекции, вывод, сколко раз каждый символ встречается в троке
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Character: '" + entry.getKey()
                    + "' has occurred times in String: " + entry.getValue());
        }

        // Вывод максимально встречающегося элемента в строке
        System.out.println("Character: '" + maxChar
                + "' has occurred maximum times in String: " + maxValue);
    }
}
