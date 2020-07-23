package ru.shakov.lesson18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

// Программа для создания файла для последующей конвертации
public class CreateTextFile {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                "src\\ru\\shakov\\lesson18\\text1.txt"), Charset.forName("UTF-8"))) {
            osw.write("Привет мир!");
            osw.write("До свидания!");
            osw.write("Hello world!");
            osw.write("By-by!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
