package com.tutorial.singleton.firstSample;

public class Singleton {
    public static void main(String[] args) {

        SingleObject singleObject = SingleObject.getInstance();
        singleObject.getMessage();
        System.out.println("1: " + singleObject);
        SingleObject singleObject1 = SingleObject.getInstance();
        singleObject1.getMessage();
        System.out.println("2: " + singleObject1);
    }
}
