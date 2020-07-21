package ru.shakov.lesson15;

import java.io.File;

public class Recursion {
    public static void main(String[] args) {

        // Выбор директории по которой будет проходить сортировка
        File dir = new File("d:\\UI_copy");
        recursiveOutput(dir, "-");
    }

    // Вводим массив вложенных файлов для реализации метода
    private static File[] files;

    public static void recursiveOutput(File root, String depth) {
        // Вводим глубину рекурсии String depth
        files = root.listFiles();
        if (files != null) {    //делаем проверку, так как listFiles() может вернуть null
            for (File file : files) {   // перебираем все файлы
                if (file.isDirectory()) {   // вызов производим только когда файл является Директорией
                    System.out.printf("%s %s%n",depth, file.getName());
                    recursiveOutput(file, depth + "-");
                } else {
                    System.out.printf("%s %s%n", depth, file.getName());
                }
            }
        } else {
            System.out.println("В указанной папке нет файлов и папок");
        }
    }
}
