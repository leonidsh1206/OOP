package ru.shakov.lesson13;

import java.sql.SQLOutput;

class TastePreferences extends Exception {
    @Override
    public String toString() {
        return "еда не понравилась";
    }
}

public class Mather {

    public static void main(String[] args) {

        try {
            String good = Child.eat(Food.APPLE.name());
            System.out.println(good);
        } catch (TastePreferences tp) {
            System.out.println("Исключение: " + tp.toString());
        } finally {
            System.out.println("Спасибо, мама!");
        }

    }
}
