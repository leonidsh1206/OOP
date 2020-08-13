package ru.shakov.lesson23;

public class Program {
    public static void main(String[] args) {

        OnlineStoreBasket onlineStoreBasket = new OnlineStoreBasket();
        onlineStoreBasket.addProduct("Book", 2);
        onlineStoreBasket.addProduct("CopyBook", 3);
        onlineStoreBasket.addProduct("Paper", 10);
        onlineStoreBasket.getProducts();
        onlineStoreBasket.removeProduct("Book");
        onlineStoreBasket.getProducts();
        onlineStoreBasket.updateProductQuantity("CopyBook", 3);
        onlineStoreBasket.getProducts();
        onlineStoreBasket.updateProductQuantity("CopyBook", 3);
        onlineStoreBasket.getProducts();
        System.out.println("----------------------------------");
//        onlineStoreBasket.clear();
//        onlineStoreBasket.getProducts();
        System.out.println(onlineStoreBasket.getProductQuantity("CopyBook"));
    }
}
