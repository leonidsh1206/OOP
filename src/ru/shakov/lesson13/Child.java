package ru.shakov.lesson13;

public class Child {

    public static String eat(String food) throws TastePreferences {

        if ("Яблоко".equals(food) || "Бургер".equals(food)) {
            return "Съел " + food.toLowerCase() + " за обе щеки";
        } else {
            throw new TastePreferences();
        }
    }
}
