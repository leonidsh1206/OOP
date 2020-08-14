package ru.shakov.lesson23;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class OnlineStoreBasket implements Basket {

    int index = 0;

    List<String> productList = new ArrayList<>();
    List<Integer> quantityList = new ArrayList<>();

    ListIterator<String> productListIterator = productList.listIterator();
    ListIterator<Integer> quantityListIterator = quantityList.listIterator();

    // Метод добавляет продукт: "продукт" в список продуктов
    // и его"количество" в список количества по индексу
    @Override
    public void addProduct(String product, int quantity) {
        productList.add(index, product);
        quantityList.add(index, quantity);
        System.out.println("Добавлен продукт \"" + product + "\" в количестве " + quantity);
        index++;
    }

    // Метод удаляет продукт: сам "продукт" из списка продуктов,
    // его "количество" из списка количества по определенному индексу
    @Override
    public void removeProduct(String product) {
        int k = productList.indexOf(product);
        System.out.println("Удален продукт: \"" + productList.remove(k) + "\" в количестве "
                + quantityList.remove(k));
        index--;
    }

    // Метод изменяет количество продукта в корзине по извлеченному индексу
    @Override
    public void updateProductQuantity(String product, int quantity) {
        int updatedProduct = productList.indexOf(product);
        int newQuantity = quantityList.remove(updatedProduct) + quantity;
        quantityList.add(updatedProduct, newQuantity);
        System.out.println("Количество продукта \"" + product + "\" стало "
                + newQuantity);
    }

    // Метод очищает корзину
    @Override
    public void clear() {
        productList.removeAll(productList);
        quantityList.remove(quantityList);
        System.out.println("Корзина пуста");
        index = 0;
    }

    // Метод выводит список продуктов в корзине с их количеством и возвращает список
    @Override
    public List<String> getProducts() {
        System.out.println("В корзине следующий список продуктов: ");
        for (int i = 0; i < index; i++) {
            System.out.println((i + 1) + " продукт \"" + productList.get(i)
                    + "\" в количестве " + quantityList.get(i));
        }
        return productList;
    }

    // Метод возвращает количество продукта по его названию
    @Override
    public int getProductQuantity(String product) {
        int indexOfProduct = productList.indexOf(product);
        int productQuantity = quantityList.get(indexOfProduct);
        System.out.println("Количество продукта \"" + product + "\" в корзине составляет "
                + productQuantity);
        return productQuantity;
    }
}
