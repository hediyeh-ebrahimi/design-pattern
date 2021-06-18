package com.tutorial.composite.firstSample;

import com.tutorial.composite.firstSample.Shape;

public class Circle implements Shape {
    private int x;
    private int y;
    private int i;

    public Circle(int x, int y, int i) {
        this.x = x;
        this.y = y;
        this.i = i;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println(String.format("Move Circle to (%d,%d)", this.x, this.y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw Circle at (%d,%d) with R %d", this.x, this.y, this.i));
    }
}
