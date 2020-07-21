package ru.shakov.lesson15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class NewFile {
    public static void main(String[] args) {
        try {
            // создаем новую директорию
            File dir1 = new File("d:\\FirstFolder");
            dir1.mkdir();
            // СОЗДАЕМ НОВЫЙ ФАЙЛ в указанной директории
            File file1 = new File(dir1, "FirstFile.txt");
            file1.createNewFile();
            // Проверяем, создан ли файл
            System.out.println("В директории " + dir1.getAbsolutePath() +
                    " создан файл " + file1.getName() + " создан " + file1.exists());
            System.out.println();

            // ПЕРЕИМЕНОВЫВАЕМ ФАЙЛ
            // Задаем новый файл
            File file2 = new File(dir1, "SecondFile.txt");
            System.out.println("В директории " + dir1.getAbsolutePath() + " "
                    + file1.getName() + " переименован в "
                    + file2.getName() + " " + file1.renameTo(file2));
            System.out.println("Файл " + file1.getAbsolutePath() + " существует " + file1.exists());
            System.out.println("Файл " + file2.getAbsolutePath() + " существует " + file2.exists());
            System.out.println();

            // КОПИРУЕМ ФАЙЛ
            // Создаем новую директорию и копируем в нее новый созданный файл
            File dir2 = new File("d:\\SecondFolder");
            dir2.mkdir();
            File file3 = new File(dir2, file2.getName());

            System.out.println("Файл " + file2.getAbsolutePath() + " скопирован в "
                    + Files.copy(file2.toPath(), file3.toPath()));
            System.out.println("Файл " + file2.getAbsolutePath() + " существует " + file2.exists());
            System.out.println("Файл " + file3.getAbsolutePath() + " существует " + file3.exists());
            System.out.println();

            // УДАЛЯЕМ ФАЙЛ
            System.out.println("Файл " + file2.getAbsolutePath() + " удален " + file2.delete());
            System.out.println("Файл " + file3.getAbsolutePath() + " удален " + file3.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
