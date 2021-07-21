package com.tutorial.visitor.firstSample;

import java.util.Arrays;

/*
 *  behavioral design pattern
 * when we use this design pattern when we do some actions in group of objects
 * visit method in visitor
 * visit called by all objects
 * accept method called by visitable class
 *  2 classes in this pattern => visit , visitable
 * components => client , visitor (interface, visit method)
 * , concrete visitor (each visitor each concrete visitor ), visitable(accept method) , concrete visitable
 * */
public class Main {
    public static void main(String[] args) {
        ItemElement[] itemElements = new ItemElement[]{
                new Book("123", "test test", 125),
                new Oil("iol brand", 30, 60),
                new Book("456", "test1 test1", 40)

        };

        float calculate = calculate(itemElements);
        System.out.println(calculate);
    }

    private static float calculate(ItemElement[] itemElements) {
        ShoppingCart shoppingCart = new ShoppingCartImpl();
        float totalPrice = 0;
        for (ItemElement itemElement : itemElements) {
            totalPrice += itemElement.accept(shoppingCart);
        }
        return totalPrice;
    }
}
