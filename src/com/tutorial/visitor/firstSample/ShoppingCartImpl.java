package com.tutorial.visitor.firstSample;

public class ShoppingCartImpl implements ShoppingCart {
    @Override
    public float visit(Book book) {
        System.out.println("Item[Book]: Isbn= " + book.getIsbn() + " Author= " + book.getAuthor() + " Price= " + book.getPrice());
        if (book.getPrice() > 50) {
            return book.getPrice() - 5;
        }
        return book.getPrice();
    }

    @Override
    public float visit(Oil oil) {
        System.out.println("Item[Oil]: Brand= " + oil.getBrand() + " Weight= " + oil.getTotalWeightPerKg() + " Price= " + oil.getPricePerKg());
        if (oil.getPricePerKg() * oil.getTotalWeightPerKg() > 150) {
            return oil.getPricePerKg() * oil.getTotalWeightPerKg() - 100;
        }
        return oil.getPricePerKg() * oil.getTotalWeightPerKg();
    }
}
