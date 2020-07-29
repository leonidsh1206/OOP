package ru.shakov.lesson19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("src\\ru\\shakov\\lesson19\\products.txt"))) {
            while (sc.hasNext()) {
                String name = sc.nextLine();
                double quantity = Double.parseDouble(sc.nextLine());
                double cost = Double.parseDouble(sc.nextLine());
                products.add(new Product(name, quantity, cost));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("src\\ru\\shakov\\lesson19\\out.txt"))) {
            pw.printf("%-20s %8s   %6s   %10s\n", "Наименование", "Цена", "Кол-во", "Стоимость");
            pw.printf("===================================================\n");
            double sum = 0;
            for (Product product : products) {
                String name = product.getName();
                double quantity = product.getQuantity();
                double price = product.getPrice();
                double cost = quantity * price;
                sum += cost;
                pw.printf("%-20s %8.2f x %6.3f = %10.2f\n", name, price, quantity, cost);
            }
            pw.printf("===================================================\n");
            pw.printf("%-40s %10.2f\n", "Итого:", sum);
            LocalDateTime date = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
            pw.printf("Дата: %45s",dtf.format(date));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
