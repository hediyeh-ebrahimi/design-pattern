package com.tutorial.composite.firstSample;

import com.tutorial.composite.firstSample.Shape;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {

    private List<Shape> children;

    public CompoundShape() {
        this.children = new ArrayList<>();
    }

    public void addChild(Shape shape) {
        this.children.add(shape);
    }

    public void removeChild(Shape shape) {
        this.children.remove(shape);
    }

    @Override
    public void move(int x, int y) {
        for (Shape child : children) {
            child.move(x,y);
        }

    }

    @Override
    public void draw() {
        for (Shape child : children) {
            child.draw();
        }
    }
}
