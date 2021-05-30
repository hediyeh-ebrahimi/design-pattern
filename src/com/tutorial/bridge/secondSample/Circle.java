package com.tutorial.bridge.secondSample;

public class Circle implements Shape {

    private Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle Shape:draw()");
    }

    @Override
    public void applyColor() {
        System.out.println("Circle Shape:applyColor()");
        color.applyColor();
    }
}
