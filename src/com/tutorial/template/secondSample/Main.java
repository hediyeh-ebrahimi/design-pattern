package com.tutorial.template.secondSample;

/*
* behavioral design pattern
*  component abstract class (super class) => template method fixed methods its final type(not changeable) , component concrete class
* */
public class Main {
    public static void main(String[] args) {
        Market store = new Store();
        store.shop(false);
        System.out.println("");

        Market online = new Online();
        online.shop(true);
    }
}
