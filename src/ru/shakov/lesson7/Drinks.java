package ru.shakov.lesson7;

public enum Drinks {
    JUICE (100),
    COLA (80),
    WATER (50),
    COFFEE (120),
    TEE (70);

    private int cost;

    Drinks(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
