package com.tutorial.composite.firstSample;

import com.tutorial.composite.firstSample.Shape;

public class Dot implements Shape {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
        System.out.println(String.format("Move Dot to (%d,%d)", this.x, this.y));
    }

    @Override
    public void draw() {
        System.out.println(String.format("Draw Dot at (%d,%d)", this.x, this.y));

    }
}
