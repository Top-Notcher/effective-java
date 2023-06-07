package com.example.effectivejava.chapter01.item03.serialization;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable {

    private static final long serialVersionUID = 8438742295759887073L;
    private String isbn;
    private String title;
    private String author;
    private LocalDate published;
    // 직렬화하고 싶지 않은 필드일 때 transient 사용
    private transient int numberOfSold;

    public Book(String isbn, String title, String author, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.published = published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", numberOfSold=" + numberOfSold +
                '}';
    }

    public void setNumberOfSold(int numberOfSold) {
        this.numberOfSold = numberOfSold;
    }
}
