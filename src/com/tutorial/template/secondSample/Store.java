package com.tutorial.template.secondSample;

public class Store extends Market {
    @Override
    protected void doSelect() {
        System.out.println("Select method in Store Class");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment method in Store Class");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Delivery method in Store Class");
    }
}
