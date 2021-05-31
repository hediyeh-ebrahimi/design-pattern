package com.tutorial.decorator.firstSample;

import com.tutorial.decorator.firstSample.Shape;

/*
* first step => composite man class
* second step => inheritance main class
* */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
