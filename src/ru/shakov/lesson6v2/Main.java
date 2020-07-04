package ru.shakov.lesson6v2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileReader("units.txt"))) {
            String line = scanner.nextLine();
            // line.split();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
