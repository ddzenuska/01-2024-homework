package io.codelex.comparing.practice;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pages;
    private long isbn;
    private double price;

    public Book(BookBuilder builder) {
        title = builder.title;
        author = builder.author;
        publisher = builder.publisher;
        pages = builder.pages;
        isbn = builder.isbn;
        price = builder.price;
    }

    @Deprecated // @Deprecated annotation discourages use of the method, but still allows it to function.
    public Book(String title, String author, String publisher, int pages, long isbn, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pages=" + pages +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}
