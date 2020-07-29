package ru.shakov.lesson17;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Добавить книгу в библиотеку;");
        System.out.println("2 - Сохранить книгу в библиотеку;");
        System.out.println("3 - Посмотреть список книг в библиотеке;");
        System.out.println("4 - Выход.");

        boolean exit = false;
        do {
            switch (sc.nextInt()) {
                case 1: {
                    System.out.println("Введите название книги");
                    String title = sc.next();
                    System.out.println("Введите автора книги");
                    String author = sc.next();
                    System.out.println("Введите год издания книги");
                    String publicationDate = sc.next();
                    books.add(new Book(title, author, publicationDate));
                }
                break;
                case 2: {
                    try (OutputStream os = new FileOutputStream("src\\ru\\shakov\\lesson17\\Library.dat", true);
                         ObjectOutputStream oos = new ObjectOutputStream(os)) {
                        oos.writeObject(books);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
                break;
                case 3: {
                    List<Book> bookList = getBooksList("src\\ru\\shakov\\lesson17\\Library.dat");
                    for (Book book : bookList) {
                        System.out.println(book);
                    }
                }
                break;
                case 4:
                    return;
            }
        } while (true);

    }

    // Метод который будет выводить список книг
    private static List<Book> getBooksList(String fileName) {
        if (new File(fileName).exists()) {      // Если файл существует, то попытаемся его считать
            try (InputStream is = new FileInputStream(fileName);
                 ObjectInputStream ois = new ObjectInputStream(is)) {
                return (List<Book>) ois.readObject();

            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex);
            }
        }
        // Иначе, вернем пустой список
        System.out.println("Не удалось найти файл, инициализируем пустым списком");
        return new ArrayList<>();
    }
}
