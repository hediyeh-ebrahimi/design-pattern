package com.tutorial.decorator.firstSample;

import com.tutorial.decorator.firstSample.Color;
import com.tutorial.decorator.firstSample.Shape;
import com.tutorial.decorator.firstSample.ShapeDecorator;

public class FillColorDecorator extends ShapeDecorator {

    private Color color;

    public FillColorDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Fill Color draw() " + this.color);
    }

    @Override
    public void resize() {
        shape.resize();
    }
}
