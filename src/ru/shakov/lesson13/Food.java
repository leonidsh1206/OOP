package ru.shakov.lesson13;

public enum Food {
    CARROT ("Морковь"),
    APPLE ("Яблоко"),
    PORRIDGE ("Каша"),
    BURGER ("Бургер");

    String food;

    Food(String food) {
        this.food = food;
    }
}
