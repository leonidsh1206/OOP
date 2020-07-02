package ru.shakov.lesson7;

public enum Drinks {
    JUICE (1,"Сок",100),
    COLA (2,"Кола",80),
    WATER (3,"Вода",50),
    COFFEE (4,"Кофе",120),
    TEE (5,"Чай",70);

    private int cost;
    private int number;
    private String title;

    public static int costOfDrink;

    Drinks(int number, String title, int cost) {
        this.title = title;
        this.cost = cost;
        this.number = number;
    }

    public static void printInterface() {
        for (Drinks drinks:Drinks.values()) {
            System.out.println(drinks.number + " - " + drinks.title + " - " + drinks.cost);

        }
    }

    private static String chosenDrink;

    public static String returnTitle(int numberOfDrink) {
        switch (numberOfDrink) {
            case 1: costOfDrink = Drinks.JUICE.cost;
                chosenDrink = Drinks.JUICE.title;
                //System.out.println("Сок");
                break;
            case 2: costOfDrink = Drinks.COLA.cost;
                chosenDrink = Drinks.COLA.title;
                //System.out.println("Кола");
                break;
            case 3:costOfDrink = Drinks.WATER.cost;
                chosenDrink = Drinks.WATER.title;
                //System.out.println("Вода");
                break;
            case 4: costOfDrink = Drinks.COFFEE.cost;
                chosenDrink = Drinks.COFFEE.title;
                //System.out.println("Кофе");
                break;
            case 5: costOfDrink = Drinks.TEE.cost;
                chosenDrink = Drinks.TEE.title;
                //System.out.println("Чай");
                break;
        }
        return chosenDrink;
    }

    public int getCost() {
        return cost;
    }
}
