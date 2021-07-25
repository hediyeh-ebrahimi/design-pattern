package com.tutorial.template.secondSample;

public class Online extends Market {
    @Override
    protected void doSelect() {
        System.out.println("Select method in Online Class");
    }

    @Override
    protected void doPayment() {
        System.out.println("Payment method in Online Class");
    }

    @Override
    protected void doDelivery() {
        System.out.println("Delivery method in Online Class");
    }
}
