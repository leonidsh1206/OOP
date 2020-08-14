package ru.shakov.lesson25_2;

import java.util.HashMap;
import java.util.Map;

public class OnlineStoreBasket implements Basket {

    HashMap<String, Integer> productMap =  new HashMap<>();

    // Метод добавляет "продукт" и его "количество" в карту HashMap
    @Override
    public void addProduct(String product, int quantity) {
        productMap.put(product, quantity);
        System.out.println("Добавлен продукт \"" + product
                + "\" в количестве " + quantity);
        //System.out.println(productMap);
    }

    // Метод удаляет "продукт" и его "количество" из карты HashMap
    @Override
    public void removeProduct(String product) {
        //System.out.println(productMap);
        System.out.println("Удален продукт: \"" + product + "\" в количестве "
                + productMap.remove(product));
    }

    // Метод изменяет количество принятого "продукта" в корзине
    @Override
    public void updateProductQuantity(String product, int quantity) {
        productMap.put(product, productMap.get(product) + quantity);
        System.out.println("Добавлен продукт \"" + product
                + "\" в количестве " + quantity);
    }

    // Метод очищает корзину
    @Override
    public void clear() {
        productMap.clear();
        System.out.println("Корзина пуста");
    }

    // Метод возвращает карту HashMap продутов и их количества,
    // выводит список продуктов
    @Override
    public HashMap<String, Integer> getProducts() {
        System.out.println("В корзине следующий список продуктов: ");
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            System.out.println(" Продукт \"" + entry.getKey() + "\" в количестве " + entry.getValue());
        }
        return productMap;
    }

    // Метод возвращает количество продукта по его названию
    @Override
    public int getProductQuantity(String product) {
        int productQuantity = productMap.get(product);
        System.out.println("Количество продукта \"" + product + "\" в корзине составляет "
                + productQuantity);
        return productQuantity;
    }
}
