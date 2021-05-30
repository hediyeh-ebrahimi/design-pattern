package com.tutorial.bridge.secondSample;

public class Rectangle implements Shape {

    private Color color;

    public Rectangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle Shape:draw()");
    }

    @Override
    public void applyColor() {
        System.out.println("Rectangle Shape:applyColor()");
        color.applyColor();
    }
}
