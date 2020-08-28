package ru.shakov.lesson30;

import java.util.*;

// Программа для поиска первого неповторяющегося символа в строке
public class Program2 {
    public static void main(String[] args) {
        String string = "tqweaotoqweal ";
        // Преобразуем строку в массив символов
        char[] chars = string.toCharArray();

        // LinkedHashMap хранит ключи в порядке их вставки в Map
        Map<Character, Boolean> map = new LinkedHashMap<>();

        // Добавляем элементы из массива в коллекцию LinkedHashMap
        for (int i = 0; i < chars.length; i++) {
            boolean k = true;
            if(map.containsKey(chars[i])) {
                k = true;
                map.remove(chars[i]);
                map.put(chars[i], k);   // Все повторяющиеся элементы будут иметь значение Value равное true
            } else {
                k = false;
                map.put(chars[i], k);   // Все неповторяющиеся элементы будуть иметь значение Value равное false
            }
        }
        System.out.println(map);

        // Добавляем ключи(Key) LinkedHashMap в отдельный список
        List keyList = new ArrayList(map.keySet());
        System.out.println(keyList);

        // Добавляем значения(Value) из LinkedHashMap в отдельный список
        List valueList = new ArrayList(map.values());
        System.out.println(valueList);

        // Вводим вспомогательную переменную, индекс
        Integer minIndex = 0;

        // Находим ИНДЕКС первого значения false в списке значений
        Iterator<Boolean> iterator = valueList.iterator();
        while (iterator.hasNext()) {
            Boolean nextIndex = iterator.next();
            if (nextIndex == true) {
                minIndex++;
            }
        }
        // Выводим индекс первого неповторяющегося элемента,
        // первого значения false в списке значений,
        System.out.println("Индекс нужного элемента в массиве: " + minIndex);

        System.out.println("Первый неповторяющийся элемент: " + keyList.get(minIndex));

    }
}
