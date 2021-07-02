package com.tutorial.observer.firstSample;

public class Radio implements Channel {
    @Override
    public void update(String news) {
        System.out.println("Radio: "+news);
    }
}
