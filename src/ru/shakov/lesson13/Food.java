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

    public String getFood() {
        return food;
    }

    private static String chosenFood;

    // Функция возвращае название еды по ее порядковому номеру в enum
    public static String chosenFood (int randomNumber) {
        switch (randomNumber) {
            case 0:
                chosenFood = Food.CARROT.food;
                break;
            case 1:
                chosenFood = Food.APPLE.food;
                break;
            case 2:
                chosenFood = Food.PORRIDGE.food;
                break;
            case 3:
                chosenFood = Food.BURGER.food;
                break;
        }
        return chosenFood;
    }

}
