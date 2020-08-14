package ru.shakov.lesson25_2;

import java.util.HashMap;

public interface Basket {
    void addProduct(String product, int quantity);
    void removeProduct(String product);
    void updateProductQuantity(String product, int quantity);
    void clear();
    HashMap<String, Integer> getProducts();
    int getProductQuantity(String product);
}
