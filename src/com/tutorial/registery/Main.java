package com.tutorial.registery;

public class Main {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Item item = registry.get(1L);
        System.out.println(item.hashCode());
    }
}
