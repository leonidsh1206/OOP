package ru.shakov.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("src\\ru\\shakov\\lesson19\\products.txt"))) {
            while (sc.hasNext()) {
                String name = sc.nextLine();
                double quantity = Double.parseDouble(sc.nextLine());
                double cost = Double.parseDouble(sc.nextLine());
                products.add(new Product().setName(name).setQuantity(quantity).setPrice(cost));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.printf("%-20s %8s   %6s   %10s\n", "Наименование", "Цена", "Кол-во", "Стоимость");
        System.out.printf("===================================================\n");
        double sum = 0;
        for (int i = 0; i < (products.size()); i++) {
            String name = products.get(i).getName();
            double quantity = products.get(i).getQuantity();
            double price = products.get(i).getPrice();
            double cost = quantity * price;
            sum += cost;
            System.out.printf("%-20s %8.2f x %6.3f = %10.2f\n", name, price, quantity, cost);
        }
        System.out.printf("===================================================\n");
        System.out.printf("%-40s %10.2f", "Итого:", sum);
    }
}
