package ru.shakov.lesson23;

public class Program {
    public static void main(String[] args) {

        OnlineStoreBasket onlineStoreBasket = new OnlineStoreBasket();

        // Добавляем несколько новых продуктов и их количество
        onlineStoreBasket.addProduct("Book", 2);
        onlineStoreBasket.addProduct("CopyBook", 3);
        onlineStoreBasket.addProduct("Paper", 10);
        System.out.println("----------------------------------");

        //Выводим список продуктов и их количество
        onlineStoreBasket.getProducts();
        System.out.println("----------------------------------");

        // Удаляем один из продуктов
        onlineStoreBasket.removeProduct("Book");
        onlineStoreBasket.getProducts();
        System.out.println("----------------------------------");

        // Обновляем количество одного из добавленных ранее продуктов
        onlineStoreBasket.updateProductQuantity("CopyBook", 3);
        onlineStoreBasket.getProducts();
        System.out.println("----------------------------------");
        onlineStoreBasket.updateProductQuantity("CopyBook", 3);
        onlineStoreBasket.getProducts();
        System.out.println("----------------------------------");

        // Выводим количество одного из имеющихся продуктов
        onlineStoreBasket.getProductQuantity("CopyBook");
        System.out.println("----------------------------------");

        // Очищаем корзину
        onlineStoreBasket.clear();
        onlineStoreBasket.getProducts();
        System.out.println("----------------------------------");
    }
}
