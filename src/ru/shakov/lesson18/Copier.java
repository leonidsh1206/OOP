package ru.shakov.lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;


// Программа, которая копирует файл с одной кодировкой в файл с другой кодировкой
public class Copier {
    public static void main(String[] args) {
        if(args.length < 4) {
            // Предварительно нужно задать аргументы командной строки, например:
            // text1.txt UTF-8 text2.txt windows-1251
            System.out.println("в параметрах нужно указать:");
            System.out.println("имя входного файла,");
            System.out.println("кодировку входного файла,");
            System.out.println("имя выходного файла,");
            System.out.println("кодировку выходного файла.");
            return;
        }
        String filename1 = args[0];
        String charset1 = args[1];
        String filename2 = args[2];
        String charset2 = args[3];
        try(InputStreamReader isr = new InputStreamReader(new FileInputStream(
                "src\\ru\\shakov\\lesson18\\" + filename1), Charset.forName(charset1));
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(
                    "src\\ru\\shakov\\lesson18\\" + filename2), Charset.forName(charset2))) {
            int v;
            while ((v = isr.read()) != -1) {    // в цикле читаем, пока есть данные
                osw.write(v);           // в цикле пишем, пока есть данные
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
