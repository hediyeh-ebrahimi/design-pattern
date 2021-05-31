package com.tutorial.decorator.firstSample;

import com.tutorial.decorator.firstSample.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle Shape draw()");
    }

    @Override
    public void resize() {
        System.out.println("Circle Shape draw()");
    }
}
