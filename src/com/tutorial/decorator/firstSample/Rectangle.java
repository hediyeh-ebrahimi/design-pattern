package com.tutorial.decorator.firstSample;

import com.tutorial.decorator.firstSample.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Shape draw()");
    }

    @Override
    public void resize() {
        System.out.println("Rectangle Shape resize()");
    }
}
