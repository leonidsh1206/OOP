package ru.shakov.lesson19;

public class Product {
    private String name;
    private double quantity;
    private double price;

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setQuantity(double quantity) {
        this.quantity = quantity;
        return this;
    }

    public Product setPrice(double price) {
        this.price = price;
        return this;
    }
}
