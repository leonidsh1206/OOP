package ru.shakov.lesson30;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Программа для поиска первого неповторяющегося символа в строке
public class Program2 {
    public static void main(String[] args) {
        String string = "tqweaotoqweal ";
        // Преобразуем строку в массив символов
        char[] chars = string.toCharArray();

        // LinkedHashMap хранит ключи в порядке их вставки в Map
        Map<Character, Boolean> map = new LinkedHashMap<>();

        // Добавляем элементы из массива в коллекцию LinkedHashMap
        for (char aChar : chars) {
            boolean k = true;
            // Все неповторяющиеся элементы будуть иметь значение Value равное false
            if (map.containsKey(aChar)) {
                map.remove(aChar);
            } else {
                k = false;
            }
            map.put(aChar, k);   // Все повторяющиеся элементы будут иметь значение Value равное true
        }
        System.out.println(map);

        // Добавляем ключи(Key) LinkedHashMap в отдельный список
        List<Character> keyList = new ArrayList<>(map.keySet());
        System.out.println(keyList);

        // Добавляем значения(Value) из LinkedHashMap в отдельный список
        List<Boolean> valueList = new ArrayList<>(map.values());
        System.out.println(valueList);

        // Вводим вспомогательную переменную, индекс
        int minIndex = 0;

        // Находим ИНДЕКС первого значения false в списке значений
        for (Boolean nextIndex : valueList) {
            if (nextIndex) {
                minIndex++;
            }
        }
        // Выводим индекс первого неповторяющегося элемента,
        // первого значения false в списке значений,
        System.out.println("Индекс нужного элемента в массиве: " + minIndex);

        System.out.println("Первый неповторяющийся элемент: " + keyList.get(minIndex));

    }
}
