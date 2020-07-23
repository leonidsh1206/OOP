package ru.shakov.lesson17;

import java.io.Serializable;

public class Book implements Serializable {
    public static final long serialVersionUID = 1L;
    String title;   // Название книги
    String author;  // Автор
    String publicationDate;     // Дата издания

    public Book(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationDate='" + publicationDate + '\'' +
                '}';
    }
}
