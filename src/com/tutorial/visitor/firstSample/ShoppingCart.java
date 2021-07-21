package com.tutorial.visitor.firstSample;

public interface ShoppingCart {
    float visit(Book book);

    float visit(Oil oil);
}
