package ru.shakov.lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OnlineStoreBasket implements Basket {

    int index = 0;
    String product;
    int quantity;

    List<String> productList = new ArrayList<>();
    List<Integer> quantityList = new ArrayList<>();

    ListIterator<String> productListIterator = productList.listIterator();
    ListIterator<Integer> quantityListIterator = quantityList.listIterator();

    @Override
    public void addProduct(String product, int quantity) {
        productList.add(index, product);
        quantityList.add(index, quantity);
        System.out.println("Add " + product + " " + quantity);
        index++;
    }

    @Override
    public void removeProduct(String product) {
        int k = productList.indexOf(product);
//        productList.remove(k);
//        quantityList.remove(k);
        System.out.println(productList.remove(k) + " " + quantityList.remove(k) + " removed");
        index--;
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        int newQuantity = quantityList.remove(productList.indexOf(product)) + quantity;
        quantityList.add(productList.indexOf(product), newQuantity);
    }

    @Override
    public void clear() {
        productList.removeAll(productList);
        quantityList.remove(quantityList);
        index = 0;
    }

    @Override
    public List<String> getProducts() {
        for (int i = 0; i < index; i++) {
            System.out.println(i + " " + productList.get(i) + " " + quantityList.get(i));
        }
        return null;
    }

    @Override
    public int getProductQuantity(String product) {
        return quantityList.get(productList.indexOf(product));
    }
}
