package ru.shakov.lesson30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Программа для поиска первого неповторяющегося символа в строке
public class Program1 {
    public static void main(String[] args) {
        String string = "tqweaotoqweal ";
        // Преобразуем строку в массив символов
        char[] chars = string.toCharArray();

        // LinkedHashMap хранит ключи в порядке их вставки в Map
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Добавляем элементы из массива в коллекцию LinkedHashMap
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], i); // Повторяющиеся элементы будут перезаписываться с новым значением
            // Первый неповторяющийся элемент НЕ БУДЕТ перезаписан
        }
        System.out.println(map);

        // Добавляем ключи(Key) LinkedHashMap в отдельный список
        List<Character> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);

        // Добавляем значения(Value) из LinkedHashMap в отдельный список
        List<Integer> valueList = new ArrayList<>(map.values());
        System.out.println(valueList);
        // Вводим вспомогательную переменную, присваиваем ей произвольное значение из всех значений списка
        Integer minIndex = valueList.get(2);
        System.out.println(minIndex);

        // Находим ИНДЕКС минимального значение в списке значений
        for (Integer nextIndex : valueList) {
            if (minIndex > nextIndex) {
                minIndex = nextIndex;
            }
        }
        System.out.println("Индекс нужного элемента в массиве: " + minIndex);

        System.out.println("Первый неповторяющийся элемент: " + keyList.get(minIndex));

    }
}
