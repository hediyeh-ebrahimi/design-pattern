package com.tutorial.visitor.firstSample;

public class Book implements ItemElement {
    private final String isbn;
    private final String author;
    private final float price;

    public Book(String isbn, String author, float price) {
        this.isbn = isbn;
        this.author = author;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public float accept(ShoppingCart shoppingCart) {
        return shoppingCart.visit(this);
    }
}
