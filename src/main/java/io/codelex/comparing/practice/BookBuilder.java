package io.codelex.comparing.practice;

public class BookBuilder {
    String title = "";
    String author = "";
    String publisher = "";
    int pages;
    long isbn;
    double price;

    private BookBuilder() {
    }

    public static BookBuilder create() {
        return new BookBuilder();
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder publisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public BookBuilder pages(int pages) {
        this.pages = pages;
        return this;
    }

    public BookBuilder isbn(long isbn) {
        this.isbn = isbn;
        return this;
    }

    public BookBuilder price(double price) {
        this.price = price;
        return this;
    }

    public Book build() {
        return new Book(this);
    }
}
