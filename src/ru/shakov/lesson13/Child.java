package ru.shakov.lesson13;

public class Child {

    public static String eat(String food) throws TastePreferences {

        if (food == "APPLE" || food == "BURGER") {
            return "Съел " + food + " за обе щеки";
        } else {
            throw new TastePreferences();
        }
    }
}
